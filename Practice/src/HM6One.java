
public class HM6One {
	public static void main(String[] args)
	{
		int[][] a = {
			{5,2,3,7},
			{1,5,2,2},
			{1,2,3,4}
		};
		int sum=0;
		for(int i=0;i<a.length;i++){
		  for(int q=0;q<a[i].length;q++){
			  if(i==2) {
				  
			 
		    sum=sum+a[2][q];
			
		}
		}
		}
		System.out.println(sum);
		
		
     //should print 10

		
		
		
	}
}
