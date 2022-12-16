import java.util.ArrayList;
import java.util.Scanner;

class ElementAndCount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int flag = 0;

        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0; i<n; i++){
            int count = 0;
            if(list.contains(arr[i])){
                continue;
            }
            {
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

            }
            if(arr[i] == count){
                System.out.printf("%d ",arr[i]);
                flag++;

            }
            list.add(arr[i]);
        }
        if(flag==0){
            System.out.print("-1");
        }

    }
}
