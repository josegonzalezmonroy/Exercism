class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distance;
    private int battery;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        distance = 0;
        battery = 100;
    }

    public boolean batteryDrained() {
        return battery <= 0 || battery < batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (battery >= batteryDrain)
        {
            distance += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int remainingDistance()
    {
        return (battery * speed) / batteryDrain;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.remainingDistance() >= distance;
    }
}
