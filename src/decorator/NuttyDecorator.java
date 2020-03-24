package decorator;

public class NuttyDecorator extends IcecreamDecorator{

	public NuttyDecorator(Icecream icecream) {
		super(icecream);
	}
	
	public String makeIcecream(){
		return super.makeIcecream()+" With Nuts";
	}

}
