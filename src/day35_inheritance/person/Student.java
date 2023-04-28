package day35_inheritance.person;
//Sub class --> child class


    // Student is-a Person.
    public class Student extends Person {


        int funLevel;


        public void study () {
            System.out.println(name + " is studying");
        }

    }
