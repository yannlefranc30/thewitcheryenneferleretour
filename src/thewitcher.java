import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


// petit bout de code pour m'exercer . Je reconnais avoir utiliser la doc.

public class thewitcher extends JFrame {
    private static final long serialVersionUID = 14;

    //je declare les variables
    //button est une implementation d'un button pissoir
    private JButton btnClickMe = new JButton( "the witcher" );
    private JButton btnPushMe = new JButton( "ciri" );
    private JButton btnActivateMe = new JButton( "yennefer" );

    public thewitcher() {
        super( "Fenetre the witcher" );
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );// rend l'opération de fermeture de la fenêtre frame inefficace.

        JPanel contentPane = (JPanel) this.getContentPane();// JPanel est une partie du package Java Swing, est un conteneur
        contentPane.setLayout( new FlowLayout() );
        contentPane.add( btnClickMe );
        contentPane.add( btnPushMe );
        contentPane.add( btnActivateMe );

        btnClickMe.addActionListener( e -> btnActivateMe.setText( "First button clicked!" + e.getSource() ) );

        btnPushMe.addActionListener( (e) -> System.out.println( "btnPushMe clicked" + e.getSource() ) );

        btnActivateMe.addActionListener( (e) -> {

            setTitle( "Bienvenue à the witcher" + e.getSource() );
        } );

        this.setSize( 800, 200 ); // taille de la fenetre
        this.setLocationRelativeTo( null );
    }
    public static void main( String[] args ) throws Exception {

        UIManager.setLookAndFeel( new NimbusLookAndFeel() ); //la classe publique UIManager

        thewitcher demo = new thewitcher();
        demo.setVisible( true );
    }
}