import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Witaj w systemie rezerwacji");
        System.out.println();
        displayInformation("Company");
        System.out.println();
        displayInformation("Hotel");

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