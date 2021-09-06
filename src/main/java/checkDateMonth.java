public class checkDateMonth {


    public static void isMonth(int num) {
        if(num >= 1 && num <= 12){
            System.out.println("This is a month of year");
            printDayPerMonth(num);
        }else{
            System.out.println("This isn't a month of year");
        }

    }

    private static void printDayPerMonth(int month) {
        int[] datePerMonth;
        datePerMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(month != 2){
            System.out.println("Your month has " + datePerMonth[month-1] + " days");
        }else{
            System.out.println("Your month has " + datePerMonth[month-1] + " or " + (datePerMonth[month-1] + 1) + " days");
        }
    }
}
