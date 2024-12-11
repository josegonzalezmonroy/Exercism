import java.util.Comparator;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distance = 0;  // Distância percorrida pelo carro
    private int numberOfVictories;  // Número de vitórias do carro

    // Método que simula a movimentação do carro, aumentando a distância
    @Override
    public void drive() {
        distance += 10;  // Cada vez que o carro dirige, ele percorre 10 unidades
    }

    // Retorna a distância percorrida até o momento
    @Override
    public int getDistanceTravelled() {
        return distance;
    }

    // Retorna o número de vitórias do carro
    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    // Define o número de vitórias do carro
    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    // Implementação do método compareTo para comparar carros pela quantidade de vitórias de forma descendente
    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        // Compara as vitórias de forma descendente (maior número de vitórias primeiro)
        return Integer.compare(otherCar.numberOfVictories, this.numberOfVictories);
    }
}
