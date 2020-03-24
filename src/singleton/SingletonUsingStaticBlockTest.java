package singleton;

public class SingletonUsingStaticBlockTest {
	public static void main(String[] args) {
		SingletonUsingStaticBlock instance = SingletonUsingStaticBlock.getInstance();
		instance.printInstance();
	}
}


class SingletonUsingStaticBlock{
	private static SingletonUsingStaticBlock staticBlockSingleton;
	
	static{
		System.out.println("Static block called");
		staticBlockSingleton = new SingletonUsingStaticBlock();
	}
	
	private SingletonUsingStaticBlock(){
		
	}
	
	public static SingletonUsingStaticBlock getInstance(){
		return staticBlockSingleton;
	}
	
	public void printInstance(){
		System.out.println("staticBlockSingleton has been initialized");
	}
}