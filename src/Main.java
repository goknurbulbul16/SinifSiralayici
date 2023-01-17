import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Kürk Matolu Madonna", 105, "Sabahattin Ali", "01/01/1999");
        Book b2 = new Book("Notre Dame'ın Kamburu", 502, "Victor Hugo", "01/01/1898");
        Book b3 = new Book("Şeker Portakalı", 486, "J. M. Vasconcelos", "01/01/2012");
        Book b4 = new Book("Uçurtma Avcısı", 674, "Khaled Husseini", "01/01/1850");
        Book b5 = new Book("Fareler ve İnsanlar", 118, "Jhon Steinback", "01/01/1993");

        TreeSet<Book> set1 = new TreeSet<>();
        set1.add(b1);
        set1.add(b2);
        set1.add(b3);
        set1.add(b4);
        set1.add(b5);

        for (Book b: set1){
            System.out.println(b);
        }

        System.out.println("********************************************");

        TreeSet<Book> set2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNumberPage() - o2.getNumberPage();
            }
        });
        set2.add(b1);
        set2.add(b2);
        set2.add(b3);
        set2.add(b4);
        set2.add(b5);

        for (Book b: set2){
            System.out.println(b);
        }
    }
}