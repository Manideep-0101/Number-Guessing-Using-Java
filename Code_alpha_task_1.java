/* 
NUMBER GUESSING GAME

The system generates a random number from a given range, say 1 to 100.
The user is prompted to enter their given number in a displayed dialogue box.
The computer then tells if the entered number matches the guesses number or it is
higher/lower than the generated number.
The game continues under the user guessing the number

Laptop with Browser Icon
The fun and easy project �Guess the Number� is a short Java project that allows the user
to guess the number generated by the computer & involves the following steps:
*/

import java.util.Random;
import java.util.Scanner;
class Code_alpha_task_1
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("****** Enter the Inputs in Integer Format *******");
		System.out.println("  ");
        int attempts = 1;
        Random rand = new Random();
        int temp = rand.nextInt(100) + 1;
		System.out.println("Enter Your Guessed Number: ");
        while (true)
		{
			int input = sc.nextInt();
            if(input == temp)
			{
				System.out.println("The System Generated Number is : "+temp);
				System.out.println("   ");
                System.out.println("The Guessed Number and System Generated Number Matched in "+attempts+" attempts...!!!!");
                break;
            }
            if(input < temp)
			{
                System.out.println("Enter a Higher Number : ");
            }
            if(temp < input)
			{
                System.out.println("Enter a Lower Number : ");
            }
            attempts++;
        }
    }
}