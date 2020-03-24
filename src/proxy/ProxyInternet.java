package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
	
	static List<String> bannedSites = new ArrayList<String>();

	static{
		bannedSites.add("abc.com");
		bannedSites.add("def.com");
	}
	@Override
	public void connectTo(String webSite) {
		if(bannedSites.contains(webSite)){
			System.out.println("Unable to connect to "+webSite);
		}else{
			System.out.println("Connected to "+webSite);
		}
		
	}

}
