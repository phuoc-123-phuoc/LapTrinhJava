package Bai3_9;
public class DanhSachKetQuaHocTap {
    private String tenHocKi;
    private float diemHocKi;

    // Hàm tạo của lớp chương sách
    public DanhSachKetQuaHocTap(String tenHocKi, float diemHocKi)
    {
        this.tenHocKi=tenHocKi;
        this.diemHocKi=diemHocKi;
    }
    // phương thức lấy tiêu đề của chương sách
    public String gettenHocKi(){return tenHocKi;}
    // phương thức lấy số trang của chương sách
    public float getdiemHocKi(){return diemHocKi;}
}