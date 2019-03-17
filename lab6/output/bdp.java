
/**
 * Write a description of class bdp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class bdp
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class bdp
     */
    public bdp()
    {
        // initialise instance variables
        x = 0;
    }
    
    
        public static void main(String[] args) throws IOException  
        { 
        //Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
        
        System.out.println("What would you like to order? (Order is LBB)");
         
        // Reading data using readLine 
        String burger = reader.readLine(); 
  
        // Printing the read line 
        //System.out.println(name);         
        if (burger.equals("LBB")){
        System.out.println(burger);
        System.out.println( "               " + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()) );
        System.out.println( "\n" );
        System.out.println("                  " + "FIVE GUYS");
        System.out.println("   Order Number:"   + "   45");
        System.out.println("   1"+"  LBB"   + "                       5.59");
        System.out.println("         {{{{ BACON }}}}" );
        System.out.println("         LETTUCE" );
        System.out.println("         TOMATO" );
        System.out.println("         -> |G ONION" );
        System.out.println("         -> |JALA Grilled" );
        System.out.println("   1"+"  LTL CAJ"   + "                       2.79");
        System.out.println( "\n" );
        System.out.println("         Sub. Total:"+"                      $8.38" );
        System.out.println("         Tax:"+"                             $0.76" );
        System.out.println("         Total:"+"                           $9.14" );
        System.out.println( "\n" );
        System.out.println("         Cash $20"+"                        $20.00" );
        System.out.println("         Change"+"                          $10.86" );
        System.out.println("     Register:1"+"         "+"Tran Seq No:   57845" );
        System.out.println("     Cashier:Sakda* S.");
        System.out.println( "      ******************************************" );
        System.out.println( "        Don't throw away your receipt!!!" );
        System.out.println( "\n" );
        System.out.println( "Packaging Slip" );
        System.out.println( "PATTIES - 1" );
        System.out.println( "\n" );
        System.out.println( "Order Number: 45" );
        System.out.println( "               " + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()) );
        System.out.println("                  " + "FIVE GUYS");
        System.out.println( "\n" );
        System.out.println( "Sandwich# 1" );
        System.out.println( "1"+"  LBB");
        System.out.println("       LETTUCE" );
        System.out.println("       TOMATO" );
        System.out.println("       -> |G ONION" );
        System.out.println("       -> |JALA Grilled" );
        System.out.println("         {{{{ BACON }}}}" );
        System.out.println( "\n" );
        System.out.println( "1"+"  LTL CAJ");
        System.out.println("     Register:1"+"         "+"Tran Seq No:   57845" );
        System.out.println("     Cashier:Sakda* S.");
        

//        System.out.println(LocalDateTime.now());
        
    }
        else{
        System.out.println("please enter a valid order");
    }
        
        
        }    

   

}
