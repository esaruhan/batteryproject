
import java.util.TimerTask;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LifeBook
 */
public class Task extends TimerTask{

    @Override
    public void run() {
        Kernel32.SYSTEM_POWER_STATUS batteryStatus = new Kernel32.SYSTEM_POWER_STATUS();
        Kernel32.INSTANCE.GetSystemPowerStatus(batteryStatus);
        System.out.println(batteryStatus);
        if(batteryStatus.toString().contains("Low, less than 33 percent")){
                     System.err.print("BATTERY LOW");      
                      SendEmail mal = new SendEmail(batteryStatus.toString());
        } else {
                    System.err.print("BATTERY FINE");
                   
        }
    }
    
    
}
