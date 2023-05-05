

public class Multidimentionarray {
	
public static void main(String[] args) throws InterruptedException {
		
	
	int [][] a = new int[2][2];
	
	a[0][0] = 1;
	a[0][1] = 2;
	a[1][0] = 3;
	a[1][1] = 4;
	
	int [][] b= {{1,2},{3,4}, {5,6}};

	int[] c = new int[3];
    c[0] = 1;
    c[1] = 2;
    c[2] = 3;
	//System.out.println(a[0][1]);
	
//	System.out.println(b[1][1]);
   
	
	for (int i=0; i<3; i++)
		
	{
		System.out.println(c[i]);
		
	} 

	
	for (int i=0;i<3;i++)//row
	{
		for(int j=0;j<2;j++)//column
		{
			System.out.print(b[i][j]);
		}
		System.out.println();
	}



		
}
	


}
