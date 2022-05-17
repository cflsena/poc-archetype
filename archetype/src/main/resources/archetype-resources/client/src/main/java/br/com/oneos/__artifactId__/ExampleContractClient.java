#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package br.com.oneos.${artifactId};

import br.com.oneos.api.ExampleApiContract;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "personContractClient",
        url = "${symbol_dollar}{poc.ms.hexagonal.person.url}")
public interface ExampleContractClient extends ExampleApiContract { }
