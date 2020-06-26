
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class GeektrustTest
{
    private String INPUT = "123456";

    @Test
    public void case1() {

    	ArrayList <Orbit> orbits = new ArrayList<Orbit>();
    	orbits.add(new Orbit1(12));
    	orbits.add(new Orbit2(10));
    	String res = new Geektrust().calculate(new Sunny(),orbits);
    	Assert.assertEquals(res,"TUKTUK ORBIT1");
        
    }
    @Test
    public void case2() {

    	ArrayList <Orbit> orbits = new ArrayList<Orbit>();
    	orbits.add(new Orbit1(40));
    	orbits.add(new Orbit2(25));
    	String res = new Geektrust().calculate(new Rainy(),orbits);
    	Assert.assertEquals(res,"CAR ORBIT2");
        
    }
    @Test
    public void case3() {

    	ArrayList <Orbit> orbits = new ArrayList<Orbit>();
    	orbits.add(new Orbit1(14));
    	orbits.add(new Orbit2(20));
    	String res = new Geektrust().calculate(new Windy(),orbits);
    	Assert.assertEquals(res,"CAR ORBIT2");
        
    }
    @Test
    public void case4() {

    	ArrayList <Orbit> orbits = new ArrayList<Orbit>();
    	orbits.add(new Orbit1(8));
    	orbits.add(new Orbit2(15));
    	String res = new Geektrust().calculate(new Rainy(),orbits);
    	Assert.assertEquals(res,"TUKTUK ORBIT2");
        
    }
    @Test
    public void case5() {

    	ArrayList <Orbit> orbits = new ArrayList<Orbit>();
    	orbits.add(new Orbit1(8));
    	orbits.add(new Orbit2(15));
    	String res = new Geektrust().calculate(new Sunny(),orbits);
    	Assert.assertEquals(res,"CAR ORBIT2");
        
    }

}
