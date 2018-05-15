package ie.cit.tutjpamvc;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DataJpAandMvcApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(DataJpAandMvcApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("DJMA run()");
	}
}
