package Parciales.P2.Par2_23_01.Ej2;

import java.util.*;

public class AddressBook {

    Map<AddressBookGroup, Set<Contact>> myMap = new TreeMap<>();

    public void addContact(AddressBookGroup group, String name, String number){
        myMap.putIfAbsent(group, new TreeSet<>());
        Contact contact = new Contact(name, number);
        if (!myMap.get(group).contains(contact)) {
            myMap.get(group).add(new Contact(name, number));
        }
    }

    //Preguntar si que un error no este en el programa de prueba lo tengo que contemplar igual... por ejemplo aca abajp chequear si existe el grupo
    public Contact getContact(AddressBookGroup group, String name){
        for(Contact contact : myMap.get(group)){
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        throw new IllegalArgumentException();
    }

    Collection<Contact> getAllContacts(AddressBookGroup group){
        ArrayList<Contact> ret = new ArrayList<>();
        if(myMap.containsKey(group)){
            ret.addAll(myMap.get(group));
        }
        return ret;
    }

    Collection<Contact> getAllContacts(){
        ArrayList<Contact> ret = new ArrayList<>();
        for(Map.Entry<AddressBookGroup, Set<Contact>> entry : myMap.entrySet()){
            ret.addAll(entry.getValue());
        }
        return ret;
    }

    public void renameContact(AddressBookGroup group, String nameFrom, String nameTo){
        for(Contact contact : myMap.get(group)){
            if (contact.getName().equals(nameFrom)){
               contact.setName(nameTo);
               return;
            }
        }

        throw new IllegalArgumentException();
    }


}
