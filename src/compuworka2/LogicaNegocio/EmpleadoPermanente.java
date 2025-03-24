/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworka2.LogicaNegocio;

/**
 *
 * @author caralvarezrob01
 */
public class EmpleadoPermanente extends Empleado {
    
    private boolean contratoIndefinido;
    private String beneficiosPermanente;
    private double bonoAnual; 
    
//constructor
    public EmpleadoPermanente(boolean contratoIndefinido, String beneficiosPermanente, double bonoAnual, String nombre, String telefono, String email, String profesion, String cargo, String direccion, long idEmpleado, Double salario) {
        super(nombre, telefono, email, profesion, cargo, direccion,salario);
        this.contratoIndefinido = contratoIndefinido;
        this.beneficiosPermanente = beneficiosPermanente;
        this.bonoAnual = bonoAnual;
    }

    public boolean isContratoIndefinido() {
        return contratoIndefinido;
    }

    public void setContratoIndefinido(boolean contratoIndefinido) {
        this.contratoIndefinido = contratoIndefinido;
    }

    public String getBeneficiosPermanente() {
        return beneficiosPermanente;
    }

    public void setBeneficiosPermanente(String beneficiosPermanente) {
        this.beneficiosPermanente = beneficiosPermanente;
    }

    public double getBonoAnual() {
        return bonoAnual;
    }

    public void setBonoAnual(double bonoAnual) {
        this.bonoAnual = bonoAnual;
    }

public String mostrarBeneficios() {
    return "Beneficios del empleado permanente: " + beneficiosPermanente;
}


public double calcularBonoAnual() {
    try {
        if (bonoAnual < 0) {
            throw new IllegalArgumentException("El bono anual no puede ser negativo.");
        }
        return bonoAnual;
    } catch (IllegalArgumentException e) {
        System.out.println("Error al calcular el bono anual: " + e.getMessage());
        return 0; 
    }
}

public String consultarPrestaciones() {
    String contrato = contratoIndefinido ? "Contrato indefinido" : "Contrato definido";
    return "Prestaciones del empleado:\n" 
           + contrato + "\n"
           + "Beneficios: " + beneficiosPermanente + "\n"
           + "Bono Anual: $" + bonoAnual;
}

    
}