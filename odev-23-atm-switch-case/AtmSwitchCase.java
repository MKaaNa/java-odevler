import java.util.Scanner;

public class AtmSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUser = "patika";
        String correctPass = "dev123";
        int attempts = 0;
        boolean loggedIn = false;
        while (attempts < 3 && !loggedIn) {
            String user = scanner.next();
            String pass = scanner.next();
            if (user.equals(correctUser) && pass.equals(correctPass)) {
                loggedIn = true;
            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre");
                attempts++;
            }
        }
        if (!loggedIn) {
            // hesabın bloke olduğu durum
            return;
        }
        int balance = 1500;
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    break;
                case 2:
                    int withdraw = scanner.nextInt();
                    balance -= withdraw;
                    break;
                case 3:
                    System.out.println("Bakiyeniz : " + balance);
                    break;
                case 4:
                    System.out.println("Tekrar görüşmek üzere.");
                    scanner.close();
                    return;
                default:
                    // ignore invalid
                    break;
            }
        }
    }
}
