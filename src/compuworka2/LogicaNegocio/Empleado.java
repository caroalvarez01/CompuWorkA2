/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworka2.LogicaNegocio;

/**
 *
 * @author caralvarezrob01
 */

public abstract class Empleado {
    
    private static long contadorEmpleados = 0;
    
    private String nombre;
    private String telefono;
    private String email;
    private String profesion;
    private String cargo;
    private String direccion;
    private long idEmpleado;
    private Double salario;
    private ReporteDesempeno reporteDesempeno;

    //constructor
    public Empleado(String nombre, String telefono, String email, String profesion, String cargo, String direccion, Double salario) {
        contadorEmpleados++;
        this.idEmpleado = contadorEmpleados;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.profesion = profesion;
        this.cargo = cargo;
        this.direccion = direccion;
        this.salario = salario;
    }
    
    public static long getContadorEmpleados() {
        return contadorEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }
    
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public ReporteDesempeno getReporteDesempeno() {
    return reporteDesempeno;
}

public void setReporteDesempeno(ReporteDesempeno reporteDesempeno) {
    this.reporteDesempeno = reporteDesempeno;
}
    
    
    //metodos 
 
    
    public String generarReporteDesempeno() {
    if (reporteDesempeno != null) {
        return "==== Reporte de Desempeño ====\n"
            + "Empleado: " + nombre + "\n"
            + "ID: " + idEmpleado + "\n"
            + "Cargo: " + cargo + "\n"
            + "Profesión: " + profesion + "\n"
            + "Asistencia y Puntualidad: " + reporteDesempeno.getAsistenciaPuntualidad() + "\n"
            + "Productividad: " + reporteDesempeno.getProductividad() + "\n"
            + "Calidad de Trabajo: " + reporteDesempeno.getCalidadTrabajo() + "\n"
            + "Trabajo en Equipo: " + reporteDesempeno.getTrabajoEquipo() + "\n"
            + "Resolución de Problemas: " + reporteDesempeno.getResolucionProblemas() + "\n";
    } else {
        return "No hay reporte de desempeño registrado para este empleado.";
    }
}
    
    
    
    
    
    
    
}








