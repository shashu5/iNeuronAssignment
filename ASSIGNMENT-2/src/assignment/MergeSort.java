package assignment;

class MergeSort{
	void merge(int[]arr,int p,int q, int r)
	{
		int n1 =q -p+1;
		int n2 =r-q;
		
		int L[]=new int[n1];
		int M[]=new int[n2];
		for(int i=0;i<n1;i++)
		L[i]=arr[p+i];
		for(int j=0;j<n2;j++)
		M[j]=arr[q+1+j];
	}
	public static void main(String[] args) {
		
	}
}
