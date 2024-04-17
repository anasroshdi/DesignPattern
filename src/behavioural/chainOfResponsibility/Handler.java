package behavioural.chainOfResponsibility;

public abstract class Handler {

    private Handler next;

    public Handler setNextHandler(Handler next){
        this.next = next;
        return next;
    }

    //this one can be removed to interface and make the handler class implement the interface
    public abstract boolean handle(String username, String password);

    //this method will house the convenient default behavioural of the handler which is to forward the request to the next object
    protected boolean handleNext(String username,String password){
        if(next==null){
            return true;
        }

        return next.handle(username,password);
    }

}

