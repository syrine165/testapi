package com.cubeit.testapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.cubeit.testapi.models.Tache;
import com.cubeit.testapi.repositories.TacheRepository;

@SpringBootApplication
public class TestapiApplication implements CommandLineRunner{

	
	private static final Logger logger = LoggerFactory.getLogger(TestapiApplication.class);
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	


	private final TacheRepository tacheRepository;
	
	@Autowired
	public TestapiApplication(TacheRepository tacheRepository) {
		
		this.tacheRepository=tacheRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TestapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	/*	
		Date date=new Date();
		System.out.println("###########saving vehicules###############");
		
		vehiculeRepository.save(new Vehicule("Toyota","corolla",date,"4","22000"));
		
		*/

		//logger.info("########### Spring Deleting Taches! ###############");
		//tacheRepository.deleteAll();

		restConfiguration.exposeIdsFor(Tache.class);


		logger.info("########### Spring Start ###############");
		
		
	}
	

}
