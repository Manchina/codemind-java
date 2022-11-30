import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        for(int i=0; i<m; i++){
            b[i] = scanner.nextInt();
        }


        for(int i=0; i<n; i++){
            int c = 0;
            for(int j=0; j<m; j++){
                if(a[i] == b[j]){
                    c++;
                    break;
                }
            }
            if(c == 0){
                set.add(a[i]);
            }
        }

        for(int i=0; i<m; i++){
            int c = 0;
            for(int j=0; j<n; j++){
                if(b[i] == a[j]){
                    c++;
                    break;
                }
            }
            if(c==0){
                set.add(b[i]);
            }
        }

        System.out.println(set.size());

    }
}
