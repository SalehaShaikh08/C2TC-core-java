
//Fourteen

public class Fourteen {
    public static void main(String[] args) {
        int Number = 10;

        //Decision with if else(int)
        if (Number == 1) {
            System.out.println("The value of x is 1");
        } else if (Number == 2) {
            System.out.println("The value of x is 2");
        } else if (Number == 3) {
            System.out.println("The value of x is 3");
        } else {
            System.out.println("The value of x is other than 1,2,3");
        }
//Decision with Switch case(int)
        switch (Number) {
            case 1:
                System.out.println("The value of x is 1");
                break;
            case 2:
                System.out.println("The value of x is 2");
                break;
            case 3:
                System.out.println("The value of x is 3");
                break;
            default:
                System.out.println("The value of x is other than 1,2,3");
                break;

        }

    }
}
