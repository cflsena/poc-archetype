#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId};

import org.springframework.cloud.openfeign.FeignClient;
import ${package}.api.ExampleApiContract;

@FeignClient(value = "personContractClient",
        url = "${symbol_dollar}{${package}.person.url}")
public interface ExampleContractClient extends ExampleApiContract { }
