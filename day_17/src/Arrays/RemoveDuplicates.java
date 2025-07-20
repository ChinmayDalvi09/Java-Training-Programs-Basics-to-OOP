package Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int arr[]= {4,5,1,2,2,4,5,6,2,8,7};
		int n=arr.length;
		//int result[]= {};
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j])
					arr[i]=arr[i]/10;
			}
		}
		for(int k:arr)
			if(k!=0)
			System.out.print(k+",");
	}
}
