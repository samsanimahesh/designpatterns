package singleton;

class Singleton {
	
	private static Singleton singleton = new Singleton();
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return singleton;
	}
	
	public void printInstance(){
		System.out.println("Singleton instance has been created");
	}

}

public class SingletonTest{
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.printInstance();
	}
}
