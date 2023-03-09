package org.example;

public class Shot extends Coctel{
    private String tipoLicor;

    public Shot() {
    }

    public Shot(String nombre, Long precioUnitario, String tipoLicor) {
        super(nombre, precioUnitario);
        this.tipoLicor = tipoLicor;
    }

    public Long calcularCosto (Long precioUnitario, int cantidad){
        Long costoTotal = precioUnitario * cantidad;
        return costoTotal;
    }

    public Long calcularCosto2 (int cantidad){
        Long costoTotal2= this.getPrecioUnitario()*cantidad;
        return costoTotal2;
    }

    public String getTipoLicor() {
        return tipoLicor;
    }

    public void setTipoLicor(String tipoLicor) {
        this.tipoLicor = tipoLicor;
    }


}
