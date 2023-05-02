
public class Loopexample {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// print 4 to 1
		
		System.out.println("Pattern 4 To 1");
		int k = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = i; j <= 4; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}

		System.out.println("Pattern 1 To 4");
		// print 1 to 4
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}

		
		// print 1 to 4 with add number
		System.out.println("Pattern 1 To 4 with addition");
		int num = 3;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num);
				System.out.print("\t");
				num += 10;

			}
			System.out.println();
		}
		
		System.out.println("Pattern 4 To 1 with addition");
		int a=2;
		for (int i=1;i<4;i++)
		{
			for(int j=i;j<4;j++)
			{
				System.out.print(a);
				System.out.print("\t");
				a += 10;
			}
			System.out.println();
		}

	}

}
