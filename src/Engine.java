public class Engine {

	static int a = 0;
	
	public static void e1() {
		p(0);
		switch(a) {
		
		case 1:p(6);
			   if(a!=3)pw(3);
			   else p(8);
			   if(a!=4)pw(4);
			   else pw(7);
		
		case 2:p(6);
		 	   if(a!=3)pw(3);
		       else p(8);
		       if(a!=4)pw(4);
		       else pw(7);
			
		case 3:p(2);
		       if(a!=1)pw(1);
		       else p(8);
		       if(a!=4)pw(4);
		       else pw(5);
			
		case 4:p(8);
			   switch(a) {
			   case 1:p(7);
			   		  if(a!=6)pw(6);
		              else p(2);
			   		  if(a!=5)pw(5);
		              else pd(3);
				   
			   case 2:p(6);
			          if(a!=3)pw(3);
	                  else pw(7);
				   
			   case 3:p(5);
		   		      if(a!=2)pw(2);
	                  else p(6);
		   		      if(a!=7)pw(7);
	                  else pd(1);
				   
			   case 5:p(3);
		    		  if(a!=6)pw(6);
	                  else p(2);
		   	    	  if(a!=1)pw(1);
	                  else pd(7);
				   
			   case 6:p(2);
		              if(a!=1)pw(1);
                      else pw(5);
				   
			   case 7:p(1);
     	   		      if(a!=2)pw(2);
                      else p(6);
	   	     	      if(a!=3)pw(3);
                      else pd(5);
				   
			   }
			
		case 5:p(2);
     	       if(a!=1)pw(1);
	           else p(6);
	           if(a!=3)pw(3);
	           else pw(4);
			
		case 6:p(2);
	           if(a!=1)pw(1);
	           else p(8);
	           if(a!=4)pw(4);
	           else pw(5);
			
		case 7:p(2);
			   if(a!=1)pw(1);
			   else p(8);
			   if(a!=4)pw(4);
			   else pw(5);
			
		case 8:p(2);
			   if(a!=1)pw(1);
			   else p(6);
			   if(a!=3)pw(3);
			   else pw(4);
			
			
		}				
	}
	
	public static void p(int abc) {
		Application a = new Application();
		
		a.bval[abc]=a.c;
		a.board();
	}
	
	public static void pw(int abc) {
		Application a = new Application();
		
		a.bval[abc]=a.c;
		a.win();
	}
	
	public static void pd(int abc) {
		Application a = new Application();
		
		a.bval[abc]=a.c;
		a.draw();
	}
}
