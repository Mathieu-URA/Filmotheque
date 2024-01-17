package fr.eni.tp.filmotheque.controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import fr.eni.tp.filmotheque.bll.FilmService;
import fr.eni.tp.filmotheque.bo.Film;

@Controller
public class FilmController {
	
	/*
	 * On référencer le service dans un attribut
	 */
	private FilmService filmService;
	
	/*
	 * Le fait de créer un constructeur avec un argument 
	 * effectue un @Autowire automatique sur filmService
	 * => Spring va injecter dans l'attribut filmService la valeur d'un bean du contexte Spring qui implémente l'interface FilmService
	 * => Ne pas publier d'ajouter l'implémentation qu'on souhaite utiliser dans le contexte Spring (@Service)
	 */
	public FilmController(FilmService filmService) {
		super();
		this.filmService = filmService;
	}
	

	public void afficherUnFilm(long id) {
		// je recupère le film grâce  au service
		Film film = filmService.consulterFilmParId(id);
		
		// je l'affiche en console
		System.out.println(film);
		
	}

	public void afficherFilms() {
		// je recupère les films grâce au service
		List<Film> films = filmService.consulterFilms();
		
		// je les affiche en console
		for (Film filmAAfficher : films) {
			System.out.println(filmAAfficher);
		}
	}

	

}
