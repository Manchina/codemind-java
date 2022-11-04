import java.util.Scanner;

class CountElementsNotDivisiblebyK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];
        int count = 0;

        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
            if(array[i] % k != 0){
                count++;
            }
        }

        System.out.print(count);
    }
}
