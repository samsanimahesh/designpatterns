package state;

public class Vibration implements AlertState{

	@Override
	public void alert(AlertStateContext state) {
		System.out.println("State set to Vibration");
	}

}
