import java.util.*;
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
               c++;
            }
        }

        System.out.printf("%d",c);

    }
}