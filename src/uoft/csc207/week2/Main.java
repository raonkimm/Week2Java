package uoft.csc207.week2;

public class Main {

    public static void main(String[] args) {
        String[] name = {"First", "Middle", "Last"};
        String[] name2 = {"Liam", "Martin", "Csiffary"};
	    Person p = new Person(name, "moogah");
        Person l = new Student(name2, "liam", "12");
        System.out.println(p);
        System.out.println(l);
    }
}
