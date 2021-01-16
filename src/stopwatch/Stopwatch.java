
package stopwatch;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Stopwatch {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("How many seconds?");
        int time=input.nextInt();
        
        for (int i = time; i > 0; i--) {
            try{
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){
            
            }
        }
        
        try{
        new MP3Player(new File("MEGALOVANIA.mp3")).play();
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            TimeUnit.SECONDS.sleep(156);
        }catch(Exception e){
            
        }
    }
    
}
