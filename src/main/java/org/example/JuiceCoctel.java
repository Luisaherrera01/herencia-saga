package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class JuiceCoctel extends Coctel{

    private LocalDate fechaVencimiento;
    private LocalDate fechaCreacion;



    public JuiceCoctel() {
    }

    public JuiceCoctel(String nombre, Long precioUnitario, LocalDate fechaVencimiento) {
        super(nombre, precioUnitario);
        this.fechaVencimiento = fechaVencimiento;
        //necesito cargar la fecha de cracion del coctel
        this.fechaCreacion = LocalDate.now();
    }

    public Long calcularCosto(int cantidad){
        //Encontrar la diferencia de dias entre las dos fechas
        Long diferenciaEntreFechas = ChronoUnit.DAYS.between(this.fechaCreacion, this.fechaVencimiento);

        //Encuentro el costo normal del coctel
        Long costoDelCoctel = this.getPrecioUnitario() * cantidad;

        //calculo definitivo de la orden

        Double costoSegunDiasDeCreado=0.0;

        //clasifico el cobro segun los dias de vencimiento
            if (diferenciaEntreFechas == 1){
                costoSegunDiasDeCreado=costoDelCoctel-0.5*(costoDelCoctel);
            System.out.println("va un dia de creado ");
            } else if (diferenciaEntreFechas == 2) {
                costoSegunDiasDeCreado= Double.valueOf(costoDelCoctel-1*(costoDelCoctel));
            System.out.println("van dos dias de creado");
            } else if (diferenciaEntreFechas == 3) {
                costoSegunDiasDeCreado= Double.valueOf(costoDelCoctel-2*(costoDelCoctel));
            System.out.println("Van tres dias");
            }else{
            System.out.println("sinverguenza, eso no se vende");
            }
        return 0L;
    }



    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
