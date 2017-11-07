/**
 *
 * @author emanuel
 */
public class OopsMessage extends OopsCode{
   
    
    private String selector;
    private OopsCode[] args;
    private OopsCode receiver;
    
    public OopsMessage(String xselector, OopsCode[] xargs, OopsCode xreceiver, OopsClass clase){
    		super(clase);
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
    public OopsCode[] getArgs() {
        return args;
    }

    /**
     * @param args the args to set
     */
    public void setArgs(OopsCode[] args) {
        this.args = args;
    }
    
    /**
     * @return the receiver
     */// TODO Auto-generated constructor stub
    public OopsCode getReceiver() {
        return receiver;
    }

    /**
     * @param receiver the receiver to set
     */
    public void setReceiver(OopsCode receiver) {
        this.receiver = receiver;
    }

    @Override
    public OopsObject evaluate(OopsState state) {
    	OopsObject callee = this.receiver.evaluate(state);
    	OopsObject[] results = new OopsObject[this.args.length];
    	for(int i=0;i<this.args.length;i++){
    		results[i] = this.args[i].evaluate(state);
    	}
        return callee.respond(selector, results, state);
    }
    
    
    
}
