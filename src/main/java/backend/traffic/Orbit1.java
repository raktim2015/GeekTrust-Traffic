
class Orbit1 implements Orbit
{
    private final double distance = 18;
    private final double craters = 20;
    private double traffic_speed;
    private final String orbit_name = "ORBIT1";

    Orbit1(double traffic_speed)
    {
        this.traffic_speed = traffic_speed;
    }

    @Override
    public double getDistance()
    {
        return this.distance;
    }
    @Override
    public double getCraters()
    {
        return this.craters;
    }
    @Override
    public double getTraffic_speed()
    {
        return this.traffic_speed;
    }
    @Override
    public String getOrbit_name()
    {
        return this.orbit_name;
    }
}