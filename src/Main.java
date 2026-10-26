public class Main {
    static void main(String[] args) {
        System.out.println("Hello, world!");
        Student student1 = new Student("Penny", "Train", "penny.train04@gmail.com", 22);
        Student student2 = new Student("Peny", "Tran", "peny.tran04@gmail.com", 22);
        student1.sayName();
        student2.sayName();
    }
}