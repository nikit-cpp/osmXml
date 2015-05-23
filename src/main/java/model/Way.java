package model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Created by nik on 23.05.15.
 */
@XStreamAlias("way")
public class Way {
    transient public static final int FIRST_ND = 0;
    transient public static final int SECOND_ND = 1;

    @XStreamAsAttribute
    long id;
    @XStreamImplicit
    public List<Nd> nds;

    @Override
    public String toString() {
        return "Way{" +
                "id=" + id +
                ", nds=" + nds +
                '}';
    }
}
