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
public class ClienteCredito extends Cliente{

    public ClienteCredito(String nombre, double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    @Override
    protected Pedido creaPedido(double monto) {
        
        Pedido pedidoCredito = new PedidoCredito(monto);
        
        System.out.println("Pedido a credito creado, monto: $"+monto);
        
        return pedidoCredito;
    }  
    
}
