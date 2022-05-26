package Bai3_9;
public class SinhVienTaiChuc extends SinhVien{
    
    private String NoiLienKet;
    private DanhSachKetQuaHocTap chuongSach;

// Hàm tạo của lớp sinh vien tai chuc
    public SinhVienTaiChuc(String MSV, String HoTen, String NgayThangNam,int  NamvaoHoc,float Diem,String NoiLienKet,DanhSachKetQuaHocTap chuongSach) {
        super(MSV,HoTen, NgayThangNam, NamvaoHoc, Diem);
        this.NoiLienKet=NoiLienKet;
        
    }
// Phương thức kiểm tra loại sinh vien
@Override
    public String loaiSinhVien() {
        
        return "Sinh vien tai chuc";
    }
// Phương thức lấy noi lien ket
    public String getNoiLienKet(){return NoiLienKet;}
// Lay thong tin ten hoc ki cua danh sach ket qua hoc tap
    public String gettenHocKi(){return chuongSach.gettenHocKi();}
// Lấy thông tin diem hoc ki cua danh sach ket qua hoc tap
        public float getdiemHocKi(){return chuongSach.getdiemHocKi();}
    @Override
// Phương thức in thông tin sinh vien tai chuc ra màn hình console
    public void inAp(){
        System.out.print("\n===============**************===================");
        System.out.print("\n\t\tMa sinh vien: "+MSV);
        System.out.print("\n\t\tTen sinh vien: "+HoTen);
        System.out.print("\n\t\tNgay thang nam sinh: "+NgayThangNam);
        System.out.print("\n\t\tNam vao hoc: "+NamVaoHoc);
        System.out.print("\n\t\tDiem: "+Diem);
        System.out.print("\n\t\tNoi lien ket: "+NoiLienKet);
    
    }
}

