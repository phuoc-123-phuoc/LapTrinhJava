package Bai3_9;
public class DanhSachKetQuaHocTap {
    private String tenHocKi;
    private float diemHocKi;

    // Hàm tạo của lớp danh sach ket qua hoc tap
    public DanhSachKetQuaHocTap(String tenHocKi, float diemHocKi)
    {
        this.tenHocKi=tenHocKi;
        this.diemHocKi=diemHocKi;
    }
    // phương thức lấy ten hoc ki cua danh sach ket qua hoc tap
    public String gettenHocKi(){return tenHocKi;}
    // phương thức lấy điem hoc ki cua danh sach ket qua hoc tap
    public float getdiemHocKi(){return diemHocKi;}
}
