package fr.jpa.banque;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BanqueConsole {

	
	private static final Logger LOG = LoggerFactory.getLogger("INFO");

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
			
		
		
		/** Remplissage de la base*/
		
		et.begin();
//		
		Banque banque = new Banque("FREE MONEY");
		Client client = new Client("JEAN", "Jeannne", LocalDate.of(1975, 03, 12), new Adresse(2, "rue des frites", 58962, "KEBAB"), banque);
//		Client client1 = new Client("JEAN", "Mehdi", LocalDate.of(2000, 12,12), new Adresse(2, "rue des frites", 58962, "KEBAB"), banque);
//
//		Compte livA = new LivretA(2.58, "TREU465", 85245698.56);
//		Compte livA1 = new LivretA(0.52, "TREU466", 8.56);
//
//		Compte assVie = new AssuranceVie(LocalDate.of(2025, 5, 21), 0.23, "RET987654EZ", 2500.0);
//
//		Operation operation = new Virement(LocalDate.of(2018, 04, 25), 250.26, "Commande pizza", livA, "Mehdi");
//		Operation operation1 = new Virement(LocalDate.of(2018, 05, 25), 250.26, "Commande pizza1", livA, "Mehdi");
//		Operation operation2 = new Virement(LocalDate.of(2018, 06, 25), 250.26, "Commande pizza2", livA, "Mehdi");
//		Operation operation3 = new Virement(LocalDate.of(2018, 07, 25), 250.26, "Commande pizza3", livA, "Mehdi");
//
//		Set<Operation> operations = new HashSet<>();
//		operations.add(operation);
//		operations.add(operation1);
//		operations.add(operation2);
//		operations.add(operation3);
//		livA.setOperations(operations);
//		
//		Set<Compte> comptes = new HashSet<>();
//		comptes.add(livA);
//		comptes.add(assVie);
//		client.setComptes(comptes);
//		
//		
//		comptes = new HashSet<>();
//		comptes.add(livA1);
//		comptes.add(assVie);
//		client1.setComptes(comptes);
//		
//		Set<Client> clients = new HashSet<>();
//		clients.add(client);
//		clients.add(client1);
//		banque.setClients(clients);
//
//		
//
		em.persist(banque);
		em.persist(client);
//		em.persist(client1);
//		em.persist(livA);
//		em.persist(livA1);
//		em.persist(assVie);
//		em.persist(operation);
//		em.persist(operation1);
//		em.persist(operation2);
//		em.persist(operation3);
//
//
//		
//		
		et.commit();
		
		/** TP 7 */
		
		LOG.info("=============1==============");	
		
		Query q = em.createQuery("SELECT cpt.numero FROM Client c JOIN c.comptes cpt WHERE c.prenom=:prenom");
		q.setParameter("prenom", "Mehdi");
		
		q.getResultList().stream().forEach(c -> LOG.info(((String) c)));
		LOG.info("=============2==============");

		q = em.createQuery("SELECT DISTINCT(cpt.numero) FROM Banque b JOIN b.clients c JOIN c.comptes cpt WHERE b.nom=:nom");
		q.setParameter("nom", "FREE MONEY");
		
		q.getResultList().stream().forEach(c -> LOG.info((String) c));
		
		LOG.info("============3===============");
		q = em.createQuery("SELECT DISTINCT(c.numero) FROM Compte c JOIN c.operations op  WHERE op.montant>1000");
		
		q.getResultList().stream().forEach(c -> LOG.info((String) c));
		
		LOG.info("=============4==============");
		q = em.createQuery("SELECT DISTINCT(c.numero) FROM Compte c   WHERE c.operations IS NOT EMPTY");
		
		q.getResultList().stream().forEach(c -> LOG.info((String) c));
		
		// mise en cache des clients
		q = em.createQuery("SELECT c FROM Client c");
		q.getResultList();
		
		Cache cache = emf.getCache();
		boolean isInCache = cache.contains(Client.class, 4);
		if (isInCache){
			LOG.info("\nJE SUIS DANS LE CACHE");

			
		}
		
		em.close(); 
		emf.close();
	}

}
