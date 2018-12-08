package viettel;

import java.util.Random;

//Tao một danh sách (array/arrayList) gồm 10 phần tử, sử dụng randoom nhập dữ liệu cho danh sách này
//Sau đó đếm xem có ba nhiêu số chăn, bao nhiêu số lẻ

public class arrayBaiTap {
	public static void main(String[] args)
	{
		int[] arrNumber = new int[10];
		Random rd = new Random();   // khai báo 1 đối tượng Random
		int DemChan = 0, DemLe = 0;
		
		for(int i = 0; i <arrNumber.length; i++)
		{
			arrNumber[i] = rd.nextInt(50);
			System.out.println("Dãy số gồm:" +arrNumber[i]);
			
			if (arrNumber[i] %2 == 0 )
				DemChan++;
			else
				DemLe++;
				 
			}
		System.out.println("Số chẵn gồm: "+DemChan);
		System.out.println("Số chẵn gồm: "+DemLe);
		}
	}

