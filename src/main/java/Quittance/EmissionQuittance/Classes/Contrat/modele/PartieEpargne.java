package Quittance.EmissionQuittance.Classes.Contrat.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import ma.co.omnidata.framework.services.entites.EntiteFactory;
import ma.co.omnidata.framework.services.entites.IEntite;

import com.rmawatanya.convergence.utile.referentiel.TypePeriodiciteCotisation;

public class PartieEpargne implements IEntite {
	private long id;

	private Double versementInitial;

	private Calendar dateVersementInitial;

	private Boolean nantissement;

	private Boolean deductibilite;

	/**
	 * Le contrat est adoss� � un cr�dit infine
	 */
	private Boolean creditInfine;

	private Double cotisation;

	private Calendar dateVersementPermiereCotisation;

	/**
	 * Date effet du contrat (ou de l'option) Epargne.
	 */
	private Calendar dateEffet;
	
	
	/**
	 * Date effet de la modification de la garantie Epargne 
	 * (si la cotisation ou la p�riodicit� a �t� chang�e).
	 */
	private Calendar dateEffetModification;

	/**
	 * Date terme du contrat (ou de l'option) Epargne.
	 */
	private Calendar dateTerme;

	private Integer dureeContrat;

	private Calendar dateSuspension;

	private Calendar dateReprise;

	private String etat;

	private Collection refVersementsExceptionnels = new ArrayList();
	
	// said partie UC
	private Collection refDemandeArbitrages;
	
	private Contrat refContrat;
	
	private PartieEpargne refPartieEpargnePrincipale;

	private TypePeriodiciteCotisation refTypePeriodiciteCotisation;

	private Calendar dateEcheance;

	//fadili le 11/10/2007
	private Double salaire;
	private Double cotisationPartPatronale;
	private Double cotisationPartSalariale;
	private Double tauxPartPatronale;
	private Double tauxPartSalariale;
	private Double montantCreance;
	private String organismeCreancier;
	// uc 
	private Collection refRepartitionSupports;
	private Calendar dateDernierPrelevementGarantiePlanche ;
    
	//Produits Dist
	private Double montantNantissement;
    private String modeAttributionPB ;
    private Double capitalGaranti;
    private Double tauxDePrime;
    private Integer option;
	private String modeMontantDistribution;
	private Double pourcentageMontantDistribution;
	private Double montantMaxDistribution;
	

	public Calendar getDateDernierPrelevementGarantiePlanche() {
		return dateDernierPrelevementGarantiePlanche;
	}

	public void setDateDernierPrelevementGarantiePlanche(
			Calendar dateDernierPrelevementGarantiePlanche) {
		this.dateDernierPrelevementGarantiePlanche = dateDernierPrelevementGarantiePlanche;
	}

	public PartieEpargne() {

	}

	/**
	 * Access method for the id property.
	 * 
	 * @return the current value of the id property
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param aId
	 *            the new value of the id property
	 */
	public void setId(long aId) {
		id = aId;
	}

	/**
	 * Access method for the versementInitial property.
	 * 
	 * @return the current value of the versementInitial property
	 */
	public Double getVersementInitial() {
		return versementInitial;
	}

	/**
	 * Sets the value of the versementInitial property.
	 * 
	 * @param aVersementInitial
	 *            the new value of the versementInitial property
	 */
	public void setVersementInitial(Double aVersementInitial) {
		versementInitial = aVersementInitial;
	}

	/**
	 * Access method for the dateVersementInitial property.
	 * 
	 * @return the current value of the dateVersementInitial property
	 */
	public Calendar getDateVersementInitial() {
		return dateVersementInitial;
	}

	/**
	 * Sets the value of the dateVersementInitial property.
	 * 
	 * @param aDateVersementInitial
	 *            the new value of the dateVersementInitial property
	 */
	public void setDateVersementInitial(Calendar aDateVersementInitial) {
		dateVersementInitial = aDateVersementInitial;
	}

	/**
	 * Access method for the nantissement property.
	 * 
	 * @return the current value of the nantissement property
	 */
	public Boolean getNantissement() {
		return nantissement;
	}

	/**
	 * Sets the value of the nantissement property.
	 * 
	 * @param aNantissement
	 *            the new value of the nantissement property
	 */
	public void setNantissement(Boolean aNantissement) {
		nantissement = aNantissement;
	}

	/**
	 * Access method for the deductibilite property.
	 * 
	 * @return the current value of the deductibilite property
	 */
	public Boolean getDeductibilite() {
		return deductibilite;
	}

	/**
	 * Sets the value of the deductibilite property.
	 * 
	 * @param aDeductibilite
	 *            the new value of the deductibilite property
	 */
	public void setDeductibilite(Boolean aDeductibilite) {
		deductibilite = aDeductibilite;
	}

