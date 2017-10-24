package behaviorType.chain;

public class OrcOfficer extends RequestHandler{
    public OrcOfficer(RequestHandler next) {
        super(next);
    }

    @Override
    public void handlerRequest(Request res) {
        if(res.getRequestType().equals(RequestType.TORTURE_PRISONER)){
            printHandling(res);
            res.markHandled();
        }else{
            super.handlerRequest(res);
        }
    }

    @Override
    public String toString() {
        return "orc officer";
    }
}
