// write a program to create an array and store 5 elements in this array, then find out miximum and minimum element on this aaray
import java.util.Scanner;
class Even_odd{
    public static void main(String arr[]){
        int i ,min,max;
        int a[]= new int[5];
        Scanner sc=new Scanner(System.in);
        for ( i=0 ; i<=4; i++){
            System.out.println("Enter the arrays");
            a[i]= sc.nextInt();
        }
        min=a[0];
        for ( i=1;i<=4;i++){
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Minimum value is :"+min);

        max=a[0];
        for ( i=1;i<=4;i++)
        {
            if (max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("maximum value is:"+ max);

        }
    }
