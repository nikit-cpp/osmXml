package commons;

import com.thoughtworks.xstream.XStream;
import model.Node;
import model.Osm;
import model.Way;

/**
 * Created by nik on 23.05.15.
 */
public class XstreamInitializer {
    public static XStream getXstream() {
        XStream xstream = new XStream();

        Class[] annotated = new Class[] {Osm.class , Way.class, Node.class};
        xstream.processAnnotations(annotated);
        xstream.ignoreUnknownElements();

        return  xstream;
    }
}
