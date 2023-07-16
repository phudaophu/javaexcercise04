import java.util.Scanner;

public class Baitap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*  20230713
 *  Bai tap 01:	Viết chương trình nhập vào một số 
 *  và kiểm tra xem số đó có chia hết cho 5 hay không?
 * 
 * */
		
		 // input: khai bao bien 
//		int a; 
//		Scanner sc = new Scanner (System.in);
//		
//		try {
//			while (true) {
//				System.out.println(">>> Kiem tra 1 so nguyen chia het cho 5");
//				System.out.print("Nhap vao 1 so nguyen: ");
//				a = sc.nextInt();
//				// processing and output
//				// kiem tra gia tri nhap vao % 5 
//			    if (a%5==0) {
//			    	System.out.println("So "+a +" chia het cho 5");
//			    }
//			    else {
//			    	System.out.println("So "+a +" khong chia het cho 5");
//			    }
//			}
//		}
//		catch(Exception e){
//			System.out.println(">>> Gia tri nhap vao ko phai la so nguyen");
//		}
		
		
/*  20230713
 *  Bai tap 02:	Viết chương trình nhật vào Họ tên, tuổi, giới tính, mã số sinh viên. 
 *  Và in ra các thông tin trên ra màn hình
 * 
 * */		
		
//		// input: khai bao bien 
//		String hoTen,gioiTinh="";
//		int tuoi,tmp;
//		
//		
//		Scanner sc= new Scanner(System.in);
//		
//		System.out.print("Nhap vao ho va ten sinh vien: ");
//		hoTen =sc.nextLine();
//		
//		do {
//			System.out.print("Nhap vao so tuoi: ");
//			tuoi  =sc.nextInt();
//		}
//		while(tuoi<1 || tuoi>100);
//		
//		do {
//			
//			System.out.print("Gioi tinh: Nam(1)/ Nu(2)/ Khac(3).Chon so 1/2/3: ");
//			 tmp = sc.nextInt();
//			 switch(tmp) {
//			 case 1: gioiTinh = "Nam";
//			 		break;
//			 case 2: gioiTinh="Nu";
//			 		break; 
//			 case 3: gioiTinh = "Khac";
//			 		break;
//			 }
//			default: System.out.println("*** Vui long cho so 1 hoac 2 hoac 3);break;
//		}
//		while (tmp != 1 && tmp!=2 && tmp!=3 );
//
//		
//		
//		
//		//processing and output
//		
//		System.out.println("----------- Thong Tin Sinh Vien -------------");
//		System.out.println("Hovaten\t\t| Tuoi\t| Gioitinh");
//		System.out.println(hoTen + "\t\t|  "+ tuoi +"\t| " + gioiTinh);
//		System.out.println("---------------------------------------------");
		
		
		
/*  20230713
 *  Bai tap 03: Nhập vào 2 số nguyên a,b từ bàn phím
 *				Tính tổng 2 số nguyên a,b và in kết quả ra màn hình console.
 * 
 * */			
		
		
//		// input: khai bao bien 
//		int a,b; 
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//		System.out.println("Nhap vao so nguyen a: ");
//		a = sc.nextInt();
//		System.out.println("Nhap vao so nguyen b: ");
//		b = sc.nextInt();
//		// processing and output: a+b
//		System.out.printf("Tong 2 so a va b la: %d",a+b);
//		}catch  (Exception e) {
//			System.out.print("*** Gia tri nhap vao phai la so nguyen");
//		}
		
		
		
		
/*  20230713
 *  Bai tap 04: 	Viết chường trình nhập vào 4 số nguyên a,b,c,d từ bàn phím
					a)	Tính tổng của 4 số nguyên a,b,c,d
					b)	Tính hiệu của 4 số nguyên a,b,c,d
					c)	Tính tích của 2 số nguyên a,b
					d)	Tính tích của 2 số nguyên c và d
					e)	Tính kết quả của a – b + c + d
 * 
 * */		
		
		// input: khai bao bien
//		int a,b,c,d,tmp; 
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			System.out.print("Nhap vao so nguyen a: ");
//			a = sc.nextInt();
//			System.out.print("Nhap vao so nguyen b: ");
//			b = sc.nextInt();
//			System.out.print("Nhap vao so nguyen c: ");
//			c = sc.nextInt();
//			System.out.print("Nhap vao so nguyen d: ");
//			d = sc.nextInt();
//			// processing and output
//			do {
//				System.out.println("------------- MENU -------------");
//				System.out.println("Chon 1: tinh tong 4 so a,b,c,d");
//				System.out.println("Chon 2: tinh hieu 4 so a,b,c,d");
//				System.out.println("Chon 3: tinh tich 2 so a,b");
//				System.out.println("Chon 4: tinh tong 2 so c,d");
//				System.out.print("*** So ban chon la: ");
//				
//				tmp = sc.nextInt();
//				switch (tmp) {
//				case 1: System.out.printf(">>> Tong 4 so a,b,c,d la: %d", a+b+c+d);break;
//				case 2: System.out.printf(">>> Hieu 4 so a,b,c,d: %d",a-b-c-d);break;
//				case 3: System.out.printf(">>> Tich 2 so a va b la: %d",a*b);break;
//				case 4: System.out.printf(">>> Tich 2 so c va d la: %d",c*d);break;
//				default: System.out.println("*** Vui long cho so 1 hoac 2 hoac 3 hoac 4");break;
//				}
//			}while(tmp != 1 && tmp!=2 && tmp!=3 && tmp!=4);
//			
//		}
//		catch(Exception e) {
//			System.out.print("*** Gia tri nhap vao phai la so nguyen");
//		}
		
		
		
