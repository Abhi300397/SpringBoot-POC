package main.java.com.example.mdbspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MdbSpringBootApplication implements CommandLineRunner {
	@Autowired
	private customerRepo custRep;
	public static void main(String[] args) {
		SpringApplication.run(MdbSpringBootApplication.class, args);
	}
	public void run(String... args) throws Exception{
		customer c1 = new customer("1","Jerry","Alexander");
		customer c2 = new customer("2","Davis","Chris");
		custRep.save(c1);
		custRep.save(c2);

		System.out.println("##############");
		List<customer> customers = custRep.findAll();
		for (customer c:customers){
			System.out.println(c.toString());
		}

	}

}
