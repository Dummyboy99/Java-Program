import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int [] a= {45,10,69,76,87,63,20};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int [] a,int st,int end) {
		if(st>=end) return;
		int pivot=(st+end)/2;
		int i=st,j=end;
		while(i<=j) {
			while(a[i]<a[pivot])i++;
			while(a[j]>a[pivot])j--;
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		sort(a,i,end);
		sort(a,st,j);
	}

}
