package by.intexsoft.vasili.drools.model;

import com.couchbase.client.java.repository.annotation.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Client {

    @Id
    @Field
    private String id;

    @Field
    private List<Subscriber> subscribers;

    @Field
    private int subsSpentTotal;

    public Client(String id) {
        this.id = id;
        this.subscribers = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    public int getSubsSpentTotal() {
        return subsSpentTotal;
    }

    public void setSubsSpentTotal(int subsSpentTotal) {
        this.subsSpentTotal = subsSpentTotal;
    }

    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }


    public List<Subscriber> getSubscribers() {
        return subscribers;
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
