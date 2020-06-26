class Orbit2 implements Orbit
{
    private final double distance = 20;
    private final double craters = 10;
    private double traffic_speed;
    private final String orbit_name = "ORBIT2";
    Orbit2(double traffic_speed)
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