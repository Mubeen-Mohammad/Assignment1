import java.util.Scanner;

//Assignment-1
//Write a program to find a factorial of a given program.

public class factorial {
    public static void main(String[] args) {
        
       // int num=5;
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fact=1;
        for(int i = 1; i <= num; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+ num +" is : "+fact);
        sc.close();
    }
    
}
