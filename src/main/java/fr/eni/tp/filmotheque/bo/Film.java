package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor // génère un constructeur par défaut
@AllArgsConstructor // génère un constructeur avec tous les arguments
@Data
/*
 * @Data fait tout ca : 
 * @Getter @Setter // génère tous les getters/setters
 * @ToString // génère un toString
 * @EqualsAndHashCode // génère un equals basé sur l'égalité des attributs
 */

public class Film {
	private long id;
	private String titre;
	private int annee;
	private int duree;
	private String synopsis;
	
	/*
	 * associations traduites en attribut
	 */
	private Genre genre; // un film est associé à un genre 
	private List<Avis> avis = new ArrayList<>();  // un film est associé à plusieurs (*) avis => on traduit par une liste d'avis
	private Participant realisateur; // un film est associé à un réalisateur
	private List<Participant> acteurs = new ArrayList<>(); // un film est associé à plusieurs (*) acteurs => on traduit par une liste de participants
	
	/*
	 * Pour les constructeurs qui ont des arguments mais pas TOUS, Lombok ne sait pas faire
	 * => il faut faire manuellement
	 */
	public Film(String titre, int annee, int duree, String synopsis) {
		super();
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
	}
	public Film(long id, String titre, int annee, int duree, String synopsis) {
		super();
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
	}
}
