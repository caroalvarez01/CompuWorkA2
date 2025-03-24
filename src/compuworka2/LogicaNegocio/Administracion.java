/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworka2.LogicaNegocio;

/**
 *
 * @author caralvarezrob01
 */
public class Administracion extends Departamento{
    private double presupuestoAsignado;
    private int numEmpleados;
    private String regulacionesInternas;
    private String responsableAdministracion;
    
    //constructor

    public Administracion(double presupuestoAsignado, int numEmpleados, String regulacionesInternas, String responsableAdministracion, int cantEmpleadosFijos, int cantEmpleadosTemp, Double presupuestoDepto, String subDeptos, String metasDepto) {
        super(cantEmpleadosFijos, cantEmpleadosTemp, presupuestoDepto, subDeptos, metasDepto);
        this.presupuestoAsignado = presupuestoAsignado;
        this.numEmpleados = numEmpleados;
        this.regulacionesInternas = regulacionesInternas;
        this.responsableAdministracion = responsableAdministracion;
    }

    public double getPresupuestoAsignado() {
        return presupuestoAsignado;
    }

    public void setPresupuestoAsignado(double presupuestoAsignado) {
        this.presupuestoAsignado = presupuestoAsignado;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public String getRegulacionesInternas() {
        return regulacionesInternas;
    }

    public void setRegulacionesInternas(String regulacionesInternas) {
        this.regulacionesInternas = regulacionesInternas;
    }

    public String getResponsableAdministracion() {
        return responsableAdministracion;
    }

    public void setResponsableAdministracion(String responsableAdministracion) {
        this.responsableAdministracion = responsableAdministracion;
    }
    
    public void procesarNomina() {
        double totalNomina = 0;
        for (Empleado empleado : this.getEmpleados()) {
            totalNomina += empleado.getSalario();
        }
        System.out.println("Total de la nómina procesada: $" + totalNomina);
    }
    
    public void gestionarContratos() {
        for (Empleado empleado : this.getEmpleados()) {
            System.out.println("Gestionando contrato de: " + empleado.getNombre());
          
        }
    }

   public String generarInformeFinanciero() {
        return "===== INFORME FINANCIERO DE ADMINISTRACIÓN =====\n"
                + "Presupuesto Asignado: $" + presupuestoAsignado + "\n"
                + "Número de Empleados: " + numEmpleados + "\n"
                + "Responsable: " + responsableAdministracion + "\n"
                + "Regulaciones Internas: " + regulacionesInternas;
    }
   
   public void verificarCumplimientoNorma() {
        System.out.println("Verificando cumplimiento de normativas internas y externas");
        System.out.println("Regulaciones a seguir: " + regulacionesInternas);
        
    }
    
}