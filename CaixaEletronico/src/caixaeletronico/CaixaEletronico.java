/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caixaeletronico;

import entidade.Cliente;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class CaixaEletronico {
 
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
// foi colocado outro scanner devido um problema no nextline do String name 
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Para cadastrar uma conta siga os passos abaixo ");
        System.out.println("");
        System.out.print("Insira o numero da conta: ");
        double conta = sc.nextDouble();
        System.out.print("Insira o nome do titular da conta: ");
        String nome = input.nextLine();
        Cliente cliente = new Cliente(conta, nome);
        System.out.print("Quer fazer um deposito inicial (y/n)?");
        String resposta = input.nextLine();
        System.out.println("");
        if ("y".equals(resposta)) {
            System.out.print("Digite o valor do deposito:");
            double deposito = input.nextDouble();
            cliente.deposito(deposito);
            System.out.println("");
        } else {
        }
        System.out.println(cliente);
        System.out.println("");
       
        String resposta1 = "";
        String controlador = "";
        
         System.out.print("Quer continuar com a operção 's' para sim 'n' para não:");
        do {   //perguntando oque o usuario quer fazer no programa.

            resposta1 = sc.nextLine();

            if (null != resposta1) {

                switch (resposta1) {
                    case "s" -> {
                        System.out.print("Para depositar digite '1' para sacar digite '2':");
                        int escolha = sc.nextInt();
                    switch (escolha) {
                        case 1:
                            {
                                System.out.print("Digite o valor do deposito:");
                                double deposito = input.nextDouble();
                                cliente.deposito(deposito);
                                System.out.println(cliente);
                                System.out.println("");
                                System.out.print("Quer continuar com a operção 's' para sim 'n' para não: ");
                                System.out.println("");
                                break;
                            }
                        case 2:
                            {
                                System.out.print("Digite o valor do saque :");
                                double deposito = input.nextDouble();
                                cliente.saquesaldo(deposito);
                                System.out.println(cliente);
                                System.out.print("Quer continuar com a operção 's' para sim 'n' para não: ");
                                break;
                            }
                        default:
                            System.out.println("opção invalida");
                            System.out.println("");
                            break;
                    }
                      
                        break;
                    }
                    case "n" -> {
                        controlador=resposta1;
                        System.out.println(cliente);

                    }
                   
                }
            }
        } while ("".equals(controlador));{
    } 
        
        sc.close();
        input.close();
        
    }
}
