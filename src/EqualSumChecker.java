public class EqualSumChecker {
    public static boolean hasEqualSum(int firstValue, int secondValue, int sumValue){
        boolean areEqual = false;

        int calculateSum = firstValue + secondValue;
        if (calculateSum == sumValue){
            areEqual = true;
        }

        return areEqual;
    }
}
