package bridge;

public class BridgeTest {
	public static void main(String[] args) {
		String os = "linux";
		FileDownloaderAbstraction provider = null;
		
		switch(os){
			case "linux":
				provider = new FileDownloaderAbstractionImpl(new LinuxFileDownloadImplementor());
				break;
			default:
				System.out.println("OS not supported");
		}
		
		Object obj = provider.download("mypath");
		provider.store(obj);
				
	}

}
