package adapter;

public class MovableAdapterImpl implements MovableAdapter{
	
	private Movable luxuryCar;
	
	public MovableAdapterImpl(Movable luxuryCar){
		this.luxuryCar = luxuryCar;
	}

	@Override
	public double getSpeed() {
		return luxuryCar.getSpeed();
	}

}
