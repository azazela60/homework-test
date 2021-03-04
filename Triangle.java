package ru.geekbrains;


public class Triangle {


    public static void main(String[] args )
    {
      double v;

        v = triangleArea(5,4,3);

        System.out.println("Треугольник со сторонами 5,4,3 имеет площадь:" + v);

    }

    public static double triangleArea( int a, int b, int c )
    {

        double p1 = (a + b + c) / 2.0;  // полупериметр
        double s = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        return s;
    }

}

