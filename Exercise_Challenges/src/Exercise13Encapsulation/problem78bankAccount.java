package Exercise13Encapsulation;

class bankAccount {
    private long accountNumber;
    private String accountHolderName;
    private long balance;

    bankAccount(long accountNumber, String accountHolderName, long balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "bankAccount { accountNumber = " + accountNumber +
                ", accountHolderName = " + accountHolderName +
                ", balance = " + balance + " }";
    }

    public long depositMoney(long depositMoney){
        return balance + depositMoney;
    }

    public long withdrawMoney(long withdrawMoney){
        if (withdrawMoney > balance) {
            System.out.println("Invalid withdraw");
        }else   if (withdrawMoney <= balance){
            balance -= withdrawMoney;
        }else {
            withdrawMoney = balance;
            balance = 0;
        }
        return withdrawMoney;
    }


    public static void main(String[] args) {
        bankAccount bA = new bankAccount(1203483472,
                "SriKant Singh", 40000);
        System.out.println(bA);
        System.out.println(bA.depositMoney(20000));
        System.out.println(bA.withdrawMoney(40000));

    }
}
