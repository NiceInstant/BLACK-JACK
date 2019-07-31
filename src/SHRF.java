
public class SHRF {

	public static void main(String[] args) {
		int Feb1 = 0;
        int Feb2 = 1;
        int sum = 0;

        do
        {
            sum = Feb1 + Feb2;
            Feb1 = Feb2;
            Feb2 = sum;

            if (Feb2 % 2 == 0)
                sum = sum + Feb2;
        }
        while (Feb2 < 4000000);

        System.out.println("A="+sum);
		summ();
    }
    		    
	

   static void summ() {  
   int sum = 0;
    int a = 0; 

    for (int i = 0; i <= 1000; i++) {
        if (i % 3 == 0) {
            sum = sum + i;
        }            
    }

    for (int j = 0; j <= 1000; j++) {
        if (j % 5 == 0) {
            a = a + j;
        
        }
    }
    System.out.println("B=" +sum + a);
   }

}