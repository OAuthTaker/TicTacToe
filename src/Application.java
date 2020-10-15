import java.util.Scanner;

public class Application{
    
    
    static char b = ' ';
    static char u = 'O';
    static char c = 'X';
    static char[] bval = {b, b, b, b, b, b, b, b, b};
    static boolean gameOn = true;
    static int uval = 0;
    
    public static void main(String arg[]){
     
        clrscrn();
        Engine eng = new Engine();
        System.out.println("Welcome to the UNBEATABLE TicTacToe Engine by OAuthTaker.\nPlay This Game with your Number Pad.\nEnter anything to move ahead to TOSS.");
        Scanner sc = new Scanner(System.in);
        sc.next();
        toss();
        System.out.println("\nEnter anything to move ahead to GAME.");
        sc.next();
        eng.e1();
    }
    
    static void toss(){
        clrscrn();
        System.out.println("These are the results of a random toss:-\n\nComputer - X\nYou - O\nAs you might know, X plays first"); 
    }
        
    static void board(){    
    	clrscrn();
        System.out.println(bval[0] + " |" + bval[1] + " |" + bval[2]);
        System.out.println("--" + "+" + "--" + "+" + "--");
        System.out.println(bval[3] + " |" + bval[4] + " |" + bval[5]);
        System.out.println("--" + "+" + "--" + "+" + "--");
        System.out.println(bval[6] + " |" + bval[7] + " |" + bval[8]);
        System.out.println("\n\nEnter Your Move:- ");
        
        uservalupdate();
        clrscrn();
        System.out.println(bval[0] + " |" + bval[1] + " |" + bval[2]);
        System.out.println("--" + "+" + "--" + "+" + "--");
        System.out.println(bval[3] + " |" + bval[4] + " |" + bval[5]);
        System.out.println("--" + "+" + "--" + "+" + "--");
        System.out.println(bval[6] + " |" + bval[7] + " |" + bval[8]);
        System.out.println("\n\nComputer Thinking...");
        wait(2000); 
    }
    
    static void win(){    
        clrscrn();
        System.out.println(bval[0] + " |" + bval[1] + " |" + bval[2]);
        System.out.println("--" + "+" + "--" + "+" + "--");
        System.out.println(bval[3] + " |" + bval[4] + " |" + bval[5]);
        System.out.println("--" + "+" + "--" + "+" + "--");
        System.out.println(bval[6] + " |" + bval[7] + " |" + bval[8]);
        System.out.println("\n\nComputer Won, NOTHING UNUSUAL"); 
        gameover();
    }

    static void draw(){    
        clrscrn();
        System.out.println(bval[0] + " |" + bval[1] + " |" + bval[2]);
        System.out.println("--" + "+" + "--" + "+" + "--");
        System.out.println(bval[3] + " |" + bval[4] + " |" + bval[5]);
        System.out.println("--" + "+" + "--" + "+" + "--");
        System.out.println(bval[6] + " |" + bval[7] + " |" + bval[8]);
        System.out.println("\n\nDRAW... but remember, you CANNOT win, how about a rematch?"); 
        gameover();
    }
    
    static void uservalupdate(){
    	Scanner sc = new Scanner(System.in);
        uval = sc.nextInt();
        switch(uval) {
        case 7: Engine.a = 0;
        break;
        case 8:	Engine.a = 1;
        break;
        case 9:	Engine.a = 2;
        break;
        case 4:	Engine.a = 3;
        break;
        case 5:	Engine.a = 4;
        break;
        case 6:	Engine.a = 5;
        break;
        case 1:	Engine.a = 6;
        break;
        case 2:	Engine.a = 7;
        break;
        case 3:	Engine.a = 8;
        break;
        default: System.out.println("Wrong Choice, Try Again");uservalupdate();break;}
        
        if(bval[Engine.a]!=b) {System.out.println("Space Occupied, Try Again");uservalupdate();}
        else bval[Engine.a]=u; 	
            
        }
    
    public static void wait(int ms){
    	try{
    		Thread.sleep(ms);
    		}catch(InterruptedException ex){
    			Thread.currentThread().interrupt();
    			}
    	}
    
    static void clrscrn() {
    	for(int i=1; i<=50; i++)
    		System.out.println();
    }
    
    static void gameover() {
    	wait(1000);
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Do you want a rematch?(yes/no)");
        switch(sc.next()) {
        case "yes":breset();Engine.e1();break;
        case "no":System.exit(0);break;
        default:System.out.println("Wrong choice");wait(500);gameover();break;
        }
    }
    
    static void breset() {
    	for(int i=0; i<=8; i++)
    		bval[i]=b;
    }
}
