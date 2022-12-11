import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UniqueOddElements{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int c = 0;

        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
            if(arr[i]%2==0 && !list.contains(arr[i])){
               list.add(arr[i]);
               c += arr[i];
            }
        }

        System.out.printf("%d",c);

    }
}
