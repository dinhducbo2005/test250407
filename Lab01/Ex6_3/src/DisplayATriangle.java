import java.util.Scanner;
public class DisplayATriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Chieu cao hinh tam giac: ");
        int h = in.nextInt();

        for (int i=1; i<=h; i++){
            for(int  j=0; j<(h*2-i*2+1)/2; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
