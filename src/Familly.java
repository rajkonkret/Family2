import com.sun.jmx.snmp.internal.SnmpAccessControlModel;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class Familly {
    private Person[] family;

    public Familly(Person[] familyAll) {
        this.family = familyAll;
    }

    public int sumAge() {
        int sumAge = 0;
        for (Person person : family) {
            sumAge += person.getAge();

        }
        return sumAge;
    }

    public double average() {
        return (double) sumAge() / family.length;
    }

    public Person youngest() {
        int youngest = family[0].getAge();
        Person personYoungest = family[0];

        for (Person person : family) {
            youngest = Math.min(youngest, person.getAge());
            personYoungest = person;
        }
        return personYoungest;
    }

    public Person oldest() {
        int oldest = 0;
        Person personOldest=new Person(0,"rad");
        for (Person person : family) {
            if (person.getAge() > oldest) {
                oldest = person.getAge();
                personOldest = person;
            }
        }
        return personOldest;
    }


}
