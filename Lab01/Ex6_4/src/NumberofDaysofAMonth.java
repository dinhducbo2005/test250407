import java.util.Scanner;
public class NumberofDaysofAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = input.nextLine();
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        input.nextLine();
        String[][] monthName = {
                {"January", "Jan.", "Jan", "1"},
                {"February", "Feb.", "Feb", "2"},
                {"March", "Mar.", "Mar", "3"},
                {"April", "Apr.", "Apr", "4"},
                {"May", "May", "May", "5"},
                {"June", "Jun.", "Jun", "6"},
                {"July", "Jul.", "Jul", "7"},
                {"August", "Aug.", "Aug", "8"},
                {"September", "Sept.", "Sep", "9"},
                {"October", "Oct.", "Oct", "10"},
                {"November", "Nov.", "Nov", "11"},
                {"December", "Dec.", "Dec", "12"}
        };
        int iMonth = 0;
        for(int  i = 0; i < 12; i++){
            for(int  j = 0; j < 4; j++){
                if(month.equalsIgnoreCase(monthName[i][j])){
                    iMonth = i+1;
                    break;
                }
            }
        }
        if (iMonth == 0){
            System.out.println("Invalid month");
        } else {
            boolean LeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            int daysInMonth = switch (iMonth) {
                case 2 -> LeapYear ? 29 : 28;
                case 4, 6, 9, 11 -> 30;
                default -> 31;
            };
            System.out.println("Days in month: " + daysInMonth);
        }
    }
}