	/**
	 * Access method for the creditInfine property.
	 * 
	 * @return the current value of the creditInfine property
	 */
	public Boolean getCreditInfine() {
		return creditInfine;
	}

	/**
	 * Sets the value of the creditInfine property.
	 * 
	 * @param aCreditInfine
	 *            the new value of the creditInfine property
	 */
	public void setCreditInfine(Boolean aCreditInfine) {
		creditInfine = aCreditInfine;
	}

	/**
	 * Access method for the cotisation property.
	 * 
	 * @return the current value of the cotisation property
	 */
	public Double getCotisation() {
		return cotisation;
	}

	/**
	 * Sets the value of the cotisation property.
	 * 
	 * @param aCotisation
	 *            the new value of the cotisation property
	 */
	public void setCotisation(Double aCotisation) {
		cotisation = aCotisation;
	}

	/**
	 * Access method for the dateVersementPermiereCotisation property.
	 * 
	 * @return the current value of the dateVersementPermiereCotisation property
	 */
	public Calendar getDateVersementPermiereCotisation() {
		return dateVersementPermiereCotisation;
	}

	/**
	 * Sets the value of the dateVersementPermiereCotisation property.
	 * 
	 * @param aDateVersementPermiereCotisation
	 *            the new value of the dateVersementPermiereCotisation property
	 */
	public void setDateVersementPermiereCotisation(
			Calendar aDateVersementPermiereCotisation) {
		dateVersementPermiereCotisation = aDateVersementPermiereCotisation;
	}

	/**
	 * Access method for the dateEffet property.
	 * 
	 * @return the current value of the dateEffet property
	 */
	public Calendar getDateEffet() {
		return dateEffet;
	}

	/**
	 * Sets the value of the dateEffet property.
	 * 
	 * @param aDateEffet
	 *            the new value of the dateEffet property
	 */
	public void setDateEffet(Calendar aDateEffet) {
		dateEffet = aDateEffet;
	}

	/**
	 * Access method for the dateTerme property.
	 * 
	 * @return the current value of the dateTerme property
	 */
	public Calendar getDateTerme() {
		return dateTerme;
	}

	/**
	 * Sets the value of the dateTerme property.
	 * 
	 * @param aDateTerme
	 *            the new value of the dateTerme property
	 */
	public void setDateTerme(Calendar aDateTerme) {
		dateTerme = aDateTerme;
	}

	/**
	 * Access method for the dureeContrat property.
	 * 
	 * @return the current value of the dureeContrat property
	 */
	public Integer getDureeContrat() {
		return dureeContrat;
	}

	/**
	 * Sets the value of the dureeContrat property.
	 * 
	 * @param aDureeContrat
	 *            the new value of the dureeContrat property
	 */
	public void setDureeContrat(Integer aDureeContrat) {
		dureeContrat = aDureeContrat;
	}

	/**
	 * Access method for the dateSuspension property.
	 * 
	 * @return the current value of the dateSuspension property
	 */
	public Calendar getDateSuspension() {
		return dateSuspension;
	}

	/**
	 * Sets the value of the dateSuspension property.
	 * 
	 * @param aDateSuspension
	 *            the new value of the dateSuspension property
	 */
	public void setDateSuspension(Calendar aDateSuspension) {
		dateSuspension = aDateSuspension;
	}

	/**
	 * Access method for the dateReprise property.
	 * 
	 * @return the current value of the dateReprise property
	 */
	public Calendar getDateReprise() {
		return dateReprise;
	}

	/**
	 * Sets the value of the dateReprise property.
	 * 
	 * @param aDateReprise
	 *            the new value of the dateReprise property
	 */
	public void setDateReprise(Calendar aDateReprise) {
		dateReprise = aDateReprise;
	}

	/**
	 * Access method for the etat property.
	 * 
	 * @return the current value of the etat property
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * Sets the value of the etat property.
	 * 
	 * @param aEtat
	 *            the new value of the etat property
	 */
	public void setEtat(String aEtat) {
		etat = aEtat;
	}

	/**
	 * @return Returns the refVersementsExceptionnels.
	 */
	public Collection getRefVersementsExceptionnels() {
		return refVersementsExceptionnels;
	}

	/**
	 * @param refVersementsExceptionnels
	 *            The refVersementsExceptionnels to set.
	 */
	public void setRefVersementsExceptionnels(
			Collection refVersementsExceptionnels) {
		this.refVersementsExceptionnels = refVersementsExceptionnels;
	}

	/**
	 * Access method for the refContrat property.
	 * 
	 * @return the current value of the refContrat property
	 */
	/*public Contrat getRefContrat() {
		return refContrat;
	}*/

	/**
	 * Sets the value of the refContrat property.
	 * 
	 * @param aRefContrat
	 *            the new value of the refContrat property
	 */
	/*public void setRefContrat(Contrat aRefContrat) {
		refContrat = aRefContrat;
	}*/

