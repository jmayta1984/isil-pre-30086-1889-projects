package ep02;

class BankAccount {
    private String name;
    private String account;
    private double balance;

    public BankAccount(String name, String account, double balance) {
        this.name = name;
        this.account = account;
        this.balance = balance;
    }

    public BankAccount(String name, String account) {
        this.name = name;
        this.account = account;
        this.balance = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public void deposit(double amount){
        if (amount > 0) {
            this.balance +=  amount;
            System.out.println("El saldo actualizado es: " + balance);
        } else {
            System.out.println("El monto depositado debe ser positivo");
        }
    }
    
    public void withdrawal(double amount) {
        if (amount < 0) {
            System.out.println("No se puede realizar la operación");
            System.out.println("El monto a retirar debe ser positivo");
            return;
        }

        if(amount> balance) {
            System.out.println("No se puede realizar la operación");
            System.out.println("El monto a retirar debe ser menor o igual al saldo");
            return;
        }
        
        this.balance -= amount;
        System.out.println("El saldo actualizado es: " + balance);

    }


    
    
}