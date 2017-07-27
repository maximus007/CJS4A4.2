
class Car
{
    public String shape; // Methods implementation and class/Instance members is a elements
    public String color;
    public void carInfo()
    {  
    System.out.println("Car Color= "+color + " Shape= " +shape);  
}
    public void setColor(String color) {  //setting values
        this.color = color;  
    }  
    public void setShape(String shape) {  
        this.shape = shape;  
    }  
}

class Mustang extends Car //Mustang extends Car and thus inherits all methods from Car 
{
public void MustangStartDemo(){  // Mustang has an engine
        Engine MustangEngine = new Engine();  
        MustangEngine.start();  
        }  
    }  
 class Engine {  
    public void start(){  
        System.out.println("Engine Started:");  
    }  
    public void stop(){  
        System.out.println("Engine Stopped:");  
    }  
}  


public class Relationships { //calling

    public static void main(String[] args) {
        Mustang mustangV8=new Mustang();
        
         mustangV8.setColor("Red");
         mustangV8.setShape("Coupe");
         mustangV8.carInfo();
         mustangV8.MustangStartDemo();
        
        
        
        
    }
    
}
