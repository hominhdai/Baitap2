import java.util.ArrayList;
import java.util.Scanner;

abstract class Sach {
    private String maSach;
    private String ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;

    public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    abstract double tinhThanhTien();
}

class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    @Override
    double tinhThanhTien() {
        double thanhTien;
        if (tinhTrang.equals("mới")) {
            thanhTien = getSoLuong() * getDonGia();
        } else {
            thanhTien = getSoLuong() * getDonGia() * 0.5;
        }
        return thanhTien;
    }
}

class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    @Override
    double tinhThanhTien() {
        return getSoLuong() * getDonGia() + getThue();
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        // Tạo sẵn 3 sách giáo khoa và 3 sách tham khảo để thử nghiệm
        danhSachSach.add(new SachGiaoKhoa("GK1", "01/01/2022", 20000, 100, "NXB A", "mới"));
        danhSachSach.add(new SachGiaoKhoa("GK2", "01/01/2022", 25000, 200, "NXB B", "cũ"));
        danhSachSach.add(new SachGiaoKhoa("

