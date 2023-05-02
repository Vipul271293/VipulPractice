import java. util. ArrayList;

public class NormalMethod {

	public static void main(String[] args) {
		
		
		NormalMethod VP = new NormalMethod();
		VP.getdata();
		
		System.out.println("----------------------");
		
		printstar();
		

	}
	
	
	public void getdata()
	{
		System.out.println("QA VCP testing");
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Vipul Patel");
		a.add("Avinash");
		System.out.println(a);
		
	}
	
	public static void printstar()
	{
		int n=4;
		for (int i=0; i<n;i++)
		{
			for (int J=0; J<=i;J++)
			{
				System.out.print("*");	
			}
			System.out.println();	
		}
	}

}
