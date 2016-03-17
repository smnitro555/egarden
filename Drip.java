/**
* A Class for Drip System
* @author ESW
* @version 1
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

	public void initiateSystem() {
		dripSystem = new DripRunnable(timeOn, timeOff);
		dripSystem.start();
	}

	public void adjustSystemParam() {

	}

	public void terminateSystem() {
		dripSystem.stop();
	}

}