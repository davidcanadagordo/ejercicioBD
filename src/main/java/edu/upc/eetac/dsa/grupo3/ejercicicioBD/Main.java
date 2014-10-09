package edu.upc.eetac.dsa.grupo3.ejercicicioBD;



public class Main {
  public static void main(String[] args) throws Exception {
	  MySqlAccess dao = new MySqlAccess();
    dao.readDataBase();
  }


} 