class Engine{
    void start(){
        System.out.println("engine is starting..");

    }
}

class Car{
    private Engine engine;
    Car(){
        this.engine=new Engine();

    }
    void drive(){
    engine.start();
    System.out.println("car is moving");
    }
}
