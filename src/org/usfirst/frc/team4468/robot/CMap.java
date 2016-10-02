package org.usfirst.frc.team4468.robot;
import edu.wpi.first.wpilibj.*;

public class CMap {

    //Create Objects for Drive System
    public static Talon leftFrontDrive, rightFrontDrive, rightBackDrive, leftBackDrive;
    public static Joystick leftStick;
	public static Joystick rightStick;
	
	//Create CameraServer for USB Camera
	public static CameraServer server;
	
	//Creates Gyro Object - Measures Angle
	public static AnalogGyro gyro;
    
	//Creates RobotDrive object
    public static RobotDrive drive;
    
    //Creates Compressor object
    public static Compressor compressor;
    
    //Creates Solenoid Objects
    public static Solenoid leftSolenoid, rightSolenoid;
    
    public void initialize(){
    	
    	//Says that Gyro was in Port 1
    	gyro = new AnalogGyro(1);

    	//Creates Talon Objects in RIO Ports 0, 1, 2, 3
    	leftFrontDrive = new Talon(0);
    	rightFrontDrive = new Talon(1);
    	rightBackDrive = new Talon(2);
    	leftBackDrive = new Talon(3);
    	
    	//Says that Joystick is in USB Ports 1, 2 on Laptop
    	leftStick = new Joystick(1);
    	rightStick = new Joystick(2);
    	
    	//Creates virtual RobotDrive object
    	drive = new RobotDrive(leftFrontDrive, leftBackDrive, rightFrontDrive, rightBackDrive);
    	
    	//Creates Compressor Object
    	compressor = new Compressor();
    	//Has the compressor stay under 120 psi
    	compressor.setClosedLoopControl(true);
    	
    	
    	//Solenoids in ports 1, 2 on PCM
    	leftSolenoid = new Solenoid(1);
    	rightSolenoid = new Solenoid(2);
    	
    	//Sets up Server for USB Camera
    	server = CameraServer.getInstance();
    	server.setQuality(50);
    	server.startAutomaticCapture();
    }
}
