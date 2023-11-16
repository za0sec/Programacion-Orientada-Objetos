package Parciales.P2.Par2_23_01.Ej2;

public class AddressBookGroup extends AddressBook implements Comparable<AddressBookGroup>{

    private final String name;

    public AddressBookGroup(String name) {
        this.name = name;
    }

    public AddressBookGroup() {
        super();
        this.name = "";
    }

    @Override
    public int compareTo(AddressBookGroup o) {
        return name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o){
        return o == this || (o instanceof AddressBookGroup that && name.equals(that.name));
    }

}


