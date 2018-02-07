package rs.enentel.springbootjokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import rs.enentel.springbootjokesapp.services.JokeService;

@Controller
public class JokeController {
	
	private JokeService jokeService;

	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""})
	public String getJoke(Model model) {
		
		model.addAttribute("joke", jokeService.getJoke());
		
		return "chucknorris";
	}
}
