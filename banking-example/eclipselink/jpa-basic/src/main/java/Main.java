import model.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "banks";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        Query q = em.createQuery("select p from Person p");

        boolean createNewEntries = (q.getResultList().size() == 0);

        if (createNewEntries) {

            Person person1 = new Person();
            person1.setName("Max Musterman");
            em.persist(person1);

            Address address1 = new Address();
            address1.setStreet("Inndalsveien");
            address1.setNumber(28);
            em.persist(address1);

            CreditCard creditCard1 = new CreditCard();
            creditCard1.setNumber(12345);
            creditCard1.setBalance(-5000);
            creditCard1.setLimit(-10000);
            em.persist(creditCard1);

            CreditCard creditCard2 = new CreditCard();
            creditCard2.setNumber(123);
            creditCard2.setBalance(1);
            creditCard2.setLimit(2000);
            em.persist(creditCard2);

            Bank bank1 = new Bank();
            bank1.setName("Pengebank");
            em.persist(bank1);

            Pincode pincode1 = new Pincode();
            pincode1.setPincode("123");
            pincode1.setCount(1);
            em.persist(pincode1);

            person1.getAddressList().add(address1);
            person1.getCreditCardList().add(creditCard1);
            person1.getCreditCardList().add(creditCard2);
            em.persist(address1);
            em.persist(person1);

            creditCard1.setPincode(pincode1);
            creditCard2.setPincode(pincode1);
            em.persist(creditCard1);
            em.persist(creditCard2);

            bank1.getCreditCardList().add(creditCard1);
            bank1.getCreditCardList().add(creditCard2);
            em.persist(creditCard1);
            em.persist(creditCard2);
            em.persist(bank1);

        }
        em.getTransaction().commit();

        em.close();

    }
}
