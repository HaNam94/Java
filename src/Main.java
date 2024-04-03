import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        // Bài 1: Chuyển từ độ C sang độ F
//        System.out.print("Nhập nhiệt độ Celsius: ");
//        double celsius = scanner.nextDouble();
//        double fahrenheit = celsius * 9 / 5 + 32;
//        System.out.println("Nhiệt độ Fahrenheit: " + fahrenheit);
//
//        // Bài 2: Chuyển từ mét sang feet
//        System.out.print("Nhập độ dài mét: ");
//        double meters = scanner.nextDouble();
//        double feet = meters * 3.2808;
//        System.out.println("Độ dài feet: " + feet);
//
//        // Bài 3: Diện tích hình vuông
//        System.out.print("Nhập độ dài cạnh hình vuông: ");
//        double side = scanner.nextDouble();
//        double squareArea = side * side;
//        System.out.println("Diện tích hình vuông: " + squareArea);
//
//        // Bài 4: Diện tích hình chữ nhật
//        System.out.print("Nhập chiều dài hình chữ nhật: ");
//        double length = scanner.nextDouble();
//        System.out.print("Nhập chiều rộng hình chữ nhật: ");
//        double width = scanner.nextDouble();
//        double rectangleArea = length * width;
//        System.out.println("Diện tích hình chữ nhật: " + rectangleArea);
//
//        // Bài 5: Diện tích tam giác vuông
//        System.out.print("Nhập độ dài cạnh góc vuông a: ");
//        double a = scanner.nextDouble();
//        System.out.print("Nhập độ dài cạnh góc vuông b: ");
//        double b = scanner.nextDouble();
//        double triangleArea = (a * b) / 2;
//        System.out.println("Diện tích tam giác vuông: " + triangleArea);
//
//        // Bài 6: Giải phương trình bậc 1
//        System.out.print("Nhập hệ số a: ");
//        double coefA = scanner.nextDouble();
//        System.out.print("Nhập hệ số b: ");
//        double coefB = scanner.nextDouble();
//        if (coefA == 0) {
//            if (coefB == 0)
//                System.out.println("Phương trình có vô số nghiệm.");
//            else
//                System.out.println("Phương trình vô nghiệm.");
//        } else {
//            double solution = -coefB / coefA;
//            System.out.println("Nghiệm của phương trình: " + solution);
//        }
//
//        // Bài 7: Giải phương trình bậc 2
//        System.out.print("Nhập hệ số a: ");
//        double aCoef = scanner.nextDouble();
//        System.out.print("Nhập hệ số b: ");
//        double bCoef = scanner.nextDouble();
//        System.out.print("Nhập hệ số c: ");
//        double cCoef = scanner.nextDouble();
//        double delta = bCoef * bCoef - 4 * aCoef * cCoef;
//        if (delta < 0) {
//            System.out.println("Phương trình vô nghiệm.");
//        } else if (delta == 0) {
//            double solution = -bCoef / (2 * aCoef);
//            System.out.println("Phương trình có nghiệm kép: " + solution);
//        } else {
//            double root1 = (-bCoef + Math.sqrt(delta)) / (2 * aCoef);
//            double root2 = (-bCoef - Math.sqrt(delta)) / (2 * aCoef);
//            System.out.println("Nghiệm thứ nhất của phương trình: " + root1);
//            System.out.println("Nghiệm thứ hai của phương trình: " + root2);
//        }
//
//        // Bài 8: Kiểm tra số là tuổi của một người
//        System.out.print("Nhập số tuổi: ");
//        int age = scanner.nextInt();
//        if (age > 0 && age < 120) {
//            System.out.println("Đây là tuổi của một người.");
//        }
//        else {
//            System.out.println("Đây không phải là tuổi của một người.");
//        }
//
//        // Bài 9: Kiểm tra 3 số có phải là cạnh của tam giác
//        System.out.println("Nhập 3 số là chiều dài 3 cạnh của tam giác:");
//        double side1 = scanner.nextDouble();
//        double side2 = scanner.nextDouble();
//        double side3 = scanner.nextDouble();
//        if (side1 > 0 && side2 > 0 && side3 > 0 &&
//                side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
//            System.out.println("Đây là 3 cạnh của một tam giác.");
//        }
//        else {
//            System.out.println("Đây không phải là 3 cạnh của một tam giác.");
//        }
//
//        // Bài 10: Tính giá điện
//        System.out.print("Nhập số điện đã sử dụng (kWh): ");
//        double soDien = scanner.nextDouble();
//        double giaDien;
//        if (soDien <= 50) {
//            giaDien = soDien * 1000;
//        }
//        else if (soDien <= 100) {
//            giaDien = 50 * 1000 + (soDien - 50) * 1200;
//        }
//        else {
//            giaDien = 50 * 1000 + 50 * 1200 + (soDien - 100) * 1500;
//        }
//        System.out.println("Giá điện phải trả là: " + giaDien + " VNĐ");

        // Bài 11: Tính thuế thu nhập cá nhân
        System.out.print("Nhập thu nhập cá nhân (VNĐ): ");
        double thuNhap = scanner.nextDouble();
        double thue;
        if (thuNhap <= 5000000) {
            thue = thuNhap * 5 / 100;
        }
        else if (thuNhap <= 10000000) {
            thue = 5000000 * 5 / 100 + (thuNhap - 5000000) * 10 / 100;
        }
        else if (thuNhap <= 18000000) {
            thue = 5000000 * 5 / 100 + 5000000 * 10 / 100 + (thuNhap - 10000000) * 15 / 100;
        }
        else {
            thue = 5000000 * 5 / 100 + 5000000 * 10 / 100 + 8000000 * 15 / 100 + (thuNhap - 18000000) * 20 / 100;
        }
        System.out.println("Số tiền thuế thu nhập cá nhân phải trả là: " + thue + " VNĐ");

    }
}