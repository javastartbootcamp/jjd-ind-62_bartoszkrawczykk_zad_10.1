package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Builder builder = new Builder();
        Example[] examples = builder.createExampleArray();

        System.out.println("Podaj informację o trzech unikalnych książkach\n");

    }
}