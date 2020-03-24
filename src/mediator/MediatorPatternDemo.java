package mediator;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		 ATCMediator atcMediator = new ATCMediatorImpl(); 
	        Flight sparrow101 = new Flight(atcMediator); 
	        Runway mainRunway = new Runway(atcMediator); 
	        atcMediator.registerPlane(sparrow101); 
	        atcMediator.registerRunway(mainRunway); 
	        mainRunway.land(); 
	        sparrow101.land(); 
	}
}
