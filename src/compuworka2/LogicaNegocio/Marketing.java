/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworka2.LogicaNegocio;

/**
 *
 * @author caralvarezrob01
 */

 public class Marketing extends Departamento{
    private int numCampañasActivas;
    private String estrategiaPublicidad;
    private double presupuestoMarketing;
    private String responsableMarketing;
    private String canalesPublicidad;

    
    //constructor

    public Marketing(int numCampañasActivas, String estrategiaPublicidad, double presupuestoMarketing, String responsableMarketing, String canalesPublicidad, int cantEmpleadosFijos, int cantEmpleadosTemp, Double presupuestoDepto, String subDeptos, String metasDepto) {
        super(cantEmpleadosFijos, cantEmpleadosTemp, presupuestoDepto, subDeptos, metasDepto);
        this.numCampañasActivas = numCampañasActivas;
        this.estrategiaPublicidad = estrategiaPublicidad;
        this.presupuestoMarketing = presupuestoMarketing;
        this.responsableMarketing = responsableMarketing;
        this.canalesPublicidad = canalesPublicidad;
    }

    public int getNumCampañasActivas() {
        return numCampañasActivas;
    }

    public void setNumCampañasActivas(int numCampañasActivas) {
        this.numCampañasActivas = numCampañasActivas;
    }

    public String getEstrategiaPublicidad() {
        return estrategiaPublicidad;
    }

    public void setEstrategiaPublicidad(String estrategiaPublicidad) {
        this.estrategiaPublicidad = estrategiaPublicidad;
    }

    public double getPresupuestoMarketing() {
        return presupuestoMarketing;
    }

    public void setPresupuestoMarketing(double presupuestoMarketing) {
        this.presupuestoMarketing = presupuestoMarketing;
    }

    public String getResponsableMarketing() {
        return responsableMarketing;
    }

    public void setResponsableMarketing(String responsableMarketing) {
        this.responsableMarketing = responsableMarketing;
    }

    public String getCanalesPublicidad() {
        return canalesPublicidad;
    }

    public void setCanalesPublicidad(String canalesPublicidad) {
        this.canalesPublicidad = canalesPublicidad;
    }
    
 public void crearCampañaPublicidad() {
    numCampañasActivas++;
    System.out.println("Se ha creado una nueva campaña publicitaria.");
    System.out.println("Total de campañas activas ahora: " + numCampañasActivas);
}
 
 
 public String analizarMercado() {
    String analisis = "Análisis de mercado realizado.\n"
                    + "Estrategia actual: " + estrategiaPublicidad + "\n"
                    + "Canales de publicidad: " + canalesPublicidad;
    System.out.println(analisis);
    return analisis;
}
 
 public double evaluarROI() {
    // este método incluye una Simulación de cálculo de ROI
    double ingresosGenerados = presupuestoMarketing * 2.5; // Ejemplo: se generan 2.5 veces el presupuesto
    double roi = (ingresosGenerados - presupuestoMarketing) / presupuestoMarketing;
    System.out.println("El ROI de las campañas de marketing es: " + roi);
    return roi;
}
 
 public void lanzarCampañas(String nombre) {
    System.out.println("Lanzando la campaña de publicidad: " + nombre);
    System.out.println("Canales utilizados: " + canalesPublicidad);
}
    
 }