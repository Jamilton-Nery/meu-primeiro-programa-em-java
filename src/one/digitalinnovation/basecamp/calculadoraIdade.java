package one.digitalinnovation.basecamp;

import java.util.Scanner;

public class calculadoraIdade {
    public static void main(String[] args) {

        System.out.println("prePos");
        prePos();
        System.out.println("Aritimetico");
        aritimetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Procedencia");

    }

    private static void prePos() {

        int k =10;
        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("x:" + x);

    }

    private static void aritimetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + c;
        int r2 = a - c;
        int r3 = a * c;
        int r4 = a / c;
        int r5 = a % c;


    }

    private static void atribuicao(){
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 15;
        float f = 3.5f;
        double d = f;

        System.out.println("d:" + d);


    }


}
