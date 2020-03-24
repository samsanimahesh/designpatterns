package state;

public class RingState implements AlertState{

	@Override
	public void alert(AlertStateContext state) {
		System.out.println("Set To Ringing State");
	}

}
