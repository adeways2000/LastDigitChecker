public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000) {

            return false;
        }

        int compare1 = 0;
        int compare2 = 0;
        int compare3 = 0;
        while (num1 > 0) {
            compare1 = num1 % 10;
            num1 /= 10;
            break;
        }
        while (num2 > 0) {
            compare2 = num2 % 10;
            num2 /= 10;
            break;
        }
        while (num3 > 0) {
            compare3 = num3 % 10;
            num3 /= 10;
            break;
        }
        if (compare1 == compare2 || compare2 == compare3 || compare1 == compare3) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int newnum){

        if(newnum < 10 || newnum > 1000){

            return false;
        }

        return true;
    }
}
