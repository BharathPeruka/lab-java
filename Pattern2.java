public class Pattern2 {
    public static void main(String[] args) {
        int rows= 30;
        for(int i=0; i<rows; i++) {
            for (int j=0; j<rows; j++) {
                if (i==0 && j<(rows-1)/2 && j>0 || j==0 && i>0 || i==(rows-1)/2 && j<(rows-1)/2|| j==(rows-1)/2 && i>0 ) {
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
