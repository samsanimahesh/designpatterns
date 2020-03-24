package mediator;

public class Runway {
	
	private ATCMediator atcMediator;
	
	public Runway(ATCMediator atcMediator){
		this.atcMediator = atcMediator;
	}
	
	public void land(){
		System.out.println("Landing permission granted."); 
		atcMediator.setLandingStatus(true);
	}

}
