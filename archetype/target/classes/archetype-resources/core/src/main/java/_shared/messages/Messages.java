#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}._shared.messages;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import ${package}.message.MessageTemplate;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Messages implements MessageTemplate {

    CHANGE_THIS_MESSAGE("ONEOSEXP-001", "validation.change.this.message");

    private final String code;
    private final String message;

    @Override
    public String code() {
        return this.code;
    }

    @Override
    public String message() {
        return this.message;
    }

}
