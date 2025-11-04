/*
 Write a program to create a class A and this class will contain one method display without paramter and without return value but this method will display a message CLASS A.
 Create another class B nd class B inherit the property of class A.
 class B also contain one method called show and this method will not pass any parameter and will not pass any parameter and will not return any value but show method will display a message CLASS B.
 class B also contains main method and from main method call all the methods of class B
*/

class A{
    void display(){
        System.out.println("Class A");
    }
}
class B extends  A{
    void show(){
        System.out.println("Class B");
    }
    public static void main(String agrs[])
    {
        B obj= new B();
        obj.show();
        obj.display();
    }
}
