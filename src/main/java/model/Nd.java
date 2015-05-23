package model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Created by nik on 23.05.15.
 */
@XStreamAlias("nd")
public class Nd {
    @XStreamAsAttribute
    public long ref;

    @Override
    public String toString() {
        return "Nd{" +
                "ref=" + ref +
                '}';
    }
}
