/**
 * 
 */
package vehicles;

/**
 * @author jwan01
 *
 */
public class ModelAirplaneBuilder {
	
	private Airplane airplane;
	private Flying flying;
	private LiftOff liftOff;

	public Airplane getAirplane() {
		
		return airplane;
	}

	public void buildFlying() {
		FlyingFactory flyingFactory = new FlyingFactory();
		flying = flyingFactory.createFlying("Model Airplane");
	}

	public void buildLiftOff() {
		LiftOffFactory liftOffFactory = new LiftOffFactory();
		liftOff = liftOffFactory.createLiftOff("don't");
		
	}

	public void buildAirplane() {
		airplane = new Airplane(liftOff,flying);
		
	}
}
