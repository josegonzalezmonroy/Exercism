public class ElonsToyCar {

    private int battery;
    private final int meters = 20;
    
    public ElonsToyCar()
    {
        battery = 100;
    }
    
    public static ElonsToyCar buy() 
    {
        return new ElonsToyCar();
    }

    public String distanceDisplay() 
    {
        return "Driven " + (100 - battery) * 20 + " meters";
    }

    public String batteryDisplay() {
        if (battery > 0)
            return "Battery at " + battery + "%";
        else 
            return "Battery empty";
    }

    public void drive() 
    {
        if (battery > 0)
            battery--;
        
        distanceDisplay();
    }
}
