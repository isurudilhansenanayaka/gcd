import java.util.Scanner;
import java.util.Arrays;
public class gcd{
	public int x=8;

	public static void main(String args[]) {
   		char[] a = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
   		String b = new String(a);
   		System.out.println(b.indexOf('o'));
   		String t = String.copyValueOf(a);
   		System.out.println(t);
   		try{
   			System.out.println(5/0);
   		}
   		catch(ArithmeticException e){
   			   		}
    }


	 /*System.out.println(Integer.parseInt("25"));
	int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");
	//capture the input in an integer
	int num=scan.nextInt();
    int i=2;
    while(i<=num)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	   i++;
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
*/	

}


    

