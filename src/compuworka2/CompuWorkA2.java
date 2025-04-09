/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package compuworka2;

import compuworka2.CapaPresentacion.IniciarSesion;
import compuworka2.CapaPresentacion.VentanaPrincipal;



public class CompuWorkA2 {

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        IniciarSesion sesion = new IniciarSesion(ventana, true);
        sesion.setVisible(true);
        //ventana.setVisible(true);
    }
}