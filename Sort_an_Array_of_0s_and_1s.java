import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class SortZeroAndOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int[] ans = new int[n];
        ans = sorting(arr, n);

        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }


    }

    private static int[] sorting(int[] a,int n){
        int[] x = new int[n];
        x = Arrays.stream(a).sorted().toArray();
        return x;

    }

}
