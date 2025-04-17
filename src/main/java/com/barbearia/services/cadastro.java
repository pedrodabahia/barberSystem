package com.barbearia.services;

import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro Matos
 */
public class cadastro {
    Scanner scanner = new Scanner(System.in);
    
    //Cadastrar cliente
    public void cadCliente(){
     System.out.println("Nome do cliente: ");
     String serviço = scanner.next();
     
    }
    
    //Cadastrar Serviço
    public void cadService(){
     System.out.println("Serviço: ");
     String serviço = scanner.next();
     
     System.out.println("Valor do Serviço: ");
     double valor = scanner.nextDouble(); 
    }
}
