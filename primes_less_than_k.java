import java.util.Scanner;

class PGTK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        for(int i=0; i<n; i++){
            if(isPrime(arr[i])){
                if(arr[i] <= k){
                    count++;
                }
            }
        }

        System.out.printf("%d",count);

    }

    private static boolean isPrime(int n){
        int c = 0;
        if(n == 1){
            return false;
        }
        for(int i=1; i<n; i++){
            if(n % i == 0){
                c++;
            }
        }
        if(c == 1){
            return true;
        }
        return false;
    }
}
