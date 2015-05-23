package model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Created by nik on 23.05.15.
 */
@XStreamAlias("osm")
public class Osm {
    @XStreamImplicit
    public List<Node> nodes;
    @XStreamImplicit
    public List<Way> ways;

    @Override
    public String toString() {
        return "Osm{" +
                "nodes=" + nodes +
                ", ways=" + ways +
                '}';
    }
}