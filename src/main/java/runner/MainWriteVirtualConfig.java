package runner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import commons.XstreamInitializer;
import model.Nd;
import model.Node;
import model.Osm;
import model.Way;

import com.thoughtworks.xstream.XStream;
//import org.apache.commons.io.FileUtils;

public class MainWriteVirtualConfig {
	
	public static final String OUT_OSM_XML = "target/osm.xml";

	public static void main(String[] args) throws IOException {
		Osm c = new Osm();
		Node n1 = new Node();
		Node n2 = new Node();
		List<Node> nodes = new ArrayList<>();
		nodes.add(n1);
		nodes.add(n2);

		Nd nd11 = new Nd();
		Nd nd12 = new Nd();
		Way way1 = new Way();

		way1.nds = new ArrayList<>();
		way1.nds.add(nd11);
		way1.nds.add(nd12);

		List<Way> ways = new ArrayList<>();
		ways.add(way1);

		c.nodes = nodes;
		c.ways = ways;

		XStream xstream = XstreamInitializer.getXstream();

		OutputStream out = new FileOutputStream(OUT_OSM_XML);
		xstream.toXML(c, out);

		File outFile = new File(OUT_OSM_XML);
		
		System.out.println("Writed to " + outFile.getCanonicalPath());
		/*String xml = FileUtils.readFileToString(outFile, "UTF8");

		System.out.println(xml);*/
	}

}
