package fr.eni.tp.filmotheque.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// callSuper = true : appelle la méthode du parent
@Getter @Setter @EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Membre extends Personne{
	private String pseudo;
	@ToString.Exclude // on ne veut pas afficher le mot de passe dans le toString()
	private String motDePasse;
	private boolean admin;

	
	/*
	 * Constructeurs
	*/
	public Membre(String nom, String prenom, String pseudo, String motDePasse, boolean admin) {
		super(nom, prenom);
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.admin = admin;
	}

	public Membre(long id, String nom, String prenom, String pseudo, String motDePasse) {
		super(id, nom, prenom);
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
	}



}
