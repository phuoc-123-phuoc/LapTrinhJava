import java.util.Scanner;

public class Bai2_9{
    
    public static void DemHoaChinhPhu(char[][] a, int n, int m){
        int demchinh=0;
		for (int i = 0; i < n; i++){
		    for (int j = 0; j < n; j++){
		        if(i==j){
		        	if ((a[i][j] >= 65) && (a[i][j] <= 90))
				        demchinh++;		  
		        }	
		    }
		}
		System.out.print("So chu hoa tren duong cheo chinh la: "+demchinh); 

        int demphu=0;
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
			    if(i+j==n-1){
			        if ((a[i][j] >= 65) && (a[i][j] <= 90))
					    demphu++;		  
			    }	
			}
		}
		System.out.println("\n");   
		System.out.print("So chu hoa tren duong cheo phu : "+demphu); 
    }

    public static void ChuyenChinhPhu(char[][] a, int n, int m){
        System.out.println("\n\nChuyen ki tu thuong tren duong cheo chinh sang ki tu hoa: ");
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				if(i==j){
				    if(a[i][j] >= 97 && a[i][j] <= 122){
				        a[i][j] -= 32;
				    }
				}
			    System.out.print(a[i][j] + "\t");
            }
			System.out.println("\n");
        }

		System.out.println("\nChuyen ki tu thuong tren duong cheo phu sang ki tu hoa:");
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				if(i+j==n-1){
				    if(a[i][j] >= 97 && a[i][j] <= 122){
				        a[i][j] -= 32;
				    }
				}
				System.out.print(a[i][j] + "\t");
            }
			System.out.println("\n");
        }
    }

    public static int DemSoLanXuatHien(char[][] a, int n, int m, int x){
        int dem=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if((a[i][j] == x) && (a[i][j] >= 65) && (a[i][j] <= 90) )
                    dem++;
            }
        }
        return dem; 
    }

    public static void XuatHienNhieuNhat(char[][] a, int n, int m){
        int r1 = DemSoLanXuatHien(a, n, m, a[0][0]);
        int r2;
        int a1=0, a2=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                r2 = DemSoLanXuatHien(a, n, m, a[i][j]);
                if(r2>r1){
                    r1=r2;
                    a1=i;
                    a2=j;
                }
            }
        }
        System.out.println("Gia tri in hoa xuat hien nhieu nhat trong mang la: "+a[a1][a2]+" voi "+r1+" lan");
    }

    public static void main(String[] args) {
        int n, m;
         
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Luu y m=n: ");
        System.out.print("Nhap vao so dong cua mang: ");
        n = scanner.nextInt();
        System.out.print("Nhap vao so cot cua mang: ");
        m = scanner.nextInt();
             
        char[][] a = new char[n][m];     
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhap phan tu thu [" + i + "," + j + "]: ");
                a[i][j] = scanner.next().charAt(0);
            }
        }
             
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }

        DemHoaChinhPhu(a, n, m);
        ChuyenChinhPhu(a, n, m);
        XuatHienNhieuNhat(a, n, m);

        scanner.close();
    }
}
