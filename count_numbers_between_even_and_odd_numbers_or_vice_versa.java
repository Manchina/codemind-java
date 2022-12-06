import java.util.Scanner;

class CountElementsBetweenEandO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;
        
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        
        for(int i=1; i<n-1; i++){
            if((arr[i-1]%2!=0 && arr[i+1]%2==0) || (arr[i-1]%2==0 && arr[i+1]%2!=0)){
                count++;
            }
        }

        System.out.printf("%d",count);
    }
}
