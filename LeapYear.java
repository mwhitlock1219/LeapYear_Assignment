public class LeapYear {
    public boolean isLeapYear(int year) {
        boolean result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        return result;
    }

    // public boolean isLeapYear(int year) {
    // boolean result = isDivisibleBy4(year) &&
    // isNotDivisibleBy100UnlessItIsDivisibleBy400(year);
    // return result;
    // }

    // private boolean isDivisibleBy4(int year) {
    // return (year % 4 == 0);
    // }

    // private boolean isNotDivisibleBy100UnlessItIsDivisibleBy400(int year) {
    // return (year % 100 != 0 || year % 400 == 0);
    // }

}