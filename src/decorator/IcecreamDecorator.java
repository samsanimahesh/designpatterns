package decorator;

public class IcecreamDecorator implements Icecream{
	
	private Icecream icecream;
	
	public IcecreamDecorator(Icecream icecream){
		this.icecream = icecream;
	}

	@Override
	public String makeIcecream() {
		return icecream.makeIcecream();
	}

}
