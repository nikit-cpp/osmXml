package model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Created by nik on 23.05.15.
 */
@XStreamAlias("node")
public class Node {
    @XStreamAsAttribute
    public long id;
    @XStreamAsAttribute
    public double lat;
    @XStreamAsAttribute
    public double lon;

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
