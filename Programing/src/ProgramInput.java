import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class ProgramInput {

	public static void main(String[] args) {
		 
//		String id = JOptionPane.showInputDialog("new ID");
		String id = args[0];
		String bright = JOptionPane.showInputDialog("bright Level... to only number");
				
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		
		Lighting lamp = new Lighting(id + " / Hall Lamp");
		lamp.on();
	
		DimmingLights moodLamp = new DimmingLights(id+"moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}

}
