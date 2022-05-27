package Bai3_9;
import java.util.LinkedList;
import java.util.Scanner;
public class Khoa {
    private static  LinkedList<SinhVienChinhQuy> SVCQ = new LinkedList<>();
    private LinkedList<SinhVienTaiChuc> SVTC = new LinkedList<>();
// phương thức lấy danh sách sinh vien chinh quy
    public LinkedList<SinhVienChinhQuy> getListSinhVienChinhQuy(){
        return SVCQ;
    }
// phương thức lấy danh sach sinh vien tai chuc
    public LinkedList<SinhVienTaiChuc> getListSinhVienTaiChuc(){
        return SVTC;
    }
// phương thức thêm sách them sinh vien chinhs quy vao danh sach
    public void addItemSinhVienChinhQuy(SinhVienChinhQuy e){
        SVCQ.add(e);
    }
// phương thức thêm sinh vien tai chuc vao danh sach
    public void addItemSinhVienTaiChuc(SinhVienTaiChuc e){
        SVTC.add(e);
    }
// phương thức xuất danh sách sach sinh vien chinh quy ra màn hình console
    public void XuatDSSinhVienChinhQuy(){
        for(SinhVienChinhQuy tk: SVCQ){
            tk.inAp();
        }
    }

// phương thức xuất danh sách sinh vien tai chuc ra màn hình console
    public void XuatDSSinhVienTaiChuc(){
        for(SinhVienTaiChuc tc: SVTC){
            tc.inAp();
        }
    }
//phuong thuc kiem tra sinh vien co phai sinh vien chinh quy hay khong
    public static boolean  KiemTra(SinhVien a)
{
    String a1= "Sinh vien chinh quy";

    if(a.loaiSinhVien().compareTo(a1)==0)
    {
        return true;
    }
    return false;
}
//phuong thuc xac dinh tong so sinh vien chinh quy cua khoa
public static int TongSVCQ(SinhVien a)
{
    int dem=0;
    for( SinhVienChinhQuy tk:SVCQ )
    {
        dem=dem+1;
    }
    return(dem);
}
//phuong thuc xac dinh diem dau vao cao nhat
public String MaxDiem(SinhVien a)
{
    SinhVien maxSV1=this.getListSinhVienChinhQuy().get(0);
    for(int i=1;i<this.getListSinhVienChinhQuy().size();i++){
        if(this.getListSinhVienChinhQuy().get(i).Diem>maxSV1.Diem)
        maxSV1=getListSinhVienChinhQuy().get(i);
    }
    return maxSV1.HoTen;
    SinhVien maxSV2=this.getListSinhVienTaiChuc().get(0);
    for(int i=1;i<this.getListSinhVienTaiChuc().size();i++){
        if(this.getListSinhVienChinhQuy().get(i).Diem>maxSV2.Diem)
        maxSV2=getListSinhVienChinhQuy().get(i);
    }
    return maxSV2.HoTen;
    
}
//phuong thuc tim sinh vien co diem trung binh cao nhat
public String TBMax(SinhVien a)
SinhVien max=this.getListSinhVienChinhQuy().get(0);
    for(int i=1;i<this.getListSinhVienChinhQuy().size();i++){
        if(this.getListSinhVienChinhQuy().get(i).getDiemTB()>max.getDiemTB())
        max=this.getListSinhVienChinhQuy().get(i).DiemKC();
    }
    return max.HoTen;
}
//phuong thuc lay ra noi lien ket cho truoc
public String NoiLienKetchoTruoc(SinhVien a)
{
    String s1;
    System.out.print("\nNhap noi lien ket can tim kiem : ");
    Scanner scanner;
    String string = scanner.nextLine();
    for(int i=1;i<this.getListSinhVienTaiChuc().size();i++)
    {
        if(this.getListSinhVienTaiChuc().get(i).getNoiLienKet().compareTo(s1)==0)
    }

    return a.HoTen ;
}

// phuong thuc tang dan theo xep loai 
public void sapXepTangDanTheoXepLoai(){
    int n=SVCQ.size();
   for(int i=0; i<n-1;i++)
    for(int j=i+1; j<n;j++){
        if((SVCQ.get(i).getXepLoai()).compareToIgnoreCase(SVCQ.get(j).getXepLoai())>0)
        {
            SinhVienChinhQuy t=SVCQ.get(i);
            SVCQ.set(i, SVCQ.get(j));
            SVCQ.set(j, t);
        }
    }
    int n1=SVTC.size();
   for(int i=0; i<n-1;i++)
    for(int j=i+1; j<n1;j++){
        if((SVTC.get(i).getXepLoai()).compareToIgnoreCase(SVTC.get(j).getXepLoai())>0)
        {
            SinhVienTaiChuc t=SVTC.get(i);
            SVTC.set(i, SVTC.get(j));
            SVTC.set(j, t);
        }
    }
}
// phuong thuc giam dan theo nam vao hoc
    public void sapXepTangDanTheoNamVaoHoc(){
        int n=SVCQ.size();
       for(int i=0; i<n-1;i++)
        for(int j=i+1; j<n;j++){
            if((SVCQ.get(i).getNamVaoHoc()).compareToIgnoreCase(SVCQ.get(j).getNamVaoHoc())<0)
            {
                SinhVienChinhQuy t=SVCQ.get(i);
                SVCQ.set(i, SVCQ.get(j));
                SVCQ.set(j, t);
            }
        }
        int n1=SVTC.size();
       for(int i=0; i<n-1;i++)
        for(int j=i+1; j<n1;j++){
            if((SVTC.get(i).getNamVaoHoc()).compareToIgnoreCase(SVTC.get(j).getNamVaoHoc())<0)
            {
                SinhVienTaiChuc t=SVTC.get(i);
                SVTC.set(i, SVTC.get(j));
                SVTC.set(j, t);
            }
        }
    }
