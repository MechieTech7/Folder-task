class Car{  
  void run()
{System.out.println("car is running");}  
}  
class Mini extends Car{  
    
  void run()
{System.out.println("mini is a super car");}  
  
  public static void main(String args[])
{  
  Mini obj = new Mini();  
  obj.run();  
  }  
}  