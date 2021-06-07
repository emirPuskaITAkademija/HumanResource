package com.solutions.hr.app.beans;

import com.solutions.hr.app.entity.Person;
import com.solutions.hr.app.entity.facade.PersonFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "personManagedBean")
@RequestScoped
public class PersonManagedBean implements Serializable{

    private List<Person> _personList;
    
    @Inject
    PersonFacadeLocal personFacadeLocal;
    
    @PostConstruct
    private void init(){
        _personList = personFacadeLocal.findAll();
    }
    
    public PersonManagedBean() {
    }

    public List<Person> getPersonList() {
        return _personList;
    }

    public void setPersonList(List<Person> _personList) {
        this._personList = _personList;
    }
    
    
    
    
}
