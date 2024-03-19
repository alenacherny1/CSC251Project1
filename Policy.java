
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
   public Policy(int p, String n, String f, String l, int a, String s, double h, double w) {
    polNum = p;
    provName = n;
    firstName = f;
    lastName = l;
    age = a;
    smokingStatus = s;
    height = h;
    weight = w;
}
   //setter methods

   /**this method will set the policy number
   @param p **/
   public void SetPolNum(int p)
   {
   polNum = p;
   }

   /**this method will set the provider name
   @param n **/
   public void SetProvName(String n)
   {
   provName = n;
   }
   
   /**this method will set the policyholder's first name
   @param f**/public void SetFirstName(String f)
   {
   firstName = f;
   }

   /**this method will set the policyholder's last name
   @param l **/
   public void SetLastName(String l)
   {
   lastName = l;
   }

   /**this method will set the policyholder's age
   @param a **/
   public void SetAge(int a)
   {
   age = a;
   }

   /**this method will set the policyholder's smoking status
   @param s **/
   public void SetSmokingStatus(String s)
   {
   smokingStatus = s;
   }

   /**this method will set the policyholder's height
   @param h **/
   public void SetHeight(double h)
   {
   height = h;
   }

   /**this method will set the policyholder's weight
   @param w **/
   public void SetWeight(double w)
   {
   weight = w;
   }
   
   //getter methods
   /**this method will get the policy number and return it
   @return polNum **/
   public double GetPolNum()
   {
   return polNum;
   }

   /**this method will get the policy provider name and return it
   @return provName **/
   public String GetProvName()
   {
   return provName;
   }

   /**this method will get the policyholders first name and return it
   @return firstName **/
   public String GetFirstName()
   {
   return firstName;
   }

   /**this method will get the policyholders last name and return it
   @return lastName **/
   public String GetLastName()
   {
   return lastName;
   }

   /**this method will get the policyholder's age and return it
   @return age **/
   public int GetAge()
   {
   return age;
   }

   /**this method will get the policyholder's smoking status and return it
   @return smokingStatus **/
   public String GetSmokingStatus()
   {
   return smokingStatus;
   }

   /**this method will get the policyholder's height and return it
   @return height **/
   public double GetHeight()
   {
   return height;
   }

   /**this method will get the policyholder's weight and return it
   @return weight **/
   public double GetWeight()
   {
   return weight;
   }

   /**this method will take the policyholder's weight, and height. It will then run a calculation and 
   return the answer
   @return bmi **/
   public double BMI()
   {
   
    double bmi = (weight * 703) / (height * height);
    return bmi;
   }
  
   /**this methof will take all the acquired information and return the price
   @return Price**/
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
