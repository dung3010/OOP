 public static void main(String[] args) {
        Diem d1 = new Diem(9, 10);
        Diem d2 = new Diem(1, 10);
        d1.hienThiDiem();
        d2.hienThiDiem();
        System.out.printf("\nKhoanh cach giua 2 diem la: %.1f\n", d1.tinhKhoangCach(d2));

        DoanThang doan = new DoanThang(d1, d2);
        doan.hienThiDoan();

        DoanThang doan1 = new DoanThang(new Diem(1, 5), new Diem(8, 5));
        DoanThang doan2 = new DoanThang(new Diem(2, 3), new Diem(4, 3));
        System.out.printf("\nDo dai doan = %.1f\n", doan1.tinhDoDai());
        Diem trungDiem = doan1.timTrungDiem();
        System.out.print("Trung diem cua doan la: ");
        trungDiem.hienThiDiem();
        System.out.println();
        System.out.println(doan1.isSongSong(doan2));

        HinhChuNhat hcn = new HinhChuNhat(new Diem(2, 5), new Diem(7, 2));
        System.out.println(hcn.tinhDienTich());
    }

