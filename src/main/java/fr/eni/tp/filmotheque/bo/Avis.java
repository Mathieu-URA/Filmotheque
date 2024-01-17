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

public class Avis {
	private long id;
	private int note;
	private String commentaire;
	
	/*
	 * associations traduites en attribut
	 */
	private Membre membre; // un avis est associé à un membre
	
	/*
	 * Pour les constructeurs qui ont des arguments mais pas TOUS, Lombok ne sait pas faire
	 * => il faut faire manuellement
	 */
	public Avis(int note, String commentaire) {
		super();
		this.note = note;
		this.commentaire = commentaire;
	}
}
