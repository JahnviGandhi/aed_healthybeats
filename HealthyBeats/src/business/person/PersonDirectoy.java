/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.person;

import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class PersonDirectoy {
    
    private ArrayList<Person> personList;
    
    public PersonDirectoy() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person addPerson(Person person) {
        personList.add(person);
        return person;
    }
    
    public void removePerson(Person person) {
        personList.remove(person);
    }
    
    public ArrayList<Person> searchPerson(String name) {
        ArrayList<Person> persons = new ArrayList<>();
        
        for (Person p : personList) {
            if (p.getFirstName().toUpperCase().contains(name.toUpperCase())) {
                persons.add(p);
            }
        }
        
        return persons;
    }
}
