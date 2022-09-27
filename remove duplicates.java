import java.util.Scanner;
public class Main{
static int removeduplicates(int arr[], int n){
    int temp[]=new int[n];
	    int j=0;
	    for(int i=0;i<n-1;i++){
	        if(arr[i]!=arr[i+1]){
	            temp[j++]=arr[i];
	        }
	    }
	    temp[j++]=arr[n-1];
for(int i=0;i<n;i++){
    arr[i]=temp[i];
}
return j;
}

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	  int length=n;
	  length=removeduplicates(arr,n);
	   
	 for(int i=0;i<length;i++){
		System.out.println(arr[i]);
	 }
	    }
}
	

