package Arrays;

public class LargestInArray {
	public static void main(String[] args) {
		int arr[]= {4,5,12,48,100,8,2,45};
		System.out.println("original array is ");
		//bubble sort
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1	]=temp;
				}
			}
			System.out.println(arr[i]);
		}
		System.out.println("Largest number is "+arr[arr.length-1]);
		System.out.println("smallest number is "+arr[0]);
	}

}
