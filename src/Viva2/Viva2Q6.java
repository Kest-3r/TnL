package Viva2;

import java.util.Scanner;
import java.util.Arrays;

public class Viva2Q6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        scan.nextLine();
        for (int n = 0; n < testCase; n++) {
            String name = scan.nextLine();
            String startTime = scan.nextLine();
            String endTime = scan.nextLine();

            for (int i = 0; i < 60; i++) {
                System.out.print("+");
            }
            System.out.println();

            if (isPrintingWelcomeMessage(name)) {
                System.out.println("Welcome to G101, Kolej Kediaman Kinabalu, University Malaya!");
            }
            generateInitials(name);
            calculateInterval(startTime, endTime);

            for (int i = 0; i < 60; i++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void generateInitials(String name) {
        String regex = "[^a-zA-Z]+|(a/l|a/p|al|ap|bin|binti)";
        String[] nameArr = name.split(regex);

        String initials = "";

        for (int i = 0; i < nameArr.length; i++) {
            nameArr[i] = nameArr[i].toUpperCase();
        }

        if (Arrays.asList(nameArr).contains("LEE") && Arrays.asList(nameArr).contains("KAH") && Arrays.asList(nameArr).contains("SING")) {
            initials = "LKS!!!!!!!!!!";
        } else {
            for (String s : nameArr) {
                if (!s.isEmpty()) {
                    initials += s.charAt(0);
                }
            }
        }
        System.out.println(initials);

        if (nameArr.length >= 3) {
            if (nameArr[0].equals("LEE") && nameArr[1].equals("KAH") && nameArr[2].equals("SING")) {
                System.out.println("WE KNOW IT'S YOU!");
            } else if (nameArr[0].equals("KAH") && nameArr[1].equals("SING") && nameArr[2].equals("LEE")) {
                System.out.println("WE KNOW IT'S YOU -- LEE KAH SING!");
            }
        }
    }

    public static boolean isPrintingWelcomeMessage(String name) {
        name = name.replaceAll("[^a-zA-z]+", "").toLowerCase();
        if (name.contains("kahsing") || name.contains("ridwan") || name.contains("suresh")) {
            return true;
        }
        return false;
    }

    public static void calculateInterval(String startTime, String endTime) {
        String[] startArr = startTime.split("[\\s:]+");
        String[] endArr = endTime.split("[\\s:]+");

        // Convert 12-hour time format to 24-hour time format
        if (startArr.length == 4) {
            if (startArr[3].equals("am") && Integer.parseInt(startArr[0]) == 12) {
                startArr[0] = "0";
            } else if (startArr[3].equals("pm") && Integer.parseInt(startArr[0]) != 12) {
                startArr[0] = Integer.toString(Integer.parseInt(startArr[0]) + 12);
            }
        }

        if (endArr.length == 4) {
            if (endArr[3].equals("am") && Integer.parseInt(endArr[0]) == 12) {
                endArr[0] = "0";
            } else if (endArr[3].equals("pm") && Integer.parseInt(endArr[0]) != 12) {
                endArr[0] = Integer.toString(Integer.parseInt(endArr[0]) + 12);
            }
        }

        double startSecs = Integer.parseInt(startArr[0]) * 3600 + Integer.parseInt(startArr[1]) * 60 + Integer.parseInt(startArr[2]);
        double endSecs = Integer.parseInt(endArr[0]) * 3600 + Integer.parseInt(endArr[1]) * 60 + Integer.parseInt(endArr[2]);

        double intervals = 0;

        if (endSecs < startSecs) {
            intervals = endSecs + 24 * 3600 - startSecs;
        } else {
            intervals = endSecs - startSecs;
        }

        int intervalHours = (int) intervals / 3600;
        double remainder = intervals % 3600;
        int intervalMin = (int) (remainder / 60);
        int intervalSecs = (int) (remainder % 60);

        String interval = String.format("%02d:%02d:%02d", intervalHours, intervalMin, intervalSecs);

        if ((startSecs >= 0 && startSecs < 6 * 3600) && (endSecs >= 0 && endSecs < 6 * 3600) && startSecs <= endSecs) {
            System.out.println("SLEEP NOW!!!!!!!!!!");
        }

        System.out.println(interval);

    }
}
