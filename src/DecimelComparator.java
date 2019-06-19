public class DecimelComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
        int firstNumInt = (int) (firstNum * 1000);
        int secondNumInt = (int) (secondNum * 1000);
        if (firstNumInt == secondNumInt) {
            return true;
        }
        return false;
    }
}
