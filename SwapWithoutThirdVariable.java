import java.util.Scanner;
class SwapWithoutThirdVariable{
	public static void main(String[] args)
	{
		
  int a,b,temp,c;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any two number");
  a=sc.nextInt();
  b=sc.nextInt();
 
  System.out.println("Before swapping a="+a+" b="+b);
  
  a=a+b;
  b=a-b;
  a=a-b;
  
  
  System.out.println(" After swapping a="+a+" b="+b);
	}
}
  
  
  
