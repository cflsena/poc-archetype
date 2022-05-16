package it.pkg.client;

import org.springframework.cloud.openfeign.FeignClient;
import it.pkg.api.ExampleApiContract;

@FeignClient(value = "personContractClient",
        url = "${it.pkg.person.url}")
public interface ExampleContractClient extends ExampleApiContract { }
