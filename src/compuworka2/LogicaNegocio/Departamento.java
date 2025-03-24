/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuworka2.LogicaNegocio;

/**
 *
 * @author caralvarezrob01
 */

import java.util.ArrayList;
import java.util.List;


public abstract class Departamento {
    private int cantEmpleadosFijos;
    private int cantEmpleadosTemp;
    private Double presupuestoDepto;
    private String subDeptos;
    private String metasDepto;
    
    
    private List<Empleado> empleados;
    
    //constructor

    public Departamento(int cantEmpleadosFijos, int cantEmpleadosTemp, Double presupuestoDepto, String subDeptos, String metasDepto) {
        this.cantEmpleadosFijos = cantEmpleadosFijos;
        this.cantEmpleadosTemp = cantEmpleadosTemp;
        this.presupuestoDepto = presupuestoDepto;
        this.subDeptos = subDeptos;
        this.metasDepto = metasDepto;
        this.empleados = new ArrayList<>();
    }
    
    public boolean agregarEmpleado(Empleado empleado) {
        return empleados.add(empleado);
    }
    
    public void listarEmpleados() {
        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre() + ", Cargo: " + e.getCargo());
        }
    }

    public int getCantEmpleadosFijos() {
        return cantEmpleadosFijos;
    }

    public void setCantEmpleadosFijos(int cantEmpleadosFijos) {
        this.cantEmpleadosFijos = cantEmpleadosFijos;
    }

    public int getCantEmpleadosTemp() {
        return cantEmpleadosTemp;
    }

    public void setCantEmpleadosTemp(int cantEmpleadosTemp) {
        this.cantEmpleadosTemp = cantEmpleadosTemp;
    }

    public Double getPresupuestoDepto() {
        return presupuestoDepto;
    }

    public void setPresupuestoDepto(Double presupuestoDepto) {
        this.presupuestoDepto = presupuestoDepto;
    }

    public String getSubDeptos() {
        return subDeptos;
    }

    public void setSubDeptos(String subDeptos) {
        this.subDeptos = subDeptos;
    }

    public String getMetasDepto() {
        return metasDepto;
    }

    public void setMetasDepto(String metasDepto) {
        this.metasDepto = metasDepto;
        
    }
    
    public List<Empleado> getEmpleados() {
    return empleados;
}
    
    //otros metodos
    
    public boolean crearEmpleado(Empleado empleado) {
    return this.empleados.add(empleado);
}
    
    private int buscarIndiceEmpleado(long idEmpleado) {
    for (int i = 0; i < this.empleados.size(); i++) {
        Empleado e = this.empleados.get(i);
        if (e.getIdEmpleado() == idEmpleado) {
            return i; 
        }
    }
    return -1; 
}

  public boolean modificarEmpleado(long idEmpleado, String nuevoNombre, String nuevoCargo) {
    int index = buscarIndiceEmpleado(idEmpleado);
    if (index != -1) {
        Empleado e = this.empleados.get(index);
        e.setNombre(nuevoNombre);
        e.setCargo(nuevoCargo);
        return true;
    }
    return false;
}
  
  public boolean eliminarEmpleado(long idEmpleado) {
    int index = buscarIndiceEmpleado(idEmpleado);
    if (index != -1) {
        this.empleados.remove(index);
        return true;
    }
    return false;
}
  
  public Double calcularSalario(long idEmpleado) {
    int index = buscarIndiceEmpleado(idEmpleado);
    if (index != -1) {
        Empleado e = this.empleados.get(index);
        return e.getSalario(); 
    }
    return null; 
}
  
  public boolean actualizarDatos(long idEmpleado, String nuevoNombre, String nuevoTelefono, String nuevaDireccion, String nuevoCargo, Double nuevoSalario) {
    int index = buscarIndiceEmpleado(idEmpleado);
    if (index != -1) {
        Empleado empleado = this.empleados.get(index);
        
        if (nuevoNombre != null) {
            empleado.setNombre(nuevoNombre);
        }
        if (nuevoTelefono != null) {
            empleado.setTelefono(nuevoTelefono);
        }
        if (nuevaDireccion != null) {
            empleado.setDireccion(nuevaDireccion);
        }
        if (nuevoCargo != null) {
            empleado.setCargo(nuevoCargo);
        }
        if (nuevoSalario != null) {
            empleado.setSalario(nuevoSalario);
        }
        return true; 
    }
    return false; 
}
  
  public String mostrarReporteEmpleado(long idEmpleado) {
    int index = buscarIndiceEmpleado(idEmpleado);
    if (index != -1) {
        Empleado e = this.empleados.get(index);
        return e.generarReporteDesempeno(); 
    }
    return "Empleado no encontrado.";
}
  
  public Double calcularHorasExtra(long idEmpleado, int horasExtras, double valorHoraExtra) {
    if (buscarIndiceEmpleado(idEmpleado) != -1) {
        return horasExtras * valorHoraExtra;
    }
    return null; 
}
  
  public void asignarEmpleado(Empleado empleado) {
    try {
        if (empleado == null) {
            throw new NullPointerException("No se puede asignar un empleado nulo al departamento.");
        }
        
        System.out.println("Empleado " + empleado.getNombre() + " asignado exitosamente.");
    } catch (NullPointerException e) {
        System.out.println("Error al asignar empleado: " + e.getMessage());
    }
}
 
  
}