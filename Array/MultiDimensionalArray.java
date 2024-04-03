package Array;


import java.util.Scanner;

public class MultiDimensionalArray {

	static void array(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int a=sc.nextInt();
		System.out.println("Enter number of columns");
		int b=sc.nextInt();
		int ar[][]=new int[a][b];
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<b;j++){
				ar[i][j]=sc.nextInt();
			}
		}
		for(int k=0;k<ar.length;k++){
			for(int l=0;l<b;l++){
				System.out.print(ar[k][l]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
		array();
	}

}
