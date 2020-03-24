package state;

public class AlertStateContext {
	
	AlertState alertState;
	
	public AlertStateContext(){
		this.alertState = new RingState();
	}
	
	public void changeStateTo(AlertState state){
		this.alertState = state;
	}
	
	public void alert(){
		alertState.alert(this);
	}

}
