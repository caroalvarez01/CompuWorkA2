/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworka2.LogicaNegocio;

/**
 *
 * @author caralvarezrob01
 */

 public class Direccion extends Departamento{
    private String visionEmpresarial;
    private String estrategiaGeneral;
    private String objetivosAnuales;
    private String presidenteEmpresa;
    private int numReunionesAnuales;
    
    //constructor

    public Direccion(String visionEmpresarial, String estrategiaGeneral, String objetivosAnuales, String presidenteEmpresa, int numReunionesAnuales, int cantEmpleadosFijos, int cantEmpleadosTemp, Double presupuestoDepto, String subDeptos, String metasDepto) {
        super(cantEmpleadosFijos, cantEmpleadosTemp, presupuestoDepto, subDeptos, metasDepto);
        this.visionEmpresarial = visionEmpresarial;
        this.estrategiaGeneral = estrategiaGeneral;
        this.objetivosAnuales = objetivosAnuales;
        this.presidenteEmpresa = presidenteEmpresa;
        this.numReunionesAnuales = numReunionesAnuales;
    }

    public String getVisionEmpresarial() {
        return visionEmpresarial;
    }

    public void setVisionEmpresarial(String visionEmpresarial) {
        this.visionEmpresarial = visionEmpresarial;
    }

    public String getEstrategiaGeneral() {
        return estrategiaGeneral;
    }

    public void setEstrategiaGeneral(String estrategiaGeneral) {
        this.estrategiaGeneral = estrategiaGeneral;
    }

    public String getObjetivosAnuales() {
        return objetivosAnuales;
    }

    public void setObjetivosAnuales(String objetivosAnuales) {
        this.objetivosAnuales = objetivosAnuales;
    }

    public String getPresidenteEmpresa() {
        return presidenteEmpresa;
    }

    public void setPresidenteEmpresa(String presidenteEmpresa) {
        this.presidenteEmpresa = presidenteEmpresa;
    }

    public int getNumReunionesAnuales() {
        return numReunionesAnuales;
    }

    public void setNumReunionesAnuales(int numReunionesAnuales) {
        this.numReunionesAnuales = numReunionesAnuales;
    }
    

public void definirEstrategia(String estrategia) {
    this.estrategiaGeneral = estrategia;
    System.out.println("La nueva estrategia general ha sido definida: " + estrategiaGeneral);
}

public void asignarPresupuesto(double monto) {
    double nuevoPresupuesto = this.getPresupuestoDepto() + monto;
    this.setPresupuestoDepto(nuevoPresupuesto);
    System.out.println("Se ha asignado un presupuesto adicional. Presupuesto total ahora: $" + nuevoPresupuesto);
}

public String evaluarDepartamento(Departamento depto) {
    String evaluacion = "Evaluación del departamento:\n"
                      + "Metas: " + depto.getMetasDepto() + "\n"
                      + "Presupuesto: $" + depto.getPresupuestoDepto() + "\n"
                      + "Empleados Fijos: " + depto.getCantEmpleadosFijos() + "\n"
                      + "Empleados Temporales: " + depto.getCantEmpleadosTemp();
    System.out.println(evaluacion);
    return evaluacion;
}

public String generarInformeAnual() {
    String informe = "===== INFORME ANUAL DE DIRECCIÓN =====\n"
                   + "Presidente: " + presidenteEmpresa + "\n"
                   + "Visión Empresarial: " + visionEmpresarial + "\n"
                   + "Estrategia General: " + estrategiaGeneral + "\n"
                   + "Objetivos Anuales: " + objetivosAnuales + "\n"
                   + "Reuniones realizadas: " + numReunionesAnuales + "\n"
                   + "Presupuesto del Departamento: $" + this.getPresupuestoDepto();
    System.out.println(informe);
    return informe;
}

public boolean aprobarProyecto(String proyecto) {
    boolean aprobado = proyecto.length() > 5; 
    System.out.println("Proyecto '" + proyecto + "' " + (aprobado ? "aprobado." : "rechazado."));
    return aprobado;
}

public void listarDepartamentos() {
    System.out.println("Departamentos a cargo: " + this.getSubDeptos());
}
    
 }