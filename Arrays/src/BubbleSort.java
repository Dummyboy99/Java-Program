import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] a= {45,10,69,76,87,63,20};
		sort(a);
		System.out.println(Arrays.toString(a));

	}
	public static void sort(int [] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
				    a[j]=a[j+1];
				    a[j+1]=temp;
				    }
				}}
	}

}
