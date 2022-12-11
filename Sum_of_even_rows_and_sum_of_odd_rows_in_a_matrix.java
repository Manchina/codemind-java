import java.util.Scanner;

class SumOfMatrix {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        int oddSum = 0;
        int evenSum = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i%2==0){
                    evenSum += arr[i][j];
                }else{
                    oddSum += arr[i][j];
                }
            }
        }

        System.out.printf("%d %d",evenSum,oddSum);
    }
}
