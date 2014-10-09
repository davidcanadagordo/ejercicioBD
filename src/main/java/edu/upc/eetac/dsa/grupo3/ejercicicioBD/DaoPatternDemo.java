package edu.upc.eetac.dsa.grupo3.ejercicicioBD;

//import java.util.List;

public class DaoPatternDemo {
	public static void main(String[] args) {
	      PiecesDao piecesDao = new PiecesDaoImpl();
	      
	     

	//print all codes
	      for (Pieces pieces : piecesDao.getAllName()) {
	          System.out.println("Pieces: [code : "
	             +pieces.getCode()+", Name : "+pieces.getName()+" ]"); 
	          
	     
	      }
	
	    //get the pieces
	      Pieces prova = piecesDao.getPieces(0); //guardamos el piece en prova
	      
		System.out.println("Pieces: [code : "
	      +prova.getCode()+", Name : "+prova.getName()+" ]");	
}
	
}