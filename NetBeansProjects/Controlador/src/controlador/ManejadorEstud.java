/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author estudiante
 */
import vista.VentanaPrincipal;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ManejadorEstud implements ActionListener {
    private final VentanaPrincipal ventanaPrin;
    
    public ManejadorEstud(VentanaPrincipal miVentanaPrinc)
    {
        ventanaPrin=miVentanaPrinc;
    }
    public void actionPerformed(ActionEvent evento)
    {
        if(evento.getActionCommand().equals("Agregar"))
        {
            ventanaPrin.agregar();
        }
        if(evento.getActionCommand().equals("Modificar"))
        {
            ventanaPrin.modificar();
        }
        if(evento.getActionCommand().equals("Eliminar"))
        {
            ventanaPrin.eliminar();
        }
        if(evento.getActionCommand().equals("Buscar"))
        {
            ventanaPrin.buscar();
        }
        
    }
    
}
