package out;

import com.thoughtworks.xstream.XStream;
import commons.XstreamInitializer;
import model.Nd;
import model.Node;
import model.Osm;
import model.Way;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nik on 23.05.15.
 */
public class Worker {
    public static List<Coordinate> readCoordinates(String osmXml) throws FileNotFoundException {
        XStream xstream = XstreamInitializer.getXstream();

        InputStream is = new FileInputStream(osmXml);
        Osm c = (Osm) xstream.fromXML(is);

        List<Way> ways = c.ways;
        List<Node> nodes = c.nodes;
        Map<Long, Node> nodesMap = new HashMap();
        for(Node n: nodes) {
            nodesMap.put(new Long(n.id), n);
        }

        List<Coordinate> outCoordinateList = new ArrayList<>();
        for(Way way: ways) {
            // System.out.println(way);
            Nd nd1 = way.nds.get(Way.FIRST_ND);
            Nd nd2 = way.nds.get(Way.SECOND_ND);
            // System.out.println(nd1 + " " + nd2);
            double lat1 = nodesMap.get(nd1.ref).lat;
            double lon1 = nodesMap.get(nd1.ref).lon;
            double lat2 = nodesMap.get(nd2.ref).lat;
            double lon2 = nodesMap.get(nd2.ref).lon;

            //System.out.println("nd1 lat=" + lat1 + ", lon=" + lon1);
            //System.out.println("nd2 lat=" + lat2 + ", lon=" + lon2);
            outCoordinateList.add(new Coordinate(lat1, lon1, lat2, lon2));
        }
        return outCoordinateList;
    }
}
