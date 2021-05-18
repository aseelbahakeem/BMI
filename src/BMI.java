import java.util.*;
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       //prompt the user to enter weight in pound 
       System.out.println(" Enter weight in pound: ");
       Double weight = input.nextDouble();
       
       //prompt the user to enter height in inches 
       System.out.println(" Enter height in inches: ");
       Double height = input.nextDouble();
       
       final double KILOGRAM_PER_POUND = 0.45359237 ; // constant ( One pound is 0.45359237 kilogram
       final double METER_PER_INCHES = 0.0254 ; // CONSTANT ( one inches is 0.0254 meters 
       
       // compute BMI 
       double weightInKilogram = weight * KILOGRAM_PER_POUND ;
       double heightInmeter = height * METER_PER_INCHES ; 
       
       double BMI = weightInKilogram / ( heightInmeter * heightInmeter );
       
       // display result 
       System.out.println(" BMI is : "+ BMI );
       if ( BMI < 18.5 ) {
           System.out.println("underweight");
       }
       else if ( BMI >= 18.5 && BMI < 25.0 ) {
           System.out.println(" Normal ");
       }
       else if ( BMI >= 25.0 && BMI < 30.0 ) {
           System.out.println(" Overweight ");
       }
       else {
           System.out.println(" Obese ");

       }
           
           
           
       
       
      
    }
    
}
