package arrays;

public class JaggedEx {
	public static void main(String[] args) 
	{
		int marks[][]= {{12,14,23},{12,44,32},{67,54,9}};
		for (int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
		    System.out.println();
	    }
	
}


}
