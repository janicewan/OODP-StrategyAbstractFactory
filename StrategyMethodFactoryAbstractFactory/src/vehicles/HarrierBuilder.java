/**
 * 
 */
package vehicles;

/**
 * @author jwan01
 *
 */
public class HarrierBuilder {

	private Airplane airplane;
	private Flying flying;
	private LiftOff liftOff;

	public Airplane getAirplane() {
		
		return airplane;
	}

	public void buildFlying() {
		flying = FlyingFactory.createFlying("Fighter Jet");
	}

	public void buildLiftOff() {
		liftOff = LiftOffFactory.createLiftOff("Vertically");
		
	}

	public void buildAirplane() {
		airplane = new Airplane(liftOff,flying);
		
	}

}
