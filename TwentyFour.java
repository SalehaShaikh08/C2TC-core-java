
//TwentyFour
//Pyramid structure
public class TwentyFour {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {//Nested for loop
                System.out.print('@');
            }
            System.out.println();
        }
    }
}
