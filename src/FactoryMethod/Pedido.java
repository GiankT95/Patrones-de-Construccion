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
public abstract class Pedido {
    
    protected double montoPedido;
    
    public abstract boolean valida(Cliente cliente);
    public abstract void paga();

    public double getMontoPedido() {
        return montoPedido;
    }

    public void setMontoPedido(double montoPedido) {
        this.montoPedido = montoPedido;
    }
   
}
