package com.company;

public class HorasEstudio {
    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + " : ");
        String s = veredicto("3", "1");
        System.out.println(s);
    }
    static String veredicto (String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada modulo puede ser insuficiente";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            return "Poco tiempo de estudio. Debes dedicar mas tiempo";
        }
        return "Ideal. Trabajas los contenidos en casa";
    }
}
