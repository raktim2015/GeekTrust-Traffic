
import java.util.ArrayList;
class Rainy implements Weather
{
    private final ArrayList<Vehicle> can_run;
    private final double crater_percent_change = 20.0;

    Rainy()
    {
        can_run = new ArrayList <Vehicle>();
        can_run.add(new Tuktuk());
        can_run.add(new Car());
    }

    @Override
    public double getCrater_percent_change() {
        return this.crater_percent_change;
    }
    @Override
    public ArrayList<Vehicle> getVehicles()
    {
        return this.can_run;
    }
    
}