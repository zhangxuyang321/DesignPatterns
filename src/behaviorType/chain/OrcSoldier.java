package behaviorType.chain;

public class OrcSoldier extends RequestHandler {
    public OrcSoldier(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handlerRequest(Request res) {
        if (res.getRequestType().equals(RequestType.COLLECT_TAX)) {
            printHandling(res);
            res.markHandled();
        } else {
            super.handlerRequest(res);
        }
    }

    @Override
    public String toString() {
        return "Orc Soldier";
    }
}
