package homeWork4;

public class Worker extends Employee {
    public Worker(String name, String secondName, int exp) {
        super(name, secondName, exp);
    }

    @Override
    public void setProf() {
        this.proff = PROFF.WORKER;
    }
}
