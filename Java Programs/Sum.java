/*
 Write a program to create a class Add and this class will contain one method called sum with two parameters of integer datatype.
 Sum method will return the addition of two numbers which are passed as a parameter in sum function.
 Class Add will also contain main method and from main method we will call sum method and here input will be taken from user
 */
import java.util.Scanner;
class Add {
    int sum(int a, int b)
    {
        return a+b;
    }
    public static void main(String agrs[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        Add obj= new Add();
        int result = obj.sum(a,b);
        System.out.println("Sum is : " + result);
    }
}
