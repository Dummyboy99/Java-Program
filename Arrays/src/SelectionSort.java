import java.util.Arrays;

public class SelectionSort {
		public static void main(String[] args) {
			int [] a= {45,10,69,76,87,63,20};
			sort(a);
			System.out.println(Arrays.toString(a));


	}
		public static void sort(int [] a) {
			for(int i=0;i<a.length-1;i++) {
				int index=i;
				for(int j=i+1;j<a.length;j++) {
					if(a[j]<a[index]) index=j;
				}
				if(index!=i) {
					int temp= a[i];
					a[i]=a[index];
					a[index]=temp;
				}
			}
		}

}
