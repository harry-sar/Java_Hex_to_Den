import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class HexDenConverter {
    public static void main(String[] args){
//        out.println(HextoDec_Scanner());
        out.println(HextoDec("3F"));
}
    public static int HextoDec_Scanner() {
        int Total_Dec = 0;
        int Current_Val;
        ArrayList<String> HexDigits = new ArrayList<String>(Arrays.asList
                ("1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"));
        Scanner GetInp = new Scanner(in);
        out.println("Enter Hex Number to convert to Den:");
        String HexChar = GetInp.nextLine();
        String[] HexList = HexChar.split("");
        Collections.reverse(Arrays.asList(HexList));
        for (int i = 0; i < HexList.length; i++) {
            Current_Val = HexDigits.indexOf(HexList[i]) + 1;
//            out.println(Current_Val);
            Total_Dec += Current_Val * Math.pow(16, i);
        }
        return Total_Dec;
    }

    public static int HextoDec(String HexChar){
        int Total_Dec = 0;
        int Current_Val;
        ArrayList<String> HexDigits = new ArrayList<String>(Arrays.asList
                ("1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"));
        String[] HexList = HexChar.split("");
        Collections.reverse(Arrays.asList(HexList));
        for (int i = 0; i < HexList.length; i++) {
            Current_Val = HexDigits.indexOf(HexList[i]) + 1;
//            out.println(Current_Val);
            Total_Dec += Current_Val * Math.pow(16, i);
        }
        return Total_Dec;

    }
}
