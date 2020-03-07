/*I/P = [56,84,20,10]
[56,84,20,10]
[20,84,56,10]
[20,84,10,56]


O/p = [10,20,56,84]*/
import java.util.*;
public class BasicSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
        
        
    }
    
}
