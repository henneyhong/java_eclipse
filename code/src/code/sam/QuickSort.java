package code.sam;

import java.util.Arrays;

public class QuickSort {
	public static int quickSort(int[]arr, int start, int end) {
		int mid = arr[(start+end)/2] ;				//중앙을 찾는다.
		while(start<=end) {
			while(arr[start]<mid)				//왼쪽부터 오른쪽으로 배열 값보다 크거나 같은 값
				start++;						
			while(arr[end]>mid)				//오른쪽에서 왼쪽으로 배열 값보다 작거나 같은 값
				end--;
			
			if(start<=end) {
				int temp = arr [start];			//찾은 값을 서로의 값으로 변경시켜준다.
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			
		}
		
		return start;
		}
//	start가 더 클 경우 두부분으로 배열을 나눔
	static int[] quick( int [] arr, int start, int end) {
		int sort = quickSort(arr, start, end);
		if(start < sort-1)
			quick(arr, start, sort-1);
		if(sort< end)
			quick(arr, sort, end);
		return arr;
		
	}
	public static void main(String[] args) {
		int arr[] = {67,700,735,287,830,360,753,332,899,616,990,890,933,975,275
			    ,707,271,80,409,602,875,813,208,949,183,504,721,494,159,549,
			    95,818,85,444,703,961,928,193,846,660,433,253,547,436,467,751,
			    684,284,481,439,12,18,421,4,394,458,829,633,474,359,454,541,
			    601,471,326,889,345,555,710,614,540,353,795,116,119,133,859,280,413,
			    689,861,966,709,938,600,190,81,544,406,692,765,179,
			    32,629,437,804,911,42,836,770};
			arr = quick(arr, 0, arr.length-1);
			System.out.println(Arrays.toString(arr));
	}
}
