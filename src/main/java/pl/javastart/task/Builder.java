package pl.javastart.task;

import java.util.Scanner;

public class Builder {
    private Scanner scanner = new Scanner(System.in);

    Example createExample() {
        System.out.println("Podaj tytuł:");
        String name = scanner.nextLine();
        System.out.println("Podaj ilość stron:");
        int amount = scanner.nextInt();
        scanner.nextLine();
        return new Example(name, amount);
    }

    Example[] createExampleArray;

    {
        Example[] examples = new Example[3];
        examples[0] = createExample();
        examples[1] = createExample();
        examples[2] = createExample();
    }
}
