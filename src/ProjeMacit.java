
import java.util.Timer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LifeBook
 */
public class ProjeMacit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {             
        // TODO code application logic here

//        Kernel32.SYSTEM_POWER_STATUS batteryStatus = new Kernel32.SYSTEM_POWER_STATUS();
//       Kernel32.INSTANCE.GetSystemPowerStatus(batteryStatus);            
//       System.out.println(batteryStatus);
        
        
       Timer timer = new Timer();
   
       // Schedule to run after every 3 second(3000 millisecond)
       timer.schedule( new Task(), 10000); 
        
    }
}
