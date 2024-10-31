public class DoanThang {

    private Diem diemDau;
    private Diem diemCuoi;

    public DoanThang(Diem diemDau, Diem diemCuoi) {
        this.diemDau = diemDau;
        this.diemCuoi = diemCuoi;
    }

    public void hienThiDoan() {
        System.out.printf("Toa do diem: [(%.1f, %.1f), (%.1f, %.1f)]",
                this.diemDau.getHoanhDo(), this.diemDau.getTungDo(),
                this.diemCuoi.getHoanhDo(), this.diemCuoi.getTungDo());
    }

    public double tinhDoDai() {
        return this.diemDau.tinhKhoangCach(this.diemCuoi);
    }

    public Diem timTrungDiem() {
        double x = (this.diemDau.getHoanhDo() + this.diemCuoi.getHoanhDo()) / 2;
        double y = (this.diemDau.getTungDo() + this.diemCuoi.getTungDo()) / 2;
        return new Diem(x, y);
    }

    public boolean isSongSong(DoanThang d) {
        double v1 = (this.diemDau.getHoanhDo() - this.diemCuoi.getHoanhDo())
                * (d.diemDau.getTungDo() - d.diemCuoi.getTungDo());
        double v2 = (this.diemDau.getTungDo() - this.diemCuoi.getTungDo())
                * (d.diemDau.getHoanhDo() - d.diemCuoi.getHoanhDo());
        return v1 == v2;
    }

    public Diem getDiemDau() {
        return diemDau;
    }

    public void setDiemDau(Diem d) {
        this.diemDau = d;
    }

    public Diem getDiemCuoi() {
        return diemCuoi;
    }

    public void setDiemCuoi(Diem d) {
        this.diemCuoi = d;
    }

}
