package projthrift;

/**
 *
 * @author Leonardo Pedrassoli Silva 11521ECP003
 */
import chavevalor.*;
import org.apache.thrift.TException;

public class Main {

    public static void main(String[] args) throws TException {
        ChaveValorHandler handler = new ChaveValorHandler();
        
        //Inserindo chaves corretas
        handler.setKV(0, "a");
        handler.setKV(1, "b");
        handler.setKV(2, "c");
        
        //Inserindo chave duplicada
        handler.setKV(2, "c");
    }
    
}
