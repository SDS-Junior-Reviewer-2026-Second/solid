package greeter;

public class CasualGreeterMessage implements GreeterMessage{
    public CasualGreeterMessage() {
    }
    @Override
    public String getMessage() {
        return "Sup bro?";
    }
}





class FlyableBird {


}
class UnflaybleBird{


}


class Bird{
    void molt(){};
}


class flyableBird extends Bird{
    void fly(){};
}

class Sparrow extends flyableBird {


}

interface flyable{
    void fly();
}
class Eagle extends Bird implements flyable{

    @Override
    public void fly() {

    }
}









