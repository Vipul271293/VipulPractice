package BasicOops;

public class ParentInteritance {
	
	String st = "Working on Inheritance";
	int a =5;
	
	public void BikeEngine()
	{
		
		System.out.println("Bike Engine");
	
	}
	
	public void BikeTier()
	{
		
		System.out.println("Bike Tier");
	
	}

	public void getdata(int a)
	{
		System.out.println(a);
	}
	
	public void getdata()
	{
		System.out.println("Blank getdata method");
		
	}
	
	public void getdata(int a, String st)
	{
		System.out.println(a + st);
		
	}
	
	public void bikecolor()
	{
		System.out.println("Bike Parent Color red");
	}

}
