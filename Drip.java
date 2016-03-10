import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

/**
* A Class for Drip System
* @author ESW
* @version 1
*/
public class Drip extends HydroSystem implements Runnable {
	private int timeOn = 0;
	private int timeOff = 0;
	private int pumpPin = 0;
	private int waterLevelPin = 0;

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

	}

	public void adjustSystemParam() {

	}

	public void terminateSystem() {
		
	}

}