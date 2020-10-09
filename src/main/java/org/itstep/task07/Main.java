package org.itstep.task07;

/**
 * Задание 7
 * <p>
 * Разработать  программу  для  представления  комплексных  чисел с возможностью задания
 * вещественной и мнимой частей числами типа double.
 * <p>
 * Вещественная часть должна быть представлена приватным полем real, а мнимая - imaginary
 * <p>
 * Реализовать конструктор с параметрами и по умолчанию
 * <p>
 * Обеспечить выполнение операций:
 * - сравнения чисел (equals) - возвращает boolean
 * - сложения (plus);
 * - вычитания (minus);
 * - умножения (times).
 *
 * Методы plus, minus, times должны возвращать экземпляр класса Complex
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(1, 999998);
        Complex b = new Complex(2, 000001);
        Complex c = a.plus(b);
        System.out.println(c.getReal() + "," + c.getImaginary());
    }
}
