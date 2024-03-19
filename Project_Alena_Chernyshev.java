import java.util.*;
import java.util.Scanner;

public class Project_Alena_Chernyshev
{
   public static void main(String[] args)
   {
   //this method will display all of the info pulled from the policy class and display it

   File input = new File("PolicyInformation.txt");
   Scanner key = new Scanner(input);
   int smoker = 0, nonsmoker = 0;
     
     while(key.hasNext())
       {
   int polNum = key.nextInt();
   key.nextLine();//clears buffer for string value after numeric value
    String provName = key.nextLine();
    String firstName = key.nextLine();
    String lastName = key.nextLine();
    int age = key.nextInt();
    key.nextLine();
    String smokingStatus = key.nextLine();
    double height = key.nextDouble();
    double weight = key.nextDouble();

      if(input.hasNext())  //checks for next line
      input.nextLine(); //clears buffer
      
      if(input.hasNext())
      input.nextLine();
    if(smokingStatus.equals("smoker"));
         {
           smoker++;
         }
    else{
      nonsmoker++;
    }
         
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
     System.out.printf("\nThe number of policies with a smoker is: %d", smoker);
     System.out.printf("\nThe number of policies with a smoker is: %d", nonsmoker);
   }
 }
