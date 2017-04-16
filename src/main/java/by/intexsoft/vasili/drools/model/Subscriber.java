package by.intexsoft.vasili.drools.model;


public class Subscriber {
    public int id;
    public int spent;
    public Client manager;

    public Subscriber(int id, int spent, Client client) {
        this.id = id;
        this.spent = spent;
        this.manager = client;
    }

    public int getId() {
        return id;
    }

    public int getSpent() {
        return spent;
    }

    public Client getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", spent=" + spent +
                ", clientId=" + manager.id +
                '}';
    }
}
