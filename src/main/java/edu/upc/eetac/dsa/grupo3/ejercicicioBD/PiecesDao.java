package edu.upc.eetac.dsa.grupo3.ejercicicioBD;
import java.util.List; //importante para que coja la lista

public interface PiecesDao {
	 public List<Pieces> getAllName();
	 public Pieces getPieces(int code);
	 
}
