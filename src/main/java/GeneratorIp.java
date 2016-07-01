import model.IpAddress;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ksu on 01.07.16.
 */
public class GeneratorIp {
    public static  List<String> generate(IpAddress ip1, IpAddress ip2) {
        long start;
        long finish;
        List<String> ips = new ArrayList<String>();
        if (ip1.getIpLong() < ip2.getIpLong()) {
             start = ip1.getIpLong();
             finish = ip2.getIpLong();
        } else {
            start = ip2.getIpLong();
            finish = ip1.getIpLong();
        }

        for (long i = start+1; i < finish; i++) {
            ips.add(ipToStr(i));
        }

        return ips;
    }

    private static String ipToStr(long ip) {
        long a = ip;
        long r0 = a / (256L * 256L * 256L);
        a -= (r0 * (256L * 256L * 256L));
        long r1 = a / (256L * 256L);
        a -= (r1 * (256L * 256L));
        long r2 = a / 256L;
        a -= (r2 * 256L);
        long r3 = a;

        return r0 + "." + r1 + "." + r2 + "." + r3;
    }
}
