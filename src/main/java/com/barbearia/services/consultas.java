package com.barbearia.services;
import com.barbearia.components.*;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MARKETING
 */
public class consultas {
    menu menu = new menu();
    Scanner scanner = new Scanner(System.in);
    
    //Faz Consulta de nomes de clientes no Banco de Dados
    public void consultaCliente(){
        
    }
    
    //Faz consulta do valor dos serviços no Banco de dados
    public double consultaServiço(){
        System.out.println("Selecione o Serviço ");
        menu.menuServices();
        int opc = scanner.nextInt();
        
        double total = 0.00;
        return total;
    }
    
}
