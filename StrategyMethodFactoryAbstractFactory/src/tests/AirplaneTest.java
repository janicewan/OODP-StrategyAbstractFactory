/**
 * 
 */
package tests;

import static org.junit.Assert.*;


import org.junit.Test;

import vehicles.AirPlaneFactory;
import vehicles.Airplane;

import vehicles.APFactory;
import vehicles.AirplaneBuilderInterface;
import vehicles.Director;
import vehicles.Flying;
import vehicles.HarrierBuilder;
import vehicles.HarrierFactory;
import vehicles.ModelAirPlaneFactory;
import vehicles.ModelAirplaneBuilder;
import vehicles.PassengerAirplaneBuilder;
import vehicles.PassengerPlaneFactory;

import vehicles.LiftOff;


/**
 * @author oded
 *
 */
public class AirplaneTest {



	@Test
	public void test1() {
				
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		
//		AirPlaneFactory harrierFactory = new HarrierFactory();
//		Flying fly = harrierFactory.createFlying();
//		LiftOff liftOff = harrierFactory.createLiftOff();

//		AirplaneBuilderInterface builder = new HarrierBuilder();		
//		Director director = new Director(builder);
//		director.constructAirplane();
//		Airplane classUnderTest = builder.getAirplane();
		
		Airplane classUnderTest = APFactory.createAirplane("Harrier");	
		
		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	
	@Test
	public void test2() {
				
		String expectedOutput = "I don't Fly";
		String stringReturned = null;
	
//		AirPlaneFactory modelAirPlaneFactory = new ModelAirPlaneFactory();
//		Flying fly = modelAirPlaneFactory.createFlying();
//		LiftOff liftOff = modelAirPlaneFactory.createLiftOff();
//		Airplane classUnderTest = new Airplane(liftOff,fly);
		
//		AirplaneBuilderInterface builder = new ModelAirplaneBuilder();
//		Director director = new Director(builder);
//		director.constructAirplane();
//		Airplane classUnderTest = builder.getAirplane();
		
		Airplane classUnderTest = APFactory.createAirplane("Model");
				
		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test3() {
				
		String expectedOutput = "Like a passenger airplane";
		String stringReturned = null;
		
//		AirPlaneFactory passengerPlaneFactory = new PassengerPlaneFactory();
//		Flying fly = passengerPlaneFactory.createFlying();
//		LiftOff liftOff =  passengerPlaneFactory.createLiftOff();
//		Airplane classUnderTest = new Airplane(liftOff,fly);	
		AirplaneBuilderInterface builder = new PassengerAirplaneBuilder();
		Director director = new Director(builder);
		director.constructAirplane();
		Airplane classUnderTest = builder.getAirplane();

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	
	@Test
	public void test4() {
				
		String expectedOutput = "Vertically";
		String stringReturned = null;

//		AirPlaneFactory harrierFactory = new HarrierFactory();
//		Flying fly = harrierFactory.createFlying();
//		LiftOff liftOff = harrierFactory.createLiftOff();
//		Airplane classUnderTest = new Airplane(liftOff,fly);
		AirplaneBuilderInterface builder = new HarrierBuilder();
		Director director = new Director(builder);
		director.constructAirplane();
		Airplane classUnderTest = builder.getAirplane();

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test5() {
				
		String expectedOutput = "I don't LiftOff";
		String stringReturned = null;

//		AirPlaneFactory modelAirPlaneFactory = new ModelAirPlaneFactory();
//		Flying fly = modelAirPlaneFactory.createFlying();
//		LiftOff liftOff = modelAirPlaneFactory.createLiftOff();
//		Airplane classUnderTest = new Airplane(liftOff,fly);
		
//		AirplaneBuilderInterface builder = new ModelAirplaneBuilder();
//		Director director = new Director(builder);
//		director.constructAirplane();
		Airplane classUnderTest = APFactory.createAirplane("Model");	

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	@Test
	public void test6() {
				
		String expectedOutput = "Horizontally";
		String stringReturned = null;

//		AirPlaneFactory passengerPlaneFactory = new PassengerPlaneFactory();
//		Flying fly = passengerPlaneFactory.createFlying();
//		LiftOff liftOff =  passengerPlaneFactory.createLiftOff();
//		Airplane classUnderTest = new Airplane(liftOff,fly);
		
		AirplaneBuilderInterface builder = new PassengerAirplaneBuilder();
		Director director = new Director(builder);
		director.constructAirplane();
		Airplane classUnderTest = builder.getAirplane();
				
		
		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}


}
