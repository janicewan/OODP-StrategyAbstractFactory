/**
 * 
 */
package vehicles;

/**
 * @author jwan01
 *
 */
public class APFactory {

	public static Airplane createAirplane(String string) {
		if (string.equals("Harrier")){
			AirplaneBuilderInterface builder = new HarrierBuilder();
			Director director = new Director(builder);
			director.constructAirplane();
			return builder.getAirplane();
		}
		if (string.equals("Model")){
			AirplaneBuilderInterface builder = new ModelAirplaneBuilder();
			Director director = new Director(builder);
			director.constructAirplane();
			return builder.getAirplane();

		}
		
		return null;
	}

}
