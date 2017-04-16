package by.intexsoft.vasili.drools.model;

import java.util.LinkedList;
import java.util.List;

public class Client {

    public int id;
    public List<Subscriber> subscribers;
    public int subsSpentTotal;

    public Client(int id) {
        this.id = id;
        this.subscribers = new LinkedList<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public int getId() {
        return id;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public int getSubsSpentTotal() {
        return subsSpentTotal;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", subscribers=" + subscribers +
                ", subsSpentTotal=" + subsSpentTotal +
                '}';
    }
}
