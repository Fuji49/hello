import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        int targetNumber = 42;  // プログラマによって設定された数
        int maxGuesses = 5;    // ユーザの最大予想回数

        Scanner scanner = new Scanner(System.in);
        System.out.println("2桁の正の整数を予想して入力してください。");
        System.out.println("（" + maxGuesses + "回まで入力できます）");

        int guesses = 0;  // ユーザの予想回数

        while (guesses < maxGuesses) {
            System.out.print("予想を入力してください: ");
            int guess = scanner.nextInt();
            guesses++;

            if (guess == targetNumber) {
                System.out.println("当たり！");
                break;
            } else if (guess < targetNumber) {
                System.out.println("設定された数より大きいです。");
            } else {
                System.out.println("設定された数より小さいです。");
            }

            if (Math.abs(guess - targetNumber) >= 20) {
                System.out.println("20以上の差があります。");
            }
        }

        if (guesses == maxGuesses) {
            System.out.println("残念！正解は " + targetNumber + " でした。");
        }

        scanner.close();
    }
}

