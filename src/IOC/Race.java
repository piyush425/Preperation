package IOC;

public class Race {

    private car car;  //=new Maruti();

    public Race(car car) {
        this.car = car;
    }

    public void run(){
        System.out.println(car.start());
    }
}
