public class Familly {
    private Person[] family;

    public Familly(Person[] familyAll) {
        this.family = familyAll;
    }
    public int sumAge(){
        int sumAge = 0;
        for (Person person :family) {
            sumAge += person.getAge();

        }
        return sumAge;
    }

    public  double average() {
        return (double) sumAge() / family.length;
    }



}
