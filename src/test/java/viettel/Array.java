package viettel;

public class Array {
	public static void main(String[] args)
	{
		int[] arrNumber = new int[3];
		
		arrNumber[0] = 10;
		arrNumber[1] = 11;
		arrNumber[2] = 22;
		
		//int[] partnewArray = Array.copyOf(arrNumber, arrNumber.length);
		int[] newArray = ArrayModification(arrNumber);
		
		for(int number:arrNumber)
		{
			System.out.println(number);
		}
	}
	
	public static int[] ArrayModification(int[] arrNumber)
	{
		arrNumber[0] = 100;
		
		return arrNumber;
	}
}
