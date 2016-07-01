package model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ksu on 01.07.16.
 */
public class IpAddressTest {

    @Test
    public void checkIp() throws Exception {

        assertTrue(IpAddress.checkIp("191.162.2.3"));
        assertFalse(IpAddress.checkIp("191.162.2.500"));
        assertFalse(IpAddress.checkIp("191,162.2.3"));
        assertFalse(IpAddress.checkIp("191.162.2"));
    }

    @Test
    public void getIp() throws Exception {
        long[] actual = {191, 162, 2, 3};
        for (int i = 0; i < actual.length; i++) {
            assertEquals(new IpAddress("191.162.2.3").getIp()[i], actual[i]);
        }
    }

    @Test
    public void getIpLong() throws Exception {
        long actual = 3215065603l;
        assertEquals(new IpAddress("191.162.2.3").getIpLong(), actual);
    }





}