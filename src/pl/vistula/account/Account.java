package pl.vistula.account;

public class Account {

    class NotEnoughMoneyException extends Exception {
        public NotEnoughMoneyException(String messenger) {
            super(messenger);
        }
    }

    public static class Accounts {
        String owner;
        int balance;
        int accountNumber;

        public void Account(String owner, int balance, int accountNumber) {
            this.balance = balance;
            this.owner = owner;
            this.accountNumber = accountNumber;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getOwner() {
            return owner;
        }

        public int getBalance() {
            return balance;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public void withoutWay(int anyMore) throws NotEnoughMoneyException {
            if (balance >= anyMore) {
                balance = balance - anyMore;
            } else {
                System.out.println("Nie mozesz wykonac przelew.Stan konta jest mniej");
            }
        }
    }


    public static void main(String[] args) {
        Accounts human = new Accounts();
        human.owner = "Jon";
        human.balance = 5600;
        human.accountNumber = 5556688;

        try {
            human.withoutWay(7000);
//            System.out.println("Twój przelew wyslany");
        } catch (NotEnoughMoneyException e) {
//            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Nie ma połączenia z siecią, nie mozesz wykonac przelew");
            e.printStackTrace();
        } finally {

            System.out.println("Numer konta: " + human.accountNumber);
            System.out.println("Właściciel: " + human.owner);
            System.out.println("Stan konta: " + human.getBalance());
        }
    }
}


