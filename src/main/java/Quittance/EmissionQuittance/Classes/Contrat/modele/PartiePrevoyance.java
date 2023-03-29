//Source file: E:\\_Abdel\\Rmawatanya\\CONVERGENCE\\MOD\\ClassesJava\\com\\rmawatanya\\convergence\\application\\oct\\metier\\modele\\PartiePrevoyance.java

package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.rmawatanya.convergence.application.prd.metier.modele.Formule;
import com.rmawatanya.convergence.application.prd.metier.modele.GarantieFormule;
import com.rmawatanya.convergence.application.prd.metier.modele.Option;
import com.rmawatanya.convergence.utile.referentiel.Franchise;
import com.rmawatanya.convergence.utile.referentiel.Medecin;
import com.rmawatanya.convergence.utile.referentiel.PeriodiciteRemboursementPret;
import com.rmawatanya.convergence.utile.referentiel.RefConvention;
import com.rmawatanya.convergence.utile.referentiel.RefDetailConvention;
import com.rmawatanya.convergence.utile.referentiel.RefProduitBanque;
import com.rmawatanya.convergence.utile.referentiel.RefTypeCredit;
import com.rmawatanya.convergence.utile.referentiel.SegmentPF;
import com.rmawatanya.convergence.utile.referentiel.TypeFractionnementPrime;
import com.rmawatanya.convergence.utile.referentiel.TypeModeFinancement;
import com.rmawatanya.convergence.utile.referentiel.TypeNaturePrime;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

public class PartiePrevoyance implements IEntite
{
   private long id;
   private Boolean delegation;
   private Double prime;
   private Double tauxPrime;
   private Double surprime;
   private Double tauxSurprime;
   private Double primeTotale;
   private Double complementPrime;
   private Double capitalRestantDu;
   
   // BMCE PREVOYANCE
   private TypeModeFinancement refTypeModeFinancement;
   private TypeNaturePrime refTypeNaturePrime;
   private PeriodiciteRemboursementPret refPeriodiciteRemboursementPret;
   private Calendar dateSuspension;
   private Calendar dateReprise;
   
   
   private Collection<PartiePrevoyanceClient> listPartiesPrevoyanceClient = new ArrayList<PartiePrevoyanceClient>();
  // private Collection refClients = new ArrayList();
  

/**
    * Date effet du contrat (ou de l'option) Pr�voyance.
    */
   private Calendar dateEffet;
   
   private Medecin refMedecinRma;
   
	/**
	 * Date effet de la modification de la garantie Pr�voyance 
	 * (si l'option a �t� chang�e).
	 */
	private Calendar dateEffetModification;
   
   /**
    * Date terme du contrat (Ou de l'option) Pr�voyance.
    */
   private Calendar dateTerme;
   
   private Calendar dateEcheance;
   
   private Calendar dateVersementPermierePrime;
   private Double capitalDegressif;
   private Integer dureePret;
   private Integer nombreMoisDiffere;
   private String etat;
   private Double revenuAnnuelAdherent;
   private Double revenuAnnuelConjoint;
   private Double dureeService;
   private Double capitalAssureMin;
   private Double capitalAssureMax;
   private Double soldeMoyen;
   
   private TypeFractionnementPrime refTypeFractionnementPrime;
   private Contrat refContrat;
   private Collection refCoassurances;
   private Option refOption;
   private Double primeTotaleEcheance;
   
   private Medecin refMedecin;

   private Integer typeFranchise;
   private Integer formule;
   private Integer tauxRembourssement;
   private Integer moyenRembourssement;
   
 	/**
  	 * taux de la taxe parafiscale
  	 */
  	private Double tauxTaxeParafiscale;
  	
  	/**
 	 * montant taxe parafiscale
 	 */
 	private Double montantTaxeParafiscale;
 	
 	private Formule refFormule; 
 	
 	private Franchise refFranchise;
 	
 	private Integer optionProtectionF;
 		
 	private SegmentPF refSegment; 	
 	
 	private Collection refGarantiesChoisies;
 	
 	private Integer dureeReport;
         /**
 	 * Convention
 	 */
 	private RefConvention refConvention;
 	private RefDetailConvention refDetailConvention;
 	private Double tauxPrimeAvecRabais;
 	private Double rabais;
 	private RefTypeCredit refTypeCredit;
 	private RefProduitBanque refProduitBanque;
 	private Collection refTypesCredit;
 	private Collection refProduitsBanque;
 	
 	public PartiePrevoyance() 
   {
    
   }
   
