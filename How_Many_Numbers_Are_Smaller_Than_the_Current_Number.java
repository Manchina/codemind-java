import java.util.Scanner;
class ElementAndCount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int flag = 0;

        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        
        for(int i=0; i<n; i++){
            int c = 0;
            for(int j=0; j<n; j++){
                if(arr[i] > arr[j]){
                    c++;
                }
            }
            
            System.out.printf("%d ",c);
        }
    }
}
