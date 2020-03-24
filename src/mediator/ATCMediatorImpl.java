package mediator;

public class ATCMediatorImpl implements ATCMediator{
	
	Flight flight;
	Runway runway;
	private boolean land;
	public void registerRunway(Runway runway)  
    { 
        this.runway = runway; 
    } 
  
    public void registerPlane(Flight flight)  
    { 
        this.flight = flight; 
    } 
  
    public boolean isLandingOk()  
    { 
        return land; 
    } 
  
    @Override
    public void setLandingStatus(boolean status)  
    { 
        land = status; 
    }

}
