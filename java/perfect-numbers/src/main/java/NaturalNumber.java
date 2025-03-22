class NaturalNumber {
    int sum = 0;
    int number;
    
    NaturalNumber(int number) {
        if (number <= 0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        
        this.number = number;

        for (int i = 1; i < number; i++)
            if (number % i == 0)
                sum += i;   
    }

    Classification getClassification() {
            if (sum == number)
                return Classification.PERFECT;
            else if (sum < number)
                return Classification.DEFICIENT;
            else
                return Classification.ABUNDANT;
    }
}
