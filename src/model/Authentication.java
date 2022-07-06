package model;

import java.util.Scanner;

public class Authentication {

    private static final String LOGIN = "Aleksey";
    private static final String PASSWORD = "1";


    public static void authenticate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");

        String loginInput = scanner.nextLine();

        System.out.println("Введите пароль");

        String passwordInput = scanner.nextLine();

        if (validate(loginInput, passwordInput) == true) {
            System.out.println("Добро пожаловать!");
        } else
            System.out.println("неверный логин или пароль, повторите ввод");

    }

    public static boolean validate (String login, String password) {
        if (login.equals(LOGIN) && password.equals(password)) {
            return true;
        }
    }
}
