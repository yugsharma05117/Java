// Write a program to check whether a string is pallindrome or not.
import java.util.Scanner;
class Pallindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a Pallindrome");
        }
    }
}


