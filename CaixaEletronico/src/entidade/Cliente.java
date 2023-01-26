/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author Mateus Ferraz
 */
public class Cliente {
    private double saldo;
    private double conta;
    private String nome;
    private double deposito;
    
    public Cliente() {

    }
    
    public Cliente(double conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }
    public Cliente(double conta, String nome, double deposito) {
        this.conta = conta;
        this.nome = nome;
        this.deposito = deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getConta() {
        return conta;
    }
    public void setConta(double conta){
        this.conta=conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDeposito() {
        return deposito;
    }

     public void deposito(double deposito){
    this.deposito+=deposito;  
    }

     public void saquesaldo(double deposito){
         //foi colocado o sinal de mais para da a subtração melhor escola até o momento
    this.deposito-=deposito+5.00; 
     }
     
    public String toString() {
       return String.format("número da conta: %.0f ", conta) + " nome do usuário: "+nome+ String.format(" Saldo da conta : R$ %.2f",deposito);
    
        
    }
    
}
