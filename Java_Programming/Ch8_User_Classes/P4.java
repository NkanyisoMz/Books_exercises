// a. Example 8-7 defined the class Person to store the name of a person.
// The methods that we included merely set the name and print the name
// of a person. Redefine the class Person so that, in addition to what the
// existing class does, you can:
// i. Set the last name only.
// ii. Set the first name only.
// iii. Set the middle name.
// iv. Check whether a given last name is the same as the last name of this
// person.
// v. Check whether a given first name is the same as the first name of
// this person.
// vi. Check whether a given middle name is the same as the middle
// name of this person.
// b. Add the method equals that returns true if two objects contain the
// same first, middle, and last name.
// c. Add the method makeCopy that copies the instance variables of a
// Person object into another Person object.
// d. Add the method getCopy that creates and returns the address of the
// object, which is a copy of another Person object.
// e. Add the copy constructor.
// f. Write the definitions of the methods of the class Person to implement
// the operations for this class.
// g. Write a program that tests various operations of the class Person.

public class PersonTest {
    public static void main(String[] args) {
        // Creating Person objects using different constructors
        Person person1 = new Person("John", "Doe", "Michael");
        Person person2 = new Person("Jane", "Doe", "Anne");
        Person person3 = new Person(person1); // Using the copy constructor

        // Testing the toString() method
        System.out.println("Person 1: " + person1); // Expected: John Michael Doe
        System.out.println("Person 2: " + person2); // Expected: Jane Anne Doe
        System.out.println("Person 3 (copy of Person 1): " + person3); // Expected: John Michael Doe

        // Testing individual set methods
        person3.setFirstName("Jim");
        person3.setLastName("Smith");
        person3.setMiddleName("Arthur");
        System.out.println("Person 3 after modification: " + person3); // Expected: Jim Arthur Smith

        // Testing equals() method
        System.out.println("Are person1 and person3 equal? " + person1.equals(person3)); // Expected: false
        System.out.println("Are person1 and person2 equal? " + person1.equals(person2)); // Expected: false
        System.out.println("Are person1 and the copy of person1 equal? " + person1.equals(new Person("John", "Doe", "Michael"))); // Expected: true

        // Testing sameFirstName, sameLastName, sameMiddleName methods
        System.out.println("Does person1 have the same first name as 'John'? " + person1.sameFirstName("John")); // Expected: true
        System.out.println("Does person1 have the same last name as 'Smith'? " + person1.sameLastName("Smith")); // Expected: false
        System.out.println("Does person1 have the same middle name as 'Michael'? " + person1.sameMiddleName("Michael")); // Expected: true

        // Testing makeCopy() method
        person3.makeCopy(person2);
        System.out.println("Person 3 after copying Person 2: " + person3); // Expected: Jane Anne Doe

        // Testing getCopy() method
        Person person4 = person1.getCopy();
        System.out.println("Person 4 (copy of Person 1): " + person4); // Expected: John Michael Doe

        // Final comparison
        System.out.println("Are person1 and person4 equal? " + person1.equals(person4)); // Expected: true
    }
}

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;

    // Default constructor
    public Person() {
        firstName = "";
        lastName = "";
        middleName = "";
    }

    // Parameterized constructor
    public Person(String first, String last, String middle) {
        setName(first, last, middle);
    }

    // String representation of the person (include middle name if needed)
    @Override
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }

    // Set full name
    public void setName(String first, String last, String middle) {
        firstName = first;
        lastName = last;
        middleName = middle;
    }

    // Getter for first name
    public String getFirstName() {
        return firstName;
    }

    // Getter for last name
    public String getLastName() {
        return lastName;
    }

    // Setter for last name
    public void setLastName(String ln) {
        lastName = ln;
    }

    // Setter for first name
    public void setFirstName(String fn) {
        firstName = fn;
    }

    // Setter for middle name
    public void setMiddleName(String mn) {
        middleName = mn;
    }

    // Check equality based on first, middle, and last name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person otherPerson = (Person) obj;
        return firstName.equals(otherPerson.firstName) &&
                lastName.equals(otherPerson.lastName) &&
                middleName.equals(otherPerson.middleName);
    }

    // Make a copy of another Person object
    public void makeCopy(Person otherPerson) {
        firstName = otherPerson.firstName;
        lastName = otherPerson.lastName;
        middleName = otherPerson.middleName;
    }

    // Return a copy of this Person object
    public Person getCopy() {
        return new Person(firstName, lastName, middleName);
    }

    // Copy constructor
    public Person(Person otherPerson) {
        this(otherPerson.firstName, otherPerson.lastName, otherPerson.middleName);
    }

    // Check if the given first name matches
    public boolean sameFirstName(String first) {
        return firstName.equals(first);
    }

    // Check if the given last name matches
    public boolean sameLastName(String last) {
        return lastName.equals(last);
    }

    // Check if the given middle name matches
    public boolean sameMiddleName(String middle) {
        return middleName.equals(middle);
    }
}

