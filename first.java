import java.util.*;
class Demo {
    public static void main(String arr[]) {
        int a;
        float b;
        String name;
        Scanner obj = new Scanner(System.in);
        System.out.print("Number Daal : ");
        a = obj.nextInt();
        System.out.print("Enter Float Value : ");
        b = obj.nextFloat();
        System.out.print("Enter A String");
        name = obj.next();
        System.out.println("The Number Is : "+a+"The Floating Number : "+b+"The Name Is : "+name);
    }
}