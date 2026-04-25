import java.util.Scanner;

public class SifreSifirlama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUser = "patika";
        String correctPass = "dev123";
        String user = scanner.next();
        String pass = scanner.next();
        if (user.equals(correctUser) && pass.equals(correctPass)) {
            System.out.println("Giriş başarılı");
            scanner.close();
            return;
        }
        System.out.println("Hatalı kullanıcı adı veya şifre");
        System.out.println("Şifreyi sıfırlamak ister misiniz? (E/H)");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("E")) {
            System.out.println("Yeni şifre giriniz:");
            String newPass = scanner.next();
            if (newPass.equals(correctPass)) {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            } else {
                System.out.println("Şifre oluşturuldu");
            }
        }
        scanner.close();
    }
}
