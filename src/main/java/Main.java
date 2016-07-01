import model.IpAddress;

import java.util.Scanner;

/**
 * Created by ksu on 30.06.16.
 */
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 ip");
        final String ip1 = scanner.nextLine();

        System.out.println("Enter 2 ip");
        final String ip2 = scanner.nextLine();

        if (IpAddress.checkIp(ip1) && IpAddress.checkIp(ip2)) {
            final IpAddress ipAddress1 = new IpAddress(ip1);
            final IpAddress ipAddress2 = new IpAddress(ip2);

            for (String ip : GeneratorIp.generate(ipAddress1, ipAddress2)) {
                System.out.println(ip);
            }
        } else {
            System.out.println("Incorrect ip");
        }
    }
}
