package behaviorType.chain;

public class OrcCommander extends RequestHandler{
    public OrcCommander(RequestHandler next) {
        super(next);
    }

    @Override
    public void handlerRequest(Request res) {
        if(res.getRequestType().equals(RequestType.DEFEND_CASTLE)){
            printHandling(res);
            res.markHandled();
        }else{
            super.handlerRequest(res);
        }
    }

    @Override
    public String toString() {
        return "Orc Commander";
    }
}
