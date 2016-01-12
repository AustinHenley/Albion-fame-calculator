
/**
 * Write a description of class fame here.
 * calculates fame required for next teir
 * @author Austin "Feare" Henley 
 * @version 0.1 alpha
 */

import java.io.*;
import java.util.*;
public class main
{
    public static void main(String args[])
    {
        boolean Loop = true;
        
        char confirm;
        
        Scanner rdr = new Scanner(System.in);
        while(Loop == true)
        {
            System.out.print("Total fame required for next tier: ");
        
            int init_fame = rdr.nextInt();
        
            System.out.print("Fame already aquired: ");
        
            int fame = rdr.nextInt();
        
            System.out.print("What tier of creature? ");
        
            int tier = rdr.nextInt();
        
            int total = init_fame - fame;
        
            int mob_fame = 0;
        
            switch(tier)
            {
                case 1:
                    mob_fame = 0;
                    break;    
                case 2:
                    mob_fame = 16;
                    break;
                case 3:
                    mob_fame = 21;
                    break;
                case 4:
                    mob_fame = 32;
                    break;
                case 5:
                    mob_fame = 47;
                    break;
                case 6:
                    mob_fame = 142;
                    break;
                case 7:
                    mob_fame = 213;
                    break;
                case 8:
                    mob_fame = 478;
                    break;
                default:
                    break;
                }
                System.out.println("You need to kill " + (total / mob_fame) + " tier " + tier + " creature(s).");
                
                System.out.print("Run again? (y/n): ");
                
                confirm = rdr.next().charAt(0);
                
                switch(confirm)
                {
                    case 'y':
                        Loop = true;
                        break;
                    case 'n':
                        Loop = false;
                        break;
                    default:
                        System.out.println("Invalid option, restarting loop...");
                }
            }
    }
}
