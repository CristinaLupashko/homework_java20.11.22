import java.util.Scanner;

public class HomeWorkString {
    public static void main(String[] args) {
        //  //level.1

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        boolean answer = (a.length()) > 10;
        System.out.println(answer);
        //level.2
        Scanner str = new Scanner(System.in);
        String b = str.nextLine();
        System.out.println(b.charAt(0));
        System.out.println(b.charAt(b.length() - 1));
        boolean reply = (b.charAt(0)) == (b.charAt(b.length() - 1));
        System.out.println(reply);

        //level.3
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();

        word = (word.replace('A', 'C'));
        word = (word.replace('B', 'D'));
        word = (word.replace('D', 'A'));
        word = (word.replace('C', 'B'));
        System.out.println(word);


    }
}
