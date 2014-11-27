//All rights reserved, Lane Surface November, 2014
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Thansgiving Feast, All rights reserved, Lane Surface November, 2014");
		Thread.sleep(5000);
		System.out.println("Help collect food to feed the African childeren!\n" + "Solve the problems to earn a grain of rice!");
		Thread.sleep(2500);
		
		int grainCount = 0;
		
		while (true)	{
			double numOne = (int)(Math.random()*Integer.MAX_VALUE+Integer.MIN_VALUE);
			double numTwo = (int)(Math.random()*Integer.MAX_VALUE+Integer.MIN_VALUE);
			
			System.out.println("Solve: " + numOne + " + " + numTwo);
			System.out.print(">>\t");
			
			int answer = 0;
			try	{
				answer = sc.nextInt();
			} catch (Exception e)	{
				System.out.println("Please enter a number!!!! Your final grain count was: " + grainCount);
				System.exit(0);
			}
			
			if (answer == (numOne + numTwo)) 	{
				grainCount++;
				System.out.println("Correct!!!! Your grain count is: " + grainCount);
			} else {
				System.out.println("Incorrect!!!! Your final grain count was: " + grainCount);
				System.out.println("The answer was: " + (numOne + numTwo) + " stupid!");
				System.exit(0);
			}
		}
	}
}
