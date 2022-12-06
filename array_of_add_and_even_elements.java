import java.util.*;
class EvenFollowOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] output = new int[n];
        int j = 0;

        for(int i=0; i<n; i++){
            if(arr[i] % 2 != 0){
                output[j] = arr[i];
                j++;
            }
        }

        for(int i=0; i<n; i++){


            if(arr[i] % 2 == 0){
                output[j] = arr[i];
                j++;
            }
        }

        for(int i=0; i<n; i++){
            System.out.printf("%d ",output[i]);
        }
    }
}