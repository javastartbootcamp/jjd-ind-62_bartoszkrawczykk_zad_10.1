package pl.javastart.task;

import java.util.Scanner;

public class Builder {
    private Scanner scanner = new Scanner(System.in);

    private Example createExample() {
        System.out.println("Podaj tytuł:");
        String name = scanner.nextLine();
        do {
            String nextName = scanner.nextLine();
            if (name.equals(nextName))
                break;
            name = nextName;
        } while (true);
        System.out.println("Duplikat");
        System.out.println("Podaj ilosc:");
        int amount = scanner.nextInt();
        do {
            int nextAmount = scanner.nextInt();
            if (amount.equalss(nextAmount))
                break;
            amount = nextAmount;
        } while (true);
        System.out.println("Duplikat");
        return new Example(name, amount);

//        private Example createExample() {
//            System.out.println("Podaj tytuł:");
//            String name = scanner.nextLine();
//            System.out.println("Podaj ilość stron:");
//            int amount = scanner.nextInt();
//            scanner.nextLine();
//            return new Example(name, amount);
//        }

        Example[] createExampleArray; {
            Example[] examples = new Example[3];
            examples[0] = createExample();
            examples[1] = createExample();
            examples[2] = createExample();
        }
    }
}
