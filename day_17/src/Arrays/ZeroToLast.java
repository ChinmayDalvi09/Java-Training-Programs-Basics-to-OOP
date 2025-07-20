package Arrays;

public class ZeroToLast {
	public static void main(String[] args) {
		int arr[]= {4,0,5,0,8,0,7,5,6,0,0,55,0,4};
		int result[]=new int[arr.length];
		int nonzeroCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				result[nonzeroCount]=arr[i];
				nonzeroCount++;
			}
		}
		for(int k:result) {
			System.out.print(k+",");
		}
	}
}


