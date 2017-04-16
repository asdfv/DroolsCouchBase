package by.intexsoft.vasili.drools;

import by.intexsoft.vasili.drools.model.Client;
import by.intexsoft.vasili.drools.service.ClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class DroolsSpringTest {

    public static void main(String args[]) {

        final int CLIENTS_COUNT = 100;
        final int SUBSCRIBERS_COUNT = 100;

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("by.intexsoft.vasili.drools.config");
        ClientService clientService = ((ClientService) applicationContext.getBean("ClientService"));

        List<Client> clients = clientService.getClients(CLIENTS_COUNT, SUBSCRIBERS_COUNT);

//        System.out.println("\nBefore drools");
//        clients.forEach(printerService::print);

        System.out.println("\nDrools works with " + CLIENTS_COUNT + " client and " + SUBSCRIBERS_COUNT + " subscribers for each client.");
        System.out.println("Calculate total spent subscribers for each client...");
        long startTime = System.currentTimeMillis();
        clientService.processClients(clients);
        System.out.println((System.currentTimeMillis() - startTime) + " ms");

//        System.out.println("\nAfter drools");
//        clients.forEach(printerService::print);
    }
}
