package state;

public class StateDemo {
	public static void main(String[] args) {
		AlertStateContext stateContext = new AlertStateContext(); 
        stateContext.alert(); 
        stateContext.alert(); 
        stateContext.changeStateTo(new Vibration()); 
        stateContext.alert(); 
        stateContext.alert(); 
        stateContext.alert();         
	}

}
