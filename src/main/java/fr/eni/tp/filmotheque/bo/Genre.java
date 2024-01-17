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

public class Genre {
	private long id;
	private String titre;
	
	/*
	 * Pour les constructeurs qui ont des arguments mais pas TOUS, Lombok ne sait pas faire
	 * => il faut faire manuellement
	 */
	public Genre(String titre) {
		super();
		this.titre = titre;
	}
}
