import java.util.HashSet;
import java.util.Scanner;

class CountElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        for (int j = 0; j < m; j++) {
            array2[j] = scanner.nextInt();
        }

            for (int k = 0; k < array1.length; k++) {
                for (int l = 0; l < array2.length; l++) {
                    if (array1[k] == array2[l]) {
                        set.add(array1[k]);
                        set.add(array2[l]);
                    }
                }
            }
        System.out.println(set.size());
    }
}
