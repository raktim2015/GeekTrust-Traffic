import java.io.*;
import java.util.*;
public class Geektrust
{
    private double ORBIT_1_TRAFFIC_SPEED;
    private double ORBIT_2_TRAFFIC_SPEED;
    public static void main(String args[]) throws IOException
    {

        File f = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String input = br.readLine();
        input = input.trim();


        Geektrust ob = new Geektrust();
        ArrayList <Orbit> orbits = new ArrayList <Orbit>();
        
        String input_weather = input.split(" ")[0];
        ob.ORBIT_1_TRAFFIC_SPEED = Double.parseDouble(input.split(" ")[1]);
        ob.ORBIT_2_TRAFFIC_SPEED = Double.parseDouble(input.split(" ")[2]);
        
        // initialize orbits 
        orbits.add(new Orbit1(ob.ORBIT_1_TRAFFIC_SPEED));
        orbits.add(new Orbit2(ob.ORBIT_2_TRAFFIC_SPEED));

        // Weather supplier    
        Weather weather = new WeatherSupplier().supplyWeather(input_weather);
        System.out.println(ob.calculate(weather, orbits));
    }

    public String calculate(Weather weather,ArrayList <Orbit> orbits)
    {

        // Ordering in case of a tie
        HashMap <String,Integer> vehicle_order_map = new HashMap <String,Integer>();
        vehicle_order_map.put("BIKE",0);
        vehicle_order_map.put("TUKTUK",1);
        vehicle_order_map.put("CAR",2);

        int vehicle_to_take = -1;
        String orbit_to_take = "";
        double minimum_time = -1.0;
        ArrayList <Vehicle> v = weather.getVehicles();
        for(Vehicle vehicle:v)
        {
            for(Orbit orbit:orbits)
            {
                double distance = orbit.getDistance();
                double vehicleSpeed = Math.min(vehicle.getSpeed(),orbit.getTraffic_speed());
                double time_to_cross_crater = vehicle.getTime_to_cross_a_crater();
                double no_of_craters = orbit.getCraters() + (weather.getCrater_percent_change()/100.0)*orbit.getCraters();

                double time_required = (distance/vehicleSpeed)*60 + no_of_craters*time_to_cross_crater;
                
                
                if(minimum_time == -1.0)
                {
                    minimum_time = time_required;
                    vehicle_to_take = vehicle_order_map.get(vehicle.getVehicle_name());
                    orbit_to_take = orbit.getOrbit_name();
                }
                else if(time_required < minimum_time)
                {
                    minimum_time = time_required;
                    vehicle_to_take = vehicle_order_map.get(vehicle.getVehicle_name());
                    orbit_to_take = orbit.getOrbit_name();
                }
                else if(time_required == minimum_time)
                {
                    if(vehicle_order_map.get(vehicle.getVehicle_name()) < vehicle_to_take)
                    {
                        vehicle_to_take = vehicle_order_map.get(vehicle.getVehicle_name());
                        orbit_to_take = orbit.getOrbit_name();
                    }
                }
            }
            
        }
        String vehicle_name = "";
        for(String e:vehicle_order_map.keySet())
        {
            if(vehicle_order_map.get(e)==vehicle_to_take)
            {
                vehicle_name = e;
                break;
            }
        }
        String result = vehicle_name + " "+orbit_to_take;
        return result;    
    }
}