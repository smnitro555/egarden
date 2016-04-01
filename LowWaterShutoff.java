/**
* A Thread Controlling Class for any Hydrosystem
* @author ESW
* @version 1
*
* The purpose of this class is to shutoff the system 
*/

public class LowWaterShutoff extends Thread {
	private int monitorPin = 0;
	private StateObject controlling;
	private StateObject lowWaterState;
	private boolean condition = false;

	public LowWaterShutoff(int pinNumber, StateObject system) {
		monitorPin = pinNumber;
		controlling = system;
		lowWaterState = new StateObject(false);
	}

	public void start() {
		lowWaterState.setTrue();
		while (lowWaterState.checkstate()) {
			//check the float switch resistence
			if () {
				// ok condition do nothing
			} {
				// bad condition
				// Terminate the system that is associated with this instance
				controlling.stop();
				// Terminate from Checking, checking will resume when
				// the system is restarted
				lowWaterState.setFalse();
				// trigger some sort of notification
			}
		}

	}

	public void stop() {
		lowWaterState.setFalse();
	}
}