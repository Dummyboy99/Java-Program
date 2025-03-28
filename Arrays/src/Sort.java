import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int [] a= {1,3,4,5,6,7,2,9};
		Arrays.sort(a);
		int b[]=new int [a.length];
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				b[count++]=a[i];
			}
		}
		for(int j=0;j<a.length;j++) {
			if(count<a.length) {
				if(a[j]%2!=0) {
					b[count++]=a[j];
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
