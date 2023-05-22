package thuchanh4;
public class Main {
    public static void main(String[] args) {
        SoPhong phong1 = new SoPhong("P001", "Phòng 1");
        SoPhong phong2 = new SoPhong("P002", "Phòng 2");

        MayTinh mayTinh1 = new MayTinh("PC001", "Máy tính 1", "Intel Core i5", 8, phong1);
        mayTinh1.hienThiThongTin();

        System.out.println();

        CardDoHoa mayTinh2 = new CardDoHoa("PC002", "Máy tính 2", "Intel Core i7", 16, phong2, "NVIDIA GeForce RTX 2080");
        mayTinh2.hienThiThongTin();

        System.out.println();

        HeDieuHanh mayTinh3 = new HeDieuHanh("PC003", "Máy tính 3", "Intel Core i3", 4, phong1, "Windows 10");
        mayTinh3.hienThiThongTin();
    }
}
