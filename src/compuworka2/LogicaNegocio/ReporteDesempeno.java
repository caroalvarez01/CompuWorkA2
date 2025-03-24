/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworka2.LogicaNegocio;

/**
 *
 * @author caralvarezrob01
 */
public class ReporteDesempeno {
    private double asistenciaPuntualidad;
    private double productividad;
    private double calidadTrabajo;
    private double trabajoEquipo;
    private double resolucionProblemas;
    
    //constructor

    public ReporteDesempeno(double asistenciaPuntualidad, double productividad, double calidadTrabajo, double trabajoEquipo, double resolucionProblemas) {
        this.asistenciaPuntualidad = asistenciaPuntualidad;
        this.productividad = productividad;
        this.calidadTrabajo = calidadTrabajo;
        this.trabajoEquipo = trabajoEquipo;
        this.resolucionProblemas = resolucionProblemas;
    }

    public double getAsistenciaPuntualidad() {
        return asistenciaPuntualidad;
    }

    public void setAsistenciaPuntualidad(double asistenciaPuntualidad) {
        this.asistenciaPuntualidad = asistenciaPuntualidad;
    }

    public double getProductividad() {
        return productividad;
    }

    public void setProductividad(double productividad) {
        this.productividad = productividad;
    }

    public double getCalidadTrabajo() {
        return calidadTrabajo;
    }

    public void setCalidadTrabajo(double calidadTrabajo) {
        this.calidadTrabajo = calidadTrabajo;
    }

    public double getTrabajoEquipo() {
        return trabajoEquipo;
    }

    public void setTrabajoEquipo(double trabajoEquipo) {
        this.trabajoEquipo = trabajoEquipo;
    }

    public double getResolucionProblemas() {
        return resolucionProblemas;
    }

    public void setResolucionProblemas(double resolucionProblemas) {
        this.resolucionProblemas = resolucionProblemas;
    }
   
public double calcularPromedio() {
    double suma = asistenciaPuntualidad + productividad + calidadTrabajo + trabajoEquipo + resolucionProblemas;
    return suma / 5;  
}

public String generarInforme() {
    return "===== INFORME DE DESEMPEÑO =====\n"
            + "Asistencia y Puntualidad: " + asistenciaPuntualidad + "\n"
            + "Productividad: " + productividad + "\n"
            + "Calidad del Trabajo: " + calidadTrabajo + "\n"
            + "Trabajo en Equipo: " + trabajoEquipo + "\n"
            + "Resolución de Problemas: " + resolucionProblemas + "\n"
            + "Promedio General: " + calcularPromedio() + "\n";
}

public void mostrarDetalle() {
    System.out.println("==== DETALLE DEL REPORTE DE DESEMPEÑO ====");
    System.out.println("Asistencia y Puntualidad: " + asistenciaPuntualidad);
    System.out.println("Productividad: " + productividad);
    System.out.println("Calidad del Trabajo: " + calidadTrabajo);
    System.out.println("Trabajo en Equipo: " + trabajoEquipo);
    System.out.println("Resolución de Problemas: " + resolucionProblemas);
    System.out.println("Promedio General: " + calcularPromedio());
}
   
}
    
   

    