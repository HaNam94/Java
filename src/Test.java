import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println( "Hello Wrold");
//
//        System.out.println("Hello World, Hi Ae");
//
//        System.out.println(" Nhập tên của bạn : ");
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name);

//        int so1 = scanner.nextInt();
//        System.out.println("Nhập số đầu tiên: " + so1);
//        int so2 = scanner.nextInt();
//        System.out.println("Nhập số thứ Hai: " + so2);
//
//         int tong = so1 + so2;
//         int tich = so1 * so2;
//         int hieu = so1 - so2;
//         int thuong = so1 / so2;
//         int sodu = so1 % so2;
//
//        System.out.println("Tổng: " + tong);
//        System.out.println("Tích: " + tich);
//        System.out.println("Hiệu: " + hieu);
//        System.out.println("Thương: " + thuong);
//        System.out.println("Số dư: " + sodu);

//        System.out.println(" Nhập tên của bạn: ");
//        String ten = scanner.next();
//        int tuoi = scanner.nextInt();
//        System.out.println("Xin chào tôi là  " + ten + " Tôi năm nay " + tuoi + " tuổi. ");

//        int a = so1;
//        a += so2;
//        System.out.println("a +=b: " + a);
//        int b = so1;
//        b -= so2;
//        System.out.println("b -= b: " + b);
//        int c = so1;
//        c *= so2;
//        System.out.println("c *= b: " + c);
//        int d = so1;
//        d /= so2;
//        System.out.println("d /= b: " + d);
//        int e = so1;
//        e++;
//        System.out.println("e++: " + e);
//        int f = so2;
//        f--;
//        System.out.println("f--: " + f);
//
//        System.out.println("so1 < so2: " + (so1 < so2));
//        System.out.println("so1 > so2: " + (so1 > so2));
//        System.out.println("so1 <= so2: " + (so1 <= so2));
//        System.out.println("so1 >= so2: " + (so1 >= so2));
//        System.out.println("so1 == so2: " + (so1 == so2));
//        System.out.println("so1 != so2: " + (so1 != so2));

        // Bai1: Kiểm tra a có chia hết chon b không
//        System.out.println("Nhap số a: ");
//        int a = scanner.nextInt();
//        System.out.println("Nhập số b: ");
//        int b = scanner.nextInt();
//        if (a % b == 0){
//            System.out.println(a + " chia hết cho " + b);
//        } else {
//            System.out.println(a + " không chia hết " + b);
//        }

        // Bai2 : Kiểm tra tuổi học sinh vào lớp 10
//        System.out.println("Nhập tuổi học sinh: ");
//        int tuoi = scanner.nextInt();
//        if (tuoi < 15) {
//            System.out.println("Học sinh không đủ tuổi vào lớp 10");
//        } else {
//            System.out.println(" Học sinh đủ tuổi vào lớp 10");
//        }

        // Bai3 : Kiểm tra số nguyên lớn hơn hay nhỏ hơn 0.
        System.out.println("Nhập một số nguyên: ");
        int soNguyen = scanner.nextInt();
        if (soNguyen > 0){
            System.out.println("Số " + soNguyen + " là số lớn hơn 0");
        } else if (soNguyen < 0) {
            System.out.println("Số " + soNguyen + " là số nhỏ hơn 0");
        } else {
            System.out.println("Số " + soNguyen + " là số không âm không nhỏ hơn 0");
        }

        // Bai4: Tìm giá trị lớn nhất của ba số nguyên
        System.out.println("Nhập số thứ nhất: ");
        int so1 = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int so2 = scanner.nextInt();
        System.out.println("Nhập số thứ 3: ");
        int so3 = scanner.nextInt();
        int max = so1;
        if (so2 > max){
            max = so2;
        }
        if (so3 > max){
            max = so3;
        }
        System.out.println("Giá trị lớn nhất là: " + max);

        //Bai5: Xếp hạng học lực của học sinh
        System.out.print("Nhập điểm bài kiểm tra: ");
        double diemBaiKT = scanner.nextDouble();
        System.out.print("Nhập điểm thi giữa kỳ: ");
        double diemThiGiuaky = scanner.nextDouble();
        System.out.print("Nhập điểm thi cuối kỳ: ");
        double diemThiCuoiKy = scanner.nextDouble();
        double diemTrungBinh = (diemBaiKT + diemThiGiuaky + diemThiCuoiKy) / 3;
        if (diemTrungBinh >= 8.0) {
            System.out.println("Học lực xuất sắc");
        } else if (diemTrungBinh >= 6.5) {
            System.out.println("Học lực giỏi");
        } else if (diemTrungBinh >= 5.0) {
            System.out.println("Học lực khá");
        } else if (diemTrungBinh >= 3.5) {
            System.out.println("Học lực trung bình");
        } else {
            System.out.println("Học lực yếu");
        }

        //Bai6: Tính hoa hồng nhận được tùy theo mức doanh thu số bán hàng
        System.out.print("Nhập mức doanh số bán hàng: ");
        double doanhSo = scanner.nextDouble();
        double hoaHong;
        if (doanhSo < 1000000) {
            hoaHong = doanhSo * 0.05;
        } else if (doanhSo < 5000000) {
            hoaHong = doanhSo * 0.1;
        } else if (doanhSo < 10000000) {
            hoaHong = doanhSo * 0.15;
        } else {
            hoaHong = doanhSo * 0.2;
        }
        System.out.println("Số tiền hoa hồng nhận được là: " + hoaHong);

        //Bai7 : Tính cước điện thoại cho một hộ gia đình.
        System.out.println("Nhập số phút gọi điện thoại:  ");
        int soPhut = scanner.nextInt();
        double cuoc;
        if (soPhut <= 50){
            cuoc = soPhut * 250;
        } else {
            cuoc = 50 * 250 + (soPhut - 50) * 150;
        }
        System.out.println("Cước điện thoại phải trả là:  " + cuoc + " đồng");
    }
}
