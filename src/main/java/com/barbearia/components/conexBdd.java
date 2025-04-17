package com.barbearia.components;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            String query="create table "+table_name+"(servico varchar(200),valor double precision);";
            //String query = "DROP TABLE IF EXISTS "+table_name;
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("tabela criada");
        }catch(Exception e){
            System.out.print(e);
        }
    }
        public void cadService(Connection conn,String table_name, String servico, double valor ){
            try{
                String query = "insert into "+table_name+" values(?, ?)";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1,servico);
                stmt.setDouble(2,valor);
                stmt.executeUpdate( );
                System.out.println("Dado salvo com sucesso!!");
                
            }catch(Exception e){ System.out.println(e);}
    }
      public void consultarDados(Connection conn, String nome_Tabela){
            Statement statement;
            try{
            statement = conn.createStatement();
            String sql = "SELECT * FROM "+nome_Tabela;
            ResultSet rs = statement.executeQuery(sql);
            
            if(!rs.next()){}else{
            String servico = rs.getString("servico");
            System.out.println(servico);}
            
            do{
            }while(rs.next());
            
            }catch(Exception e){    
                System.out.println(e);
            }}

}


