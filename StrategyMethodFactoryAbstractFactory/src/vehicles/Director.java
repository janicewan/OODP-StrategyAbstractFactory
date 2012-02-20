/**
 * 
 */
package vehicles;

/**
 * @author jwan01
 *
 */
public class Director {

	private HarrierBuilder builder;
	private ModelAirplaneBuilder builder2;


	public Director(HarrierBuilder builder) {
		this.builder = builder;
	}

	public Director(ModelAirplaneBuilder builder2) {
		this.builder2 = builder2;
	}

	public void constructAirplane() {
		builder.buildFlying();
		builder.buildLiftOff();
		builder.buildAirplane();
		
	}

}
