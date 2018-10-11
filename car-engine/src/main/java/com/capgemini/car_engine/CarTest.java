package com.capgemini.car_engine;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class CarTest {
    private Car car;// creating an object for car
    private Engine engine; // create an object for engine
    private FuelTank fuelTank; // create an object for fuelTank

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup() {
    	//What is the use of mock() method in Mockito?
        engine = Mockito.mock(Engine.class);
        fuelTank = Mockito.mock(FuelTank.class);

        car = new Car(engine, fuelTank);
    }

    @Test
    public void isRunning() {
        when(engine.isRunning()).thenReturn(true);
        //What is assertEquals? 
        //What is the argument passed in ? 
        //What will be the output of assertEquals?
          assertEquals(true, car.isRunning());

        when(engine.isRunning()).thenReturn(false);
        assertEquals(false, car.isRunning());
    }

    @Test
    public void start() {
        when(engine.isRunning()).thenReturn(false, true);
        when(fuelTank.getFuel()).thenReturn(100);
        car.start();
    }

    @Test
    public void start_NoFuel() {
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage("Can't start: no fuel");
        when(engine.isRunning()).thenReturn(false);
        when(fuelTank.getFuel()).thenReturn(0);
        car.start();
    }

    @Test
    public void start_IsRunning() {
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage("Engine already running");
        when(fuelTank.getFuel()).thenReturn(100);
        when(engine.isRunning()).thenReturn(true);
        car.start();
    }

    @Test
    public void start_DidNotStart() {
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage("Started engine but isn't running");
        when(engine.isRunning()).thenReturn(false, false);
        when(fuelTank.getFuel()).thenReturn(100);
        car.start();
    }
}