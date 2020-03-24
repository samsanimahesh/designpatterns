package decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		Icecream base = new SimpleIceCream();
		Icecream nutty = new NuttyDecorator(base);
		Icecream honey = new HoneyDecorator(nutty);
		
		System.out.println(honey.makeIcecream());
	}

}
