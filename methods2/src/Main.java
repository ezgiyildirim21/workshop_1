public class Main {

    public static void main(String[] args) {

        String message = "Bugün hava çok güzel";
        String newMessage = message.substring(0, 2);
        int number = sum(4, 8);
        System.out.println(number);
        String city = getCity();
        System.out.println(city);

        int total = sum2(2, 5, 8, 9, 8, 56);
        System.out.println(total);

    }

    public static void create() {
        System.out.println("Eklendi");
    }

    public static void delete() {
        System.out.println("Silindi");
    }

    public static void update() {
        System.out.println("Güncellendi");
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum2(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static String getCity() {
        return "Ankara";
    }
}