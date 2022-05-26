package Bai3_9;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GiaoDien {
	static JFrame f = new JFrame("SINH VIEN");
	
//Phương thức hiển thị Sinh Vien với giao diện đồ họa thườngthường 
	public static  void HienThi(Khoa a) {
		

		String colunm[] = { "MÃ SINH VIÊN", "TÊN SINH VIÊN", "NGAY THÁNG NĂM SINH", "NĂM VÀO HỌC", "DIỂM","TÊN HỌC KÌ","DIỂM HỌC KÌ","NOI LIEN KET"};

		DefaultTableModel model = new DefaultTableModel(colunm, 0);
		JTable table = new JTable(model);
		table.setBounds(30, 40, 200, 300);
		for(SinhVienChinhQuy tc: a.getListSinhVienChinhQuy()) {
					Object row[] = {
                        tc.getMSV(),
                        tc.getHoTen(),
                        tc.getNgayThangNam(),
                        tc.getNamVaoHoc(),
                        tc.getDiem(),
                        tc.gettenHocKi(),
                        tc.getdiemHocKi(),
					};
					model.addRow(row);

			}
        for(SinhVienTaiChuc stk: a.getListSinhVienTaiChuc()){
            Object row[] ={
                stk.getMSV(),
                stk.getHoTen(),
                stk.getNgayThangNam(),
                stk.getNamVaoHoc(),
                stk.getDiem(),
                stk.gettenHocKi(),
                stk.getdiemHocKi(),
                stk.getNoiLienKet(),

            };
            model.addRow(row);

        }
		JScrollPane sp = new JScrollPane(table);
		f.add(sp);
		f.setSize(1000, 500);
		f.setVisible(true);

	}
// phương thức main để chạy chương trình
    public static void main(String[] args){
        Khoa a= new Khoa();
        SinhVienChinhQuy tc=a.inputSTK();
        SinhVienChinhQuy tc1=a.inputSTK();
        SinhVienTaiChuc stk=a.inputTapChi();
        SinhVienTaiChuc stk1=a.inputTapChi();
        a.addItemSinhVienChinhQuy(tc);
        a.addItemSinhVienChinhQuy(tc1);
        a.addItemSinhVienTaiChuc(stk);
        a.addItemSinhVienTaiChuc(stk1);
        HienThi(a);
    }
    
}
