public class Main {

    public static void main(String[] args) {

        int sayi1 = 24;
        int sayi2 = 15;
        int sayi3 = 2;

        if (sayi1 > sayi2) {
            if(sayi1 > sayi3) {
                System.out.println(sayi1 + " sayılardan en büyüktür.");
            } else {
                System.out.println(sayi3 + " sayılardan en büyüktür.");
            }
        } else {
            if(sayi2 > sayi3) {
                System.out.println(sayi2 + " sayılardan en büyüktür.");
            } else {
                System.out.println(sayi3 + " sayılardan en büyüktür.");
            }
        }

    }
}