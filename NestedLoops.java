public class NestedLoops {
    public static void main(String[] args) {
        
        // 7 - Nested Loops

        for(int m = 1; m <= 3; m++){

            System.out.println("EXTERNO!");

            for(int n = 1; n <= 3; n++){

                System.out.println(m + " x " + n + " = " + (m * n));
            }
        }

        for(int o = 1; o <= 5; o++){

            for(int p = 1; p <= o; p++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
