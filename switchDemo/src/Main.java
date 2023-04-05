public class Main {

    public static void main(String[] args) {

        char grade = 'G';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel");
                break;
            case 'B':
                System.out.println("Çok Güzel");
                break;
            case 'C':
                System.out.println("İyi");
                break;
            case 'D':
                System.out.println("Fena Değil");
                break;
            case 'E':
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");

        }

    }
}