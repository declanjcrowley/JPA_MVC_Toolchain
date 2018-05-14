package ie.cit.tutjpamvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ie.cit.tutjpamvc.entity.*;
import ie.cit.tutjpamvc.repository.*;

@SpringBootApplication
public class DataJpAandMvcApplication implements CommandLineRunner{

	@Autowired
	ArtistRepository artistRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DataJpAandMvcApplication.class, args);
	}
	
	public void printMaleArtists() {
		System.out.println("\nQuery 2 (Print male artists)\n------------");
		
		List<Artist> artists = artistRepository.findByGender("male");
		for (Artist artist : artists) {
			System.out.println(artist.getFullName());
		}
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("DJMA run()");
		printAll();
		/*
		printMaleArtists();
		
		Movement m = new Movement();
		m.setName("Movement");
		
		List<Movement> movements = new ArrayList<Movement>();
		movements.add(m);
		
		Artist a = new Artist();
		a.setFullName("Bob");
		a.setGender("male");
		a.setMovements(movements);
		
		artistRepository.save(a);
		
		printArtistsMovementName();
		*/
	}
	
	public void printArtistsMovementName() {
		System.out.println("\n(Get artists in 'Movement' movement using custom query with joins)\n------------------");
		
		List<Artist> artists = artistRepository.findByMovementsName("Movement");
		
		for (Artist artist : artists) {
			System.out.println(artist.toString());
		}
	}
	
	public void printAll() {
		System.out.println("\n(Get artists in 'Movement' movement using custom query with joins)\n------------------");
		
		List<Artist> artists = artistRepository.findAll();//ByMovementsName("Movement");
		
		for (Artist artist : artists) {
			System.out.println(artist.toString());
		}
	}
}
