package ru.java.training.javafx.interfaces;

import javafx.collections.ObservableList;
import ru.java.training.javafx.objects.Person;


public interface AddressBook {

    boolean add(Person person);

    boolean update(Person person);

    boolean delete(Person person);

    ObservableList<Person> findAll();

    ObservableList<Person> find(String text);

}
