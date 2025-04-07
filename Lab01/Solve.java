import java.util.Scanner;

public class Solve {
    public static void phuongTrinhBacNhat(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        }
    }

    public static void hePhuongTrinhBacNhat(double a11, double a12, double b1, double a21, double a22, double b2) {
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("He phuong trinh co nghiem duy nhat:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("He phuong trinh co vo so nghiem");
            } else {
                System.out.println("He phuong trinh vo nghiem");
            }
        }
    }

    public static void phuongTrinhBacHai(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.println("Phuong trinh co nghiem x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Phuong trinh bac nhat");
        System.out.println("2. He phuong trinh bac nhat");
        System.out.println("3. Phuong trinh bac hai");
        System.out.print("Lua chon: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Nhap he so a va b co dang ax + b = 0: ");
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                phuongTrinhBacNhat(a, b);
                break;
            case 2:
                System.out.println("Nhap cac he so cua he phuong trinh:");
                System.out.print("a11: ");
                double a11 = scan.nextDouble();
                System.out.print("a12: ");
                double a12 = scan.nextDouble();
                System.out.print("b1: ");
                double b1 = scan.nextDouble();
                System.out.print("a21: ");
                double a21 = scan.nextDouble();
                System.out.print("a22: ");
                double a22 = scan.nextDouble();
                System.out.print("b2: ");
                double b2 = scan.nextDouble();
                hePhuongTrinhBacNhat(a11, a12, b1, a21, a22, b2);
                break;
            case 3:
                System.out.print("Nhap he so a, b, c: ");
                a = scan.nextDouble();
                b = scan.nextDouble();
                double c = scan.nextDouble();
                phuongTrinhBacHai(a, b, c);
                break;
            default:
                System.out.println("Lua chon khong hop le!");
            }
        }
    }