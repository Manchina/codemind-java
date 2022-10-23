import java.util.Scanner;

class Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int k = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < n ; i++ ){
            arr[i] = scanner.nextInt();
           
        }
        for(int j=0; j<n; j++){
            if(arr[j] % k == 0){
                count++;
            }
        }
        
        System.out.println(count);

    }
}
