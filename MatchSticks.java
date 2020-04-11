import java.util.Scanner;

class MatchStick
{
	public static void main(String args[])
	{
		int z=-1,x,i,sticks=21;
        
     
		System.out.println("WELCOME TO THE MATCH STICK GAME");
		
		while(sticks>1)
		{

			key:{

				System.out.print("Its user turn:"); 					
			    	Scanner keyboard=new Scanner(System.in);
	                    	x=keyboard.nextInt();
               
				
			                  

				if(x>4)
				{
                        		System.out.println("You have entered a wrong number");
					break key;
				}

				z=5-x;

 	                	System.out.println("Its Computers turn:"+z);
  				
				sticks-=5;
  				System.out.println("The number of match sticks remaning are:" + sticks);
			
			}

		}


		System.out.println("The computer won the match");
        }

}