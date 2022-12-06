import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int flag = 0;
        
        for(int i=0; i<n; i++){
            if(arr[i]<a || arr[i]>b){
                System.out.printf("%d ",arr[i]);
                flag++;
            }
        }
        
        if(flag == 0){
            System.out.print("-1");
        }
    }
}