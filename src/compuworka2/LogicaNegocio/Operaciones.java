/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworka2.LogicaNegocio;

/**
 *
 * @author caralvarezrob01
 */


 public class Operaciones extends Departamento{
    private int numProcesosActivos;
    private String eficienciaOperativa;
    private String recursosDisponibles;
    private String responsableOperaciones;
    private double costosOperacion;
    
//constructor

    public Operaciones(int numProcesosActivos, String eficienciaOperativa, String recursosDisponibles, String responsableOperaciones, double costosOperacion, int cantEmpleadosFijos, int cantEmpleadosTemp, Double presupuestoDepto, String subDeptos, String metasDepto) {
        super(cantEmpleadosFijos, cantEmpleadosTemp, presupuestoDepto, subDeptos, metasDepto);
        this.numProcesosActivos = numProcesosActivos;
        this.eficienciaOperativa = eficienciaOperativa;
        this.recursosDisponibles = recursosDisponibles;
        this.responsableOperaciones = responsableOperaciones;
        this.costosOperacion = costosOperacion;
    }

    public int getNumProcesosActivos() {
        return numProcesosActivos;
    }

    public void setNumProcesosActivos(int numProcesosActivos) {
        this.numProcesosActivos = numProcesosActivos;
    }

    public String getEficienciaOperativa() {
        return eficienciaOperativa;
    }

    public void setEficienciaOperativa(String eficienciaOperativa) {
        this.eficienciaOperativa = eficienciaOperativa;
    }

    public String getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(String recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    public String getResponsableOperaciones() {
        return responsableOperaciones;
    }

    public void setResponsableOperaciones(String responsableOperaciones) {
        this.responsableOperaciones = responsableOperaciones;
    }

    public double getCostosOperacion() {
        return costosOperacion;
    }

    public void setCostosOperacion(double costosOperacion) {
        this.costosOperacion = costosOperacion;
    }
    
    
    public void asignarRecursos() {
    if (recursosDisponibles != null && !recursosDisponibles.isEmpty()) {
        System.out.println("Asignando recursos: " + recursosDisponibles + " a los " + numProcesosActivos + " procesos activos.");
    } else {
        System.out.println("No hay recursos disponibles para asignar.");
    }
}
    
    public String monitorearProduccion() {
    String mensaje = "Actualmente se están ejecutando " + numProcesosActivos + " procesos activos.\n"
                   + "Eficiencia operativa registrada: " + eficienciaOperativa;
    System.out.println(mensaje);
    return mensaje;
}
    
    public double evaluarEficiencia() {
    
    double eficiencia = (numProcesosActivos > 0) ? (100 - (costosOperacion / numProcesosActivos)) : 0;
    System.out.println("Eficiencia evaluada: " + eficiencia + "%");
    return eficiencia;
}
    
    public String optimizarProcesos() {
   
    double costosAntes = costosOperacion;
    costosOperacion = costosOperacion * 0.90;
    String mensaje = "Procesos optimizados. Costos de operación reducidos de $" + costosAntes + " a $" + costosOperacion;
    System.out.println(mensaje);
    return mensaje;
}
    
    
    
 }
