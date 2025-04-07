import java.util.Scanner;
public class SortArrayandCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong day: ");
        double sum = 0;
        int n = input.nextInt();
        int[]   a = new int[n];
        System.out.println("Nhap phan tu trong day: ");

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            sum += a[i];
        }

        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        double avg = sum/n;
        System.out.println("Day sau khi sap xep la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        };
        System.out.println(" ");
        System.out.println("Tong cac phan tu la: " +sum);
        System.out.println("Trung binh cong la: " +avg);

    }
}
