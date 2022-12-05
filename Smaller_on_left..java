import java.util.*;
class LeftMin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];

        ans[0] = -1;

        for(int i=1; i<n; i++){
            int end = i - 1;
            ans[i] = min(arr,end,arr[i]);
        }

        for(int i=0; i<n; i++){
            System.out.printf("%d ",ans[i]);
        }
    }

    public static int min(int[] arr, int end, int com){
        for(int i=end; i>=0; i--){
            if(arr[i] < com){
                return arr[i];
            }
        }

        return -1;
    }
}