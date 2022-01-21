public class APCalendar
{
    public APCalendar()
    {
        System.out.println(firstDayOfYear(2019));
        System.out.println(dayOfWeek(1, 10, 2019));
        System.out.println(dayOfYear(3, 1, 2017));
        System.out.println(dayOfYear(3, 1, 2016));
    }

    private static boolean isLeapYear(int year){
        boolean isLeapYear = false;
        if(year % 4 == 0){
            isLeapYear = true;
        }
        return isLeapYear;
    }
    
    public static int numberOfLeapYears(int year1, int year2){
        int numberOfLeapYears = 0;
        for (int i = year1; i <= year2; i++){
            if (isLeapYear(i)){
                numberOfLeapYears += 1;
            }
        }
        return numberOfLeapYears;
    }
    
    private static int firstDayOfYear(int year){
        int firstDayOfYear = ((year + (year / 4)) % 7) - 1;
        return firstDayOfYear;
    }
    
    public static int dayOfYear(int month, int day, int year){
        int firstDay = firstDayOfYear(year);
        int isLeap = 2;
        if (isLeapYear(year)){
            isLeap = 1;
        }
        int monthCount = 0;
        for (int i = 1; i < month; i++){
            
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                monthCount += 31;
            }
            else{
                monthCount += 30;
            }
        }
        
        int dayOfYear = (monthCount - isLeap);
        
        if (month == 1){
            dayOfYear = day;
        }
        
        return dayOfYear;
    }
    
    public static int dayOfWeek(int month, int day, int year){
         int dayOfTheWeek = ((dayOfYear(month, day, year) + firstDayOfYear(year)) % 7) - 1;
         return dayOfTheWeek;
    }
    
}