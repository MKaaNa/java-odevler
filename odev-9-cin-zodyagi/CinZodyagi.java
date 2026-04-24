import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogumYili = scanner.nextInt();
        int mod = dogumYili % 12;
        String burc;
        if (mod == 0) burc = "Maymun";
        else if (mod == 1) burc = "Horoz";
        else if (mod == 2) burc = "Köpek";
        else if (mod == 3) burc = "Domuz";
        else if (mod == 4) burc = "Fare";
        else if (mod == 5) burc = "Öküz";
        else if (mod == 6) burc = "Kaplan";
        else if (mod == 7) burc = "Tavşan";
        else if (mod == 8) burc = "Ejderha";
        else if (mod == 9) burc = "Yılan";
        else if (mod == 10) burc = "At";
        else burc = "Koyun";
        System.out.println("Çin Zodyağı Burcunuz : " + burc);
        scanner.close();
    }
}
