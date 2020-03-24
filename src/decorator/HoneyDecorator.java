package decorator;

public class HoneyDecorator extends IcecreamDecorator {

	public HoneyDecorator(Icecream icecream) {
		super(icecream);
	}

	public String makeIcecream() {
		return super.makeIcecream() + addHoney();
	}

	private String addHoney() {
		return " + sweet honey";
	}

}
