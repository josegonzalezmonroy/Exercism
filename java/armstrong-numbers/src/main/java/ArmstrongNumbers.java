class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        int original = numberToCheck;
        int digits = String.valueOf(numberToCheck).length();
        int sum = 0;

        while (numberToCheck > 0) {
            int digit = numberToCheck % 10;
            sum += Math.pow(digit, digits);
            numberToCheck /= 10;
        }
        return sum == original;
    }

}
