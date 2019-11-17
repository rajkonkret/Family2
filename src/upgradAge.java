import com.sun.xml.internal.ws.api.server.LazyMOMProvider;

import java.util.Scanner;

public class upgradAge {
    public static void main(String[] args) {
//        int[] ageArray = {28, 29, 1};
//        int familiCount = ageArray.length;
        int sum = 0;
//        int youngest = ageArray[0]; // przypisujemy pierwszy element tablicy
//        int oldest = ageArray[0];
        int agepersons = 0;
        Scanner scanner = new Scanner(System.in);
        int counterpersons = 0;
        System.out.println("ile osób?");
        int numberOfPerson = scanner.nextInt();
        Person[] personsall = new Person[numberOfPerson];

        for (int i = 0; i < personsall.length; i++) {
            System.out.println("Podajj członków rodziny: (podaj wiek -1 aby zakończyć)");
            System.out.println("imię: ");
            String name = scanner.next();
            System.out.println("wiek: ");
            agepersons = scanner.nextInt();
            if (agepersons >= 0) {
                counterpersons += 1;
                Person person = new Person(agepersons, name);
                personsall[i] = person;
            }
        }
        //System.out.println(Person.sum(personsall));
        Familly familly =new Familly(personsall);
        for (Person person : personsall) {
            System.out.println("Imię: "+person.getName()+" wiek: "+person.getAge());

        }
        System.out.println("Average: "+familly.average());

//        double average = (double) sum / familiCount;
//        System.out.println("Average: " + average);
//        System.out.println("Youngedt: " + youngest);
//        System.out.println("Oldest: " + oldest);
    }
}
