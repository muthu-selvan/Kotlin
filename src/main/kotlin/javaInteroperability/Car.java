package javaInteroperability;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class Car {

    public static final int X=900;

    public static void printStaticMethod() {
        System.out.println("This is printed from static method");
    }

    private String name;
    private String color;
    private int releasedYear;

    public Car(String name, String color, int releasedYear) {
        this.name = name;
        this.color = color;
        this.releasedYear = releasedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(@Nullable String color) {
        this.color = color;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", releasedYear=" + releasedYear +
                '}';
    }

    public void acceptAndPrintVarargs(int num, String... values) {
        Arrays.stream(values).forEach(System.out::println);
    }

    public void acceptsAndPrintIntArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }

    public void acceptsAndPrintList(List<String> values) {
        System.out.println("Printing values");

        values.forEach(System.out::println);
    }

    public static void main(String[] args) {
        StaticCar.topLevelFunction();

        Student student = new Student("Muthu","Selvan", true);
        student.isAllPass();
        student.getFirstName();
        student.getLastName();
    }
}
