/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class MetodosClientes {
    
    NodoCliente primero;

    public MetodosClientes() {
        
        primero=null;
    }
    
    public String devolverLista() {
        
        NodoCliente auxiliar=primero;
        String valores="Lista:\n\n";
        
        while(auxiliar!=null) {
            
            valores+=auxiliar.getFicha()+"\n"+auxiliar.getNombre()+"\n"+auxiliar.getEdad()+"\n"+
                     auxiliar.getServicio()+"\n"+auxiliar.getPrioridad()+"\n\n";
            
            auxiliar=auxiliar.getSiguiente();
        }
        
        return valores;
    }
    public String devolverInfoPrimero() {
        
        if(primero!=null) {
            String atendiendo="Atendiendo a:\n\n";
        
            atendiendo+=primero.getFicha()+"\n"+primero.getNombre()+"\n"+primero.getEdad()+"\n"+
                        primero.getServicio()+"\n"+primero.getPrioridad()+"\n\n";
        
            return atendiendo;
        }
        else {
            return null;
        }
    }
    public void agregar(String arreglo[]) {
        
        NodoCliente auxiliar;
        
        if(arreglo[4].equalsIgnoreCase("7600")) {
            auxiliar= new NodoCliente(arreglo[0],arreglo[1],arreglo[2],arreglo[3],arreglo[4]);
            auxiliar.setSiguiente(primero);
            primero=auxiliar;
        }
        else {
            if(primero!=null) {
                auxiliar= devolverUltimo();
                auxiliar.setSiguiente(new NodoCliente(arreglo[0],arreglo[1],arreglo[2],arreglo[3],arreglo[4]));
            }
            else {
                auxiliar= new NodoCliente(arreglo[0],arreglo[1],arreglo[2],arreglo[3],arreglo[4]);
                auxiliar.setSiguiente(primero);
                primero=auxiliar;
            }
        }
    }
    public NodoCliente devolverUltimo() {
        
        NodoCliente auxiliar=primero;
        while(auxiliar.getSiguiente()!=null) {
            auxiliar=auxiliar.getSiguiente();
        }
        return auxiliar;
    }
    public void eliminarPrimero() {
        if(primero!=null)
            primero=primero.getSiguiente();
    }
    public void ordenarMenorAMayor() {
        
        int cantidadNodos=devolverCantidadNodos();
        String fichaTemporal,nombreTemporal,edadTemporal,servicioTemporal,prioridadTemporal;
        NodoCliente auxiliar;
        
        for(int contador=0;contador<cantidadNodos;contador++) {
            
            auxiliar=primero;
            while(auxiliar.getSiguiente()!=null) {
                
                if(Integer.parseInt(auxiliar.getEdad())>Integer.parseInt(auxiliar.getSiguiente().getEdad())) {
                    
                    fichaTemporal=auxiliar.getFicha();
                    nombreTemporal=auxiliar.getNombre();
                    edadTemporal=auxiliar.getEdad();
                    servicioTemporal=auxiliar.getServicio();
                    prioridadTemporal=auxiliar.getPrioridad();
                    
                    auxiliar.setFicha(auxiliar.getSiguiente().getFicha());
                    auxiliar.setNombre(auxiliar.getSiguiente().getNombre());
                    auxiliar.setEdad(auxiliar.getSiguiente().getEdad());
                    auxiliar.setServicio(auxiliar.getSiguiente().getServicio());
                    auxiliar.setPrioridad(auxiliar.getSiguiente().getPrioridad());
                    
                    auxiliar.getSiguiente().setFicha(fichaTemporal);
                    auxiliar.getSiguiente().setNombre(nombreTemporal);
                    auxiliar.getSiguiente().setEdad(edadTemporal);
                    auxiliar.getSiguiente().setServicio(servicioTemporal);
                    auxiliar.getSiguiente().setPrioridad(prioridadTemporal);
                }
                auxiliar=auxiliar.getSiguiente();
            }
        }
    }
    public void ordenarMayorAMenor() {
        
        int cantidadNodos=devolverCantidadNodos();
        String fichaTemporal,nombreTemporal,edadTemporal,servicioTemporal,prioridadTemporal;
        NodoCliente auxiliar;
        
        for(int contador=0;contador<cantidadNodos;contador++) {
            
            auxiliar=primero;
            while(auxiliar.getSiguiente()!=null) {
                
                if(Integer.parseInt(auxiliar.getEdad())<Integer.parseInt(auxiliar.getSiguiente().getEdad())) {
                    
                    fichaTemporal=auxiliar.getFicha();
                    nombreTemporal=auxiliar.getNombre();
                    edadTemporal=auxiliar.getEdad();
                    servicioTemporal=auxiliar.getServicio();
                    prioridadTemporal=auxiliar.getPrioridad();
                    
                    auxiliar.setFicha(auxiliar.getSiguiente().getFicha());
                    auxiliar.setNombre(auxiliar.getSiguiente().getNombre());
                    auxiliar.setEdad(auxiliar.getSiguiente().getEdad());
                    auxiliar.setServicio(auxiliar.getSiguiente().getServicio());
                    auxiliar.setPrioridad(auxiliar.getSiguiente().getPrioridad());
                    
                    auxiliar.getSiguiente().setFicha(fichaTemporal);
                    auxiliar.getSiguiente().setNombre(nombreTemporal);
                    auxiliar.getSiguiente().setEdad(edadTemporal);
                    auxiliar.getSiguiente().setServicio(servicioTemporal);
                    auxiliar.getSiguiente().setPrioridad(prioridadTemporal);
                }
                auxiliar=auxiliar.getSiguiente();
            }
        }
    }
    public int devolverCantidadNodos() {
        
        int contador=1;
        NodoCliente auxiliar=primero;
        while(auxiliar.getSiguiente()!=null)
        {
            contador++;
            auxiliar=auxiliar.getSiguiente();
        }
        
        return contador;
    }
}
