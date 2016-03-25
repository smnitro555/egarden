public class DripRunnable extends Thread {
	private DripThread temp;
	private StateObject stateObj = new StateObject(false);
	private int timeActive = 0;
	private int timeSleep = 0;
	private LowWaterShutoff safety;

	public DripRunnable(int timeOn, int timeOff, StateObject o) {
		boolean cont = true;
		stateObj = new StateObject(true);
	}
	
	public void start() {
		
		while (cont) {
			//do something
			sleep(timeOff)
			if (stateObj.checkState()) {
				temp = new DripThread(); 
				System.out.println("Got to checkState of Drip Runnable Thread");
			}
		}
	}

	public void stop() {
		stateObj.stop();
	}

}