
package org.usfirst.frc.team178.robot;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;

public class Encoder_Test extends IterativeRobot {
	public static final int ppr = 1024; // Pulses per revolution
	Encoder encoder;					// Encoder Object
	
    public void robotInit() {
    	// Initialize encoder with the following parameters
    	//  Digital Channel A: 0
    	//  Digital Channel B: 1
    	//  Reverse Direction: False
    	//  Encoding Type: k4X, which counts both the rise and fall of the pulses
    	encoder = new Encoder(0, 1, false, EncodingType.k4X);
    }
    
    public void autonomousInit() {

    }

    public void autonomousPeriodic() {

    }

    public void teleopPeriodic() {
        
    }
    
    public void testPeriodic() {
    	// Print the displacement of the encoder in revolutions and pause for 0.1 seconds
    	System.out.println("Displacement: " + encoder.getDistance());
    	Timer.delay(0.100);
    }
    
}
