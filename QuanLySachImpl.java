import java.util.ArrayList;
public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> danhSachSach;
    public QuanLySachImpl() {
        danhSachSach = new ArrayList<>();
    }
    @Override
    public void themSach(Sach s) {
        if (timKiemSach(s.getMaSach()) != null) {
            System.out.println("-> LOI: Ma sach '" + s.getMaSach() + "' da ton tai. Khong the them.");
        } else {
            danhSachSach.add(s);
            System.out.println("-> Da them sach thanh cong: " + s.getTieuDe());
        }
    }
    @Override
    public boolean xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            danhSachSach.remove(s);
            System.out.println("-> Da xoa sach: " + s.getTieuDe());
            return true;
        } else {
            System.out.println("-> LOI: Khong tim thay sach co ma '" + maSach + "'.");
            return false;
        }
    }
    @Override
    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            s.setSoLuong(soLuongMoi);
            System.out.println("-> Da cap nhat so luong cho sach '" + s.getTieuDe() + "' thanh " + soLuongMoi);
            return true;
        } else {
            System.out.println("-> LOI: Khong tim thay sach co ma '" + maSach + "'.");
            return false;
        }
    }
    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null; // Không tìm thấy
    }
    @Override
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("-> Danh sach hien dang trong!");
        } else {
            System.out.println("\n============== DANH SACH TRONG THU VIEN ==============");
            for (Sach s : danhSachSach) {
                System.out.println(s.toString()); 
            }
            System.out.println("==========================================================");
        }
    }
}
