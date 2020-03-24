package template;

public abstract class Network {
	
	String userName;
	String password;
	
	Network(){}
	
	public boolean post(String message){
		if(login(this.userName, this.password)){
			boolean result = sendData(message.getBytes());
			logout();
			return result;
		}
		return false;
	}
	
	abstract boolean login(String userName, String password);
	
	abstract boolean sendData(byte[] data);
	
	abstract void logout();

}
