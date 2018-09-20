
public class QuickSort {

	public int partition(int[] a,int start,int end)
	 {      
		    int pivot = a[end];
			int p =start;
			for(int i=start;i<=end;i++)
			{
				
				if(a[i]<=pivot )
				{
					int temp = a[i];
					a[i] = a[p];
					a[p] = temp;
					p++;			
					
				}
				
				
			}
		 return p-1;
	 }
	

	 public void QuickSorting(int[] a,int start,int end)
	 {
		if(start<=end)
		{  		 
		int p = this.partition(a, start, end);
		 this.QuickSorting(a, 0, p-1);
		 this.QuickSorting(a, p+1, end);
		} 
	 }
}
