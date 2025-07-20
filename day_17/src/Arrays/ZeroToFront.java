package Arrays;

public class ZeroToFront {
	public static void main(String[] args) {
		
	int arr[]= {2,0,8,6,0,7,0,3,0};
	
	int result[]= new int[arr.length];
	
	int ZeroCount = 0;//4
	for(int num:arr) {
		if(num==0)
			ZeroCount++;
	}
	for(int i=0;i<ZeroCount;i++) {
		result[i]=0;//[0,0,0,0]
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			result[ZeroCount]=arr[i];
			ZeroCount++;
		}
	}
    for(int k:result) {
    	System.out.print(k+" ");
    }
	}
}
