/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworka2.LogicaNegocio;

import java.util.Date;

/**
 *
 * @author caralvarezrob01
 */


public class EmpleadoTemporal extends Empleado {
    private boolean contratoFijo;
    private String beneficiosTemporal;
    private Date fechaFinalizacion;
    private boolean posibleRenovacion;
    
    //constructor
    
    public EmpleadoTemporal(boolean contratoFijo, String beneficiosTemporal, Date fechaFinalizacion, boolean posibleRenovacion, String nombre, String telefono, String email, String profesion, String cargo, String direccion, long idEmpleado, Double salario) {
        super(nombre, telefono, email, profesion, cargo, direccion, salario);
        this.contratoFijo = contratoFijo;
        this.beneficiosTemporal = beneficiosTemporal;
        this.fechaFinalizacion = fechaFinalizacion;
        this.posibleRenovacion = posibleRenovacion;
    }

    public boolean isContratoFijo() {
        return contratoFijo;
    }

    public void setContratoFijo(boolean contratoFijo) {
        this.contratoFijo = contratoFijo;
    }

    public String getBeneficiosTemporal() {
        return beneficiosTemporal;
    }

    public void setBeneficiosTemporal(String beneficiosTemporal) {
        this.beneficiosTemporal = beneficiosTemporal;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public boolean isPosibleRenovacion() {
        return posibleRenovacion;
    }

    public void setPosibleRenovacion(boolean posibleRenovacion) {
        this.posibleRenovacion = posibleRenovacion;
    }
    
    
    public boolean renovarContrato(int nuevosMeses) {
        if (posibleRenovacion) {
            System.out.println("Contrato renovado por " + nuevosMeses + " meses.");
          
            return true;
        } else {
            System.out.println("Este contrato no es renovable.");
            return false;
        }
    }
    
    public String mostrarBeneficios() {
        return "Beneficios del empleado temporal: " + beneficiosTemporal;
    }
    
    public Date verificarFechaFinalizacion() {
        System.out.println("Fecha de finalización del contrato: " + fechaFinalizacion);
        return fechaFinalizacion;
    }
    
   public String evaluarRenovacion() {
        if (posibleRenovacion) {
            return "El contrato puede ser renovado.";
        } else {
            return "El contrato NO puede ser renovado.";
        } 
    }
   
}