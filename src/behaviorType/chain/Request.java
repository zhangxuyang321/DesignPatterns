package behaviorType.chain;

import java.util.Objects;

public class Request {
    private RequestType requestType;
    private String requestDesc;
    private boolean handled;

    public Request(RequestType requestType, String requestDesc){
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDesc = Objects.requireNonNull(requestDesc);
    }

    public String getRequestDesc() {
        return requestDesc;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public boolean isHandled() {
        return handled;
    }

    public void markHandled(){
        this.handled = true;
    }

    @Override
    public String toString() { return getRequestDesc(); }
}
