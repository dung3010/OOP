public class PhanSo {
    private int tuSo, mauSo;
    private int a;
    
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public static int ucln(int a, int b) {
        while (b != 0) {            
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public PhanSo rutGon() {
        int ucln = ucln(this.tuSo, this.mauSo);
        return new PhanSo((this.tuSo / ucln), (this.mauSo / ucln));
    }
    
    public PhanSo cong(PhanSo ps) {
        PhanSo kq = new PhanSo();
        kq.tuSo = (this.tuSo * ps.mauSo) + (ps.tuSo * this.mauSo);
        kq.mauSo = this.mauSo * ps.mauSo;
        int ucln = ucln(kq.mauSo, kq.mauSo);
        return kq;
    }
    
    
    public void hienThiPhanSo() {
        System.out.printf("%d / %d", this.tuSo, this.mauSo);
    }
    
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
}
