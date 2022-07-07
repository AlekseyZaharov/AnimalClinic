package main;

import java.util.Scanner;

public class Authentication {

    private static final String LOGIN = "Aleksey";
    private static final String PASSWORD = "1";


    public static void authenticate() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 2; i >= 0; i--) {

            System.out.println("Введите логин");

            String loginInput = scanner.nextLine();

            System.out.println("Введите пароль");

            String passwordInput = scanner.nextLine();

            if (validate(loginInput, passwordInput)) {
                System.out.println("Здравствуйте " + loginInput);
                break;
            } else {
                System.out.println("неверный логин или пароль, у вас осталось " + i + " попыток, повторите ввод заново");
                if (i == 0) {
                    System.out.println("Лимит попыток исчерпан");
                    break;
                }
            }
        }
    }

    public static boolean validate (String login, String password) {
        return login.equals(LOGIN) && password.equals(PASSWORD);
    }
}
