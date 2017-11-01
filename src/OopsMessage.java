/**
 *
 * @author emanuel
 */
public class OopsMessage extends OopsCode{
   
    
    private String selector;
    private OopsObject[] args;
    private OopsObject receiver;
    
    public OopsMessage(String xselector, OopsObject[] xargs, OopsObject xreceiver ){
            this.selector = xselector;
            this.args = xargs;
            this.receiver = xreceiver;
    }
    
     /**
     * @return the selector
     */
    public String getSelector() {
        return selector;
    }

    /**
     * @param selector the selector to set
     */
    public void setSelector(String selector) {
        this.selector = selector;
    }
    
    
    /**
     * @return the args
     */
    public OopsObject[] getArgs() {
        return args;
    }

    /**
     * @param args the args to set
     */
    public void setArgs(OopsObject[] args) {
        this.args = args;
    }
    
    /**
     * @return the receiver
     */
    public OopsObject getReceiver() {
        return receiver;
    }

    /**
     * @param receiver the receiver to set
     */
    public void setReceiver(OopsObject receiver) {
        this.receiver = receiver;
    }

    @Override
    public OopsObject evaluate() {
        return receiver.respond(selector, args);
    }
    
    
    
}
