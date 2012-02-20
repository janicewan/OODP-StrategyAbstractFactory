/**
 * 
 */
package vehicles;

/**
 * @author jwan01
 *
 */
public class Director {

	private AirplaneBuilderInterface builder;


	public Director(AirplaneBuilderInterface builder) {
		this.builder = builder;
	}

	public void constructAirplane() {
		builder.buildFlying();
		builder.buildLiftOff();
		builder.buildAirplane();
		
	}

}
