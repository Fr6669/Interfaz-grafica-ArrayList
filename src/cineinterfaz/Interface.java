package cineinterfaz;

import java.util.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Interface extends JFrame implements ActionListener {
    JTextPane t1;
    JTextField t2, t3;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
    JLabel l1, l2, l3;
    JPanel superior, central, centralInferior, inferior;
    ArrayList lista = new ArrayList();

    public Interface() {
        Peliculas theWitch = new Peliculas("The Witch", "Robert Eggers", "27 de enero de 2015", "Nueva Inglaterra, 1630. Una familia compuesta "
                + "por un matrimonio de colonos cristianos, padres de cinco \nhijos, vive cerca de un bosque al que la leyenda popular atribuye un"
                + "carácter demoníaco. La convivencia estalla y la familia se\ndesgarra al sospechar que su hija mayor practica la brujería");
        Peliculas elFaro = new Peliculas("El Faro", "Robert Eggers", "18 de octubre de 2019", "En la década de 1890, dos fareros que afrontan "
                + "un turno de cuatro semanas juntos \ncombaten la constante tentación de dejarse arrastrar por la locura en una isla remota y"
                + " misteriosa de Nueva Inglaterra.");
        Peliculas getOut = new Peliculas("Get Out", "Jordan Peele", "24 de febrero de 2017", "Chris va a conocer a los padres de Rose, su novia."
                + "Al principio se muestran encantadores, si bien un tanto nerviosos. \nChris supone que se debe a que él es negro, pero un poco más"
                + " tarde descubre que los padres de Rose ocultan un secreto terrible.");
        Peliculas uncutGems = new Peliculas("Uncut Gems", " Josh Safdie, Ben Safdie", "25 de diciembre de 2019", "Un carismático joyero hace una apuesta"
                + " de alto riesgo que podría conducir a una ganancia \ninesperada, pero antes debe lograr un equilibrio entre las empresas, la familia y"
                + " los adversarios.");
        Peliculas batman = new Peliculas("Batman", "Christopher Nolan", "18 de julio de 2008", "Batman tiene que mantener el equilibrio entre el heroísmo"
                + "y el vigilantismo para pelear contra un vil criminal \nconocido como el Guasón, que pretende sumir Ciudad Gótica en la anarquía.");
        Peliculas inception = new Peliculas("Inception", "Christopher Nolan", "6 de agosto de 2010", "Dom Cobb es un ladrón con una extraña habilidad"
                + "para entrar a los sueños de la gente y robarles\n los secretos de sus subconscientes. Su habilidad lo ha vuelto muy popular en el mundo"
                + "del espionaje corporativo, pero ha tenido un \ngran costo en la gente que ama.");
        Peliculas joker = new Peliculas("Joker", "Todd Phillips", "2 de octubre de 2019", "Arthur Fleck adora hacer reír a la gente, pero su carrera"
                + "como comediante es un fracaso. El repudio social, la marginación\n y una serie de trágicos acontecimientos lo conducen por el sendero"
                + "de la locura y, finalmente, cae en el mundo del crimen.");
        Peliculas e1917 = new Peliculas("1917", "Sam Mendes", "enero de 2020", "Durante la Primera Guerra Mundial, dos jóvenes soldados"
                + " británicos reciben una orden, aparentemente, \nimposible de ejecutar: en una carrera contra el reloj, deben infiltrarse en territorio "
                + "enemigo para entregar un mensaje \nque podría salvar a miles de compañeros.");
        Peliculas interestelar = new Peliculas("Interestelar", "Christopher Nolan", "26 de octubre de 2014", "Gracias a un descubrimiento, un grupo de"
                + "científicos y exploradores, encabezados por Cooper, \nse embarcan en un viaje espacial para encontrar un lugar con las condiciones"
                + "necesarias para \nreemplazar a la Tierra y comenzar una nueva vida allí.");
        Peliculas basterds = new Peliculas("Inglourious Basterds", "Quentin Tarantino", "30 de octubre de 2009", "Es el primer año de la ocupación"
                + "alemana de Francia. El oficial aliado, \nteniente Aldo Raine, ensambla un equipo de soldados judíos para cometer actos violentos en"
                + "contra de los \nnazis, incluyendo la toma de cabelleras.");
        lista.add(theWitch);
        lista.add(elFaro);
        lista.add(getOut);
        lista.add(uncutGems);
        lista.add(batman);
        lista.add(inception);
        lista.add(joker);
        lista.add(e1917);
        lista.add(interestelar);
        lista.add(basterds);
        lista.add(1, basterds);
        lista.add(basterds);
        //Lista hecha
        parteSuperior();
        parteCentral();
        centralInferior();
        parteInferior();
        //x,y,ancho y alto
        setBounds(600, 300, 500, 1000);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        add(superior);
        add(central);
        add(centralInferior);
        add(inferior);
        setVisible(true);        
        pack();        
        
    }

    public void parteSuperior() {
        //Panel superior
        b1 = new JButton("The Witch");
        b2 = new JButton("El Faro");
        b3 = new JButton("Get Out");
        b4 = new JButton("Uncut Gems");
        b5 = new JButton("Batman");
        b6 = new JButton("Inception");
        b7 = new JButton("Joker");
        b8 = new JButton("1917");
        b9 = new JButton("Interestelar");
        b10 = new JButton("Inglourious Basterds");
        superior = new JPanel();
        superior.setLayout(new GridLayout(2, 2));
        superior.add(b1);
        superior.add(b2);
        superior.add(b3);
        superior.add(b4);
        superior.add(b5);
        superior.add(b6);
        superior.add(b7);
        superior.add(b8);
        superior.add(b9);
        superior.add(b10);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        //Si oprimen una pelicula
    }

    public void parteCentral() {        
        t1 = new JTextPane();
        central = new JPanel();
        central.setLayout(new FlowLayout());
        t1.setText("\n                                                                                                                                                                            "
                + "\n                                                                                                                       "
                + "\n                                                                                                                       "
                + "\n                                                                                                                       "
                + "\n                                                                                                                       "
                + "\n                                                                                                                       "
                + "\n                                                                                                                       ");
        central.add(t1);
    }

    public void centralInferior() {
        b13 = new JButton("Cant.Entradas del film");
        b12 = new JButton("Total entradas");
        b11 = new JButton("Comprar entrada");
        centralInferior = new JPanel();
        centralInferior.setLayout(new FlowLayout());
        centralInferior.add(b11);
        centralInferior.add(b13);
        centralInferior.add(b12);
        b11.addActionListener(this);
        b13.addActionListener(this);
        b12.addActionListener(this);
        //Si compran una entrada
    }

    public void parteInferior() {
        l1 = new JLabel("Numero de entradas vendidas de este film: ");
        l2 = new JLabel("Total de entradas vendidad: ");
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        inferior = new JPanel();
        inferior.setLayout(new GridLayout(2, 2));
        inferior.add(l1);
        inferior.add(t2);
        inferior.add(l2);
        inferior.add(t3);
    }
    int entradas[]={0,0,0,0,0,0,0,0,0,0};
    int aux = 0,entTotal = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        Iterator it = lista.iterator();
        String accion, x;
        accion = e.getActionCommand();
        if(accion.equals("The Witch")) {
            aux = 1;
            t2.setText("");
            t3.setText("");
            while (it.hasNext()) {
                Object objeto = it.next();
                Peliculas p = (Peliculas) objeto;
                x = p.getNombre();
                if (x.equals("The Witch")) {
                    t1.setText("");
                    t1.setText(p + "");
                    break;
                }
            }
        }else if (accion.equals("El Faro")) {
            t2.setText("");
            t3.setText("");
            while (it.hasNext()) {
                Object objeto = it.next();
                Peliculas p = (Peliculas) objeto;
                x = p.getNombre();
                if (x.equals("El Faro")) {
                    t1.setText("");
                    t1.setText(p + "");
                    aux = 2;
                    break;
                }
            }
        }else if (accion.equals("Get Out")) {
            t2.setText("");
            t3.setText("");
            while (it.hasNext()) {
                Object objeto = it.next();
                Peliculas p = (Peliculas) objeto;
                x = p.getNombre();
                if (x.equals("Get Out")) {
                    t1.setText("");
                    t1.setText(p + "");
                    aux = 3;
                    break;
                }
            }
        }else if (accion.equals("Uncut Gems")) {
            t2.setText("");
            t3.setText("");
            while (it.hasNext()) {
                Object objeto = it.next();
                Peliculas p = (Peliculas) objeto;
                x = p.getNombre();
                if (x.equals("Uncut Gems")) {
                    t1.setText("");
                    t1.setText(p + "");
                    aux = 4;
                    break;
                }
            }
        }else if (accion.equals("Batman")) {
            t2.setText("");
            t3.setText("");
            while (it.hasNext()) {
                Object objeto = it.next();
                Peliculas p = (Peliculas) objeto;
                x = p.getNombre();
                if (x.equals("Batman")) {
                    t1.setText("");
                    t1.setText(p + "");
                    aux = 5;
                    break;
                }
            }
        }else if (accion.equals("Inception")) {
            t2.setText("");
            t3.setText("");
            while (it.hasNext()) {
                Object objeto = it.next();
                Peliculas p = (Peliculas) objeto;
                x = p.getNombre();
                if (x.equals("Inception")) {
                    t1.setText("");
                    t1.setText(p + "");
                    aux = 6;
                    break;
                }
            }
        }else if (accion.equals("Joker")) {
            t2.setText("");
            t3.setText("");
            while (it.hasNext()) {
                Object objeto = it.next();
                Peliculas p = (Peliculas) objeto;
                x = p.getNombre();
                if (x.equals("Joker")) {
                    t1.setText("");
                    t1.setText(p + "");
                    aux = 7;
                    break;
                }
            }
        }else if (accion.equals("1917")) {
            t2.setText("");
            t3.setText("");
            while (it.hasNext()) {
                Object objeto = it.next();
                Peliculas p = (Peliculas) objeto;
                x = p.getNombre();
                if (x.equals("1917")) {
                    t1.setText("");
                    t1.setText(p + "");
                    aux = 8;
                    break;
                }
            }
        }else if (accion.equals("Interestelar")) {
            t2.setText("");
            t3.setText("");
            while (it.hasNext()) {
                Object objeto = it.next();
                Peliculas p = (Peliculas) objeto;
                x = p.getNombre();
                if (x.equals("Interestelar")) {
                    t1.setText("");
                    t1.setText(p + "");
                    aux = 9;
                    break;
                }
            }
        }else if (accion.equals("Inglourious Basterds")) {
            t2.setText("");
            t3.setText("");
            while (it.hasNext()) {
                Object objeto = it.next();
                Peliculas p = (Peliculas) objeto;
                x = p.getNombre();
                if (x.equals("Inglourious Basterds")) {
                    t1.setText("");
                    t1.setText(p + "");
                    aux = 10;
                    break;
                }
            }
        }
        //Botones del centro
        if(accion.equals("Comprar entrada") & aux == 1) {
            entradas[0]++;
            entTotal++;
        }else if (accion.equals("Cant.Entradas del film") & aux == 1) {
            t2.setText(entradas[0] + " entradas vendidas");
        }else if (accion.equals("Total entradas") & aux == 1) {
            t3.setText(entTotal + " entradas vendidas");
        }else if (accion.equals("Comprar entrada") & aux == 2) {
            entradas[1]++;
            entTotal++;
        }else if (accion.equals("Cant.Entradas del film") & aux == 2) {
            t2.setText(entradas[1] + " entradas vendidas");
        }else if (accion.equals("Total entradas") & aux == 2) {
            t3.setText(entTotal + " entradas vendidas");
        }else if (accion.equals("Comprar entrada") & aux == 3) {
            entradas[2]++;
            entTotal++;
        }else if (accion.equals("Cant.Entradas del film") & aux == 3) {
            t2.setText(entradas[2] + " entradas vendidas");
        }else if (accion.equals("Total entradas") & aux == 3) {
            t3.setText(entTotal + " entradas vendidas");
        }else if (accion.equals("Comprar entrada") & aux == 4) {
            entradas[3]++;
            entTotal++;
        }else if (accion.equals("Cant.Entradas del film") & aux == 4) {
            t2.setText(entradas[3] + " entradas vendidas");
        }else if (accion.equals("Total entradas") & aux == 4) {
            t3.setText(entTotal + " entradas vendidas");
        }else if (accion.equals("Comprar entrada") & aux == 5) {
            entradas[4]++;
            entTotal++;
        }else if (accion.equals("Cant.Entradas del film") & aux == 5) {
            t2.setText(entradas[4] + " entradas vendidas");
        }else if (accion.equals("Total entradas") & aux == 5) {
            t3.setText(entTotal + " entradas vendidas");
        }else if (accion.equals("Comprar entrada") & aux == 6) {
            entradas[5]++;
            entTotal++;
        }else if (accion.equals("Cant.Entradas del film") & aux == 6) {
            t2.setText(entradas[5] + " entradas vendidas");
        }else if (accion.equals("Total entradas") & aux == 6) {
            t3.setText(entTotal + " entradas vendidas");
        }else if (accion.equals("Comprar entrada") & aux == 7) {
            entradas[6]++;
            entTotal++;
        }else if (accion.equals("Cant.Entradas del film") & aux == 7) {
            t2.setText(entradas[6] + " entradas vendidas");
        }else if (accion.equals("Total entradas") & aux == 7) {
            t3.setText(entTotal + " entradas vendidas");
        }else if (accion.equals("Comprar entrada") & aux == 8) {
            entradas[7]++;
            entTotal++;
        }else if (accion.equals("Cant.Entradas del film") & aux == 8) {
            t2.setText(entradas[7] + " entradas vendidas");
        }else if (accion.equals("Total entradas") & aux == 8) {
            t3.setText(entTotal + " entradas vendidas");
        }else if (accion.equals("Comprar entrada") & aux == 9) {
            entradas[8]++;
            entTotal++;
        }else if (accion.equals("Cant.Entradas del film") & aux == 9) {
            t2.setText(entradas[8] + " entradas vendidas");
        }else if (accion.equals("Total entradas") & aux == 9) {
            t3.setText(entTotal + " entradas vendidas");
        }else if (accion.equals("Comprar entrada") & aux == 10) {
            entradas[9]++;
            entTotal++;
        }else if (accion.equals("Cant.Entradas del film") & aux == 10) {
            t2.setText(entradas[9] + " entradas vendidas");
        }else if (accion.equals("Total entradas") & aux == 10) {
            t3.setText(entTotal + " entradas vendidas");
        }
    }
}
