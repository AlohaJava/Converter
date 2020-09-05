package com.company;

public class Main {

    public static void main(String[] args) {
	double c = 23.0;
        System.out.println("C:"+c);
        System.out.println("F:"+BasicsConverters.getFahrenheitConverter().convert(c));
        System.out.println("K:"+BasicsConverters.getKelvinConverter().convert(c));
    }
}