   /**
    * Access method for the id property.
    * 
    * @return   the current value of the id property
    */
   public long getId() 
   {
      return id;
   }
   
   /**
    * Sets the value of the id property.
    * 
    * @param aId the new value of the id property
    */
   public void setId(long aId) 
   {
      id = aId;
   }
   
   /**
    * Access method for the delegation property.
    * 
    * @return   the current value of the delegation property
    */
   public Boolean getDelegation() 
   {
      return delegation;
   }
   
   /**
    * Sets the value of the delegation property.
    * 
    * @param aDelegation the new value of the delegation property
    */
   public void setDelegation(Boolean aDelegation) 
   {
      delegation = aDelegation;
   }
   
   /**
    * Access method for the prime property.
    * 
    * @return   the current value of the prime property
    */
   public Double getPrime() 
   {
      return prime;
   }
   
   /**
    * Sets the value of the prime property.
    * 
    * @param aPrime the new value of the prime property
    */
   public void setPrime(Double aPrime) 
   {
      prime = aPrime;
   }
   
   /**
    * Access method for the surprime property.
    * 
    * @return   the current value of the surprime property
    */
   public Double getSurprime() 
   {
      return surprime;
   }
   
   /**
    * Sets the value of the surprime property.
    * 
    * @param aSurprime the new value of the surprime property
    */
   public void setSurprime(Double aSurprime) 
   {
      surprime = aSurprime;
   }
   
   
   /**
    * Access method for the primeTotale property.
    * 
    * @return   the current value of the primeTotale property
    */
   public Double getPrimeTotale() 
   {
      return primeTotale;
   }
   
   /**
    * Sets the value of the primeTotale property.
    * 
    * @param aPrimeTotale the new value of the primeTotale property
    */
   public void setPrimeTotale(Double aPrimeTotale) 
   {
      primeTotale = aPrimeTotale;
   }
   
   /**
    * Access method for the complementPrime property.
    * 
    * @return   the current value of the complementPrime property
    */
   public Double getComplementPrime() 
   {
      return complementPrime;
   }
   
   /**
    * Sets the value of the complementPrime property.
    * 
    * @param aComplementPrime the new value of the complementPrime property
    */
   public void setComplementPrime(Double aComplementPrime) 
   {
      complementPrime = aComplementPrime;
   }
   
   /**
    * Access method for the dateEffet property.
    * 
    * @return   the current value of the dateEffet property
    */
   public Calendar getDateEffet() 
   {
      return dateEffet;
   }
   
   /**
    * Sets the value of the dateEffet property.
    * 
    * @param aDateEffet the new value of the dateEffet property
    */
   public void setDateEffet(Calendar aDateEffet) 
   {
      dateEffet = aDateEffet;
   }
   
   /**
    * Access method for the dateTerme property.
    * 
    * @return   the current value of the dateTerme property
    */
   public Calendar getDateTerme() 
   {
      return dateTerme;
   }
   
   /**
    * Sets the value of the dateTerme property.
    * 
    * @param aDateTerme the new value of the dateTerme property
    */
   public void setDateTerme(Calendar aDateTerme) 
   {
      dateTerme = aDateTerme;
   }
   
   /**
    * Access method for the dateVersementPermierePrime property.
    * 
    * @return   the current value of the dateVersementPermierePrime property
    */
   public Calendar getDateVersementPermierePrime() 
   {
      return dateVersementPermierePrime;
   }
   
   /**
    * Sets the value of the dateVersementPermierePrime property.
    * 
    * @param aDateVersementPermierePrime the new value of the dateVersementPermierePrime property
    */
   public void setDateVersementPermierePrime(Calendar aDateVersementPermierePrime) 
   {
      dateVersementPermierePrime = aDateVersementPermierePrime;
   }
   
   /**
    * Access method for the capitalDegressif property.
    * 
    * @return   the current value of the capitalDegressif property
    */
   public Double getCapitalDegressif() 
   {
      return capitalDegressif;
   }
   
   /**
    * Sets the value of the capitalDegressif property.
    * 
    * @param aCapitalDegressif the new value of the capitalDegressif property
    */
   public void setCapitalDegressif(Double aCapitalDegressif) 
   {
      capitalDegressif = aCapitalDegressif;
   }
   
   /**
    * Access method for the dureePret property.
    * 
    * @return   the current value of the dureePret property
    */
   public Integer getDureePret() 
   {
      return dureePret;
   }
   
