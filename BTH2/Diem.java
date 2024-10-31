public class Diem {

    private double hoanhDo;
    private double tungDo;

    public Diem(double hoanhDo, double tungDo) {
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }
    
    public double tinhKhoangCach(Diem d) {
        return Math.sqrt(Math.pow(this.hoanhDo - d.hoanhDo, 2) + Math.pow(this.tungDo - d.tungDo, 2));
    }
    
    public double getHoanhDo() {
        return hoanhDo;
    }

    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public double getTungDo() {
        return tungDo;
    }

    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }
    
    public void hienThiDiem() {
        System.out.printf("(%.1f, %.1f)", this.hoanhDo, this.tungDo);
    }
}
