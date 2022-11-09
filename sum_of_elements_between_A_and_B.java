import java.util.Scanner;

class SumOfElementsBetweenAandB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for(int i=0; i<n; i++){
            if(arr[i] >= a && arr[i] <= b){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
