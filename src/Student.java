
public class Student {
    public String firstName;
    public String lastName;
    public String emailAddress;
    public int age;

    public Student(String firstName, String lastName, String emailAddress, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.age = age;
    }

    public void sayName() {
        System.out.println("Your name is " + this.firstName);
    }
}
