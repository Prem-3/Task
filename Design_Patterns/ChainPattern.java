class MyNumber {
    private String value;

    public MyNumber(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyNumber [value=" + value + "]";
    }

}

class Request {
    private MyNumber number;

    Request(MyNumber number) {
        this.number = number;
    }

    public MyNumber getNumber() {
        return number;
    }
}

abstract class Handler {
    protected Handler nextHandler;

    Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
class NegativeNumberHandler extends Handler{
    NegativeNumberHandler(Handler nextHandler) {
        super(nextHandler);


    }
}
class PositiveNumberHandler extends Handler{
    PositiveNumberHandler(Handler nextHandler) {
        super(nextHandler);


    }
}
class ZeroHandler extends Handler{
    ZeroHandler(Handler nextHandler) {
        super(nextHandler);


    }
}
class NotAnIntegerHandler extends Handler{
    NotAnIntegerHandler(Handler nextHandler) {
        super(nextHandler);


    }
}
class Chain {
    Handler firstHandler;

    Chain() {
        buildChain();

        
    }
}