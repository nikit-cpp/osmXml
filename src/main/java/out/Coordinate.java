package out;

/**
 * Created by nik on 23.05.15.
 */
public class Coordinate {
    public double lat1;
    public double lon1;

    public double lat2;
    public double lon2;

    public Coordinate(double lon1, double lat2, double lon2, double lat1) {
        this.lon1 = lon1;
        this.lat2 = lat2;
        this.lon2 = lon2;
        this.lat1 = lat1;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "lat1=" + lat1 +
                ", lon1=" + lon1 +
                ", lat2=" + lat2 +
                ", lon2=" + lon2 +
                '}';
    }
}
