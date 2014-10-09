import java.io.* ;
import java.util.Arrays;

public class Mergesort {

 public int[] values;		
 public int[] helper;
 public int n;
 	public static void main(String[] args) 
		 {
		 	Mergesort obj = new Mergesort();
		 	int[] numbers ={8,9,5,6,22,44,61} ;
		 	obj.sort(numbers);
		 }		
       public void sort(int[] numbers) 
		{
			this.values = numbers;
			this.n =numbers.length ;
			this.helper = new int[n];
			mergesort(0,n-1);
		}
		public void mergesort( int low , int high) {
		if(low < high ) {
		int middle = (low+high)/2 ;
		mergesort(low ,middle);
		mergesort(middle+1 ,high);
		merge(low ,middle ,high);
		}
		}
		public void merge(int low , int middle ,int high) 
		{
		
			for ( int i = low ; i<= high ; i++)
			{
				
				helper[i] = values[i];
				
			}
			int i=low ;
			int j= middle+1 ;
			int k= low ;
			while(i <= middle && j <= high)
			{
				if(helper[i] < helper[j]) 
				{
					values[k]= helper[i];
					i++ ;
				}
				else 
				{
					values[k] = helper[j];
					j++ ;
				}
				k++;
			}
			while(i <= middle) 
			{
				values[k]=helper[i];
				k++ ;
				i++ ;
			}
			System.out.println(Arrays.toString(values));
		}
	}
		
	
        		
	 