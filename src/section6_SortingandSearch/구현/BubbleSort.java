package section6_SortingandSearch.구현;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {9,4,8,6,5,3};
        bubble_sort(arr, arr.length);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static  void bubble_sort(int[] arr, int n ){
        // round 진행
        for(int i=1; i<n; i++){
            // 각 라운드 별 비교 횟수
            for(int j = 0; j<n-i; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr [j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
