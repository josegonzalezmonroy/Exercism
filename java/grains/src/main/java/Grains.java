import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        BigInteger grains = BigInteger.ONE;
        
        for (int i = 1; i < square; i++) {
            grains = grains.multiply(BigInteger.valueOf(2));
        }

        return grains;
    }

    BigInteger grainsOnBoard() {
        BigInteger totalGrains = BigInteger.ZERO;

        for (int i = 1; i <= 64; i++) {
            totalGrains = totalGrains.add(grainsOnSquare(i));
        }

        return totalGrains;
    }
}
