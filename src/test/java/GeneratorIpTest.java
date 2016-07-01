import model.IpAddress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ksu on 01.07.16.
 */
public class GeneratorIpTest {

    private static final List<String> ACTUAL_IP = Arrays.asList("191.162.2.4", "191.162.2.5");
    @org.junit.Test
    public void generate() throws Exception {

        assertEquals(GeneratorIp.generate(new IpAddress("191.162.2.3"), new IpAddress("191.162.2.6")).size(), 2);
        assertEquals(GeneratorIp.generate(new IpAddress("191.162.2.3"), new IpAddress("191.162.2.6")), ACTUAL_IP);
    }

}