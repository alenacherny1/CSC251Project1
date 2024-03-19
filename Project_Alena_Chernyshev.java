import java.util.*;

public class Project_Alena_Chernyshev
{
   public static void main(String[] args)
   {
   //this method will display all of the info pulled from the policy class and display it
   
   Scanner key = new Scanner(System.in);
   
   System.out.print("Please enter the Policy Number: ");
   int polNum = key.nextInt();
   
   key.nextLine();//clears buffer for string value after numeric
   
    System.out.print("\nPlease enter the Provider Name: ");
    String provName = key.nextLine();
    
    System.out.print("\nPlease enter the Policyholder's First Name: ");
    String firstName = key.nextLine();
    
    System.out.print("\nPlease enter the Policyholder's Last Name: ");
    String lastName = key.nextLine();
    
    System.out.print("\nPlease enter the Policyholder's Age: "); 
    int age = key.nextInt();
    
    key.nextLine();
    
    System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): " );
    String smokingStatus = key.nextLine();
    
    System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
    double height = key.nextDouble();
    
    System.out.print("\nPlease enter the Policyholder's Weight (in pounds) ");
    double weight = key.nextDouble();
    
    Policy p = new Policy(polNum, provName, firstName, lastName, age, smokingStatus, height, weight);
    
    System.out.println("Policy Number: " + p.GetPolNum());
    System.out.println("Provider Name: " + p.GetProvName());
    System.out.println("Policyholder's First Name: " + p.GetFirstName());
    System.out.println("Policyholder's Last Name: " + p.GetLastName());
    System.out.println("Policyholder's Age: " + p.GetAge());
    System.out.println("Policyholder's Smoking Status: " + p.GetSmokingStatus()); 
    System.out.printf("\nPolicyholder's Height: %,.2f inches", p.GetHeight());
    System.out.printf("\nPolicyholder's Weight %,.2f pounds", p.GetWeight());
    System.out.printf("\nPolicyholder's BMI: %.2f", p.BMI());
    System.out.printf("\nPolicy Price: $%,.2f ", p.Price());
    }
 }