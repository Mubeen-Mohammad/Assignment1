//Assignment-1:
//write a java program to Sort the  list of integers using Bubble sort 

import java.util.Scanner;

public class Bubblesort {

    public static void sort(int arr[]){
        
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i] <  arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }

    }
    public static void printarr(int[] arr){
        
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    } 

    
    public static void main(String[] args) {
        
        System.out.println("Enter a no of elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        System.out.print("Array elements : ");
        sc.close();

        sort(arr);
        System.out.print("Sorted array :");
        printarr(arr);
    }
    
}
