package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lefrontend {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        JuiceCoctel coctel1 = new JuiceCoctel("Bloody Mary", 25000L,LocalDate.of(2023,03,06

        ));
        System.out.println(coctel1.calcularCosto(5));
/*
        System.out.println(coctel1.getFechaCreacion());
        System.out.println(coctel1.getFechaVencimiento());
*/



/*
        //como obtener una fecha del sistema
        LocalDate fecha = LocalDate.now(); //metodo estatico
        System.out.println(fecha);

        //como asignar una fecha en especifico
        LocalDate fecha2 = LocalDate.of(2023,2,24);
        System.out.println(fecha2);

        //encontrar la diferencia entre dos fechas
        Long diferenciaEntreFechas = ChronoUnit.DAYS.between(fecha,fecha2);
        System.out.println(diferenciaEntreFechas);
*/




         }
}