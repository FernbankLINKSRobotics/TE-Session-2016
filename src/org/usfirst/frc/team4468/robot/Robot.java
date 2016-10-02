
package org.usfirst.frc.team4468.robot;

import drive.Drive;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    final String defaultAuto = "Default";
    final String customAuto = "My Auto";
    String autoSelected;
    SendableChooser chooser;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    }
    
    public void autonomousInit(){
    	
    }
    
    public void autonomousPeriodic(){
    	
    }
    
    public void teleopInit(){
    	System.out.println("My angle is " + CMap.gyro.getAngle());
    }
    
    public void teleopPeriodic(){
    	Drive.go();
    	
    }
}
