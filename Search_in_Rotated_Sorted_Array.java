import java.util.Scanner;

class RBS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        System.out.println(search(arr,target));
    }

    public static int search(int[] nums, int target) {
         int pivot = searchPivot(nums);
         if(pivot == -1){
             return binarySearch(nums, target, 0, nums.length-1);
         }
         if(nums[pivot] == target){
             return pivot;
         }
         if(target >= nums[0]){
             return binarySearch(nums, target, 0, pivot - 1);
         }

         return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int searchPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid] < arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
