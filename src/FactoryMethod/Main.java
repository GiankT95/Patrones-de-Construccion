/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente1 = new ClienteContado("Juan", 500000);
        Cliente cliente2 = new ClienteCredito("Mario", 200000);
        
        cliente1.nuevoPedido(250000);
        cliente2.nuevoPedido(50000);
        cliente1.nuevoPedido(510000);
        
    }
    
}
