package LAB2;

public interface Sedan extends Automobile  {
    public static void Audi() {
        //super();
        System.out.println("This is an extension of Vehicle");
        }
        
        @Override
        public default void accelerate() {
            //System.out.println("This is overriding");
        }

        public static void main(String args[]){
     
            System.out.println("This is an overridden method of the instance Audi in the Sedan class");
      
      
          }
            
    
    
}
