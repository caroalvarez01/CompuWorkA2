/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworka2.LogicaNegocio;

/**
 *
 * @author caralvarezrob01
 */

 public class Tecnologia extends Departamento{
    private int numDesarrolladores;
    private int numProyectosActivos;
    private String tecnologiasUsadas;
    private String infraestructuraTI;
    private String responsableTecnologia;
    
    
    //constructor

    public Tecnologia(int numDesarrolladores, int numProyectosActivos, String tecnologiasUsadas, String infraestructuraTI, String responsableTecnologia, int cantEmpleadosFijos, int cantEmpleadosTemp, Double presupuestoDepto, String subDeptos, String metasDepto) {
        super(cantEmpleadosFijos, cantEmpleadosTemp, presupuestoDepto, subDeptos, metasDepto);
        this.numDesarrolladores = numDesarrolladores;
        this.numProyectosActivos = numProyectosActivos;
        this.tecnologiasUsadas = tecnologiasUsadas;
        this.infraestructuraTI = infraestructuraTI;
        this.responsableTecnologia = responsableTecnologia;
    }

    public int getNumDesarrolladores() {
        return numDesarrolladores;
    }

    public void setNumDesarrolladores(int numDesarrolladores) {
        this.numDesarrolladores = numDesarrolladores;
    }

    public int getNumProyectosActivos() {
        return numProyectosActivos;
    }

    public void setNumProyectosActivos(int numProyectosActivos) {
        this.numProyectosActivos = numProyectosActivos;
    }

    public String getTecnologiasUsadas() {
        return tecnologiasUsadas;
    }

    public void setTecnologiasUsadas(String tecnologiasUsadas) {
        this.tecnologiasUsadas = tecnologiasUsadas;
    }

    public String getInfraestructuraTI() {
        return infraestructuraTI;
    }

    public void setInfraestructuraTI(String infraestructuraTI) {
        this.infraestructuraTI = infraestructuraTI;
    }

    public String getResponsableTecnologia() {
        return responsableTecnologia;
    }

    public void setResponsableTecnologia(String responsableTecnologia) {
        this.responsableTecnologia = responsableTecnologia;
    }
    
    public void desarrollarSoftware() {
        System.out.println("El equipo de tecnología está desarrollando otro nuevo software");
        numProyectosActivos++;
    }
    
    public void administrarServidores() {
        System.out.println("Administrando y monitoreando los servidores de la infraestructura TI...");
    }
    
    public void realizarBackup() {
        System.out.println("Realizando copia de seguridad de todos los datos importantes...");
    }
    
    public boolean desplegarSistema(String sistema) {
        System.out.println("Desplegando el sistema: " + sistema);
       
        return true;
 }
    
}
    