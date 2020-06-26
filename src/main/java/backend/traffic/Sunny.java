
import java.util.ArrayList;
class Sunny implements Weather
{
    private final ArrayList<Vehicle> can_run;
    private final double crater_percent_change = -10.0;

    Sunny()
    {
        can_run = new ArrayList <Vehicle>();
        can_run.add(new Tuktuk());
        can_run.add(new Car());
        can_run.add(new Bike());
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