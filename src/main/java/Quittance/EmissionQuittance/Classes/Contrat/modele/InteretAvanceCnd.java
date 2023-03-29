//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\oct\\metier\\modele\\PrimePersonnel.java

package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.Calendar;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class InteretAvanceCnd implements IEntite
{
   private long id;
   
   /**
    * 0 : taux, 1 : montant
    */
   private Calendar  dateDebut;
   private Calendar  dateFin;
   private Double majoration;
   private ConditionPreferentielle refConditionPreferentielle;
 
   



public InteretAvanceCnd() 
   {
    
   }
   
  
   
	public long getId() {
	return id;
}



public void setId(long id) {
	this.id = id;
}





public EntiteFactory getFactory() {
	// TODO Auto-generated method stub
	return null;
}



public Calendar getDateDebut() {
	return dateDebut;
}



public void setDateDebut(Calendar dateDebut) {
	this.dateDebut = dateDebut;
}



public Calendar getDateFin() {
	return dateFin;
}



public void setDateFin(Calendar dateFin) {
	this.dateFin = dateFin;
}




public ConditionPreferentielle getRefConditionPreferentielle() {
	return refConditionPreferentielle;
}



public void setRefConditionPreferentielle(
		ConditionPreferentielle refConditionPreferentielle) {
	this.refConditionPreferentielle = refConditionPreferentielle;
}




public Double getMajoration() {
	return majoration;
}



public void setMajoration(Double majoration) {
	this.majoration = majoration;
}



}
