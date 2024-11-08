import javax.swing.*;

public class Zobrazeni extends JFrame{
    private JTextField textTXT;
    private JTextField vzorekTXT;
    private JButton hledatButton;
    private JButton krokDalButton;
    private JPanel Main;

    private String text;
    private String vzorek;
    private JButton pripravitButton;
    private DemonstraceAlgoritmu demonstraceAlgoritmu;

    public Zobrazeni(){
        initcomponent();
        hledatButton.setEnabled(false);
        hledatButton.setEnabled(false);
        pripravitButton.addActionListener(e -> pripravit());
        hledatButton.addActionListener(e -> posledniKrok());
        krokDalButton.addActionListener(e -> dalsiKrok());


        }

    private void pripravit() {
        text = textTXT.getText();
        vzorek = vzorekTXT.getText();
        if (text == "") {
            JOptionPane.showMessageDialog(this, "Nebyl zadán text", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if(vzorek == ""){
                JOptionPane.showMessageDialog(this, "Nebyl zadán vzorek", "ERROR", JOptionPane.ERROR_MESSAGE);
            }   else{
            hledatButton.setEnabled(true);
            krokDalButton.setEnabled(true);
            this.demonstraceAlgoritmu = new DemonstraceAlgoritmu(text, vzorek);
            }
        }


    private void dalsiKrok() {
    }

    private void posledniKrok() {
        do{ demonstraceAlgoritmu.provedKrok();
        } while(demonstraceAlgoritmu.getAktualniKrok() != KONEC)


    }

    private void initcomponent() {

            setContentPane(Main);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            pack();
    }

}
