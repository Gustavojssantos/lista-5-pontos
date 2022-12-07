import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class questao8 {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
 
		try (Scanner in = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("0.000");
            int R;
            double pi, VOLUME;

            pi = 3.14159;
            R = in.nextInt();

            VOLUME = (4/3.0) * pi * Math.pow(R,3);
            System.out.println("VOLUME = " + df.format(VOLUME));
        }

    }
}