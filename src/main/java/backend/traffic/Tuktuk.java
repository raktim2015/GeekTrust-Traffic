class Tuktuk implements Vehicle
{
    
    private final double speed = 12.0;
    private final double time_to_cross_a_crater = 1.0;
    private final String vehicle_name = "TUKTUK";
    
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