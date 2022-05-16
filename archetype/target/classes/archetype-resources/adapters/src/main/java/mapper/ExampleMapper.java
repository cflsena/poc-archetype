#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public abstract class ExampleMapper {

    public static final ExampleMapper MAPPER = Mappers.getMapper(ExampleMapper.class);

}
