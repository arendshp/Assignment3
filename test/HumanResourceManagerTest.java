import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanResourceManagerTest {

    private HumanResourceManager obj = new HumanResourceManager("Shene Arends",4504178,60000);

    @Test
    public void employeeTest() {

        assertEquals("Shene Arends", obj.getName());
        assertEquals(4504178, obj.getEmpId());

    }

    @Test
    public void increaseTest() {
        int increaseAmount = obj.increase(obj.getSalary(), 10);
        Assert.assertEquals("The new salary increase amount",6000, 6000, increaseAmount);
    }
}
