package adapter;

public class AdapterTest {
	public static void main(String[] args) {
		Movable bugattiVeyron = new BugattiVeyron();
	    MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
	    System.out.println("Veyron speed is "+bugattiVeyronAdapter.getSpeed());
	}
}
