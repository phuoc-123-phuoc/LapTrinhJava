package Bai3_9;
public abstract class SinhVien {
    protected String MSV;
	protected String HoTen;
	protected String NgayThangNam;
	protected int NamVaoHoc;
	protected float Diem;
	//Ham Tao Cua Lop Sinh Vien;
	protected SinhVien(String MSV, String HoTen, String NgayThangNam, int NamVaoHoc, float Diem) {
		super();
		this.MSV=MSV;
		this.HoTen = HoTen;
		this.NgayThangNam = NgayThangNam;
		this.NamVaoHoc = NamVaoHoc;
		this.Diem = Diem;
	}
	//Phuong thuc lay Ma Sinh Vien
	public String getMSV()
	{
		return this.MSV;
	}
	//Phuong thuc lay ho ten
	public String getHoTen()
	{
		return this.HoTen;
	}
	//phuong thuc lay ngay thang nam
	public String getNgayThangNam()
	{
		return this.NgayThangNam;
	}
	public int getNamVaoHoc()
	{
		return this.NamVaoHoc;
	}
	//Phuong thuc lay diem
	public float getDiem()
	{
		return this.getDiem();
	}
	//Phuong thuc lay thong tin loai sinh vien
    public abstract String loatAnPham();
// phương thức kiểm tra loại ấn phẩm có xuất bản cách đây 10 năm không
//phương thức in sinh vien ra màn mình console
    public abstract void inAp();
}
