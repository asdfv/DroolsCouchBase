package by.intexsoft.vasili.drools.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableCouchbaseRepositories("by.intexsoft.vasili.drools.repository")
public class CouchConfig extends AbstractCouchbaseConfiguration {

    @Override
    protected List<String> getBootstrapHosts() {
        return Arrays.asList("localhost");
    }

    @Override
    protected String getBucketName() {
        return "default";
    }

    @Override
    protected String getBucketPassword() {
        return "";
    }
}
