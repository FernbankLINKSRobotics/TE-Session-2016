package drive;
import org.usfirst.frc.team4468.robot.*;


public class Drive {
	private static boolean solenoidOn = false;
	private static boolean beenPressed = false;
	
	public static void go(){
    	CMap.drive.tankDrive(CMap.leftStick.getY() * -1, CMap.rightStick.getY());
    	//We multiply by -1 to invert the left side of motors so we don't
    	//Have the robot spinning in circles
    	
    	if(CMap.leftStick.getTrigger()){
    		//If the button is pressed
    		if(!beenPressed){
    			//and it wasn't pressed in previous cycle.
    			//REMEMBER, code is called every 20ms
    			solenoidOn = !solenoidOn;
    			//Change state of Solenoid
    		}
    		
    		beenPressed = true;
    		//Set BeenPressed to True since the button is pressed
    	} else {
    		//Since we're not holding it, set it to false
    		beenPressed = false;
    	}
    	
    	if(solenoidOn){
    		CMap.leftSolenoid.set(true);
    		CMap.rightSolenoid.set(true);
    		//Place the robot in High Gear
    	} else {
    		CMap.rightSolenoid.set(false);
    		CMap.leftSolenoid.set(false);
    		//Otherwise Low Gear
    	}
	}
}
