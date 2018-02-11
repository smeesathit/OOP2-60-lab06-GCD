
/**
 * โปรแกรมหา ห.ร.ม. (ตัวหารร่วมมาก)
 */
import javax.swing.JOptionPane;

public class GCD_Program
{
    public static void main(String[] args){
        GCD_Program program = new GCD_Program();

        program.start();
    }

    /**
     * Constructor for objects of class GCD_Program
     */
    public GCD_Program()
    {

    }

    private void start(){
        String inputStr;
        int num1, num2;
        int answer;

        do {
            do {
                inputStr = JOptionPane.showInputDialog(
                    null, "จำนวนเต็มที่ 1");

                num1 = Integer.parseInt(inputStr);

                if (num1 <= 0)
                    JOptionPane.showMessageDialog(
                        null, "ป้อนจำนวนเต็มที่มากกว่า 0");
            } while(num1 <= 0);

            do {
                inputStr = JOptionPane.showInputDialog(
                    null, "จำนวนเต็มที่ 2");

                num2 = Integer.parseInt(inputStr);

                if (num2 <= 0)
                    JOptionPane.showMessageDialog(
                        null, "ป้อนจำนวนเต็มที่มากกว่า 0");
            } while(num2 <= 0);

            JOptionPane.showMessageDialog(
                null, "จำนวนที่ 1 : " + num1 + "\n"
                + "จำนวนที่ 2 : " + num2 + "\n"
                + "ห.ร.ม. : " + getGCD(num1, num2) + "\n");

            answer = JOptionPane.showConfirmDialog(
                null, "ต้องการทำงานต่อหรือไม่?", "Confirmation"
            , JOptionPane.YES_NO_OPTION);	
        } while (answer == JOptionPane.YES_OPTION);

    }

    private int getGCD(int n, int m){
        int r = m % n;

        while(r != 0){
            m = n;
            n = r;
            r = m % n;
        } // end while
        return n;
    }

}
