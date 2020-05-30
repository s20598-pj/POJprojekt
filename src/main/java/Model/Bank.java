package Model;

import java.util.ArrayList;

public class Bank extends Account {

    public Bank(int stankonta, int numerkonta, String nazwakonta) {
        super(stankonta, numerkonta, nazwakonta);
    }

    private int idbanku;
    private String nazwabanku;



    public Bank(int idbanku, String nazwabanku) {
        super();

        this.idbanku = idbanku;
        this.nazwabanku = nazwabanku;
    }
}
