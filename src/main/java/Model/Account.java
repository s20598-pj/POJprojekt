package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Account{



    public int stankonta;
    public int numerkonta;
    public String nazwakonta;


    public Account(int stankonta, int numerkonta, int nazwakonta) {
        this.stankonta = stankonta;
        this.numerkonta = numerkonta;
        this.nazwakonta = nazwakonta;
    }

    public List<Account> accountList;

    public Account() {

        this.accountList = new ArrayList<>();
    }

    public void addAccount(Account account) {

        this.accountList.add(account);
    }

    public void addAccount(int numerkonta, int stankonta, String nazwakonta) {

        Account account = new Account(numerkonta, stankonta, nazwakonta);
        this.accountList.add(account);
    }

    public void update(int numerkonta){
        Optional<Account> optionalAccount = findBynumerkonta(numerkonta);
        if (optionalAccount.isPresent()) {
            optionalAccount.get().setName();
        }
    }

    private Optional<Account> findBynumerkonta (String nazwakonta, int numerkonta) {
        return accountList.stream().filter(breadstuff -> breadstuff.getId() == id).findFirst(); //
    }

    public List<Account> findAll(){
        return this.accountList;
    }

    public void chooseAccount (int nazwakonta, int numerkonta){
        Optional<Account> optionalAccount = findBynumerkonta(numerkonta);
        if (optionalAccount.isPresent()){
            System.out.println("wyświetlam numer konta " + optionalAccount.get() + " dla " + nazwakonta);
        } else {
            System.out.println("nie znaleziono konta");
        }
    }

    private Optional<Account> findBynumerkonta(int numerkonta) {
    }

    public void deleteAccount(int nazwakonta, int numerkonta) {
        findBynumerkonta(numerkonta).ifPresentOrElse(
                account -> accountList.remove(account),
                () -> System.out.println("nie znaleziono produktu")
        );

    }

    public int getStankonta() {
        return stankonta;
    }

    public void setStankonta(int stankonta) {
        this.stankonta = stankonta;
    }

    public int getNumerkonta() {
        return numerkonta;
    }

    public void setNumerkonta(int numerkonta) {
        this.numerkonta = numerkonta;
    }

    public String getNazwakonta() {
        return nazwakonta;
    }

    public void setNazwakonta(String nazwakonta) {
        this.nazwakonta = nazwakonta;
    }

    public List<Account> getAccountListList() {
        return accountList;
    }

    public void setAccountListList(List<Account> accountListList) {
        this.accountList = accountListList;
    }
}