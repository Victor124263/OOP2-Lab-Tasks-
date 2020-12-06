import java.util.ArrayList;

public class YearRange{

  int a,b,rangeType;
  
  int divisor1=14,divisor2=20;
  
  ArrayList<Integer> leapYears = new ArrayList<Integer>();
  
  YearRange(int A,int B){
   a = A;
   b = B;
  }
  
  
  public void setRangeType(int rng){
    rangeType = rng;
    if(rng==3){
      fillolympic();
    }else if(rng==2){
      fillleapyear();
    }
  }
  

  public int getFirstDivisor(){
    return divisor1;
  }
  
  public int getSecondDivisor(){
    return divisor2;
  }
  
  public void divisibleYears(int div1,int div2){
    for(int i = a;i<=b;i++){
      
      if(i%div1==0 && i%div2==0){
        System.out.println(i);
      }
    }
  
  }
  
 public int getFirstYear(){
     return leapYears.get(0);
   
  }

 public int getSecondYear(){
    return leapYears.get(1);
 
  }

  private void fillolympic(){
    leapYears.clear();
    for(int i=a;i<=b;i+=4){
      if(i%3==0){
        leapYears.add(i);
      }
    }


  }

  private void fillleapyear(){
    leapYears.clear();
    for(int i = a;i<=b;i++ ){
      if(i%4==0){

        leapYears.add(i);

      }
    }
  }

  private void leapyearprint(){
    for(int i =0;i<leapYears.size();i++){
      System.out.println(leapYears.get(i));
    }
  }
  
  public void printYears(){
  
    switch(rangeType){
        case 1:
          divisibleYears(divisor1,divisor2);
          break;
        case 2:
          leapyearprint();
          break;
        case 3:
          leapyearprint();
          break;
      }
  
  }
  
  }