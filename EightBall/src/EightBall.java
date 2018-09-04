
import java.util.Scanner;


public class EightBall



	{

		public static void main(String[] args)
			{

				Scanner sc = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = sc.nextLine();
				System.out.println("Well hello " + name + ". We're gonna play a little game of eight ball, you know how it works?");
				System.out.println("1 for Yes 2 for No");
				
				String answer = sc.nextLine();
					{
						if (answer.equals("1"))
							{
								System.out.println("Alright then lets begin");
							}
						else if (answer.equals("2"))
							{
								System.out.println("Alright well, you pretty much ask a question, and that's that. I answer it.");
								System.out.println("Now let's begin.");
							}
					}
				System.out.println("Ask away. Yes or no questions only!");
				
				String question = sc.nextLine();
					{
						switch (question)
						{
							case :
							case :
									{
										System.out.println("Yes");
									}
						}
					}
				
			}

	}
