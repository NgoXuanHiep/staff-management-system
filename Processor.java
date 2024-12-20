package quanlicanbo;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("Quan li can bo:");
            System.out.println("1. Them moi can bo");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Hien thi danh sach can bo");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    System.out.println("1. Cong nhan");
                    System.out.println("2. Ky su");
                    System.out.println("3. Nhan vien");
                    System.out.print("Chon loai can bo: ");
                    int loai = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ho ten: ");
                    String hoTen = sc.nextLine();
                    System.out.print("Tuoi: ");
                    int tuoi = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Gioi tinh: ");
                    String gioiTinh = sc.nextLine();
                    System.out.print("Đia chi: ");
                    String diaChi = sc.nextLine();

                    if (loai == 1) {
                        System.out.print("Bac: ");
                        int bac = sc.nextInt();
                        qlcb.themMoiCanBo(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                    } else if (loai == 2) {
                        System.out.print("Nganh dao tao: ");
                        String nganhDaoTao = sc.nextLine();
                        qlcb.themMoiCanBo(new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao));
                    } else if (loai == 3) {
                        System.out.print("Cong viec: ");
                        String congViec = sc.nextLine();
                        qlcb.themMoiCanBo(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec));
                    }
                    break;
                case 2:
                    System.out.print("Nhap ho ten can tim: ");
                    String tenTim = sc.nextLine();
                    qlcb.timKiemTheoHoTen(tenTim);
                    break;
                case 3:
                    qlcb.hienThiDanhSachCanBo();
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon hop le.");
            }
        } while (luaChon != 4);

        sc.close();
    }
}
