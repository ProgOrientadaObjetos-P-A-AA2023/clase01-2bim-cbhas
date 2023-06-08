package paquete1;

public class Edificio {

    private String nombre;
    private double costo;
    private double costoPredio;

    public Edificio(String m) {
        nombre = m;
    }

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerCostos(double m) {
        costo = m;
    }

    public void calcularCostoPredio() {
        costoPredio = costo * 0.002;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCosto() {
        return costo;
    }

    public double obtenerCostoPredio() {
        return costoPredio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Edificio de nombre %s\n"
                + "\tEl costo del edificio es: %.2f\n"
                + "\tEl costo del predio es: %.2f",
                nombre,
                obtenerCosto(),obtenerCostoPredio());
        return cadena;
    }
}
