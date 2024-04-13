class Leap {

    boolean isLeapYear(int year) {
        if(isDivisible(year,100)){
            return isDivisible(year,400);
        }
        return isDivisible(year,4);
    }

    private boolean isDivisible(int num1, int num2) {
        return num1 % num2 == 0;
    }

}
