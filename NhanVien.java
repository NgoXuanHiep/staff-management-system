package quanlicanbo;

public class NhanVien extends CanBo {

    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Cong viec: " + congViec);
    }

    @Override
    public String toString() {
        return "Nhan vien - Ho ten: " + getHoTen() + ", Tuoi: " + getTuoi()
                + ", Gioi tinh: " + getGioiTinh() + ", Đia chi: " + getDiaChi()
                + ", Cong viec: " + congViec;
    }
}
