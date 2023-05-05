package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person= Arrays.asList(
                new Person("Subin","Roushan",1),
                new Person("Hritik","Roushan",2),
                new Person("Rishabh","Bharadwaj",3)
        );
        for(int i=0;i< person.size();i++)
        {
            System.out.println(person.get(i));
        }

        for(Person p:person)
        {
            System.out.println(p);
        }


        person.forEach(e-> System.out.println(e));

            }
}