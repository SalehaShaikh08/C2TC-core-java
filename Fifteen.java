
//Fifteen

public class Fifteen {
    public static void main(String[] args) {
        char x = 'F';

        //Decison with switch case (char)
        switch (x) {
            case 'a':
            case 'A':
                System.out.println("The value of x is a");
                break;
            case 'b':
            case 'B':
                System.out.println("The value of x is b");
                break;
            case 'c':
            case 'C':
                System.out.println("The value of x is c");
                break;
            default:
                System.out.println("The value of x is other than a,b,c");
                break;
        }
    }
}
