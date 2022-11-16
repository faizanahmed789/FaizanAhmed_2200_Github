/***************************************
 * 
 * @author Faizan Ahmed
 * @date 11/16/2022 [W]
 *
 */
import java.util.Scanner;
public class PracticeExam06_04v2 {
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		reverse(number);
		input.close();
	}
	public static void reverse(int n) {
		if( n == 0) {
			System.out.println(n);
		}
		while( n != 0) {
			if ( n < 0 ) {
				System.out.print(n % 10);
				n = n * -1;
				n = n /10;
			}
			else {
				System.out.print(n % 10);
				n = n / 10;
			}
			
	}
		
	}

}