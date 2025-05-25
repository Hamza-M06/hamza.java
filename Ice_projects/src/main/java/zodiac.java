
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mwars
 */
public class zodiac {
    
    public static final int ARIES_START = 321, ARIES_END = 419;
    public static final int TAURUS_START = 420, TAURUS_END = 520;
    public static final int GEMINI_START = 521, GEMINI_END = 620;
    public static final int CANCER_START = 621, CANCER_END = 722;
    public static final int LEO_START = 723, LEO_END = 822;
    public static final int VIRGO_START = 823, VIRGO_END = 922;
    public static final int LIBRA_START = 923, LIBRA_END = 1022;
    public static final int SCORPIO_START = 1023, SCORPIO_END = 1121;
    public static final int SAGITTARIUS_START = 1122, SAGITTARIUS_END = 1221;
    public static final int CAPRICORN_START = 1222, CAPRICORN_END = 119;
    public static final int AQUARIUS_START = 120, AQUARIUS_END = 218;
    public static final int PISCES_START = 219, PISCES_END = 320;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set console title (may not work on all terminals)
        System.out.println("\033]0;Zodiac Sign App – Your Name\007");

        printBanner();

        int month = 0, day = 0;

        // Input validation loop
        while (true) {
            System.out.print("Enter your birth month and day (e.g., 3 21): ");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    day = scanner.nextInt();
                    if (month >= 1 && month <= 12 && day >= 1 && day <= 31) {
                        break;
                    }
                }
            }
            scanner.nextLine(); // Clear input buffer
            System.out.println("Invalid input. Please try again with numeric values (e.g., 3 21).");
        }

        int date = month * 100 + day;

        // Clear screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        printBanner();

        String sign = getZodiacSign(date);
        System.out.println("Your Zodiac Sign is: " + sign);
    }

    public static String getZodiacSign(int date) {
        if (date >= ARIES_START && date <= ARIES_END) return "Aries";
        else if (date >= TAURUS_START && date <= TAURUS_END) return "Taurus";
        else if (date >= GEMINI_START && date <= GEMINI_END) return "Gemini";
        else if (date >= CANCER_START && date <= CANCER_END) return "Cancer";
        else if (date >= LEO_START && date <= LEO_END) return "Leo";
        else if (date >= VIRGO_START && date <= VIRGO_END) return "Virgo";
        else if (date >= LIBRA_START && date <= LIBRA_END) return "Libra";
        else if (date >= SCORPIO_START && date <= SCORPIO_END) return "Scorpio";
        else if (date >= SAGITTARIUS_START && date <= SAGITTARIUS_END) return "Sagittarius";
        else if ((date >= CAPRICORN_START && date <= 1231) || (date >= 101 && date <= CAPRICORN_END)) return "Capricorn";
        else if (date >= AQUARIUS_START && date <= AQUARIUS_END) return "Aquarius";
        else if (date >= PISCES_START && date <= PISCES_END) return "Pisces";
        else return "Unknown";
    }

    public static void printBanner() {
        System.out.println("====================================");
        System.out.println("       Zodiac Sign Finder App       ");
        System.out.println("        by Your Name (OOP1)         ");
        System.out.println("====================================");
        System.out.println();
    }
    
}