/*  20230713
 *  Bai tap 05: – Người dùng nhập vào số nguyên n
				– Kiểm tra số n là chẵn hay lẻ.
				  Ví dụ: n = 2. In ra màn hình 2 là số chẵn; n = 9. In ra màn hình 9 là số lẻ.

 * 
 * */			
		
		
//		// input: khai bao bien
//		try {
//			int n;
//			Scanner sc = new Scanner(System.in);
//			System.out.print("Nhap vao so nguyen n: ");
//			n = sc.nextInt();
//			sc.close();
//			
//			// processing and output
//			if (n%2==0) System.out.println("So "+n+" la so chan");
//			else System.out.println("So "+n+" la so le");
//			
//		}
//		catch(Exception e) {
//			System.out.print("*** Gia tri nhap vao phai la so nguyen");
//		}
		
		
		

/*  20230713
 *  Bai tap 06: Viết chương trình xuất ra tiếng kêu của các con vật chó, mèo, chuột, ngựa. 
 *  			Trong đó người dùng sẽ nhập vào con vật mà người dùng muốn xem tiếng kêu. 
 *  			Ví dụ người dùng nhập chó chương trình sẽ xuất ra “gâu gâu”.
 * */		
		
		
		// input: khai bao bien
//		String tenConVat,tiengKeu;
//		Scanner sc =new Scanner(System.in);
//		System.out.print("Nhap vao ten con vat: ");
//		tenConVat = sc.nextLine();
//		// processing and output
//		switch (tenConVat){
//			case "cho": System.out.println("gau gau gau");break; 
//			case "meo": System.out.println("meo meo meo"); break; 
//			case "chuot": System.out.println("chit chit chit"); break;
//			case "ngua": System.out.println("hi hi hi");break;
//			default: System.out.print("Con vat ban nhap vao chua duoc khai bao"); break;
//		}
	
		
		
		
		
/*  20230713
 *  Bai tap 06: Viết chương trình giải phương trình bậc nhất ax + b = 0 
 *  			Trong đó a, b là 2 số được người dùng nhập vào màn hình
 * */			
		
//		try {
		// input khai bao bien
//			int a,b; 
//			Scanner sc = new Scanner(System.in);
//			System.out.println("*** Giai phuong trinh bac nhat ax+b = 0: ");
//			
//			
//			do {
//				System.out.print("Nhap vao so a: ");
//				a = sc.nextInt();
//				if (a==0) System.out.println("*** So a phai khac 0");
//			}while (a ==0);
//			
//			
//			System.out.print("Nhap vao so b: ");
//			b = sc.nextInt();
//			
//			// processing and output
//			System.out.printf(">>> Ket qua cua phuong trinh la: %.3f", (float) -b/a);
//		
//		
//		}catch(Exception e) {
//			
//			System.out.println("*** Gia tri nhap vao phai la so nguyen");
//		}
		
		
		
/*  20230713
 *  Bai tap 07: Viết chương trình giải phương trình sau ax2 + b = 0 
 *  			Trong đó a,b là 2 số người dùng nhập vào màn hình.	
*/		
		
		
		try {
		// input: khai bao bien
		int a,b; 
		Scanner sc = new Scanner(System.in);
		System.out.println("*** Giai phuong trinh bac hai ax2+b = 0: ");
		
		
		do {
			System.out.print("Nhap vao so a: ");
			a = sc.nextInt();
			if (a==0) System.out.println("*** So a phai khac 0");
		}while (a ==0);
		
		
		System.out.print("Nhap vao so b: ");
		b = sc.nextInt();
		
		
		// processing and output
		if (-b/a < 0 ) System.out.printf(">>> Phuong trinh vo nghiem");
		else
		System.out.printf(">>> Ket qua cua phuong trinh la: %.3f va %.3f", (float) Math.sqrt(-b/a), (float) -Math.sqrt(-b/a) );
	
	
	}catch(Exception e) {
		
		System.out.println("*** Gia tri nhap vao phai la so nguyen");
	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
