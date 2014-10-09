package edu.upc.eetac.dsa.grupo3.ejercicicioBD;
import java.util.ArrayList;
import java.util.List;

public class PiecesDaoImpl implements PiecesDao{
	List<Pieces> pieces; //lista
	
	public PiecesDaoImpl(){
	pieces = new ArrayList<Pieces>();
	Pieces pieces1 = new Pieces("abab",0);
    Pieces pieces2 = new Pieces("cdcd",1);
    pieces.add(pieces1);
    pieces.add(pieces2);	
	}
	//@Override
	   public List<Pieces> getAllName() {
		      return pieces;
		   }
	//@Override
	   public Pieces getPieces(int code) {
		      return pieces.get(code);
		   }
	
}
