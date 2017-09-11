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
public abstract class Cliente {
    
    protected String nombre;
    protected double saldo;
    
    public void nuevoPedido(double montoPedido){
        
        System.out.println("Cliente: "+nombre+"     Saldo: $"+saldo);
        
        Pedido pedido = creaPedido(montoPedido);
        
        if(pedido.valida(this)){
            pedido.paga();
        }
        
        System.out.println("-----------------------------------------------------------------");
        
    }
    
    protected abstract Pedido creaPedido(double monto);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
