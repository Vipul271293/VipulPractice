package BasicOops;

public class ChildInheritance extends ParentInteritance{
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildInheritance a = new ChildInheritance();
		a.BikeEngine();
		a.bikecolor();
		a.BikeTier();
		a.getdata();
		a.getdata(5);
		a.getdata(12, "vipul patel");
		a.Biketype();
		
		
		

	}
	
	public void bikecolor()
	{
		System.out.println("Bike Child Color black");
	}


	public void Biketype()
	{
		ChildInheritance ab = new ChildInheritance();
		System.out.println(ab.st);
		
	}
}
