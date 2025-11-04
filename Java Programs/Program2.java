/*Write a program to create a class X and this class will contain one method display without parameter and return value but this method will display a message CLASS X. 
 * Create another class Y and class Y inherit the property of class X. Class Y also contain one method show without paramter and without return value but this method will print a message CLASS Y. 
 * Create another class Z and this class will inherit the property of class Y and class Z will contain one method print, but print method will not return any value and will not pass any parameter.
 * Print method will print the message CLASS Z. Class Z also contain main method and in this main method call all the methods of class Z.

 */

class X{
    void display(){
        System.out.println("Class X");
    }
}
class Y extends X{
    void show(){
        System.out.println("Class Y");
    }
}
class Z extends Y{
    void print(){
        System.out.println("Class Z");
    }
    public static void main(String agrs[])
    {
        Z obj= new Z();
        obj.print();
        obj.show();
        obj.display();
    }
}