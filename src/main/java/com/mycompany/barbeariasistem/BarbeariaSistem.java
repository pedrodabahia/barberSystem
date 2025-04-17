/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.barbeariasistem;
import com.barbearia.components.conexBdd;
import com.barbearia.components.*;
import java.sql.Connection;
/**
 *
 * @author MARKETING
 */
public class BarbeariaSistem {

    public static void main(String[] args) {
         conexBdd db = new conexBdd();
         Connection conn=db.connect_to_db("admin_matos", "ZcVWqMvD307RuvUdbtB8czUGpI4kWPUE");
         //db.criarTabela(conn, "services");
         db.cadService(conn, "services", "corte+sombrancelha", 35.00);
    } 
}
