package ie.cit.tutjpamvc.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ie.cit.tutjpamvc.entity.Artist;
import ie.cit.tutjpamvc.repository.ArtistRepository;

@Controller
public class AwayController {
		
	@Autowired
	ArtistRepository artistRepository;
	
	@RequestMapping(value="/away", method=GET)
	public String showaway() {
		return "away";
	}
	
	/*
	 * Insert info into webpage
	 * http://localhost:8090/away/single?id=1
	 * this inputs '1' into function below
	 */
	@RequestMapping(value="/away/single", method=GET)
	public String showaway(@RequestParam("id") long id, Model model) {
		System.out.println("id: " + id);
		Artist artist = getSingle((int)id);
		System.out.println("id: " + id + "  "+ artist.getGender());
		String g = artist.getGender();
		model.addAttribute("artist", g);//artist);
		return "away";
	}
	
	@RequestMapping(value="/away/all", method=GET)
	public String show() {
		System.out.println("Print all" );
		printAll();
		return "away";
	}
	
	public void printAll() {
		System.out.println("\n(Get artists in 'Movement' movement using custom query with joins)\n------------------");
		
		List<Artist> artists = artistRepository.findAll();//ByMovementsName("Movement");
		
		for (Artist artist : artists) {
			System.out.println(artist.toString());
		}
	}
	
	public Artist getSingle(int id) {
		System.out.println("\nGet Single Artist\n------------------");
		
		List<Artist> artists = artistRepository.findAll();//ByMovementsName("Movement");
		return artists.get(id);
	}
}