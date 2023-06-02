package jungol.Language_Coder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice9055 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader (new InputStreamReader (System. in));
            String input = br.readLine();
            for (int i = 0; i < input. length()/2; i++) {
                if (input.charAt (i) != input.charAt (input. length()-1-i)) {
                    System.out.println(0);
                    break;
//                    if (i == input. length()/2-1) System.out.println(1);
//                    br.close ();

            }
        }
    }
}
