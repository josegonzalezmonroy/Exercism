class CollatzCalculator {

    int computeStepCount(int start) {

        if (start <= 0)
            throw new IllegalArgumentException("Only positive integers are allowed");

        int stepCount = 0;
        int current = start;

        while (current != 1) {
            if (current % 2 == 0) 
                current = current / 2;
            else 
                current = 3 * current + 1;
            
            stepCount++;
        }
        return stepCount;
    }
}
