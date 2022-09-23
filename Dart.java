
import java.util.Random;
import java.util.Scanner;

public class Dart {
    public static void main(String[] args) {
        Random rand = new Random();     
        Scanner scn = new Scanner(System.in); 
        
        System.out.println("DART GAME!");
        System.out.print("Enter the number of darts to be thrown: ");
        int numberOfDarts = scn.nextInt(); 
        int CopyNumberOfDarts = numberOfDarts;
        System.out.println(""); 
        
        int dart = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int undecided = 0;

        while (numberOfDarts > 0) {            
            
            float x = (float) ((rand.nextInt(19) - 9) / 10.0);
            float y = (float) ((rand.nextInt(19) - 9) / 10.0);
            String region = null;   
            
            if ((x + y) == 1 || x==y && x<0 && y<0 || x==0 ||  y==0){ 
                region = "Undecided";
                undecided ++;
            }else if (x>0 && y>0 && (x+y)<1){ 
                region = "A";
                a ++;
            }else if (x>0 && y>0 && (x+y)>1){
                region = "B";
                b ++; 
            }else if (x<0 && y>0){ 
                region = "C";
                c ++;
            }else if (x<0 && y<0 && x<y){ 
                region = "D";
                d ++;
            }else if (x<0 && y<0 && x>y){ 
                region = "E"; 
                e ++;
            }else if (x>0 && y<0){ 
                region = "F";
                f ++;
            }
            numberOfDarts --;
            dart ++;
            
            System.out.println("Dart " + dart + ":"); 
            System.out.print("Coordinates: (" + x + "," + y + ")");
            System.out.println(" Region: " + region);            
        }
        System.out.println("");
        System.out.println("Region statistic: ");
        System.out.println("A: " + a + " darts ("  + ((int)(a * 100.0/CopyNumberOfDarts*10)) /10.0 +  "%)");
        System.out.println("B: " + b + " darts ("  + ((int)(b * 100.0/CopyNumberOfDarts*10)) /10.0 +  "%)");        
        System.out.println("C: " + c + " darts ("  + ((int)(c * 100.0/CopyNumberOfDarts*10)) /10.0 +  "%)");
        System.out.println("D: " + d + " darts ("  + ((int)(d * 100.0/CopyNumberOfDarts*10)) /10.0 +  "%)");
        System.out.println("E: " + e + " darts ("  + ((int)(e * 100.0/CopyNumberOfDarts*10)) /10.0 +  "%)");
        System.out.println("F: " + f + " darts ("  + ((int)(f * 100.0/CopyNumberOfDarts*10)) /10.0 +  "%)");     
        System.out.println("Undecided: " + undecided + " darts ("  + ((int)(undecided * 100.0/CopyNumberOfDarts*10)) /10.0 +  "%)");        
    }
    
}
