import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Witaj w systemie rezerwacji");
        System.out.println();
        multiply();
    }

    public static void multiply()
    {
        for(int i = 1; i <= 10; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                int r = i * j;
                System.out.println(String.format("%d * %d = %d", i, j, r));
            }
            System.out.println();
        }
    }
    public static void taskTwo()
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        System.out.println(String.format("Your print : %s", userString));

    }
    public static void displayInformation(String typeInfo)
    {
        if(Objects.equals(typeInfo, "Company"))
        {
            System.out.println("81389 Brudov Kyrylo");
            System.out.println("Clockwork Java");
            System.out.println("ul. Programistow 32");
            System.out.println("31-333 Krakow");
        }
        else if(Objects.equals(typeInfo, "Hotel"))
        {
            System.out.println("Hotel Clockwork Java");
            System.out.println("ul. Programistow 32");
            System.out.println("31-333 Krakow");
            System.out.println("Tel. 333-332-331");
        }
        else
        {
            System.out.println("ERROR 0x000001");
        }
    }
}