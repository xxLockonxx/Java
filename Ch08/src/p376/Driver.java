package p376;

import p372.Vehicle;
import p374.Bus;

public class Driver {
	public void driver(Vehicle vehicle) {
		if(vehicle instanceof Bus ) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
