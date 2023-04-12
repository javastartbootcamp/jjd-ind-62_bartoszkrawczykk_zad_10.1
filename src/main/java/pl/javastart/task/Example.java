package pl.javastart.task;

import java.util.Objects;

public class Example {
    private String name;
    private int amount;

    public Example(String name, int amount) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return amount == example.amount && Objects.equals(name, example.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }
}
