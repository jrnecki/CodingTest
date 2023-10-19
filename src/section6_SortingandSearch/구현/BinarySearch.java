package section6_SortingandSearch.구현;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 7, 8, 10, 20, 35, 99, 100};
        System.out.println(binarySearch1(5,arr,arr.length));
        System.out.println(binarySearch2(5,0,arr.length-1,arr));

    }
    public static int  binarySearch1(int key, int[]arr, int n){
        int low = 0;
        int high = n-1;
        int mid ;
        while(low <= high){
            mid = (low+high)/2;
            if(key > arr[mid]){
                low = mid+1;
            }else if(key < arr[mid]){
                high = mid-1;
            }else{
                return mid;
            }
        }
        return -1;

    }
    public static int binarySearch2(int key, int low, int high, int[] arr){
        int mid ;
        if(low <= high){
            mid = (low+high)/2;
            if(key >arr[mid]){
                return binarySearch2(key,mid+1,high,arr);
            }else if(key <arr[mid]){
                return binarySearch2(key,low,mid-1,arr);
            }else{
                return mid;
            }
        }
        return -1;

    }
}
