package proxy;

public class RealInternet implements Internet{

	@Override
	public void connectTo(String webSite) {
		System.out.println("Connected to "+webSite);
	}
	

}
