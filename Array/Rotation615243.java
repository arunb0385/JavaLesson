package Array;

public class Rotation615243 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int r=1;
		for(int i=0;i<r;i++) {
			int firstleter=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=firstleter;
		}
		for(int c:a)
			System.out.print(c+" ");

	}

}
