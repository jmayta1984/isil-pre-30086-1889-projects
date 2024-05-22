package ep02;

public class Main {
    public static void main(String[] args) {
        BankAccount object = new BankAccount("Fernado Torres", "1234569856");

        object.deposit(-100);

        object.deposit(50);
    
        object.withdrawal(-200);

        object.withdrawal(10);
    }
}
