package thuchanh4;
class MayTinh {
    protected String maSo;
    protected String ten;
    protected String cpu;
    protected int ram;
    protected SoPhong soPhong;

    public MayTinh(String maSo, String ten, String cpu, int ram, SoPhong soPhong) {
        this.maSo = maSo;
        this.ten = ten;
        this.cpu = cpu;
        this.ram = ram;
        this.soPhong = soPhong;
    }

    public void hienThiThongTin() {
        System.out.println("Mã số: " + maSo);
        System.out.println("Tên: " + ten);
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + "GB");
        soPhong.hienThiThongTin();
    }
}
