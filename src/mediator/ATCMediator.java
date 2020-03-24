package mediator;

public interface ATCMediator {
	
	public void registerPlane(Flight flight);
	
	public void registerRunway(Runway runway);
	
	public boolean isLandingOk(); 
	
	public void setLandingStatus(boolean status);
	
}