//Thong ke so luong sinh vien theo nam vao hoc
    public void ThongKeSoLuongAnPhamTheoNam()
    {
        sapXepTangDanTheoNamVaoHoc();
        System.out.print("\nNam hoc va so sinh vien cua tung nam");
        int flag=0,count;
        int n=SVCQ.size();
        for(int i=flag; i<n;i++)
        {
             count=1;
            for(int j=flag+1; j<n;j++){
                if(SVCQ.get(i).getNamVaoHoc()==SVCQ.get(j).getNamVaoHoc())
                count++;
                else break;
            }
            System.out.print("\nNam "+SVCQ.get(flag).getNamVaoHoc()+" co "+count+" sinh vien chinh quy");
            flag+=count;
        }
        System.out.print("\nNam vao hoc va so luong sinh vien cua tung nam");
       
        int n1=SVTC.size();
        flag=0;
        for(int i=flag; i<n;i++)
        {
             count=1;
            for(int j=flag+1; j<n1;j++){
                if(SVTC.get(i).getNamVaoHoc()==SVTC.get(j).getNamVaoHoc())
                count++;
                else break;
            }
            System.out.print("\nNam "+SVTC.get(flag).getNamVaoHoc()+" co "+count+" sinh vien tai chuc");
            flag+=count;
        }

    }
    // Nhập sinh vien chinh quy
    public  SinhVienChinhQuy  inputSVCQ(){
        Scanner scanner= new Scanner(System.in); {
            String MSV;
            String HoTen;
            String NgayThangNam;
            int NamVaoHoc;
            float Diem;
            String tenHocKi;
            	float diemHocKi;
            	System.out.print("\nNhap ma sinh vien : ");
            	MSV=scanner.nextLine();
            	System.out.print("\nNhap ho ten sinh vien: ");
            	HoTen=scanner.nextLine();
            	System.out.print("\nNhap nay thang nam  sinh: ");
            	NgayThangNam=scanner.nextLine();
            	System.out.print("\nNhap nam sinh vien vao hoc: ");
            	NamVaoHoc=scanner.nextInt();
            	System.out.print("\nNhap diem sinh vien: ");
            	Diem=scanner.nextFloat();
                tenHocKi=scanner.nextLine();
            	System.out.print("\nNhap ten hoc ki: ");
            	tenHocKi=scanner.nextLine();
            	System.out.print("\nNhap diem hoc ki: ");
            	diemHocKi=scanner.nextFloat();
                DanhSachKetQuaHocTap c= new DanhSachKetQuaHocTap(tenHocKi,diemHocKi);
            	SinhVienChinhQuy a=new SinhVienChinhQuy(MSV,HoTen,NgayThangNam,NamVaoHoc,Diem,c);
            return a;
        }
    }
// Nhập sinh vien tai chuc
    public  SinhVienTaiChuc  inputSVTC(){
        Scanner scanner= new Scanner(System.in);{
            String MSV;
            String HoTen;
            String NgayThangNam;
            int NamVaoHoc;
            float Diem;
            String NoiLienKet;
            String tenHocKi;
            float diemHocKi;
            System.out.print("\nNhap ma sinh vien :");
            MSV=scanner.nextLine();
            System.out.print("\nNhap ho ten sinh vien: ");
            HoTen=scanner.nextLine();
            System.out.print("\nNhap nay thang nam  sinh:  ");
            NgayThangNam=scanner.nextLine();
            System.out.print("\nNhap nam sinh vien vao hoc: ");
            NamVaoHoc=scanner.nextInt();
            System.out.print("\nNhap diem sinh vien: ");
            Diem=scanner.nextFloat();
            NoiLienKet=scanner.nextLine();
            System.out.print("\nNhap noi lien ket dao tao:");
            NoiLienKet=scanner.nextLine();
            System.out.print("\nNhap ten hoc ki : ");
            tenHocKi=scanner.nextLine();
            System.out.print("\nNhap diem hoc ki: ");
            diemHocKi=scanner.nextFloat();
            DanhSachKetQuaHocTap c= new DanhSachKetQuaHocTap(tenHocKi,diemHocKi);
            SinhVienTaiChuc a=new SinhVienTaiChuc(MSV,HoTen,NgayThangNam,NamVaoHoc,Diem,NoiLienKet,c);
            return a;
        }
    }

}
