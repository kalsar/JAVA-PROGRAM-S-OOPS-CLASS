import java.util.Scanner;
class Rectangle{
    public static void main(String[] args) {
        double height,width;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter height of Rectangle:");
        height =s.nextDouble();
        System.out.println("Enter height of Rectangle:");
        width =s.nextDouble();
        double Area=height*width;
        System.out.println("Area is:"+Area);
    }
}