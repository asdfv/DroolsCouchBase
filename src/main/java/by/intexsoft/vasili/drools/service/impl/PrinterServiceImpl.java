package by.intexsoft.vasili.drools.service.impl;

import by.intexsoft.vasili.drools.model.Client;
import by.intexsoft.vasili.drools.service.PrinterService;
import org.springframework.stereotype.Service;

@Service("PrinterService")
public class PrinterServiceImpl implements PrinterService {

    /**
     * Out to console for {@link Client}
     * @param client - instance of {@link Client}
     */
    @Override
    public void print(Client client) {
        System.out.println(client);
    }
}
