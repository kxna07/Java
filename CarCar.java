public  class CarCar {
    String model;
    int yrOfMade;
    
    CarCar(String model, int year){
        this.model=model;
        this.yrOfMade=year;
    }

    void display(){
        System.out.println("Model : "+model+" Year of made : "+yrOfMade);
    }
}