   /**
    * Sets the value of the dureePret property.
    * 
    * @param aDureePret the new value of the dureePret property
    */
   public void setDureePret(Integer aDureePret) 
   {
      dureePret = aDureePret;
   }
   
   /**
    * Access method for the nombreMoisDiffere property.
    * 
    * @return   the current value of the nombreMoisDiffere property
    */
   public Integer getNombreMoisDiffere() 
   {
      return nombreMoisDiffere;
   }
   
   /**
    * Sets the value of the nombreMoisDiffere property.
    * 
    * @param aNombreMoisDiffere the new value of the nombreMoisDiffere property
    */
   public void setNombreMoisDiffere(Integer aNombreMoisDiffere) 
   {
      nombreMoisDiffere = aNombreMoisDiffere;
   }
   
   /**
    * Access method for the etat property.
    * 
    * @return   the current value of the etat property
    */
   public String getEtat() 
   {
      return etat;
   }
   
   /**
    * Sets the value of the etat property.
    * 
    * @param aEtat the new value of the etat property
    */
   public void setEtat(String aEtat) 
   {
      etat = aEtat;
   }
   
   /**
    * Access method for the revenuAnnuelAdherent property.
    * 
    * @return   the current value of the revenuAnnuelAdherent property
    */
   public Double getRevenuAnnuelAdherent() 
   {
      return revenuAnnuelAdherent;
   }
   
   /**
    * Sets the value of the revenuAnnuelAdherent property.
    * 
    * @param aRevenuAnnuelAdherent the new value of the revenuAnnuelAdherent property
    */
   public void setRevenuAnnuelAdherent(Double aRevenuAnnuelAdherent) 
   {
      revenuAnnuelAdherent = aRevenuAnnuelAdherent;
   }
   
   /**
    * Access method for the revenuAnnuelConjoint property.
    * 
    * @return   the current value of the revenuAnnuelConjoint property
    */
   public Double getRevenuAnnuelConjoint() 
   {
      return revenuAnnuelConjoint;
   }
   
   /**
    * Sets the value of the revenuAnnuelConjoint property.
    * 
    * @param aRevenuAnnuelConjoint the new value of the revenuAnnuelConjoint property
    */
   public void setRevenuAnnuelConjoint(Double aRevenuAnnuelConjoint) 
   {
      revenuAnnuelConjoint = aRevenuAnnuelConjoint;
   }
   
   /**
    * Access method for the dureeService property.
    * 
    * @return   the current value of the dureeService property
    */
   public Double getDureeService() 
   {
      return dureeService;
   }
   
   /**
    * Sets the value of the dureeService property.
    * 
    * @param aDureeService the new value of the dureeService property
    */
   public void setDureeService(Double aDureeService) 
   {
      dureeService = aDureeService;
   }
   
   /**
    * Access method for the capitalAssureMin property.
    * 
    * @return   the current value of the capitalAssureMin property
    */
   public Double getCapitalAssureMin() 
   {
      return capitalAssureMin;
   }
   
   /**
    * Sets the value of the capitalAssureMin property.
    * 
    * @param aCapitalAssureMin the new value of the capitalAssureMin property
    */
   public void setCapitalAssureMin(Double aCapitalAssureMin) 
   {
      capitalAssureMin = aCapitalAssureMin;
   }
   
   /**
    * Access method for the capitalAssureMax property.
    * 
    * @return   the current value of the capitalAssureMax property
    */
   public Double getCapitalAssureMax() 
   {
      return capitalAssureMax;
   }
   
   /**
    * Sets the value of the capitalAssureMax property.
    * 
    * @param aCapitalAssureMax the new value of the capitalAssureMax property
    */
   public void setCapitalAssureMax(Double aCapitalAssureMax) 
   {
      capitalAssureMax = aCapitalAssureMax;
   }
 
	public Double getSoldeMoyen() {
		return soldeMoyen;
	}
	
	public void setSoldeMoyen(Double soldeMoyen) {
		this.soldeMoyen = soldeMoyen;
	}

/**
    * Access method for the refTypeFractionnementPrime property.
    * 
    * @return   the current value of the refTypeFractionnementPrime property
    */
   public TypeFractionnementPrime getRefTypeFractionnementPrime() 
   {
      return refTypeFractionnementPrime;
   }
   
   /**
    * Sets the value of the refTypeFractionnementPrime property.
    * 
    * @param aRefTypeFractionnementPrime the new value of the refTypeFractionnementPrime property
    */
   public void setRefTypeFractionnementPrime(TypeFractionnementPrime aRefTypeFractionnementPrime) 
   {
      refTypeFractionnementPrime = aRefTypeFractionnementPrime;
   }
   
