import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class HalfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;

        int[] array1 = new int[n / 2];

        int array1Start = mid + 1;

        for (int i = 0; i < n / 2; i++) {
            array1[i] = array[array1Start];
            array1Start++;
        }

        int[] array2 = new int[n/2];


        for(int i=0; i<n/2; i++){
            array2[i] = array[i];
        }

        int sizee = n / 2;

        int[] rev = reverse(array1,sizee);

        for (int i=0; i<n/2; i++){
            list.add(rev[i]);
        }

        for (int i=0; i<n/2; i++){
            list.add(array2[i]);
        }

        for (int i=0; i<n; i++){
            System.out.print(list.get(i) + " ");
        }

    }

    private static int[] reverse(int[] arrayR,int size){
        int[] newOne = new int[size];
        int j = 0;
        for(int i = (size-1); i>-1; i--){
              newOne[j] = arrayR[i];
              j++;
        }
        return newOne;
    }
}
