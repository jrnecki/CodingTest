package section6_SortingandSearch.구현;

public class SelectionSort {
    // 최솟값을 찾은 뒤
    // 맨 앞의 값과 교환
    // 맨앞의 다음 인덱스 ~ 끝인덱스 부터 위의 행동 반복
    public static void main(String[] args) {
        int [] arr = {3,42,5,12,44,7,80,39};
        selection_sort(arr,arr.length);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void selection_sort(int[] a, int size) {
        for(int i = 0; i < size - 1; i++) {
            int min_index = i;
            // 최솟값을 갖고있는 인덱스 찾기
            for(int j = i + 1; j < size; j++) {
                if(a[j] < a[min_index]) {
                    min_index = j;
                }
            }
            // i번째 값과 찾은 최솟값을 서로 교환
            int tmp = a[min_index];
            a[min_index] = a[i];
            a[i] = tmp;
        }
    }

}
