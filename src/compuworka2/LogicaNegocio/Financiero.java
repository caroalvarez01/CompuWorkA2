/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworka2.LogicaNegocio;

/**
 *
 * @author caralvarezrob01
 */
    
    public class Financiero extends Departamento{
    private double presupuestoAnual;
    private double ingresosTotales;
    private double gastosOperacionales;
    private String responsableFinanzas;
    private String estrategiaFinanciera;
    
    //constructor

        public Financiero(double presupuestoAnual, double ingresosTotales, double gastosOperacionales, String responsableFinanzas, String estrategiaFinanciera, int cantEmpleadosFijos, int cantEmpleadosTemp, Double presupuestoDepto, String subDeptos, String metasDepto) {
            super(cantEmpleadosFijos, cantEmpleadosTemp, presupuestoDepto, subDeptos, metasDepto);
            this.presupuestoAnual = presupuestoAnual;
            this.ingresosTotales = ingresosTotales;
            this.gastosOperacionales = gastosOperacionales;
            this.responsableFinanzas = responsableFinanzas;
            this.estrategiaFinanciera = estrategiaFinanciera;
        }

    public double getPresupuestoAnual() {
        return presupuestoAnual;
    }

    public void setPresupuestoAnual(double presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }

    public double getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(double ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public double getGastosOperacionales() {
        return gastosOperacionales;
    }

    public void setGastosOperacionales(double gastosOperacionales) {
        this.gastosOperacionales = gastosOperacionales;
    }

    public String getResponsableFinanzas() {
        return responsableFinanzas;
    }

    public void setResponsableFinanzas(String responsableFinanzas) {
        this.responsableFinanzas = responsableFinanzas;
    }

    public String getEstrategiaFinanciera() {
        return estrategiaFinanciera;
    }

    public void setEstrategiaFinanciera(String estrategiaFinanciera) {
        this.estrategiaFinanciera = estrategiaFinanciera;
    }
    
    public double calcularPresupuestoAnual() {
        return ingresosTotales - gastosOperacionales;
    }
    
    
    public String generarReporteGastos() {
        return "===== REPORTE DE GASTOS =====\n"
             + "Gastos Operacionales: $" + gastosOperacionales + "\n"
             + "Responsable Finanzas: " + responsableFinanzas + "\n";
    }
    
    public double evaluarRentabilidad() {
        if (ingresosTotales == 0) {
            return 0;
        }
        return ((ingresosTotales - gastosOperacionales) / ingresosTotales) * 100;
    }
    
    public String generarReporteFinanciero() {
        return "===== INFORME FINANCIERO =====\n"
             + "Presupuesto Anual: $" + presupuestoAnual + "\n"
             + "Ingresos Totales: $" + ingresosTotales + "\n"
             + "Gastos Operacionales: $" + gastosOperacionales + "\n"
             + "Estrategia Financiera: " + estrategiaFinanciera + "\n"
             + "Responsable: " + responsableFinanzas + "\n";
    }
    
    
}
