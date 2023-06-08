package paquete1;

public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private Vehiculo[] vehiculos; // tipo, matricula, valor
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;
    private double costoTotalPagoPredio;

    public Empresa(String n, Edificio[] e, Vehiculo[] v) {
        nombre = n;
        edificios = e;
        vehiculos = v;
    }

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerVehiculos(Vehiculo[] v) {
        vehiculos = v;
    }

    public void calcularCostosBienesInmuebles() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            suma = suma + edificios[i].obtenerCosto();
        }

        costoBienesInmuebles = suma;
    }

    public void calcularCostoVehiculos() {
        double suma = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            suma = suma + vehiculos[i].obtenerValor();
        }

        costoVehiculos = suma;
    }

    public void calcularCostoTotalBienes() {
        costoTotalBienes = costoBienesInmuebles + costoVehiculos;
    }

    public void calcularCostoTotalPagoPredio() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            suma = suma + edificios[i].obtenerCostoPredio();
        }

        costoTotalPagoPredio = suma;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public Vehiculo[] obtenerVehiculos() {
        return vehiculos;
    }

    public double obtenerCostosBienesInmuebles() {
        return costoBienesInmuebles;
    }

    public double obtenerCostoVehiculos() {
        return costoVehiculos;
    }

    public double obtenerCostoTotalBienes() {
        return costoTotalBienes;
    }

    public double obtenerCostoTotalPagoPredio() {
        return costoTotalPagoPredio;
    }

    @Override
    public String toString() {
        /*
        Empresa de Hojas
        Lista de Edificios
        1. EDIFICIO CENTRAL (20000)
        2. EDIFICIO NORTE (30000)
        3. EDIFICIO SUR (10000)
        4. EDIFICIO SECUNDARIO (5000)
        Total de inmuebles: 65000
        
        Lista de Vehiculos
        1. Auto, LBB0011 (10000)
        2. Camioneta, LCB0011 (20000)
        3. Auto, LBD0012 (6000)
        4. Camioneta, LCC0011 (10000)
        5. Camioneta, LDC0011 (25000)
        Total de inmuebles: 71000
        
        Total bienes: 136000
         */

        String reporte = String.format("%s\nLista de Edificio\n",
                obtenerNombre());
        for (int i = 0; i < edificios.length; i++) {
            reporte = String.format("%s%d. %s \n\t- Costo: ($%.2f)\n\t- Costo Predio: ($%.2f) \n",
                    reporte,
                    i + 1,
                    edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto(),
                    edificios[i].obtenerCostoPredio());
        }

        reporte = String.format("%sTotal de inmuebles: $%.2f\n",
                reporte,
                costoBienesInmuebles);

        reporte = String.format("%s\nLista de Vehiculos\n", reporte);
        for (int i = 0; i < vehiculos.length; i++) {
            reporte = String.format("%s%d. %s\n\t- Matricula: %s\n\t- Valor: ($%.2f)\n",
                    reporte,
                    i + 1,
                    vehiculos[i].obtenerTipo(),
                    vehiculos[i].obtenerMatricula(),
                    vehiculos[i].obtenerValor());
        }

        reporte = String.format("%sTotal de vehículos: $%.2f\n\n"
                + "Total bienes: $%.2f\n"
                + "Total predio: $%.2f\n",
                reporte,
                costoVehiculos,
                costoTotalBienes,
                costoTotalPagoPredio);

        return reporte;
    }
}
