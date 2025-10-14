/*
Write a program to create a class A. This class will contain 1 instance variable x with value 20.
This class also contain 1 static variable y then after this class also contain main method and main method contain one local variable z with value 68.97 .
Print the variable x,y and z in main function ?
*/

class A
{
    int x= 20;
    static int y;
    public static void main(String args[])
    {
        double z= 68.97;
        A obj= new A(); // <class name> <object/ varible name> = new <class name>(if agrument passed enter in the bracket); 
        System.out.println("x = " + obj.x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }

} 
