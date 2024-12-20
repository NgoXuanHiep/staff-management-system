package quanlicanbo;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {

    private ArrayList<CanBo> danhSachCanBo = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void themMoiCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
        System.out.println("Them thanh cong!");
    }

    public void timKiemTheoHoTen(String hoTen) {
        boolean timThay = false;
        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getHoTen().equalsIgnoreCase(hoTen)) {
                canBo.hienThiThongTin();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay can bo co ho ten: " + hoTen);
        }
    }

    public String hienThiDanhSachCanBo() {
        StringBuilder result = new StringBuilder();
        if (danhSachCanBo.isEmpty()) {
            result.append("Danh sach can bo trong.\n");
        } else {
            for (int i = 0; i < danhSachCanBo.size(); i++) {
                CanBo canBo = danhSachCanBo.get(i);
                result.append("[").append(i).append("] ").append(canBo.toString()).append("\n");
            }
        }
        return result.toString();
    }

    public void xoaCanBoTheoId(int id) {
        if (id >= 0 && id < danhSachCanBo.size()) {
            danhSachCanBo.remove(id);
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong tim thay can bo voi ID: " + id);
        }
    }

    public void capNhatCanBoTheoId(int id) {
        if (id >= 0 && id < danhSachCanBo.size()) {
            CanBo canBo = danhSachCanBo.get(id);

            System.out.print("Nhap ho ten moi: ");
            String hoTen = sc.nextLine();
            System.out.print("Nhap tuoi moi: ");
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap gioi tinh moi: ");
            String gioiTinh = sc.nextLine();
            System.out.print("Nhap dia chi moi: ");
            String diaChi = sc.nextLine();

            canBo.setHoTen(hoTen);
            canBo.setTuoi(tuoi);
            canBo.setGioiTinh(gioiTinh);
            canBo.setDiaChi(diaChi);

            System.out.println("Cap nhat thanh cong!");
        } else {
            System.out.println("Khong tim thay can bo voi ID: " + id);
        }
    }

}
