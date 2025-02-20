import java.util.Scanner;

public class Primitives{
    public static void main(String args[]){
        byte b = 1;
        short s = 10;
        int i = 909999;
        long longg = 999999999999l;
        float f = 111.999f;
        double d = 1111.1111;
        char ch = 'a';
        boolean bool = true;

        // System.out.println(b);
        // System.out.println(s);
        // System.out.println(i);
        // System.out.println(longg);
        // System.out.println(f);
        // System.out.println(d);
        // System.out.println(ch);
        // System.out.println(bool);

        // Input

        Scanner input = new Scanner(System.in);

        // Byte input
        System.out.print("Enter a byte : ");
        b = input.nextByte();
        System.out.println("The byte is "+b);

        // Short input
        System.out.print("Enter a short : ");
        s = input.nextShort();
        System.out.println("The short is "+s);

        // Integer input
        System.out.print("Enter a integer : ");
        i = input.nextInt();
        System.out.println("The integer is "+i);

        // Long input
        System.out.print("Enter a long integer : ");
        longg = input.nextLong();
        System.out.println("The long is "+longg);

        // Float input
        System.out.print("Enter a float : ");
        f = input.nextFloat();
        System.out.println("The float is "+f);

        // Double input
        System.out.print("Enter a double : ");
        d = input.nextDouble();
        System.out.println("The double is "+d);

        // character input
        System.out.print("Enter a character : ");
        ch = input.next().charAt(0); // No direct method like nextChar() so we use next().charAt(0)
        System.out.println("The character is "+ch);

        //Single word
        System.out.print("Enter a word : ");
        String word = input.next();
        System.out.println("The word is "+word);
        input.nextLine(); // it consumes the /n leftover by next()

        // Sentence input
        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine();
        System.out.println("The number is "+sentence);

    }
}