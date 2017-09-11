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
public class ClienteContado extends Cliente{

    public ClienteContado(String nombre, double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    @Override
    protected Pedido creaPedido(double monto) {
        
        Pedido pedidoContado = new PedidoContado(monto);
        
        System.out.println("Pedido a contado creado, monto: $"+monto);
        
        return pedidoContado;
    }
    
}
