package quanlicanbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QLCB_GUI extends JFrame {

    private QLCB qlcb = new QLCB();
    private JTextArea textArea;

    public QLCB_GUI() {
        setTitle("Quan ly can bo");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panelFunctions = new JPanel();
        panelFunctions.setLayout(new GridLayout(5, 1));

        JButton btnThemMoi = new JButton("Them can bo moi");
        JButton btnTimKiem = new JButton("Tim kiem can bo");
        JButton btnHienThiDS = new JButton("Hien thi danh sach");
        JButton btnXoa = new JButton("Xoa can bo");
        JButton btnCapNhat = new JButton("Cap nhat can bo");

        panelFunctions.add(btnThemMoi);
        panelFunctions.add(btnTimKiem);
        panelFunctions.add(btnHienThiDS);
        panelFunctions.add(btnXoa);
        panelFunctions.add(btnCapNhat);

        add(panelFunctions, BorderLayout.WEST);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        btnThemMoi.addActionListener(e -> themMoiCanBo());

        btnTimKiem.addActionListener(e -> timKiemCanBo());

        btnHienThiDS.addActionListener(e -> hienThiDanhSach());

        btnXoa.addActionListener(e -> xoaCanBo());

        btnCapNhat.addActionListener(e -> capNhatCanBo());
    }

    private void themMoiCanBo() {
        String[] options = {"Cong nhan", "Ky su", "Nhan vien"};
        int choice = JOptionPane.showOptionDialog(this, "Chon loai can bo can them:", "Them moi can bo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (choice == 0) {
            JTextField hoTenField = new JTextField();
            JTextField tuoiField = new JTextField();
            JTextField gioiTinhField = new JTextField();
            JTextField diaChiField = new JTextField();
            JTextField bacField = new JTextField();

            Object[] message = {
                "Ho ten:", hoTenField,
                "Tuoi:", tuoiField,
                "Gioi tinh:", gioiTinhField,
                "Đia chi:", diaChiField,
                "Bac:", bacField
            };

            int option = JOptionPane.showConfirmDialog(this, message, "Them cong nhan", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                try {
                    String hoTen = hoTenField.getText();
                    int tuoi = Integer.parseInt(tuoiField.getText());
                    String gioiTinh = gioiTinhField.getText();
                    String diaChi = diaChiField.getText();
                    int bac = Integer.parseInt(bacField.getText());

                    CongNhan congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
                    qlcb.themMoiCanBo(congNhan);

                    textArea.append("Them moi cong nhan thanh cong!\n");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Du lieu khong hop le!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (choice == 1) {
            JTextField hoTenField = new JTextField();
            JTextField tuoiField = new JTextField();
            JTextField gioiTinhField = new JTextField();
            JTextField diaChiField = new JTextField();
            JTextField nganhDaoTaoField = new JTextField();

            Object[] message = {
                "Ho ten:", hoTenField,
                "Tuoi:", tuoiField,
                "Gioi tinh:", gioiTinhField,
                "Đia chi:", diaChiField,
                "Nganh dao tao:", nganhDaoTaoField
            };

            int option = JOptionPane.showConfirmDialog(this, message, "Them ky su", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                try {
                    String hoTen = hoTenField.getText();
                    int tuoi = Integer.parseInt(tuoiField.getText());
                    String gioiTinh = gioiTinhField.getText();
                    String diaChi = diaChiField.getText();
                    String nganhDaoTao = nganhDaoTaoField.getText();

                    KySu kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
                    qlcb.themMoiCanBo(kySu);

                    textArea.append("Them moi ky su thanh cong!\n");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Du lieu khong hop le!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (choice == 2) {
            JTextField hoTenField = new JTextField();
            JTextField tuoiField = new JTextField();
            JTextField gioiTinhField = new JTextField();
            JTextField diaChiField = new JTextField();
            JTextField congViecField = new JTextField();

            Object[] message = {
                "Ho ten:", hoTenField,
                "Tuoi:", tuoiField,
                "Gioi tinh:", gioiTinhField,
                "Đia chi:", diaChiField,
                "Cong viec:", congViecField
            };

            int option = JOptionPane.showConfirmDialog(this, message, "Them nhan vien", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                try {
                    String hoTen = hoTenField.getText();
                    int tuoi = Integer.parseInt(tuoiField.getText());
                    String gioiTinh = gioiTinhField.getText();
                    String diaChi = diaChiField.getText();
                    String congViec = congViecField.getText();

                    NhanVien nhanVien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
                    qlcb.themMoiCanBo(nhanVien);

                    textArea.append("Them moi nhan vien thanh cong!\n");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Du lieu khong hop le!", "error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void timKiemCanBo() {
        String hoTen = JOptionPane.showInputDialog(this, "Nhap ho ten can bo can tim");
        if (hoTen != null && !hoTen.trim().isEmpty()) {
            textArea.setText("Ket qua tim kiem:\n");
            qlcb.timKiemTheoHoTen(hoTen);
        }
    }

    private void hienThiDanhSach() {
        String danhSach = qlcb.hienThiDanhSachCanBo();
        textArea.setText(danhSach);
    }

    private void xoaCanBo() {
        String idStr = JOptionPane.showInputDialog(this, "Nhap ID cua can bo can xoa:");
        if (idStr != null && !idStr.trim().isEmpty()) {
            try {
                int id = Integer.parseInt(idStr);
                qlcb.xoaCanBoTheoId(id);
                textArea.append("Xoa can bo thanh cong!\n");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "ID khong hop le!", "error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void capNhatCanBo() {
        JOptionPane.showMessageDialog(this, "Chuc nang duoc cap nhat khong trien khai trong vi du nay!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            QLCB_GUI gui = new QLCB_GUI();
            gui.setVisible(true);
        });
    }
}