	/**
	 * Access method for the refTypePeriodiciteCotisation property.
	 * 
	 * @return the current value of the refTypePeriodiciteCotisation property
	 */
	public TypePeriodiciteCotisation getRefTypePeriodiciteCotisation() {
		return refTypePeriodiciteCotisation;
	}

	/**
	 * Sets the value of the refTypePeriodiciteCotisation property.
	 * 
	 * @param aRefTypePeriodiciteCotisation
	 *            the new value of the refTypePeriodiciteCotisation property
	 */
	public void setRefTypePeriodiciteCotisation(
			TypePeriodiciteCotisation aRefTypePeriodiciteCotisation) {
		refTypePeriodiciteCotisation = aRefTypePeriodiciteCotisation;
	}

	public EntiteFactory getFactory() {
		return null;
	}

	public Calendar getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(Calendar dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	public Calendar getDateEffetModification() {
		return dateEffetModification;
	}

	public void setDateEffetModification(Calendar dateEffetModification) {
		this.dateEffetModification = dateEffetModification;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	public Double getCotisationPartPatronale() {
		return cotisationPartPatronale;
	}

	public void setCotisationPartPatronale(Double cotisationPartPatronale) {
		this.cotisationPartPatronale = cotisationPartPatronale;
	}

	public Double getCotisationPartSalariale() {
		return cotisationPartSalariale;
	}

	public void setCotisationPartSalariale(Double cotisationPartSalariale) {
		this.cotisationPartSalariale = cotisationPartSalariale;
	}


	public Double getMontantCreance() {
		return montantCreance;
	}

	public void setMontantCreance(Double montantCreance) {
		this.montantCreance = montantCreance;
	}

	public String getOrganismeCreancier() {
		return organismeCreancier;
	}

	public void setOrganismeCreancier(String organismeCreancier) {
		this.organismeCreancier = organismeCreancier;
	}

	public Double getTauxPartPatronale() {
		return tauxPartPatronale;
	}

	public void setTauxPartPatronale(Double tauxPartPatronale) {
		this.tauxPartPatronale = tauxPartPatronale;
	}

	public Double getTauxPartSalariale() {
		return tauxPartSalariale;
	}

	public void setTauxPartSalariale(Double tauxPartSalariale) {
		this.tauxPartSalariale = tauxPartSalariale;
	}

	public PartieEpargne getRefPartieEpargnePrincipale() {
		return refPartieEpargnePrincipale;
	}

	public void setRefPartieEpargnePrincipale(PartieEpargne refPartieEpargnePrincipale) {
		this.refPartieEpargnePrincipale = refPartieEpargnePrincipale;
	}

	public Contrat getRefContrat() {
		return refContrat;
	}

	public void setRefContrat(Contrat refContrat) {
		this.refContrat = refContrat;
	}
	public Collection getRefRepartitionSupports() {
		return refRepartitionSupports;
	}

	public void setRefRepartitionSupports(Collection refRepartitionSupports) {
		this.refRepartitionSupports = refRepartitionSupports;
	}
	public Double getMontantNantissement() {
		return montantNantissement;
	}

	public void setMontantNantissement(Double montantNantissement) {
		this.montantNantissement = montantNantissement;
	}

	public String getModeAttributionPB() {
		return modeAttributionPB;
	}

	public void setModeAttributionPB(String modeAttributionPB) {
		this.modeAttributionPB = modeAttributionPB;
	}

	public Double getCapitalGaranti() {
		return capitalGaranti;
	}

	public void setCapitalGaranti(Double capitalGaranti) {
		this.capitalGaranti = capitalGaranti;
	}

	public Double getTauxDePrime() {
		return tauxDePrime;
	}

	public void setTauxDePrime(Double tauxDePrime) {
		this.tauxDePrime = tauxDePrime;
	}

	public Integer getOption() {
		return option;
	}

	public void setOption(Integer option) {
		this.option = option;
	}

	public String getModeMontantDistribution() {
		return modeMontantDistribution;
	}

	public void setModeMontantDistribution(String modeMontantDistribution) {
		this.modeMontantDistribution = modeMontantDistribution;
	}

	public Double getPourcentageMontantDistribution() {
		return pourcentageMontantDistribution;
	}

	public void setPourcentageMontantDistribution(
			Double pourcentageMontantDistribution) {
		this.pourcentageMontantDistribution = pourcentageMontantDistribution;
	}

	public Double getMontantMaxDistribution() {
		return montantMaxDistribution;
	}

	public void setMontantMaxDistribution(Double montantMaxDistribution) {
		this.montantMaxDistribution = montantMaxDistribution;
	}

	public Collection getRefDemandeArbitrages() {
		return refDemandeArbitrages;
	}

	public void setRefDemandeArbitrages(Collection refDemandeArbitrages) {
		this.refDemandeArbitrages = refDemandeArbitrages;
	}
	
	

}
