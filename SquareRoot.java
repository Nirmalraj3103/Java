package javatask;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Printing the square root of Numbers");

		int num =69;
		for (int i=1;i<=num/2;i++) {
			if ((i*i) == num )
			{
				System.out.println(num+" is a Perfect Square ");
				
				return;
			}
		}
		System.out.println(num+" is not a Perfect Square ");

	}

}
