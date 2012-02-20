/**
 * 
 */
package vehicles;

/**
 * @author jwan01
 *
 */
public class ModelAirplaneBuilder implements AirplaneBuilderInterface {
	
	private Airplane airplane;
	private Flying flying;
	private LiftOff liftOff;

	public Airplane getAirplane() {
		
		return airplane;
	}

	public void buildFlying() {
		flying = FlyingFactory.createFlying("Model Airplane");
	}

	public void buildLiftOff() {
		liftOff = LiftOffFactory.createLiftOff("don't");
		
	}

	public void buildAirplane() {
		airplane = new Airplane(liftOff,flying);
		
	}
}
