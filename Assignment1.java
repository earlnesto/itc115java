
public class Assignment1 {

	public static void main(String[] args) {
		
		int count = 12, num1 = 1, num2 = 1;
        System.out.println("The first "+count+" Fibonacci numbers are: ");
        System.out.println();
        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }

	}

}
