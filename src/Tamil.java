import javax.swing.*;
import java.awt.*;

public class Tamil extends JApplet  {

    public void init() {
        String rt = "teriter\u0BA4\u0BAE\u0BBF\u0BB4\u0BCD";
        Container cp= getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel b=new JLabel();
        b.setFont(new Font("Latha", Font.PLAIN,12));
        b.setText(rt);
        cp.add(b);
    }


}
