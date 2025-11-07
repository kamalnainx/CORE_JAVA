package chapter02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class LocalizingCurrecy {

    Scanner br = new Scanner(System.in);
    Locale currentLocale = Locale.US;

    public static void main(String[] args) {

        LocalizingCurrecy dateApp = new LocalizingCurrecy();
        dateApp.run();
    }

    public void run() {
        String line = "";


        this.printMenu();
        try {
            line = this.br.next();
        } catch (Exception e) {
            System.out.println(e);
        }

        switch (line) {
            case "1":
                setEnglish();
                run();
                break;
            case "2":
                setFrench();
                run();
                break;
            case "q":
                System.exit(0);
        }
    }

    public void printMenu() {
        System.out.println("=== Localizing currency application ===");

        System.out.println("\n--- Choose Language Option ---");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("q. Quit ");
        System.out.print("Enter a command: ");



    }

    public void setEnglish() {

        currentLocale = Locale.US;
        NumberFormat nft = NumberFormat.getCurrencyInstance(currentLocale);
        String formatted = nft.format(1000000);
        System.out.println(formatted);

    }

    public void setFrench() {
        currentLocale = Locale.FRANCE;
        NumberFormat nft = NumberFormat.getCurrencyInstance(currentLocale);
        String formatted = nft.format(1000000);
        System.out.println(formatted);
    }
}
