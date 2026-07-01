import java.util.*;

class Weather {
    String date;
    String day;
    String w;

    public Weather(String date, String day, String w) {
        this.date=date;
        this.day=day;
        this.w=w;
    }

    public String toString() {
        return date+" "+day+" "+w;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Weather[] forecast = new Weather[n];
        for (int i=0; i<n; i++) {
            String date = sc.next();
            String day = sc.next();
            String w = sc.next();

            forecast[i] = new Weather(date, day, w);
        }
        Arrays.sort(forecast, (a,b) -> {
            return a.date.compareTo(b.date);
        });
        for (int i=0; i<n; i++) {
            // System.out.println(forecast[i].toString());
            if (forecast[i].w.equals("Rain")) {
                System.out.println(forecast[i].toString());
                break;
            }
        }
    }
}