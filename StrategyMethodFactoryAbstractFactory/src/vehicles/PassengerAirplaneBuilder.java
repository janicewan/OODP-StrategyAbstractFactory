/**
 * 
 */
package vehicles;

/**
 * @author jwan01
 *
 */
public class PassengerAirplaneBuilder implements AirplaneBuilderInterface {

	private Airplane airplane;
	private Flying flying;
	private LiftOff liftOff;

	/* (non-Javadoc)
	 * @see vehicles.AirplaneBuilderInterface#getAirplane()
	 */
	@Override
	public Airplane getAirplane() {
		// TODO Auto-generated method stub
		return airplane;
	}

	/* (non-Javadoc)
	 * @see vehicles.AirplaneBuilderInterface#buildFlying()
	 */
	@Override
	public void buildFlying() {
		flying = FlyingFactory.createFlying("Passenger Airplane");

	}

	/* (non-Javadoc)
	 * @see vehicles.AirplaneBuilderInterface#buildLiftOff()
	 */
	@Override
	public void buildLiftOff() {
		liftOff =  LiftOffFactory.createLiftOff("Horizontally");

	}

	/* (non-Javadoc)
	 * @see vehicles.AirplaneBuilderInterface#buildAirplane()
	 */
	@Override
	public void buildAirplane() {
		airplane = new Airplane(liftOff,flying);

	}

}
