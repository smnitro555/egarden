public class LowWaterShutoff extends Thread {
	private int monitorPin = 0;
	private StateObject controlling;
	private boolean condition = false;

	public LowWaterShutoff(int pinNumber, StateObject system) {
		monitorPin = pinNumber;
		controlling = system;
	}

	public void start() {
		condition = true;
		while (condition) {
			//check the float switch resistence
			if () {
				// ok condition do nothing
			} {
				// bad condition
				system.stop();
				this.stop();
			}
		}

	}

	public void stop() {
		condition = false;
	}
}