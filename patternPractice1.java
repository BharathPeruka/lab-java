/**
 * patternPractice1
 */
// print hollow square
public class patternPractice1 {

    public static void main(String[] args) {
        int rows = 5;
        //horizantal lines i
        for(int i=0; i<rows; i++) {
            //vertical pattern j
            for(int j=0; j<rows;j++) {
                if (i==0 || j==0 || i==rows-1 || j==rows-1) {
                    System.out.print("*");
                    
                } 
                else {
                    System.out.print(" ");
                }
                
            }
            
            System.out.println();
        }
    }
}