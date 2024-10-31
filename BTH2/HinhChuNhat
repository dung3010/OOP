public class HinhChuNhat {

    private Diem trenTrai;
    private Diem duoiPhai;

    public HinhChuNhat(Diem trenTrai, Diem duoiPhai) throws Exception {
        if (trenTrai.getHoanhDo() <= duoiPhai.getHoanhDo()
                && trenTrai.getTungDo() >= duoiPhai.getTungDo()) {
        this.trenTrai = trenTrai;
        this.duoiPhai = duoiPhai;
        }
        else
            throw new Exception("Invalid data!");
    }
    
    public double tinhDienTich() {
        double c1 = this.duoiPhai.getHoanhDo() - this.trenTrai.getHoanhDo();
        double c2 = this.trenTrai.getTungDo() - this.duoiPhai.getTungDo();
        return c1 * c2;
    }
    
    public Diem getTrenTrai() {
        return trenTrai;
    }

    public void setTrenTrai(Diem trenTrai) {
        this.trenTrai = trenTrai;
    }

    public Diem getDuoiPhai() {
        return duoiPhai;
    }

    public void setDuoiPhai(Diem duoiPhai) {
        this.duoiPhai = duoiPhai;
    }

}
