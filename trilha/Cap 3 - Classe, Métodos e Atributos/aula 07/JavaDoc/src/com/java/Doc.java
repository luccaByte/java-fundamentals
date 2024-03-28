package com.java;
//      Utilizando a estrutura do banco para exemplificação

public class Doc {
    /**
     * Classe que abstrai uma Conta Bancária
     * @author Lucas Gonçalves
     * @version 1.0
    */

	/**
	 * Número da Conta
	*/
	public int numero;
	/**
	 * Número da Agencia
	*/
	public int agencia;
	/**
	 * Saldo da Conta
	*/
	public double saldo;

	public Doc(){}

	public Doc(int numero, int agencia, double saldo){
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	/**
	 * Deposita um valor ao saldo da conta
	 * @param valor Valor a ser depositado
	*/
	public void depositar(double valor){
		saldo = saldo + valor;
	}

	/**
	 * Retira um valor do saldo da conta
	 * @param valor Valor a ser retirado
	*/
	public void retirar(double valor){
		saldo = saldo - valor;
	}

	/**
	 * Verifica o saldo da conta
	 * @return Valor do saldo da conta
	*/
	public double verificarSaldo(){
		return saldo;
	}
}


