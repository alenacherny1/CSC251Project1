
public class Policy
{
/**This will model an insurance policy for one person**/
   private int polNum;
   private String provName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   /**this will be a no args default setting. 
      no args = no parameters or data type**/
   public Policy(int polNum, String provName, String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
    this.polNum = polNum;
    this.provName = provName;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.smokingStatus = smokingStatus;
    this.height = height;
    this.weight = weight;
}
   //setter methods
   public void SetPolNum(int p)
   {
   polNum = p;
   }
   
   public void SetProvName(String prov)
   {
   provName = prov;
   }
   
   public void SetFirstName(String first)
   {
   firstName = first;
   }
   
   public void SetLastName(String last)
   {
   lastName = last;
   }
   
   public void SetAge(int a)
   {
   age = a;
   }
   
   public void SetSmokingStatus(String stat)
   {
   smokingStatus = stat;
   }
   
   public void SetHeight(double h)
   {
   height = h;
   }
   
   public void SetWeight(double w)
   {
   weight = w;
   }
   
   //getter methods
   public double GetPolNum()
   {
   return polNum;
   }
   
   public String GetProvName()
   {
   return provName;
   }
   
   public String GetFirstName()
   {
   return firstName;
   }
   
   public String GetLastName()
   {
   return lastName;
   }
   
   public int GetAge()
   {
   return age;
   }
   
   public String GetSmokingStatus()
   {
   return smokingStatus;
   }
   
   public double GetHeight()
   {
   return height;
   }
   
   public double GetWeight()
   {
   return weight;
   }
   
   public double BMI()
   {
   
    double bmi = (weight * 703) / (height * height);
    return bmi;
   }
  
     public double Price()
   {
   double bmi = BMI();
   final double BASE_FEE = 600;
   final double OVER_FIFTY_FEE = 75;
   final double SMOKER_FEE = 100;
   final double maxAge = 50;
   final double maxBMI = 35;
   double addFee = (bmi - maxBMI) * 20;
   double Price = 0.0;
   
   Price += BASE_FEE;
   
   if (age > maxAge)
   {
   Price += OVER_FIFTY_FEE;
   }
   
   if (smokingStatus.equalsIgnoreCase("smoker"))
   {
   Price += SMOKER_FEE;
   }
   
   if (bmi > maxBMI)
   {
   Price += addFee;
   } 
   
   return Price;
   }
   
   
   
   
   
     
}