class Darts {
    int score(double xOfDart, double yOfDart) {
        double distancia = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);

        if (distancia <= 1) {
            return 10;
        } else if (distancia <= 5) {
            return 5;
        } else if (distancia <= 10) {
            return 1;
        } else {
            return 0;
        }
    }
}
