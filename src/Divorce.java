import java.io.Serializable;
import java.util.*;

public class Divorce implements Serializable{
	
	//Attributs de la classe Divorce
    public Date dateDivorce;
    
    //Constructeur de la classe Divorce
    public Divorce(Date date) {	
    	dateDivorce = date;				//applique une date au divorce
    }
}