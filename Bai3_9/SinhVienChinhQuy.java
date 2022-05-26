package Bai3_9;

public class SinhVienChinhQuy extends SinhVien{
    private DanhSachKetQuaHocTap chuongSach;
// Hàm tạo sách tham khảo
    public SinhVienChinhQuy(String MSV, String HoTen, String NgayThangNam,int  NamvaoHoc,float Diem,DanhSachKetQuaHocTap chuongSach) {
        super(MSV, HoTen, NgayThangNam, NamvaoHoc, Diem);
    }
    @Override
// Kiểm tra loại ấn phẩm
    public String loatAnPham() {
        
        return "Sinh Vien Chinh Quy";
    }
// Kiểm tra xem tạp chí có xuất bản cách đây 10 năm hay không
// Lấy thông tin lĩnh vực của sách tham khảo
// Lấy thông tin số trang của chương sách
    public String gettenHocKi(){return chuongSach.gettenHocKi();}
// Lấy thông tin tiêu đề của chương
    public float getdiemHocKi(){return chuongSach.getdiemHocKi();}
    @Override
//  In thông tin sách tham khảo ra màn hình console
    public void inAp() {
        System.out.print("\n===============**************===================");
        System.out.print("\n\t\tMa sinh vien: "+MSV);
        System.out.print("\n\t\tTen sinh vien: "+HoTen);
        System.out.print("\n\t\tNgay thang nam sinh: "+NgayThangNam);
        System.out.print("\n\t\tNam vao hoc: "+NamVaoHoc);
        System.out.print("\n\t\tDiem: "+Diem);
        System.out.print("\n\t\tTen hoc ki: "+gettenHocKi());
        System.out.print("\n\t\t:Diem Hoc Ki "+getdiemHocKi());
    }
    
}
