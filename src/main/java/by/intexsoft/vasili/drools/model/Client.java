package by.intexsoft.vasili.drools.model;

import com.couchbase.client.java.repository.annotation.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.LinkedList;
import java.util.List;

@Document
public class Client {

    @Id
    public String id;

    @Field
    public List<Subscriber> subscribers;

    @Field
    public int subsSpentTotal;

    public Client(String id) {
        this.id = id;
        this.subscribers = new LinkedList<>();
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
