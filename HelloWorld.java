
//My first program

/*public class HelloWorld{
    public static void Main(String args[]){
        System.out.println("Hello World!");
    }
}*/

//Second Program Primitive Datatype - Integer

/*public class HelloWorld {
    public static void main(String args[]) {
        // Variable declarations
        // All variables get stored in STACK.
        int max = 2147483647;
        int min = -2147483648;
        short shortMax = 32767;
        short shortMin = -32768;
        long longMax = 9223372036854775807L;
        long longMin = -9223372036854775808L;
        byte byteMax = 127;
        byte byteMin = -128;

    }
}*/

// Program 3 Primitive Datatype - Float

// public class HelloWorld {
// public static void main(String args[]) {
/*
 * int value1 = 9/2;
 * float value2 = 10f/6f;
 * double value3 = 10d/6d;
 * System.out.println("value  1 = "+ value1);
 * System.out.println("value  2 = "+ value2);
 * System.out.println("value  3 = "+ value3);
 */
// Variable declaration
/*
 * int marker = 512;
 * double percentage = marker * 0.46f;
 * // Print statement
 * System.out.println("percentage:" + percentage);
 * 
 * }
 * }
 */

// Program 4 Boolean & Unicode

/*
 * public class HelloWorld {
 * public static void main(String args[]) {
 * // Variable declaration
 * boolean var = false;
 * // Print statement of first variable
 * System.out.println(var);
 * // Second variable declaration
 * char var1 = '\u00A7';
 * System.out.println(var1);
 * 
 * }
 * }
 */

//Program 5: String

/*public class HelloWorld {
    public static void main(String[] args) {
        String var = new String("Hello world");
        System.out.println(var);

    }

}*/

//Program 6Decision making with operators}

/*public class HelloWorld {

    public static void main(String[] args) {

        float f = 10.532f;
        long l = (long) f;
        System.out.println(l);
    }
}*/

//Program 8

/*public class HelloWorld {

    public static void main(String[] args) {
        int x = 5;
        if (x != 5) {
            System.out.println("Value of x is not 5");

        } else {
            System.out.println("Value of x is 5");
        }
    }
}*/

//Decision making with operators
/*public class HelloWorld {
    public static void main(String[] args) {
        int x = 8, y = 7;

        if (x >= y) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}*/

//10 Decision making with operators
/*public class HelloWorld {

    public static void main(String[] args) {

        int x = 10;
        int y = 11;

        if (!(x < y) || (x == y)) {
            System.out.println("Condition is TRUE");
        } else {
            System.out.println("Condition is FALSE");
        }*/

/*
 * int ageOfBoy = 36;
 * int ageOfGirl = 25;
 * 
 * if ((ageOfBoy >= 21) && (ageOfGirl >= 18))
 * {
 * System.out.println("ready to get married!");
 * }
 * else
 * {
 * System.out.println("Wait for it kiddo!");
 * }
 */

/* }

}*/

//11 Ternary Operator

/*public class HelloWorld {

    public static void main(String[] args) {
        int x = 10;

        x = (10 == x) ? 1 : 0;

        System.out.println(x);

    }

}*/

//12 Assignment  Operator

/*public class HelloWorld {
    public static void main(String[] args) {
        int x = 4;
        // x += 5; // x = x + 5
        // x -= 5; // x = x - 5
        // x *= 5; // x = x * 5
        // x /= 4; // x = x / 4
        x %= 5; // x = x % 5
        System.out.println(x);
    }
}*/

//13 Making decision with if else

/*public class HelloWorld {

    public static void main(String[] args) {
        int x = 5;

        if (x == 5) {
            if (x >= 5) {
                System.out.println("X is greater than 5");
            } else {
                System.out.println("X is smaller than 5");
            }
        }

        if (x == 5) {
            System.out.println("X equals to 5");
        } else if (x > 5) {
            System.out.println("X is greater to 5");
        } else {
            System.out.println("X is smaller than 5");
        }

    }

}*/

//14 Switch Case in Java (int)

/*public class HelloWorld {
    public static void main(String[] args) {
        int x = 10;

        if (x == 1) {
            System.out.println("The value of x is 1");
        } else if (x == 2) {
            System.out.println("The value of x is 2");
        } else if (x == 3) {
            System.out.println("The value of x is 3");
        } else {
            System.out.println("The value of x is other than 1,2,3");
        }

        switch (x) {
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
}*/

//15 Switch Case in Java (Char)
/*public class HelloWorld {
    public static void main(String[] args) {
        char x = 'F';
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
}*/

//16 for loop

/*public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) // (int i = 1000; i<=1;i--)
        {
            System.out.print("Value of i:");
            System.out.println(i);
        }
    }
}*/

//17 for loop 

/*public class HelloWorld {
    public static void main(String[] args) {
        int number = 8;
        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("The number is a prime number");
        } else {
            System.out.println("The number is not a prime number");
        }

    }

}*/

//18
/*public class HelloWorld {

    public static void main(String[] args) {
        int i = 99;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}*/

//19
/*public class HelloWorld {
    public static void main(String[] args) {
        int i = 11;
        do {
            System.out.println(i);
            i++;
        } while (i <= 1);
    }
}*/

//20 for, while, do while loop

/*public class HelloWorld {

	public static void main(String[] args) 
	{

	  // for loop
	  for(int i=1,j=1; i<10||j<10;i++,j++)
	  { 
		  j++;
		  System.out.println("i="+i+" and j="+j); 
	  }


	  // while loop 
		  int i=1,j=1;
		  while(i<10 || j<10)
		  { 
			  i++; j++;
		      System.out.println("i="+i+" and j="+j); 
		  }	
		
	// Do while loop
		int i = 1, j = 1;
		do {
			i++;
			j++;
			System.out.println("i=" + i + " and j=" + j);
		    } while (i < 10 || j < 10);
	}
}*/

//23

public class HelloWorld {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('@');
            }
            System.out.println();
        }
    }
}
