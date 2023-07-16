import java.util.Scanner;
import java.time.*;
public class Baitap05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*  20230713
 *  Bai tap 01:Viết hàm tìm số Iớn nhất trong 3 số a,b, c do người dùng nhập vào
 * 
 * */
		
		
		//TimSoLonNhat();
		
		
/*  20230713
 *  Bai tap 02: Viết hàm kiểm tra một số do người dùng nhập vào Ià số chẵn hay lẻ
 * 
 * */		
		
		//KiemTraChanLe();

		
		
		
/*  20230713
 *  Bai tap 03:	Viết hàm tính tổng 3 số do người dùng nhập vào
 * 
 * */
	
		
		//TinhTong3So();
		
		
		
/*  20230713
 *  Bai tap 04: Xây dựng chương trình tính toán đơn giản cộng, trừ, nhân chia số nguyên khác không. 
 *  				Yêu cầu SỬ DỤNG HÀM. 
 *  				Xuất thông báo cho người dùng chọn : Nếu 1 là +, 2 là -, 3 là *, 4 là chia.
 * 
 * */	
//		// input: khai bao bien
//		int a,b,opt;
//		boolean isStop = false;
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			while(!isStop) {
//				Menu();
//				opt = sc.nextInt();
//				// processing and output
//				switch (opt) {
//							case 1: {
//								System.out.println("*** Tinh Tong 2 So");
//								a = NhapSoNguyen();
//								b = NhapSoNguyen();
//								TinhTong2So(a,b);
//								isStop = CheckIsStop();
//								break;
//							}
//							case 2: {
//								System.out.println("*** Tinh Hieu 2 So");
//								a = NhapSoNguyen();
//								b = NhapSoNguyen();
//								TinhHieu2So(a,b);
//								break;
//							}
//							case 3:{
//								System.out.println("*** Tinh Tich 2 So");
//								a = NhapSoNguyen();
//								b = NhapSoNguyen();
//								TinhTich2So(a,b);
//								isStop = CheckIsStop();
//								TinhTich2So(a,b);
//								break;
//							}
//							case 4:{
//								System.out.println("*** Tinh Thuong 2 So");
//								a = NhapSoNguyen();
//								b = NhapSoNguyen();
//								TinhThuong2So(a,b);
//								isStop = CheckIsStop();
//								break;
//							}
//							case 0:{
//								System.out.print("*** Chuong trinh da ket thuc");
//								isStop =!isStop;
//								break;
//							}
//							default: System.out.println("*** Vui long nhap vao gia tri phu hop [0,5]");
//							break;
//				}
//			}
//		}
//		catch(Exception e) {
//			System.out.print("*** So ban nhap vao khong phai la 1 so nguyen");
//		}
		
		
		
		
/*  20230713
 *  Bai tap 05:	Nhập tên và năm sinh của 3 sinh viên.
 *  			Hãy viết chương trình xuất ra tên và năm sinh của sinh viên trẻ nhất.
 * 
 * */			
		
		// input: khai bao bien
//		String tenSv01, tenSv02, tenSv03;
//		int namSinh01, namSinh02, namSinh03,max;
//		int thisyear = Year.now().getValue();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("*** Chuong trinh tim sinh vien tre nhat");
//		
//		try {
//		System.out.print("Nhap vao ten sinh vien thu nhat: ");
//		tenSv01 = sc.nextLine();
//		do {
//		System.out.print("Nhap vao nam sinh: ");
//		namSinh01 = sc.nextInt();
//		sc.nextLine();
//		}while (namSinh01 <= thisyear-100 || namSinh01 >= thisyear);
//		
//		System.out.print("Nhap vao ten sinh vien thu hai: ");
//		tenSv02 = sc.nextLine();
//		
//		do {
//		System.out.print("Nhap vao nam sinh: ");
//		namSinh02 = sc.nextInt();
//		sc.nextLine();
//		}while (namSinh02 <= thisyear-100 || namSinh02 >= thisyear );
//		
//		System.out.print("Nhap vao ten sinh vien thu ba: ");
//		tenSv03 = sc.nextLine();
//	
//		do {
//		System.out.print("Nhap vao nam sinh: ");
//		namSinh03 = sc.nextInt();
//		sc.nextLine();
//		}while (namSinh01 <= thisyear-100 || namSinh01 >= thisyear );
//		
//		// processing and output
//		TimSvTreNhat(namSinh01,namSinh02,namSinh03,tenSv01,tenSv02,tenSv03);
//
//		}
//		catch(Exception e) {
//			System.out.print("*** So ban nhap vao khong phai la 1 so nguyen");
//		}

/*  20230713
 *  Bai tap 06:	Cho 3 số nguyên. 
 *  			Hãy viết chương trình xuất ra có bao nhiêu số lẻ và bao nhiêu số chẵn
 * 
 * */	
		
		
		
//		//input: khai bao bien
//		int a,b,c;
//		int countChan=0,countLe=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("*** Chuong trinh nhap 3 so nguyen");
//		System.out.println("*** Xuat ra bao nhieu so chan, bao nhieu so le");
//		try {
//			System.out.print("Nhap vao so nguyen thu nhat: ");
//			a = sc.nextInt();
//			System.out.print("Nhap vao so nguyen thu hai: ");
//			b = sc.nextInt();
//			System.out.print("Nhap vao so nguyen thu ba: ");
//			c = sc.nextInt();
//			//processing
//			if(a!=0 ) {
//				if (a%2==0) countChan++;
//				else countLe++;
//			}
//			
//			if(b!=0) {
//				if (b%2==0) countChan++;
//				else countLe++;
//			}
//			
//			if(c!=0) {
//				if (c%2==0) countChan++;
//				else countLe++;
//			}
//			
//			//output
//			System.out.println(">>> Co "+countChan +" so chan");
//			System.out.println(">>> Co "+countLe+" so le");
//		}
//		catch(Exception e) {
//			System.out.println("*** So ban nhap vao khong phai la 1 so nguyen");
//		}
		
		
		
		
		
/*  20230713
 *  Bai tap 07:	Cho biết tên, năm sinh và giới tính của 3 cán bộ. 
 *  			Hãy viết chương trình tìm và in tên cán bộ Nam trẻ nhất.
 * 
 * */				
		
		
//		System.out.println("*** Chuong trinh tim can bo nam tre nhat");
//		CanBo cb1 = new CanBo();
//		CanBo cb2 = new CanBo();
//		CanBo cb3 = new CanBo();
//		int thisyear = Year.now().getValue();
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			System.out.println("Nhap ten can bo thu nhat: ");
//			cb1.Ten = sc.nextLine();
//			System.out.println("Chon gioi tinh, Nam(true)/Nu(false): ");
//			cb1.IsMale = sc.nextBoolean();
//			do {
//				System.out.println("Nhap nam sinh: ");
//				cb1.namSinh = sc.nextInt();
//				sc.nextLine();
//				}while (cb1.namSinh <= thisyear-100 || cb1.namSinh >= thisyear );
//			
//			System.out.println("Nhap ten can bo thu hai: ");
//			cb2.Ten = sc.nextLine();
//			System.out.println("Chon gioi tinh, Nam(true)/Nu(false): ");
//			cb2.IsMale = sc.nextBoolean();
//			do {
//				System.out.println("Nhap nam sinh: ");
//				cb2.namSinh = sc.nextInt();
//				sc.nextLine();
//				}while (cb2.namSinh <= thisyear-100 || cb2.namSinh >= thisyear );
//	
//			
//			System.out.println("Nhap ten can bo thu ba: ");
//			cb3.Ten = sc.nextLine();
//			System.out.println("Chon gioi tinh, Nam(true)/Nu(false): ");
//			cb3.IsMale = sc.nextBoolean();
//			do {
//				System.out.println("Nhap nam sinh: ");
//				cb3.namSinh = sc.nextInt();
//				sc.nextLine();
//				}while (cb3.namSinh <= thisyear-100 || cb3.namSinh >= thisyear );
//			
//			
//			if(cb1.IsMale && cb2.IsMale && cb3.IsMale) {
//				TimCBTreNhat03(cb1.namSinh,cb2.namSinh,cb3.namSinh,cb1.Ten,cb2.Ten,cb3.Ten);
//			}
//			else if (cb1.IsMale && cb2.IsMale) {
//				TimCBTreNhat02(cb1.namSinh,cb2.namSinh,cb1.Ten,cb2.Ten);
//			}
//			else if (cb1.IsMale && cb3.IsMale) {
//				TimCBTreNhat02(cb1.namSinh,cb3.namSinh,cb1.Ten,cb3.Ten);
//			}
//			else if (cb2.IsMale && cb3.IsMale) {
//				TimCBTreNhat02(cb2.namSinh,cb3.namSinh,cb2.Ten,cb3.Ten);
//			}
//			else if (cb1.IsMale) {
//				System.out.println("*** Can bo nam tre nhat la: "+ cb1.Ten+ " sinh nam: "+cb1.namSinh);
//			}
//			else if (cb2.IsMale) {
//				System.out.println("*** Can bo nam tre nhat la: "+ cb2.Ten+ " sinh nam: "+cb2.namSinh);
//			}
//			else if (cb3.IsMale) {
//				System.out.println("*** Can bo nam tre nhat la: "+ cb3.Ten+ " sinh nam: "+cb3.namSinh);
//			}
//			else {
//				System.out.println(">>> Khong co can bo nam thoa yeu cau");
//			}
//		}
//		catch(Exception e) {
//			System.out.print("*** Kieu gia tri nhap vao khong dung yeu cau");
//		}

		
		
/*  20230713
 *  Bai tap 08:	Cho biết tên và tọa độ nhà của 3 sinh viên. 
 *  			Cho biết toạ độ của trường đại học. 
 * 	 			Hãy viết chương trình cho máy in tên sinh viên ở xa trường đại học nhất.
 * 
 * */			
		
		
		
//		// input: khai bao bien
//		Scanner sc = new Scanner(System.in);
//		
//		ToaDo TruongDH = new ToaDo();
//		ToaDo hs1 = new ToaDo();
//		ToaDo hs2 = new ToaDo();
//		ToaDo hs3 = new ToaDo();
//		float kc1, kc2, kc3; 
//		try {
//			System.out.print("Nhap vao ten truong DH: ");
//			TruongDH.Ten = sc.nextLine();
//			System.out.print("Nhap vao toa do x: ");
//			TruongDH.x = sc.nextFloat();
//			System.out.print("Nhap vao toa do y: ");
//			TruongDH.y = sc.nextFloat();
//			sc.nextLine();
//			
//			System.out.print("Nhap vao ten HS thu nhat: ");
//			hs1.Ten = sc.nextLine();
//			System.out.print("Nhap vao toa do x: ");
//			hs1.x = sc.nextFloat();
//			System.out.print("Nhap vao toa do y: ");
//			hs1.y = sc.nextFloat();
//			sc.nextLine();
//			System.out.print("Nhap vao ten HS thu hai: ");
//			hs2.Ten = sc.nextLine();
//			System.out.print("Nhap vao toa do x: ");
//			hs2.x = sc.nextFloat();
//			System.out.print("Nhap vao toa do y: ");
//			hs2.y = sc.nextFloat();
//			sc.nextLine();
//			System.out.print("Nhap vao ten HS thu ba: ");
//			hs3.Ten = sc.nextLine();
//			System.out.print("Nhap vao toa do x: ");
//			hs3.x = sc.nextFloat();
//			System.out.print("Nhap vao toa do y: ");
//			hs3.y = sc.nextFloat();
//			// processing
//			kc1 = TinhKhoangCach2Diem(TruongDH.x,TruongDH.y,hs1.x,hs1.y);
//			kc2 = TinhKhoangCach2Diem(TruongDH.x,TruongDH.y,hs2.x,hs2.y);
//			kc3 = TinhKhoangCach2Diem(TruongDH.x,TruongDH.y,hs3.x,hs3.y);
//			// output
//			TinhKhoangCachXaNhat(kc1,kc2,kc3,hs1.Ten,hs2.Ten,hs3.Ten);
//		}
//		catch(Exception e) {
//			System.out.print("*** Kieu gia tri nhap vao khong dung yeu cau");
//		}
		

		
		
		
}

	public static void TimSoLonNhat() {
		//input: khai bao bien
		try {
			int a,b,c,max; 
			Scanner sc = new Scanner(System.in);
			System.out.println("*** Chuong trinh tim so lon nhat trong 3 so a,b,c do nguoi dung nhap vao");
			System.out.print("Nhap vao so nguyen a: ");
			a = sc.nextInt();
			System.out.print("Nhap vao so nguyen b: ");
			b = sc.nextInt();
			System.out.print("Nhap vao so nguyen c: ");
			c = sc.nextInt();
			sc.close();
			// processing 
			max = a; 
			if (b>=max) {
				max = b; 
				if (c>=max) max = c;
			}
			else if (c>= max) max=c;
			else max = a;
			// output
			System.out.print("So nguyen lon nhat la: "+max);
		}
		catch(Exception e) {
			System.out.println(">>> Gia tri nhap vao ko phai la so nguyen");
		}
		
	}
	
	public static void KiemTraChanLe() {
		// input: khai bao bien 
		int a;
		Scanner sc = new Scanner (System.in);
		try {
			while (true) {
				System.out.println(">>> Kiem tra 1 so nguyen la so chan hay le");
				System.out.print("Nhap vao 1 so nguyen: ");
				a = sc.nextInt();
				sc.close();
				// processing and output
				// kiem tra gia tri nhap vao % 2
			    if (a%2==0) {
			    	System.out.println("So "+a +" la so chan");
			    }
			    else {
			    	System.out.println("So "+a +" la so le");
			    }
			}
		}
		catch(Exception e){
			System.out.println(">>> Gia tri nhap vao ko phai la so nguyen");
		}
	}
	
	public static void TinhTong3So() {
		
		// input: khai bao bien
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("*** Chuong trinh tinh tong ba so");
		System.out.print("Nhap vao so thu nhat: ");
		a = sc.nextInt();
		System.out.print("Nhap vao so thu hai: ");
		b = sc.nextInt();
		System.out.print("Nhap vao so thu ba: ");
		c = sc.nextInt();
		
		// processing and output
		System.out.printf("*** Tong ba so la: %d",a+b+c);
		}
		catch(Exception e) {
			System.out.print("*** So ban nhap vao khong phai la 1 so nguyen");
		}
	}
	
	public static void TinhTong2So(int a,int b) {
		System.out.printf("*** Tong hai so la: %d",a+b);
		System.out.println("");
	}
	
	public static void TinhHieu2So(int a,int b) {
		System.out.printf("*** Hieu hai so la: %d",a-b);
		System.out.println("");
	}
	
	public static void TinhTich2So(int a,int b) {
		System.out.printf("*** Tich hai so la: %d",a*b);
		System.out.println("");
	}
	public static void TinhThuong2So(int a,int b) {
		if(b != 0) {
			System.out.printf("*** Thuong hai so la: %.3f", (float) a/b);
			System.out.println("");
		}
		else {
			System.out.print("*** Phep chia khong the thuc hien - Nhap vao b khac 0");
			System.out.println("");
		}
	}
	
	public static void Menu() {
		System.out.println("------------------------ MENU -------------------------");
		System.out.println("Chuong trinh thuc hien phep tinh: Cong, Tru, Nhan, Chia");
		System.out.println("Chon 1: Tinh tong 2 so");
		System.out.println("Chon 2: Tinh hieu 2 so");
		System.out.println("Chon 3: Tinh tich 2 so");
		System.out.println("Chon 4: Tinh thuong 2 so");
		System.out.println("Chon 0: Ket thuc chuong trinh");
		System.out.println("-------------------------------------------------------");
		System.out.print("*** So ban chon la: ");
	}
	public static int NhapSoNguyen() {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen: ");
		a = sc.nextInt();
		//sc.close();
		return a;
		
	}
	
	public static boolean CheckIsStop() {
		int check = -1; 
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.println("*** Ban co tuc tiep tuc chuong trinh");
//			System.out.print("Co(1)/Khong(0): ");
//			check= sc.nextInt();
//			//sc.close();
//			if (check ==0 ) {
//				return isStop = true;
//			}
//			else {
//				return isStop=false;
//			}
//		}while(check !=1 && check !=0);
		while(check !=1 && check !=0){
			System.out.println("*** Ban co tuc tiep tuc chuong trinh");
			System.out.print("Co(1)/Khong(0): ");
			check= sc.nextInt();
			//sc.close();
			if (check ==0 ) {
				 isStop = true;
				 System.out.print("*** Chuong trinh da ket thuc");
			}
			else {
				 isStop=false;
			}
		}
		return isStop;

	}
	
	public static void TimSvTreNhat(int a,int b, int c, String a1, String a2, String a3) {
			//input: khai bao bien
			int max; 
			// processing 
			max = a; 
			if (b>max) {
				max = b; 
				if (c>max) {
					max = c;
					System.out.println("*** Sinh vien tre nhat la: "+ a3+ " sinh nam: "+c);
				}
				else if (c == max ) {
					System.out.println("*** Sinh vien tre nhat la: "+ a2+" va "+a3+ " sinh nam: "+b);
					//System.out.println("*** Sinh vien tre nhat la: "+ a3+ " sinh nam: "+c);
				}
				else {
					System.out.println("*** Sinh vien tre nhat la: "+ a2+ " sinh nam: "+b);
				}
			}
			else if (b==max) {
				if (c>max) {
					max =c;
					System.out.println("*** Sinh vien tre nhat la: "+ a3+ " sinh nam: "+c);
				}
				else if (c==max){
					System.out.println("*** 3 sinh vien bang tuoi nhau, sinh nam: "+ max);
				}
				else {
					System.out.println("*** Sinh vien tre nhat la: "+ a1+ " va "+a2 + " sinh nam: "+a);
					//System.out.println("*** Sinh vien tre nhat la: "+ a2+ " sinh nam: "+b);
				}
			}
			else {
				
				if (c>max) {
					System.out.println("*** Sinh vien tre nhat la:  "+ a3+ " sinh nam: "+c);
				}
				else if (c == max) {
					System.out.println("*** Sinh vien tre nhat la: "+ a1+ " va "+a3+" sinh nam: "+a);
					//System.out.println("*** Sinh vien tre nhat la: "+ a3+ " sinh nam: "+c);
				}
				else {
					System.out.println("*** Sinh vien tre nhat la: "+ a1+ " sinh nam: "+a);
				}
			}
	}

	
	public static void TimCBTreNhat03(int a,int b, int c, String a1, String a2, String a3) {
		//input: khai bao bien
		int max; 
		// processing 
		max = a; 
		if (b>max) {
			max = b; 
			if (c>max) {
				max = c;
				System.out.println("*** Can bo nam tre nhat la: "+ a3+ " sinh nam: "+c);
			}
			else if (c == max ) {
				System.out.println("*** Can bo nam tre nhat la: "+ a2+" va "+a3+ " sinh nam: "+b);
				//System.out.println("*** Sinh vien tre nhat la: "+ a3+ " sinh nam: "+c);
			}
			else {
				System.out.println("*** Can bo nam tre nhat la: "+ a2+ " sinh nam: "+b);
			}
		}
		else if (b==max) {
			if (c>max) {
				max =c;
				System.out.println("*** Can bo nam tre nhat la: "+ a3+ " sinh nam: "+c);
			}
			else if (c==max){
				System.out.println("*** 3 can bo nam bang tuoi nhau, sinh nam: "+ max);
			}
			else {
				System.out.println("*** Can bo nam tre nhat la: "+ a1+ " va "+a2 + " sinh nam: "+a);
				//System.out.println("*** Sinh vien tre nhat la: "+ a2+ " sinh nam: "+b);
			}
		}
		else {
			
			if (c>max) {
				System.out.println("*** Can bo nam tre nhat la:  "+ a3+ " sinh nam: "+c);
			}
			else if (c == max) {
				System.out.println("*** Can bo nam tre nhat la: "+ a1+ " va "+a3+" sinh nam: "+a);
				//System.out.println("*** Sinh vien tre nhat la: "+ a3+ " sinh nam: "+c);
			}
			else {
				System.out.println("*** Can bo nam tre nhat la: "+ a1+ " sinh nam: "+a);
			}
		}
	}
	
	public static void TimCBTreNhat02(int a, int b, String a1, String b1) {
		int max; 
		max = a; 
		if (b>max) {
			System.out.println("*** Can bo nam tre nhat la: "+ b1+ " sinh nam: "+b);
		}
		else if (b==max) {
			System.out.println("*** Can bo nam tre nhat la: "+ a1+ " va "+b1 + " sinh nam: "+max);
		}
		else {
			System.out.println("*** Can bo nam tre nhat la: "+ a1+ " sinh nam: "+max);
		}
		
		
	}
	
	public static float TinhKhoangCach2Diem(float x1, float y1 , float x2, float y2) {
		return (float) Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
	}

	
	
	public static void TinhKhoangCachXaNhat(float a,float b, float c, String a1, String a2, String a3) {
		//input: khai bao bien
		float max; 
		// processing 
		max = a; 
		if (b>max) {
			max = b; 
			if (c>max) {
				max = c;
				System.out.println("*** Sinh vien xa truong nhat la: "+ a3+ " ,khoang cach den truong: "+c);
			}
			else if (c == max ) {
				System.out.println("*** Sinh vien xa truong nhat la: "+ a2+" va "+a3+ " ,khoang cach den truong: "+b);
				//System.out.println("*** Sinh vien tre nhat la: "+ a3+ " sinh nam: "+c);
			}
			else {
				System.out.println("*** Sinh vien xa truong nhat la: "+ a2+ " ,khoang cach den truong: "+b);
			}
		}
		else if (b==max) {
			if (c>max) {
				max =c;
				System.out.println("*** Sinh vien xa truong nhat la: "+ a3+ " sinh nam: "+c);
			}
			else if (c==max){
				System.out.println("*** 3 sinh vien co khoang cach den truong bang nhau la: "+ max);
			}
			else {
				System.out.println("*** Sinh vien xa truong nhat la: "+ a1+ " va "+a2 + " ,khoang cach den truong: "+a);
				//System.out.println("*** Sinh vien tre nhat la: "+ a2+ " sinh nam: "+b);
			}
		}
		else {
			
			if (c>max) {
				System.out.println("*** Sinh vien xa truong nhat la:  "+ a3+ " ,khoang cach den truong: "+c);
			}
			else if (c == max) {
				System.out.println("*** Sinh vien xa truong nhat la: "+ a1+ " va "+a3+" ,khoang cach den truong: "+a);
				//System.out.println("*** Sinh vien tre nhat la: "+ a3+ " sinh nam: "+c);
			}
			else {
				System.out.println("*** Sinh vien xa truong nhat la: "+ a1+ " ,khoang cach den truong: "+a);
			}
		}
}
	
	
}

 class CanBo {

	public String Ten;
	public Boolean IsMale;
	public int namSinh;
	public CanBo() {
		
	}
	public CanBo(String _ten,Boolean _isMale, int _namSinh) {
		this.Ten = _ten;
		this.IsMale = _isMale;
		this.namSinh = _namSinh;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	
	public Boolean getIsMale() {
		return IsMale;
	}
	public void setIsMale(Boolean isMale) {
		IsMale = isMale;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
 }
	class ToaDo{
		
		public String Ten;
		public float x;
		public float y;
		public ToaDo() {
			
		}
		public ToaDo(String _Ten, float _x, float _y) {
			this.Ten = _Ten;
			this.x = _x;
			this.y = _y;
		}
		public String getTen() {
			return Ten;
		}
		public void setTen(String ten) {
			Ten = ten;
		}
		public float getX() {
			return x;
		}
		public void setX(float x) {
			this.x = x;
		}
		public float getY() {
			return y;
		}
		public void setY(float y) {
			this.y = y;
		}	
		
	}
