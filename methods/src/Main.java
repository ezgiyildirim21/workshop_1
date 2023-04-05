public class Main {

    public static void main(String[] args) {

        findNumber();

    }

    public static void findNumber() {

        int[] numbers = new int[]{1, 5, 6, 7, 9};
        int searchNumber = 5;
        boolean isTrue = false;

        for (int number : numbers) {
            if (number == searchNumber) {
                isTrue = true;
                break;
            }
        }

        if (isTrue) {
            getMessage("Sayı vardır " + searchNumber);
        } else {
            getMessage("Sayı yoktur " + searchNumber);
        }

    }

    public static void getMessage(String message) {
        System.out.println(message);
    }
}