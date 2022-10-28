package gcd_of_two_numbers;
class GCD_Finder_2 {
    public static void main(String[] args) {
  
      // find GCD between n1 and n2
      int n1 = 81, n2 = 153;
      
      while(n1 != n2) {
      
        if(n1 > n2) {
          n1 -= n2;
        }
        
        else {
          n2 -= n1;
        }
      }
  
      System.out.println("GCD: " + n1);
    }
  }