import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

public class DripRunnable extends Thread {
	private DripThread temp;

	public DripRunnable(int timeOn, int timeOff, StateObject o) {
		boolean cont = true;
	}
	
	public void start() {
		while (cont) {
			//do something
			sleep(timeOff)
			if (o.checkState()) {
				temp = new DripThread(); 
				System.out.println("Got to checkState of Drip Runnable Thread");
			}
		}
	}

	public void stop() {
		this = null;
	}

}