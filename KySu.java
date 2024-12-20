package quanlicanbo;

public class KySu extends CanBo {

    private String nganhDaoTao;

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Nganh dao tao: " + nganhDaoTao);
    }

    @Override
    public String toString() {
        return "Ky su - Ho ten: " + getHoTen() + ", Tuoi: " + getTuoi()
                + ", Gioi tinh: " + getGioiTinh() + ", Đia chi: " + getDiaChi()
                + ", Nganh dao tao: " + nganhDaoTao;
    }

}
