import java.util.Scanner;
public class ArrOfObjects {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CarCar[] Cars=new CarCar[3];

        //Cars[0]=new CarCar("Mustang",1969);
       // Cars[1]=new CarCar("Corvette",2005);
        //Cars[2]=new CarCar("Camero",2002);

        for(int i=0;i<Cars.length;i++){
           // Cars[i].display();
           System.out.println("********************");;
           System.out.print("Enter a car model : ");
           String CarModel=sc.next();
            
           System.out.println("********************");
           System.out.print("Enter Yr of made : ");
           int year=sc.nextInt();

            Cars[i]=new CarCar(CarModel, year);

               
        } 

        for(int i=0;i<Cars.length;i++){
            System.out.println("********************");
            Cars[i].display();     
        }
        
        sc.close();
    }
    

}
