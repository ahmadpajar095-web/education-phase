import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "maaf ya, aku nggak bisa balas perasaan kamu... ＞﹏＜",
                "maaf",
                -1);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "kenapa kamu gak bilang dari awal...\n kalo kamu gak suka sama aku\n dan udah suka sama yang lain...\nT_T",
                "hai....",
                3,
                null,
                null,
                "?????????");
        
        
        String[] acceptableValues = {"belum tau", "aku", "dia"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "so.....",
                "jujurly",
                3,
                null,
                acceptableValues,
                acceptableValues[0]);
                
    }
}
