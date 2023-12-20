// Homework 9, 9.2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Student student = new Student();
        student.Student("Алиса", 15, 2023);
        System.out.println(student.toString());
        student.setYear(2024);
        System.out.println(student.toString());
        System.out.println("..........");

        //Task 2
        StarTriangle small = new StarTriangle();
        small.starTriangle(3);
        System.out.println(small.toString());
        System.out.println("..........");

        //Task 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину стороны квадрата: ");
        int sideLength = sc.nextInt();
        Square square = new Square();
        square.square(sideLength);
        System.out.println(square.area());
        System.out.println(square.perimeter());
        System.out.println(square.diagonal());
        System.out.println("..........");

        //Task 4
        Temperature temp = new Temperature();
        System.out.println(temp.getTempF(35));
        System.out.println(temp.getTempC(95));
        temp.setTemp(25);
        temp.setScale('C');
        System.out.println(temp.toString());
        System.out.println("..........");

        // Task 9.2.2
        Outer outerClass = new Outer();
        Outer.Inner inner = outerClass.new Inner();
        System.out.println(inner.getOuter());
        System.out.println("..........");

        // Task 9.2.3
        Vehicle vehicle = new Vehicle();
        vehicle.start = true;
        Vehicle.Engine engine = vehicle.new Engine();
        if (vehicle.start == true) {
            engine.run(60);
        }
        System.out.println("..........");

        // Task 9.2.4
        Book book = new Book();
        Book.Description description = book.new Description();
        description.Description();
    }
}