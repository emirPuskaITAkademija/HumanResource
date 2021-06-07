package com.solutions.hr.app.entity.facade;

import com.solutions.hr.app.entity.Person;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PersonFacade extends AbstractFacade<Person> implements PersonFacadeLocal {

    @PersistenceContext(unitName = "HR_PU")
    private EntityManager entityManager;

    public PersonFacade() {
        super(Person.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
