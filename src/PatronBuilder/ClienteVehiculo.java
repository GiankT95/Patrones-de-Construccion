/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbuilder;

/**
 *
 * @author Fuller 101
 */
public class ClienteVehiculo {
    
    private String nombre;
    ConstructorDocumentacionVehiculo constructor;
    
    public ClienteVehiculo(String nombre){
        this.nombre = nombre;
    }
    
   public void pedirDocumentacion(Vendedor vendedor, String tipo){
       
       
       if(tipo.equals("html")){
           constructor = new ConstructorDocumentacionVehiculoHtml();
           System.out.println("Cliente: "+this.nombre);
           vendedor.construye(constructor);
           System.out.println("-----------------------");
       }
       
       if(tipo.equals("pdf")){
           constructor = new ConstructorDocumentacionVehiculoPdf();
           System.out.println("Cliente: "+this.nombre);
           vendedor.construye(constructor);
           System.out.println("-----------------------");
       }
       
   } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ConstructorDocumentacionVehiculo getConstructor() {
        return constructor;
    }

    public void setConstructor(ConstructorDocumentacionVehiculo constructor) {
        this.constructor = constructor;
    }
   
   
    
}
