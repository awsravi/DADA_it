package com.awsravi.sps;

public class ORM_JPA {
	package com.awsravi.sps;

	@Entity
	public class Person {

	    @Id
	    private Long id;

	    @Column(name = "person_name")
	    private String name;

	    @Column(name = "person_age")
	    private int age;

	    // Constructors, getters, setters, etc.
	}
	//SQL Table
			CREATE TABLE Person (
		    id BIGINT PRIMARY KEY,
		    person_name VARCHAR(255),
		    person_age INT
		);


	//+++++++++++++++++++++++
	//Tables created form non-primitive datatype
	import javax.persistence.Embeddable;

	@Embeddable
	public class Address {

	    private String street;
	    private String city;
	    private String zipCode;

	    // Constructors, getters, and setters

	}

	import javax.persistence.Embedded;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class User {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String username;

	    @Embedded
	    private Address address;

	    // Constructors, getters, and setters

	}


	//====================

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	public class Main {
	    public static void main(String[] args) {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("yourPersistenceUnitName");
	        EntityManager em = emf.createEntityManager();

	        // Create a new person
	        Person person = new Person();
	        person.setName("John Doe");
	        person.setAge(25);

	        // Start a transaction
	        EntityTransaction transaction = em.getTransaction();
	        transaction.begin();

	        // Save the person to the database
	        em.persist(person);

	        // Commit the transaction
	        transaction.commit();

	        // Close the EntityManager and EntityManagerFactory when done
	        em.close();
	        emf.close();
	    }
	}

}
