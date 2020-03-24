package mediator;

public class Flight {

	private ATCMediator atcMediator;

	public Flight(ATCMediator atcMediator) {
		this.atcMediator = atcMediator;
	}

	public void land() {
		System.out.println("Landing Plane...");
		atcMediator.setLandingStatus(true);
		System.out.println("Landing Plane successful");
	}

}
