package robruscel.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmostraApplication implements CommandLineRunner{
	
	@Autowired
	private PersonagemService servico;
	
	@Override
	public void run(String... args){
		Personagem personagem = new Personagem("John Cricket", "Capitão Pirata", "Lefou", 8,
				4,4,1,2,0);
		this.servico.save(personagem);
				
	}

	public static void main(String[] args) {
		SpringApplication.run(AmostraApplication.class, args);
	}
}
