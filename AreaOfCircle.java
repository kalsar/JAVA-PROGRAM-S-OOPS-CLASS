 import java.util.Scanner;
class Circle {
    int r;
    double pi=3.14,area;
    
    public static void main(String[] kk) {
        Circle m=new Circle();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Circle redius");
       m.r=s.nextInt();
        m.area=m.pi*m.r*m.r;
                System.out.println("Area is:"+m.area);
        
    }
}