package BasicOops;

public class CarChildAbstract extends CarParentAbstract{

	public static void main(String[] args)
	{
		
		
		
		CarChildAbstract a = new CarChildAbstract();
		a.CarEngine();
		a.CarSaftey();
		a.Carcolor();
		carwheeltype();
		
		

	}

	@Override
	public void Carcolor() {
		
		System.out.println("Car Color");
		
		
	}
	
	public static void carwheeltype()
	{
		
		System.out.println("Car Wheel type");
	}

}
