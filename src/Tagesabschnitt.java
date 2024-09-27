import java.time.LocalTime;

public class Tagesabschnitt {
    public static void main(String[] args) {
        int hour = LocalTime.now().getHour();

        String dayTime = switch (hour) {
            case 6, 7, 8, 9 -> "Früh";
            case 10, 11, 12 -> "Vormittag";
            case 13, 14, 15, 16 -> "Nachmittag";
            case 17, 18, 19, 20 -> "Abend";
            default -> "Nacht";
        };
        System.out.println(dayTime);
    }
}
