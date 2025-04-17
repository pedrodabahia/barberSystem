package com.barbearia.components;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**postgresql://admin_matos:ZcVWqMvD307RuvUdbtB8czUGpI4kWPUE@dpg-d00lftre5dus73c2iqb0-a/barberdb_chka
 *
 * @author MARKETING
 */
public class conexBdd {
    public Connection connect_to_db(String user, String pass){
        Connection conn=null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://dpg-d00lftre5dus73c2iqb0-a.ohio-postgres.render.com:5432/barberdb_chka?user=admin_matos&password=ZcVWqMvD307RuvUdbtB8czUGpI4kWPUE&ssl=true&sslmode=require");
            if(conn!=null){
                System.out.print("conexão concluida ------------------------");
            }else{
                System.out.println("Conexão falhou ---------------------------");
            }
        }catch(Exception e){
            System.out.println(e); 
            System.out.append("deu muito errado");
        }
        return conn;
    }
    
    public void criarTabela(Connection conn, String table_name){
        Statement statement;
        try{
            String query="create table "+table_name+"(empid SERIAL ,servico varchar(200),valor double precision,primary key(empid));";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("tabela criada");
        }catch(Exception e){
            System.out.print(e);
        }
    }
        public void cadService(Connection conn,String table_name, String servico, double valor ){
            Statement statement;
            try{
                String query = String.format("insert into %s(servico,valor) values('%s', '$s')",table_name,servico,valor);
                statement=conn.createStatement();
                statement.executeUpdate(query);
                
                
            }catch(Exception e){ System.out.println(e);}
    }
        public void consultarDados(Connection conn, String nome_Tabela){
            Statement statement;
            try{
            statement = conn.createStatement();
            String sql = "SELECT * FROM"+nome_Tabela;
            statement.executeQuery(sql);
            }catch(Exception e){    
                System.out.println(e);
            }}

}


