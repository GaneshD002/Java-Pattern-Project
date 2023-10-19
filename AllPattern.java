import java.util.*;
class Pattern
{
	public static void rectangleP()
	{
		System.out.println("---------------------------------------------");
		System.out.println("**************1.Solid Rectangle****************");
		System.out.println("---------------------------------------------");
	       /****
		****
		****
		****/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value For Row => ");
		int n = sc.nextInt();
		System.out.print("Enter Value For Column => ");
		int m = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
	}
	public static void hollowP()
	{
		System.out.println("**************2.Hollow Rectangle****************");
		System.out.println("---------------------------------------------");
		/****
		 *  *
		 *  *
		 ****/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value For Row => ");
		int n = sc.nextInt();
		System.out.print("Enter Value For Column => ");
		int m = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				if(i==1||j==1||i==n||j==m)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
        			}
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
	}
	public static void halfPyramidP()
	{
		System.out.println("***************3.Half Pyramid******************");
		System.out.println("---------------------------------------------");
		/*
		 **
		 ***
		 ****/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size => ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
	}
	public static void invertedPyramidP()
	{
		System.out.println("***********4.Inverted Half Pyramid*************");
		System.out.println("---------------------------------------------");
		/****
		 ***
		 **
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size => ");
		int n = sc.nextInt();
		for(int i=n; i>=1; i--)
		{
    			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
     		}
		System.out.println("---------------------------------------------");
	}
	public static void rightHalfPyramid()
	{
		System.out.println("*************5.Right Half Pyramid**************");
		System.out.println("---------------------------------------------");
	           /*
		   **
		  ***
		 ****/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size => ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
    			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
	}
	public static void invertedRightPyramid()
	{
		System.out.println("**********6.Inverted Right Half Pyramid******");
		System.out.println("---------------------------------------------");
		/****
		  ***
		   **
		    */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size => ");
		int n = sc.nextInt();
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		System.out.println("---------------------------------------------");
	}
	public static void butterFly()
	{
		System.out.println("***************7.ButterFly*******************");
		System.out.println("---------------------------------------------");
		/*      *
		 **    **
		 ***  ***
		 ********
		 ********
		 ***  ***
		 **    **
		 *      */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size => ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int j=1; j<=2*(n-i); j++)
			{
				System.out.print(" ");	
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int j=1; j<=2*(n-i); j++)
			{
				System.out.print(" ");	
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
	}
	public static void tringle()
	{
		System.out.println("***************8.Tringle*********************");
		System.out.println("---------------------------------------------");
		   /*
      		   ***
    		  *****
  		 *******/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size => ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
 				System.out.print("*");
  			}
			for(int j=1; j<=i-1; j++)
			{
				System.out.print("*");
 			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
	}
	public static void diamond()
	{
		System.out.println("***************9.Diamond*********************");
		System.out.println("---------------------------------------------");
		   /*
		   ***
		  *****
		 *******
      	 	 *******
 		  *****
		   ***
		    */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size => ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
 			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
  			}
			for(int j=1; j<=i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
  		}
		for(int i=n; i>=1; i--)
		{
 			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
  			}
			for(int j=1; j<=i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
  		}
		System.out.println("---------------------------------------------");		
	}
	public static void zeroOneTringle()
	{
		System.out.println("***************10.0-1 Tringle****************");
		System.out.println("---------------------------------------------");
		/*0
		  1 0
		  0 1 0
		  1 0 1 0*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size => ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if((i+j)%2==0)
				{
					System.out.print("0 ");
				}
				else{
					System.out.print("1 ");
				}
 			}
			System.out.println();
  		}
		System.out.println("---------------------------------------------");
	}
	public static void name()
	{
		Scanner sc = new Scanner(System.in);
		boolean value = true;
		while(value == true)
		{
			System.out.print("Enter Your Choice => ");
			char ch = sc.next().charAt(0);
			switch(ch)
			{
				case '1':
					rectangleP();
				break;
				case '2':
					hollowP();
				break;
				case '3':
					halfPyramidP();
				break;
				case '4':
					invertedPyramidP();
				break;
				case '5':
					rightHalfPyramid();
				break;
				case '6':
					invertedRightPyramid();
				break;
				case '7':
					butterFly();
				break;
				case '8':
					tringle();
				break;
				case '9':
					diamond();
				break;
				case 'A':
					zeroOneTringle();
				break;
			
				case 'B':
					rectangleP();
					hollowP();
					halfPyramidP();
					invertedPyramidP();
					rightHalfPyramid();
					invertedRightPyramid();
					butterFly();
					tringle();
					diamond();
					zeroOneTringle();
				break;
				case '0':
					value = false;
				break;
				default :
					System.out.println("Invalid Choice Please Enter 1-11 Only!!");
				break;
			}
		}
	}
	public static void main(String args[])
	{
		System.out.println("---------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name ==> ");
		String name = sc.nextLine();
		System.out.println("---------------------------------------------");
		System.out.println(" Hey "+ name + " !!!!! \n I have some pattern if you want to see please check following index and choose index number \n 1.Solid Rectangle \n 2.Hollow Rectangle \n 3.Half Pyramid \n 4.Inverted Half Pyramid \n 5.Right Half Pyramid \n 6.Inverted Right Half Pyramid \n 7.ButterFly \n 8.Tringle \n 9.Diamond \n A.0-1 Tringle  \n B.For All Pattern \n 0.Exit");
		System.out.println("---------------------------------------------");
		name();
		
	}
}