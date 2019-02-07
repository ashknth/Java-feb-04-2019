package Array;
import java.util.Scanner;

public class ArrayImpl {



    public static void main(String[] args) {

        int []arr= new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        int ant[]=new int[5];
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int am=scanner.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<am;i++)
            {
               ant[i]=scanner.nextInt();
            }

            System.out.println("The array list is ::");
            for(int i=0;i<am;i++)
             {
            System.out.println(ant[i]);
           }

        }
    }
