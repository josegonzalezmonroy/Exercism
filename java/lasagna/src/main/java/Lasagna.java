public class Lasagna {
    public static int expectedMinutesInOven()
    {
        return 40;
    }
    public static int remainingMinutesInOven(int value)
    {
        return expectedMinutesInOven() - value;
    }
    public static int preparationTimeInMinutes(int value)
    {
        return 2 * value;
    }

    public static int totalTimeInMinutes(int capas, int time)
    {
        return preparationTimeInMinutes(capas) + time;
    }
}
