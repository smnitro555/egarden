import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

public class DripThread extends Thread {
	private int timeActive;
	private int pin = 0;

	public DripThread(int timeOn, int controlPin) {
		timeActive = timeOn;
		pin = controlPin;
		gotime();
	}

	private gotime() {
		boolean aliveStatus = true;
		// Set pin on 
		// timeOn
	}
}