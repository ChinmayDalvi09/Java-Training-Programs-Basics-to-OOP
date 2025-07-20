package Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[]= {2,8,5,1,4,6,22,44,75,33,41};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
//			System.out.println(arr[i]);
			
	}
		for(int k:arr) {
			System.out.print(k+",");
		}
		System.out.println();
		System.out.println("2nd largest num is "+arr[arr.length-2]);
		System.out.println("Smallest number is "+arr[0]);
	
	}

	
}
