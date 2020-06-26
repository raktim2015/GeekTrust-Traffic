
class Car implements Vehicle
{
   
    private final double speed = 20.0;
    private final double time_to_cross_a_crater = 3.0;
    private final String vehicle_name = "CAR";
    
    @Override
    public double getSpeed()
    {
        return this.speed;
    }
    public double getTime_to_cross_a_crater()
    {
        return this.time_to_cross_a_crater;
    }
    public String getVehicle_name()
    {
        return this.vehicle_name;
    }

}