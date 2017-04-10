package robruscel.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonagemService {
	
	@Autowired
	private PersonagemRepository repo;
	
	public void save(Personagem personagem){
		this.repo.save(personagem);
	
	}

}