package org.example.SOLID.L_LiskovSubstitution;

public class Example {
    public static void main(String[] args) {
        FatherClass fatherObject = new FatherClass();
        SonClass sonObject = new SonClass();
        printClasses(fatherObject);
        printClasses(sonObject);
    }

    public static void printClasses(FatherClass fatherClass) {
        fatherClass.print();
    }
}
