package pl.javastart.task;

import java.util.Scanner;

public class Builder {
    private Scanner scanner = new Scanner(System.in);

    Book createBook() {
        System.out.println("Podaj tytuł:");
        String name = scanner.nextLine();
        System.out.println("Podaj ilość stron:");
        int amount = scanner.nextInt();
        scanner.nextLine();
        return new Book(name, amount);
    }

    void check() {
        String previous = createBook().getName();
        do {
            String next = createBook().getName();
            if (previous.equals(next))
                break;
            previous = next;
        } while (true);
        System.out.println("Duplikat");
    }

    Book[] createBookArray;

    {
        Book[] examples = new Book[3];
        examples[0] = createBook();
        examples[1] = createBook();
        examples[2] = createBook();
    }
}
