package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ksu on 30.06.16.
 */
public class IpAddress {

    private static final String IP_TEMPLATE =
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

    private long[] ip = new long[4];
    private long ipLong;

    private void ipToLong() {
        this.ipLong = ((ip[0] * 256L + ip[1]) * 256L + ip[2]) * 256L + ip[3];
    }

    public IpAddress(final String ip) {
        final String[] partIp = ip.split("\\.");

        for (int i = 0; i < 4; i++) {
            this.ip[i] = new Long(partIp[i]);
        }
        ipToLong();
    }

    public long[] getIp() {
        return ip;
    }

    public long getIpLong() {
        return ipLong;
    }

    public static boolean checkIp(final String address) {
        final Pattern pattern = Pattern.compile(IP_TEMPLATE);
        Matcher matcher = pattern.matcher(address);
        return matcher.matches();
    }
}
