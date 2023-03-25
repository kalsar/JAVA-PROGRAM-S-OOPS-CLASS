import java.util.Scanner;
public class Simple_Interest
{
     float p, r, t;
     float si;
    public static void main(String args[]) 
    {
       Simple_Interest m= new Simple_Interest();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
       m.p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        m.r = s.nextFloat();
        System.out.print("Enter the Time period : ");
        m.t = s.nextFloat();
        
        m.si = (m.r * m.t * m.p) / 100;
        System.out.print("The Simple Interest is : " + m.si);
    }
}