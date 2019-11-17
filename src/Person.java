public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static int sum(Person[] personsall) {
        int sumAge = 0;
        for (Person person : personsall) {
            sumAge += person.age;
        }
        return sumAge;
    }

    public static double average(Person[] personsall) {
        return (double) sum(personsall) / personsall.length;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
//            youngest = Math.min(youngest, age);
//            oldest = Math.max(oldest, age);
//    }
}
