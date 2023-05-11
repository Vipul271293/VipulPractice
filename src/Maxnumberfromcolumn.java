
public class Maxnumberfromcolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		int[][] abc = {{1,11,3},{2,5,34}, {4,6,20}};
		
		int min = abc[0][0];
		int mincolumn = 0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				if(abc[i][j]<min)
				{
					min =abc[i][j];
					 mincolumn =j;
					
				}
			}
		} System.out.println(min);
		
		int k=0;
		int maxcolumn = abc[0][mincolumn];
		while (k<3)
		{
		 if(abc[k][mincolumn] > maxcolumn)
		 {
			 maxcolumn = abc[k][mincolumn] ;
		 }
		 k++;
		}
		 System.out.println(maxcolumn);
		
	
	} 
	
	// TODO Auto-generated method stub

}
