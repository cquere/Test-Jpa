package fr.jpa.console;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.jpa.model.Client;
import fr.jpa.model.Emprunt;
import fr.jpa.model.Livre;

public class BibliothequeConsole {

	private static final Logger LOG = LoggerFactory.getLogger("INFO");

	
	public static void main(String[] args) {
		EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("banque");
		EntityManager em2 = emf2.createEntityManager();
		em2.close();
		emf2.close();
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
			
		et.begin();
		
		LOG.info("====== TP 2 =======");
		
		Livre l = em.find(Livre.class, 1);
		if (l != null){
		LOG.info(l.getAuteur());
		}
		
		LOG.info("\n====== TP 3 =======\nRequete 1:");
		
		Emprunt emprunt= em.find(Emprunt.class, 1);
		if (emprunt != null){
			LOG.info(emprunt.getDateDebut().toString());
			Set<Livre> livres = emprunt.getLivres();
			livres.stream()
			.forEach(s-> LOG.info(s.getAuteur() +" : " + s.getTitre()));
		}
		
		LOG.info("\nRequete 2");

		Client client = em .find(Client.class, 2);
		
		if (client != null) {
			LOG.info(client.getNom() + " " + client.getPrenom());
			Set<Emprunt> e = client.getEmprunts();
			e.stream()
			.forEach(i -> LOG.info(i.getDateDebut() + " : " + i.getLivres().size() + " livres"));
		}
				
		
		et.commit(); // et.rollback();
		em.close();
		emf.close();
	}

}
