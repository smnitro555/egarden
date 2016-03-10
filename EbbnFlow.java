import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

public class EbbnFlow extends HydroSystem implements Runnable {
	
	public EbbnFlow(boolean condition, int pumpSetPin, int waterLevelSetpin, int waterHighPin) {
		if (condition) {
			System.out.println("Setting up Ebb and Flow System");
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