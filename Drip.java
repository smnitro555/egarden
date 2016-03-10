import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

public class Drip extends HydroSystem implements Runnable {
	private int timeOn = 0;
	private int timeOff = 0;
	private int pumpPin = 0;
	private int waterLevelPin = 0;

	public Drip(boolean condition) {
		if (condition) {
			System.out.println("Setting up Drip System");
			adjustSystemParam();
		}
	}

	public void initiateSystem() {

	}

	public void adjustSystemParam() {

	}

	public void terminateSystem() {
		
	}

}