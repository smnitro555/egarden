/**
* A Class for Drip System
* @author ESW
* @version 1
*
* The purpose of this class is to act as a link between the user and the 
* thread that controls the drip system. UI communication should not occur
* in the DripRunnable or DripThread threads!
*/
public class Drip extends HydroSystem {
	private int timeOn = 0;
	private int timeOff = 0;
	private int pumpPin = 0;
	private int waterLevelPin = 0;
	private DripRunnable dripSystem;

    /**
    * Drip System Object Constructor
    * @param condition Whether to create system or placeholder
    */
	public Drip(boolean condition) {
		if (condition) {
			System.out.println("Setting up Drip System");
			adjustSystemParam();
		}
	}

    /**
    * Creates the Drip System, this object is what the user interfaces to. 
    */
	public void initiateSystem() {
		// Creates Runnable Drip Object - This thread controls the continous thread
		dripSystem = new DripRunnable(timeOn, timeOff, pumpPin, waterLevelPin);
		dripSystem.start();
	}

    /**
    * Prompts the user through the system parameters that they want to change for the
    * drip system. 
    */
	public void adjustSystemParam() {

	}

    /**
    * Turns off the Drip System
    */
	public void terminateSystem() {
		dripSystem.stop();
	}

}