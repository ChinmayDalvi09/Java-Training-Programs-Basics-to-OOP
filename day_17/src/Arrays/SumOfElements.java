package Arrays;

public class SumOfElements {
	public static void main(String[] args) {
		int arr[]= {5,4,2,6,8,7,55,12,45,6,2,1};
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("Addition of array element is: "+sum);
	}

}
