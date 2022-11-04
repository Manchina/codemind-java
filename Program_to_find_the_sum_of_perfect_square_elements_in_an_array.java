import java.util.Scanner;

class PerfectSquareSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }

       for(int i=0; i<n; i++){
           if(check(array[i]) == true){
               sum += array[i];
           }
       }

        System.out.print(sum);

    }

    private static boolean check(int num) {
        int sq;
        if (num == 1) {
            return true;
        } else
            for (int i = 1; i <= num/2; i++){
                sq = i * i;
                if(sq == num){
                    return true;
                }
           }
            return false;
    }


}

