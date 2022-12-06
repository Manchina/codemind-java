import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int flag=0;
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                flag++;
                break;
            }
        }
        
        if(flag!=0){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}