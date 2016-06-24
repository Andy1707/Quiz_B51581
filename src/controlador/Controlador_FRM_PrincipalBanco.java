/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.MetodosClientes;
import vista.FRM_PrincipalBanco;

/**
 *
 * @author Carlos
 */
public class Controlador_FRM_PrincipalBanco implements ActionListener {
    
    MetodosClientes metodosClientes;
    FRM_PrincipalBanco frm_PrincipalBanco;
    
    public Controlador_FRM_PrincipalBanco(FRM_PrincipalBanco frm_PrincipalBanco) {
        
        metodosClientes= new MetodosClientes();
        this.frm_PrincipalBanco=frm_PrincipalBanco;
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("Generar")) {
            metodosClientes.agregar(frm_PrincipalBanco.devolverInformacion());
            frm_PrincipalBanco.resetearGUI();
            frm_PrincipalBanco.generarFicha();
            frm_PrincipalBanco.mostrarLista(metodosClientes.devolverLista());
        }
        if(e.getActionCommand().equalsIgnoreCase("Llamar")) {
            if(metodosClientes.devolverInfoPrimero()!=null) {
                frm_PrincipalBanco.mostrarAtencionCliente(metodosClientes.devolverInfoPrimero());
                metodosClientes.eliminarPrimero();
            }
            else {
                frm_PrincipalBanco.resetearAtendiendo();
                JOptionPane.showMessageDialog(null,"No existen clientes en espera");
            }
        }
        if(e.getActionCommand().equalsIgnoreCase("<")) {
            metodosClientes.ordenarMenorAMayor();
            frm_PrincipalBanco.mostrarLista(metodosClientes.devolverLista());
        }
        if(e.getActionCommand().equalsIgnoreCase(">")) {
            metodosClientes.ordenarMayorAMenor();
            frm_PrincipalBanco.mostrarLista(metodosClientes.devolverLista());
        }
        if(e.getActionCommand().equalsIgnoreCase("Cajas")) {
            frm_PrincipalBanco.definirServicio("Cajas");
        }
        if(e.getActionCommand().equalsIgnoreCase("ServicioCliente")) {
            frm_PrincipalBanco.definirServicio("Servicio al cliente");
        }
        if(e.getActionCommand().equalsIgnoreCase("Normal")) {
            frm_PrincipalBanco.definirPrioridad("Normal");
        }
        if(e.getActionCommand().equalsIgnoreCase("7600")) {
            frm_PrincipalBanco.definirPrioridad("7600");
        }
    }
}
