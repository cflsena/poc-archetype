#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}._mock;

import java.util.UUID;

public class MockUUID {

    public static UUID mockValidUUID(){
        return UUID.fromString("5bbac0be-1c50-40f2-810a-60bd6c82fc5b");
    }
}
