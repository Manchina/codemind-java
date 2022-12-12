import java.util.Scanner;

class ColSum {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        int sum = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            sum = 0;
            for(int j=0; j<arr[i].length; j++){
                sum+= arr[i][j];
            }
            System.out.printf("%d ",sum);
        }


    }
}
