package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj informację o trzech unikalnych książkach");
        Builder builder = new Builder();
        builder.check();

        Book[] examples = builder.createBookArray;
    }
}