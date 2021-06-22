package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr)
	{
		arr = new int[]{5,6,7,8,9};
		int n = 3;
		System.out.println("Original Array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		for(int i=0;i<n;i++)
		{
			int j, last;
			last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		System.out.println(shift(arr));
	}

}
