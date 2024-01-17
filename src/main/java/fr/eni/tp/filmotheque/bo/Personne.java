package fr.eni.tp.filmotheque.bo;

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

public abstract class Personne {
	private long id;
	private String nom;
	private String prenom;
	
	
	/*
	 * Pour les constructeurs qui ont des arguments mais pas TOUS, Lombok ne sait pas faire
	 * => il faut faire manuellement
	 */
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
}
