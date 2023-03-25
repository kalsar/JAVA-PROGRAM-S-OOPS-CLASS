import java.util.Scanner;
class Rectangle{
  double height,width;
  double Area;
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
		Rectangle obj=new Rectangle();
        System.out.println("Enter height of Rectangle:");
        obj.height =s.nextDouble();
        System.out.println("Enter height of Rectangle:");
        obj.width =s.nextDouble();
        double obj.Area=obj.height*obj.width;
        System.out.println("Area is:"+obj.Area);
    }
}