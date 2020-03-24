package singleton;

public class EagerSingletonTest {
	public static void main(String[] args) {
		EagerSingleton eagerSingleton = EagerSingleton.getInstance();
		eagerSingleton.printInstance();
	}

}

class EagerSingleton{
	private static EagerSingleton eagerSingleton = new EagerSingleton();
	StringBuilder builder = new StringBuilder();
	private EagerSingleton(){
		System.out.println("Eagerly initialized");
	}
	
	public static EagerSingleton getInstance(){
		return eagerSingleton;
	}
	
	public void printInstance(){
		System.out.println("Object initialized eagerly");
	}
}
