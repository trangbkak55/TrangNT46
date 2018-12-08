package viettel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Assert;

import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest {

	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void TongHaiSo() {
		// Arrange
		int a = 1;
		int b = 2;
		int c = 0;

		// Action
		c = a + b;
		// Assertion

		Assert.assertEquals(3, c);
	}

	// Giải phương trình bậc 1: ax + b = 0

	@Test
	public void GiaiPT() {
		// Arrange
		int a = 0, b = 4;
		int x1 = 0;
		String giai = "";

		if (a == 0) {
			giai = "PT vo nghiem";
		} else {
			x1 = -b / a;
		}

		// Assertion
		// Assert.assertEquals(x1,-2);
		Assert.assertEquals(giai, "PT vo nghiem");

		System.out.println("");
		boolean test = true;
		assertTrue(test);
	}

	// Giải PT bậc 2: ax2 + bx + c = 0

	@Test
	public void giaiPTBac2() {
		float a = 2, b = 1, c = -1;
		// tính delta
		float delta = b * b - 4 * a * c;
		float x1;
		float x2;
		// tính nghiệm
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
		} else {
			System.out.println("Phương trình vô nghiệm!");
		}
	}

	// Liệt kê các số nguyên tố nhỏ hơn n
	// main
	@Test
	public void SoNT() {
		System.out.print("Nhập n = ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
		if (n >= 2) {
			System.out.print(2);
		}
		for (int i = 3; i < n; i += 2) {
			if (SoNguyenTo(i)) {
				System.out.print(" " + i);
			}
		}
	}

	// check so nguyen to
	public boolean SoNguyenTo(int n) {
		// so nguyen n < 2 khong phai la so nguyen to
		if (n < 2) {
			return false;
		}
		// check so nguyen to khi n >= 2
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Kiểm tra 1 số có phải là số nguyên tố hay không
	// main
	@Test
	public void KiemTraLaSoNguyenTo() {
		System.out.print("Nhập n = ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n > 0) {
			if (HamKiemTraSoNguyenTo(n) == 1)
				System.out.println(n + " Là số nguyên tố");
			else
				System.out.println(n + " Không là số nguyên tố");
			;
		}
	}

	// check so nguyen to
	public int HamKiemTraSoNguyenTo(int n) {
		int dem = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				dem++;
		}
		if (dem == 2)
			return 1;
		else
			return 0;
	}

	// Liệt kê số nguyên tố <100
	@Test
	public void SoNguyenTo() {
		int n = 100;
		System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
		if (n >= 2) {
			System.out.print(2);
		}
		for (int i = 3; i < n; i += 2) {
			if (KiemTraSoNguyenTo(i)) {
				System.out.print(" " + i);
			}
		}
	}

	// check so nguyen to
	public boolean KiemTraSoNguyenTo(int n) {
		// so nguyen n < 2 khong phai la so nguyen to
		if (n < 2) {
			return false;
		}
		// check so nguyen to khi n >= 2
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Tính tổng các số nguyên tố < 100
	// main
	@Test
	public void TongSoNguyenTo() {
		int n = 100;
		System.out.println("Tổng các số nguyên tố nhỏ hơn" + n + "=" + tinhTong(n));
	}

	private int tinhTong(int n) {
		// TODO Auto-generated method stub
		int tong = 0;
		for (int i = 1; i <= n; i++) {
			if (CheckSoNguyenTo(i) == 1)
				tong += i;
		}
		return tong;
	}

	// check so nguyen to
	public int CheckSoNguyenTo(int n) {
		int dem = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				dem++;
		}
		if (dem == 2)
			return 1;
		else
			return 0;
	}

	// Đếm số nguyên tố chẵn, số nguyên tố lẻ
	@Test
	public void ChanLeNguyenTo() {
		int n = 100;
		int soChan = 0;
		int soLe = 0;
		int dem = 0;

		System.out.println("Số chẵn gồm: " + soChan);
		System.out.println("Số lẻ gồm: " + soLe);
	}

	private int DemSo(int n) {
		int soChan = 0;
		int soLe = 0;
		for (int i = 1; i <= n; i++) {
			if (CheckLaSoNguyenTo(i) % 2 == 0)
				soLe++;
		}
		return soChan++;
	}

	// check so nguyen to
	public int CheckLaSoNguyenTo(int n) {
			int dem = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0)
					dem++;
			}
			if (dem == 2)
				return 1;
			else
				return 0;
		}
