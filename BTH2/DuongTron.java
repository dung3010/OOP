public class DuongTron {
    private Diem tam;
    private double banKinh;
    
    public DuongTron(Diem tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }
    
    public int ktViTriDiemVaDuongTron(Diem a) {
        double kc = this.tam.tinhKhoangCach(a);
        if (kc > this.banKinh)
            return 1;
        else if (kc < this.banKinh)
            return -1;
        
        return 0;
    }
    
    public int ktViTriDtVaDt(DuongTron dt) {
        double kc = this.tam.tinhKhoangCach(dt.tam);
        double tongBk = this.banKinh + dt.banKinh;
        if (kc > tongBk)
            return 1;
        else if (kc < tongBk)
            return -1;
        
        return 0;
    }
    
    public Diem getTam() {
        return tam;
    }
    
    public void setTam(Diem tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
}