   /**
    * Access method for the refContrat property.
    * 
    * @return   the current value of the refContrat property
    */
   public Contrat getRefContrat() 
   {
      return refContrat;
   }
   
   /**
    * Sets the value of the refContrat property.
    * 
    * @param aRefContrat the new value of the refContrat property
    */
   public void setRefContrat(Contrat aRefContrat) 
   {
      refContrat = aRefContrat;
   }

	/**
	 * @return Returns the refCoassurances.
	 */
	public Collection getRefCoassurances() {
		return refCoassurances;
	}
	
	/**
	 * @param refCoassurances The refCoassurances to set.
	 */
	public void setRefCoassurances(Collection refCoassurances) {
		this.refCoassurances = refCoassurances;
	}
	
   /**
    * Access method for the refOption property.
    * 
    * @return   the current value of the refOption property
    */
   public Option getRefOption() 
   {
      return refOption;
   }
   
   /**
    * Sets the value of the refOption property.
    * 
    * @param aRefOption the new value of the refOption property
    */
   public void setRefOption(Option aRefOption) 
   {
      refOption = aRefOption;
   }
   
	/* (non-Javadoc)
	 * @see ma.co.omnidata.framework.services.entites.IEntite#getFactory()
	 */
	public EntiteFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}   
	public Calendar getDateEcheance() {
		return dateEcheance;
	}
	public void setDateEcheance(Calendar dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	public Double getTauxPrime() {
		return tauxPrime;
	}

	public void setTauxPrime(Double tauxPrime) {
		this.tauxPrime = tauxPrime;
	}

	public Double getTauxSurprime() {
		return tauxSurprime;
	}

	public void setTauxSurprime(Double tauxSurprime) {
		this.tauxSurprime = tauxSurprime;
	}

	public Double getPrimeTotaleEcheance() {
		return primeTotaleEcheance;
	}

	public void setPrimeTotaleEcheance(Double primeTotaleEcheance) {
		this.primeTotaleEcheance = primeTotaleEcheance;
	}

	public Calendar getDateEffetModification() {
		return dateEffetModification;
	}

	public void setDateEffetModification(Calendar dateEffetModification) {
		this.dateEffetModification = dateEffetModification;
	}

	public TypeModeFinancement getRefTypeModeFinancement() {
		return refTypeModeFinancement;
	}

	public void setRefTypeModeFinancement(TypeModeFinancement refTypeModeFinancement) {
		this.refTypeModeFinancement = refTypeModeFinancement;
	}

	public TypeNaturePrime getRefTypeNaturePrime() {
		return refTypeNaturePrime;
	}

	public void setRefTypeNaturePrime(TypeNaturePrime refTypeNaturePrime) {
		this.refTypeNaturePrime = refTypeNaturePrime;
	}
	
	public PeriodiciteRemboursementPret getRefPeriodiciteRemboursementPret() {
		return refPeriodiciteRemboursementPret;
	}

	public void setRefPeriodiciteRemboursementPret(PeriodiciteRemboursementPret refPeriodiciteRemboursementPret) {
		this.refPeriodiciteRemboursementPret = refPeriodiciteRemboursementPret;
	}

	public Double getCapitalRestantDu() {
		return capitalRestantDu;
	}

	public void setCapitalRestantDu(Double capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}

	public Calendar getDateSuspension() {
		return dateSuspension;
	}

	public void setDateSuspension(Calendar dateSuspension) {
		this.dateSuspension = dateSuspension;
	}

	public Calendar getDateReprise() {
		return dateReprise;
	}

	public void setDateReprise(Calendar dateReprise) {
		this.dateReprise = dateReprise;
	}

	public Medecin getRefMedecin() {
		return refMedecin;
	}

	public void setRefMedecin(Medecin refMedecin) {
		this.refMedecin = refMedecin;
	}

	public Medecin getRefMedecinRma() {
		return refMedecinRma;
	}

	public void setRefMedecinRma(Medecin refMedecinRma) {
		this.refMedecinRma = refMedecinRma;
	}

	public Collection<PartiePrevoyanceClient> getListPartiesPrevoyanceClient() {
		return listPartiesPrevoyanceClient;
	}

	public void setListPartiesPrevoyanceClient(
			Collection<PartiePrevoyanceClient> listPartiesPrevoyanceClient) {
		this.listPartiesPrevoyanceClient = listPartiesPrevoyanceClient;
	}

	public Integer getTypeFranchise() {
		return typeFranchise;
	}

	public void setTypeFranchise(Integer typeFranchise) {
		this.typeFranchise = typeFranchise;
	}

	public Integer getFormule() {
		return formule;
	}

	public void setFormule(Integer formule) {
		this.formule = formule;
	}


	public Integer getMoyenRembourssement() {
		return moyenRembourssement;
	}

	public void setMoyenRembourssement(Integer moyenRembourssement) {
		this.moyenRembourssement = moyenRembourssement;
	}

	public Integer getTauxRembourssement() {
		return tauxRembourssement;
	}

	public void setTauxRembourssement(Integer tauxRembourssement) {
		this.tauxRembourssement = tauxRembourssement;
	}

	/**
	 * @return the tauxTaxeParafiscale
	 */
	public Double getTauxTaxeParafiscale() {
		return tauxTaxeParafiscale;
	}

	/**
	 * @param tauxTaxeParafiscale the tauxTaxeParafiscale to set
	 */
	public void setTauxTaxeParafiscale(Double tauxTaxeParafiscale) {
		this.tauxTaxeParafiscale = tauxTaxeParafiscale;
	}

	/**
	 * @return the montantTaxeParafiscale
	 */
	public Double getMontantTaxeParafiscale() {
		return montantTaxeParafiscale;
	}

	/**
	 * @param montantTaxeParafiscale the montantTaxeParafiscale to set
	 */
	public void setMontantTaxeParafiscale(Double montantTaxeParafiscale) {
		this.montantTaxeParafiscale = montantTaxeParafiscale;
	}


	public Franchise getRefFranchise() {
		return refFranchise;
	}

	public void setRefFranchise(Franchise refFranchise) {
		this.refFranchise = refFranchise;
	}

	public Integer getOptionProtectionF() {
		return optionProtectionF;
	}

	public void setOptionProtectionF(Integer optionProtectionF) {
		this.optionProtectionF = optionProtectionF;
	}

	public Formule getRefFormule() {
		return refFormule;
	}

	public void setRefFormule(Formule refFormule) {
		this.refFormule = refFormule;
	}
	
	public SegmentPF getRefSegment() {
		return refSegment;
	}

	public void setRefSegment(SegmentPF refSegment) {
		this.refSegment = refSegment;
	}
	
	public Collection getRefGarantiesChoisies() {
		return refGarantiesChoisies;
	}

	public void setRefGarantiesChoisies(
			Collection refGarantiesChoisies) {
		this.refGarantiesChoisies = refGarantiesChoisies;
	}
	
	public Integer getDureeReport() {
		return dureeReport;
	}

	public void setDureeReport(Integer dureeReport) {
		this.dureeReport = dureeReport;
	}
        	public RefConvention getRefConvention() {
		return refConvention;
	}

	public void setRefConvention(RefConvention refConvention) {
		this.refConvention = refConvention;
	}

	public RefDetailConvention getRefDetailConvention() {
		return refDetailConvention;
	}

	public void setRefDetailConvention(RefDetailConvention refDetailConvention) {
		this.refDetailConvention = refDetailConvention;
	}

	public Double getTauxPrimeAvecRabais() {
		return tauxPrimeAvecRabais;
	}

	public void setTauxPrimeAvecRabais(Double tauxPrimeAvecRabais) {
		this.tauxPrimeAvecRabais = tauxPrimeAvecRabais;
	}

	public Double getRabais() {
		return rabais;
	}

	public void setRabais(Double rabais) {
		this.rabais = rabais;
	}
	public RefTypeCredit getRefTypeCredit() {
		return refTypeCredit;
	}

	public void setRefTypeCredit(RefTypeCredit refTypeCredit) {
		this.refTypeCredit = refTypeCredit;
	}

	public RefProduitBanque getRefProduitBanque() {
		return refProduitBanque;
	}

	public void setRefProduitBanque(RefProduitBanque refProduitBanque) {
		this.refProduitBanque = refProduitBanque;
	}

	public Collection getRefTypesCredit() {
		return refTypesCredit;
	}

	public void setRefTypesCredit(Collection refTypesCredit) {
		this.refTypesCredit = refTypesCredit;
	}

	public Collection getRefProduitsBanque() {
		return refProduitsBanque;
	}

	public void setRefProduitsBanque(Collection refProduitsBanque) {
		this.refProduitsBanque = refProduitsBanque;
	}

}
