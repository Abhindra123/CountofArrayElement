import java.io.*;
import java.util.*;
public class ArrayElement {

    public static int Counter(int arr[]){

        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]<max){
                count=count+1;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    int count=Counter(arr);
        System.out.println(count);

    }
}