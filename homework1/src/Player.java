import java.util.Random;
public class Player {
    public String firstName;
    public String lastName;
    public Boolean active;


    public Player(String firstName, String lastName, Boolean active) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
    }

    public void sayName() {
        System.out.println("Your name is " + this.firstName);
    }

    public void getRandomPlayer() {
        Random random = new Random();
        this.active = random.nextBoolean();
    }
}
