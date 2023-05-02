import java.lang.reflect.Array;
import java. util. ArrayList;
import java.util.Arrays;
import java.util.List;
public class NormalArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Vipul");
		a.add("Ketan");
		a.add("Avi");
		
		System.out.println(a.contains("Vipul"));
		System.out.println("******************************");
		
		System.out.println(a.get(0));
		System.out.println("******************************");

	for (int i=0;i<a.size();i++)	
	{
		System.out.println(a.get(i));
	}
	
	System.out.println("******************************");
	for (String S : a)	
	{
		System.out.println(S);
	}
	
	System.out.println("******************************");
	String[] arry1 = {"vipul", "Avi", "Jay"}; //String Array
	
	List<String> newarraylist = Arrays.asList(arry1);
	
	System.out.println(newarraylist.contains("vipul"));
	}

}
