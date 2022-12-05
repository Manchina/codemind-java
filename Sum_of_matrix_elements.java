import java.util.Scanner;

class SumOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] arr = new int[rows][columns];

        int sum = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j] = scanner.nextInt();
                sum += arr[i][j];
            }
        }

        System.out.printf("%d",sum);
    }
}
