import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class Program {
 
	public static void main(String[] args) {
		
		String id = "My APT 408";
		
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		
		Lighting lamp = new Lighting(id + " / Hall Lamp");
		lamp.on();
	
	}

}
