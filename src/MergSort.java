import java.util.Arrays;

public class MergSort {
	
	
	
	
	public static int[] mergsort(int[] arr) {
		
		if(arr.length==1) {
			return arr;
		}
		int mid=arr.length/2;
		int[] left=mergsort(Arrays.copyOfRange(arr, 0, mid));
		int[] right=mergsort(Arrays.copyOfRange(arr, mid, arr.length));
		return merg(left,right);
	}

	private static int[] merg(int[] left,int[] right) {
		int[] mix=new int[left.length+right.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				mix[k]=left[i];
				i++;
			}else {
				mix[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length) {
			mix[k]=left[i];
			i++;
			k++;
			
		}
		while(j<right.length) {
			mix[k]=right[j];
			j++;
			k++;
			
		}
		return mix;
	}

	public static void main(String[] args) {
		int[] arr= {10,2,50,3,25,45,1};
		arr=mergsort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
