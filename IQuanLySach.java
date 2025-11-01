public interface IQuanLySach {
    void themSach(Sach s);
    Sach timKiemSach(String maSach);
    boolean xoaSach(String maSach);
    void hienThiDanhSach();
    boolean capNhatSoLuong(String maSach, int soLuongMoi);
}
