package behaviorType.chain;

public abstract class RequestHandler {
    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handlerRequest(Request res) {
        if (res != null) {
            next.handlerRequest(res);
        }
    }

    protected void printHandling(Request req) {
        System.out.println(this + "handling request" + req);
    }

    @Override
    public abstract String toString();
}
