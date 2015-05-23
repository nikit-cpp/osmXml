package runner;

import out.Coordinate;
import out.Worker;
import java.io.FileNotFoundException;
import java.util.List;

public class MainReadVirtualConfig {

	public static void main(String[] args) throws FileNotFoundException {		
		String originalOsm = "osm.xml";

		List<Coordinate> coordinates = Worker.readCoordinates(originalOsm);
		for(Coordinate coordinate: coordinates) {
			System.out.println("lat1=" + coordinate.lat1+ ", lon1 =" + coordinate.lon1 + ", lat2=" + coordinate.lat2 + ", lon2 =" + coordinate.lon2);
		}
	}
}
