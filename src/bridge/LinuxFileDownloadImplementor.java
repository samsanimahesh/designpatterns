package bridge;

public class LinuxFileDownloadImplementor implements FileDownloadImplementor{

	@Override
	public Object downloadFile(String path) {
		return "linux"+path;
	}

	@Override
	public boolean storeFile(Object object) {
		System.out.println("Saved to linux folder path");
		return true;
	}

}
