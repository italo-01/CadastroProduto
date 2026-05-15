package org.example;

import java.util.ArrayList;

public class Caixa {
    // Atributos
    double sacar;
    double depositar;
    double saldo;
    double extrato;

    //Constrtutor
    public Caixa(double saldo){
        this.saldo = 0;
        //this.extrato = 0;
    }

    //Metodos
    public double sacar(double sacar){
        return 0;
    }
    public double depositar(double depositar){
        return 0;
    }
    public double saldo(){
        return 0;
    }
    public ArrayList<Caixa> extrato(){
        return null;
    }
    //Metodos especiais

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }
}
