package Viva3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Exhibit {
    private String title;
    private String artist;
    private int year;
    private String type;
    private String description;



    // ���캯��
    public Exhibit(String title, String artist, int year, String type, String description) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.type = type;
        this.description = description;
    }



    // ��ȡչƷ��ϸ��Ϣ�ķ���
    public String getDetails() {
        return "Title: " + title + "\nArtist: " + artist + "\nYear: " + year +
                "\nType: " + type + "\nDescription: " + description;
    }



    // Getter ��������������������ʹ��
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getYear() { return year; }
    public String getType() { return type; }

}

class Museum {
    private List<Exhibit> exhibits = new ArrayList<>();
    // ���ļ�����չƷ����
    public void loadExhibits(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    try {
                        Exhibit exhibit = new Exhibit(
                                parts[0].trim(),
                                parts[1].trim(),
                                Integer.parseInt(parts[2].trim()),
                                parts[3].trim(),
                                parts[4].trim()
                        );
                        exhibits.add(exhibit);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid year format for line: " + line);
                    }
                } else {
                    System.out.println("Invalid data format for line: " + line);
                }
            }
            System.out.println("Successfully loaded exhibits from " + filename);
        } catch (IOException e) {
            System.err.println("Error loading exhibits from " + filename + ": " + e.getMessage());
        }
    }

    // ������������չƷ
    public void searchExhibitsByArtist(String artist) {
        boolean found = false;
        for (Exhibit exhibit : exhibits) {
            if (exhibit.getArtist().equalsIgnoreCase(artist)) {
                System.out.println(exhibit.getDetails());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No exhibits found by artist: " + artist);
        }
    }

    // ����������չƷ
    public void searchExhibitsByType(String type) {
        boolean found = false;
        for (Exhibit exhibit : exhibits) {
            if (exhibit.getType().equalsIgnoreCase(type)) {
                System.out.println(exhibit.getDetails());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No exhibits found of type: " + type);
        }
    }

    // ���������չƷ
    public void searchExhibitsByYear(int year) {
        boolean found = false;
        for (Exhibit exhibit : exhibits) {
            if (exhibit.getYear() == year) {
                System.out.println(exhibit.getDetails());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No exhibits found from the year: " + year);
        }
    }

    // ��ʾ����չƷ
    public void viewAllExhibits() {
        if (exhibits.isEmpty()) {
            System.out.println("No exhibits available.");
        } else {
            for (Exhibit exhibit : exhibits) {
                System.out.println(exhibit.getDetails());
                System.out.println(); // ���ӿ����Էָ�չƷ
            }
        }
    }
}

public class Viva3Q4 {
    public static void main(String[] args) {
        Museum museum = new Museum();
        Scanner scanner = new Scanner(System.in);

        // ��ӡ��ǰ����Ŀ¼
        System.out.println("Current working directory: " + System.getProperty("user.dir"));

        // ����չƷ����
        museum.loadExhibits("C:/Users/keste/IdeaProjects/TnL/src/Viva3/exhibits.txt");
        // �û������˵�
        int choice;
        do {
            System.out.println("\nMuseum Exhibit Management System");
            System.out.println("1. View all exhibits");
            System.out.println("2. Search exhibits by artist");
            System.out.println("3. Search exhibits by type");
            System.out.println("4. Search exhibits by year");
            System.out.println("0. Exit");
            System.out.print("Please select an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // ����������еĻ��з�
            switch (choice) {
                case 1:
                    System.out.println("\nAll exhibits:");
                    museum.viewAllExhibits();
                    break;
                case 2:
                    System.out.print("\nEnter artist name to search: ");
                    String artist = scanner.nextLine();
                    museum.searchExhibitsByArtist(artist);
                    break;
                case 3:
                    System.out.print("\nEnter exhibit type to search: ");
                    String type = scanner.nextLine();
                    museum.searchExhibitsByType(type);
                    break;
                case 4:
                    System.out.print("\nEnter year to search: ");
                    int year = scanner.nextInt();
                    museum.searchExhibitsByYear(year);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (choice != 0);
        scanner.close();
    }
}
