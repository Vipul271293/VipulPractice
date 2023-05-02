
public class NormalString {

	public static void main(String[] args) {
		
		
		
		NormalMethod VP = new NormalMethod();
		
         VP.getdata();
		
		System.out.println("----------------------");
		
		NormalMethod.printstar();
		
		
		// String literal - String is Object
		//String s = "Vipul Chhotubhai Patel"; 
		
		//new Keyword
		//String S1 = new String("Vipul Patel");
		
		String S3 = "Vipul Chhotubhai Patel";
		
		String[] QA =  S3.split("Chhotubhai");
		
		//System.out.println(QA[0]);
		//System.out.println(QA[1]);

		for(int i=0; i <S3.length(); i++)
		{
			System.out.println(S3.charAt(i));
		} 
		
		System.out.println("******************************");
		
		for(int i= S3.length()-1; i >=0; i--)
		{
			System.out.println(S3.charAt(i));
		}
		
		
		

		
	}

}
