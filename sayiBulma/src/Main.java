public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[]{1,3,6,7,9};
        int findNumber = 5;
        boolean isTrue = false;

        for(int number: numbers){
            if(number == findNumber)
            {
                isTrue = true;
                break;
            }
        }

        if(isTrue){
            System.out.println("Sayı vardır");
        }else{
            System.out.println("Sayı yoktur");
        }

    }
}