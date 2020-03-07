/* Find max and min number in an array*/
/*[1,2,9,4,3]
max = 9 at index 2
min = 1 at index 0*/
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        /*for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }*/
        
        /*for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Min element" + arr[0]);
        System.out.println("Max element" + arr[n-1]);*/
        
        
        /*[6,5,1,8]
        max = 8   min = 1*/
        /*O(n)*/
        
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min element" + min);
        System.out.println("Max element" + max);
        
        

    }
    
    

}
/*O(n*n)*/
/*O(nlogn)*/
