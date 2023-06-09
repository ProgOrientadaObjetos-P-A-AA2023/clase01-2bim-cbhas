package paquete2;

import paquete1.*;

public class Ejecutor {

    public static void main(String[] args) {

        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCostos(20000);
        edf1.calcularCostoPredio();
        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCostos(30000);
        edf2.calcularCostoPredio();
        Edificio edf3 = new Edificio("Edificio sur");
        edf3.establecerCostos(10000);
        edf3.calcularCostoPredio();
        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(5000);
        edf4.calcularCostoPredio();

        Vehiculo v1 = new Vehiculo("Auto", "LBB0011", 10000);
        Vehiculo v2 = new Vehiculo("Camioneta", "LCB0011", 20000);
        Vehiculo v3 = new Vehiculo("Auto", "LBD0012", 6000);
        Vehiculo v4 = new Vehiculo("Camioneta", "LCC0011", 10000);
        Vehiculo v5 = new Vehiculo("Camioneta", "LDC0011", 25000);

        Edificio[] listaEdificios = {edf1, edf2, edf3, edf4};
        Vehiculo[] listaVehiculos = {v1, v2, v3, v4, v5};

        Empresa miempresa = new Empresa("Empresa de Hojas", listaEdificios,
                listaVehiculos);

        miempresa.calcularCostosBienesInmuebles();
        miempresa.calcularCostoVehiculos();
        miempresa.calcularCostoTotalBienes();
        miempresa.calcularCostoTotalPagoPredio();
        System.out.printf("%s\n", miempresa);
    }
}
