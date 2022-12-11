import java.util.Scanner;

class FirstHalfAndSecondHalf{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int half = n/2;
        int fhs = 0;
        int shs = 0;

        for(int i=0; i<n; i++){
            if(i<half){
                fhs += arr[i];
            }else{
                shs += arr[i];
            }
        }

        System.out.println(fhs);
        System.out.println(shs);
    }
}
