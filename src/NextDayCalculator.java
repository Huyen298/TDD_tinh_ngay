public class NextDayCalculator {
    public static final String SLASH = "/";
    // public static final int LASTDAYOFMONTH = 31;
    public static final int FIRSTDAYOFMONTH = 1;
    public static final int FISTMONTHOFYEAR = 1;
    public static final int FIRSTMONTHOFYEAR = 1;
    public static final int LASTMONTHOFYEAR = 12;

    public static String getNextDay(int day, int month, int year) {
        int outputDay;
        int outputMonth=month;

        int outputYear=year;

        checkLeapYear(year);
        int lastDayOfMonth = getLastOfMonth(month,year);

        if (day== lastDayOfMonth){
            if (month== LASTMONTHOFYEAR){
                outputDay=FIRSTDAYOFMONTH;
                outputMonth= FIRSTMONTHOFYEAR;
                outputYear=++year;
            }
        else  {
            outputDay= FIRSTDAYOFMONTH;
            outputMonth=++month;
            outputYear=year;
        }}
        else {
            outputDay=++day;
            outputMonth=month;
            outputYear=year;
        }

        String result = outputDay + SLASH + outputMonth+ SLASH + outputYear;
        return result;
    }

    private static boolean checkLeapYear(int year) {
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }return isLeapYear;
    }

    private static int getLastOfMonth(int month, int year) {
        int lastDayOfMonth=0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDayOfMonth= 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDayOfMonth= 30;
                break;
            case 2:
                if (checkLeapYear(year)){
                    lastDayOfMonth=29;
                }else {
                    lastDayOfMonth=28;
                }
                break;
        }
        return lastDayOfMonth;
    }

}
