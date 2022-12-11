import java.util.Scanner;

class PrimesLessThanK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        int c = 0;

        for(int i=0; i<n; i++){
            if(isPrime(arr[i]) && arr[i]<=k){
                c++;
            }
        }

        System.out.printf("%d",c);
    }

    public static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        int c = 0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                c++;
            }
        }
        if(c<2){
            return true;
        }

        return false;
    }
}
