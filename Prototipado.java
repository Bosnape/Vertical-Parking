/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA09;

/**
 *
 * @author Alejandro Castrillon
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyPanel_1 extends JPanel {
   //form1
    private JLabel titulo1;
    private JLabel introduccionPart1;
    private JButton bt_IniciaSesion;
    private JButton bt_Registrar;
    private JLabel introduccionPart2;
    private JLabel introduccionPart3;
    private JLabel introduccionPart4;
    private JLabel introduccionPart5;
    private JLabel introduccionPart6;
    private JLabel introduccionPart7;

    //form 2
    private JButton btRegGoogle;
    private JLabel labelOpcionRegistrarse;
    private JButton btRegCorreo;
    private JLabel titulo2Iniciasesion;
    private JLabel labelCorreo;
    private JLabel labelContraseña;
    private JTextField textCorreo;
    private JPasswordField textContraseña;
    private JLabel labelOlvidarContraseña;
    private JButton btIniciarSesion2;
     
    //form4 
    private JButton bt_menubar1;
    private JMenuBar mb_VertPark3;
    private JMenuBar mb_VertPark2;
    private JPasswordField tex1;
    private JLabel lb_InincioApp5;
    private JLabel lb_InincioApp;
    private JLabel lb_InincioApp4;
    private JLabel lb_InincioApp2;
    private JLabel lb_InincioApp3;
    private JTextArea texArea1;
    private JLabel lb_InincioApp6;
    private JLabel lb_InincioApp7;
    private JTextArea texArea2;
    private JButton bt_Adelante;
    private JButton bt_atras;
    private JMenuBar jcomp16;
    
    //form 5
    private JLabel lb_form4_8;
    private JTextArea texArea_4_2;
    private JComboBox cb_4_1;
    private JLabel lb_form4_1;
    private JLabel lb_form4_2;
    private JLabel lb_form4_5;
    private JLabel lb_form4_4;
    private JButton bt_Cambiar1;
    private JLabel lb_form4_3;
    private JLabel lb_form4_6;
    private JTextArea texArea_4_1;
    private JLabel lb_form4_7;
    
    //form6
    private JMenuBar mb_Billetera2_5;
    private JMenuBar mb_Billetera1_5;
    private JLabel lb_Billt2_5;
    private JLabel lb_Saldo1_5;
    private JLabel lb_Billet7_5;
    private JLabel lb_Billet6_5;
    private JLabel lb_Billet5_5;
    private JTextArea txA_Saldo1;
    private JLabel lb_Billet4_5;
    private JLabel lb_Billet3_5;
    private JMenuBar mb_Billetera3_5;
    private JButton bt_Ajuste1_5;
    private JButton bt_RecargBllt2_5;
    private JButton bt_PagoQ4_5;
    private JButton bt_CompBllt3_5;
    private JButton bt_Not6_5;
    private JButton bt_Sug7_5;
    private JLabel lb_Billet10_5;
    private JLabel lb_Billet12_5;
    private JLabel lb_Billet9_5;
    private JLabel lb_Billet8_5;
    private JLabel lb_Billet11_5;
    private JButton bt_Masinfo8_5;
    private JTextArea jcomp27;
    
    //form7
    private JLabel lb_form7_1;
    private JLabel lb_form7_2;
    private JTextField txFld_Form7_1;
    private JTextField txFld_Form7_2;
    private JTextField txFld_Form7_4;
    private JTextField txFld_Form7_3;
    private JLabel lb_form7_3;
    private JLabel lb_form7_4;
    private JLabel lb_form7_6;
    private JLabel lb_form7_5;
    private JComboBox cb_form7_1;
    private JComboBox cb_form7_2;
    private JComboBox cb_form7_3;
    private JComboBox cb_form7_4;
    private JLabel lb_form7_7;
    private JTextField txFld_Form7_6;
    private JLabel lb_form7_11;
    private JComboBox cb_form7_6;
    private JLabel lb_form7_9;
    private JTextField txFld_Form7_5;
    private JLabel lb_form7_10;
    private JComboBox cb_form7_5;
    private JLabel lb_form7_8;
    
    //form8
    private JLabel lb_Form8_5;
    private JLabel lb_Form8_6;
    private JLabel jcomp3;
    private JLabel lb_Form8_1;
    private JMenuBar mb_Form8_2;
    private JMenuBar mb_Form8_1;
    private JRadioButton rb_Form8_2;
    private JTextArea tA_Form8_4;
    private JButton bt_Form8_3;
    private JTextArea tA_Form8_3;
    private JLabel lb_Form8_4;
    private JButton bt_Form8_2;
    private JLabel lb_Form8_3;
    private JTextArea tA_Form8_2;
    private JButton bt_Form8_1;
    private JRadioButton rb_Form8_1;
    private JLabel lb_Form8_2;
    private JTextArea tA_Form8_1;

    
    
    
    
    public MyPanel_1() {
        // Ajustar tamaño y establecer diseño para todo el panel
        setPreferredSize(new Dimension(285, 465));
        setLayout(null);
        
        // Construir componentes para la Primera parte
        titulo1 = new JLabel ("Vertical Parking");
        introduccionPart1 = new JLabel ("Bienvenido a EAFIT");
        bt_IniciaSesion = new JButton ("Inicia Sesión");
        bt_Registrar = new JButton ("Registrate");
        introduccionPart2 = new JLabel ("Esta app es el resultado de un proyecto");
        introduccionPart3 = new JLabel ("universitario que busca mejorar la movilidad ");
        introduccionPart4 = new JLabel ("y la calidad de vida de los estudiantes, ");
        introduccionPart5 = new JLabel ("profesores y personal de la universidad.");
        introduccionPart6 = new JLabel ("Te invitamos a que disfrutes de esta app");
        introduccionPart7 = new JLabel ("y explotes su potencial.");

        // Agregar componentes para la Primera parte
        add (titulo1);
        add (introduccionPart1);
        add (bt_IniciaSesion);
        add (bt_Registrar);
        add (introduccionPart2);
        add (introduccionPart3);
        add (introduccionPart4);
        add (introduccionPart5);
        add (introduccionPart6);
        add (introduccionPart7);

        // Establecer ubicación de los componentes para la Primera parte
        titulo1.setBounds (90, 0, 95, 135);
        introduccionPart1.setBounds (90, 135, 115, 40);
        bt_IniciaSesion.setBounds (0, 420, 150, 45);
        bt_Registrar.setBounds (145, 420, 140, 45);
        introduccionPart2.setBounds (25, 175, 230, 15);
        introduccionPart3.setBounds (10, 190, 255, 20);
        introduccionPart4.setBounds (30, 210, 240, 20);
        introduccionPart5.setBounds (25, 230, 235, 20);
        introduccionPart6.setBounds (30, 285, 235, 35);
        introduccionPart7.setBounds (75, 310, 135, 20);

        // Construir componentes para la Segunda parte
        btRegGoogle = new JButton("Google");
        labelOpcionRegistrarse = new JLabel("Regístrate con");
        btRegCorreo = new JButton("Correo");
        titulo2Iniciasesion = new JLabel("Inicia Sesión");
        labelCorreo = new JLabel("Correo");
        labelContraseña = new JLabel("Contraseña");
        textCorreo = new JTextField(5);
        textContraseña = new JPasswordField(5);
        labelOlvidarContraseña = new JLabel("¿Olvidaste tu contraseña?");
        btIniciarSesion2 = new JButton ("Iniciar Sesión");

        // Agregar componentes para la Segunda parte
        add(btRegGoogle);
        add(labelOpcionRegistrarse);
        add(btRegCorreo);
        add(titulo2Iniciasesion);
        add(labelCorreo);
        add(labelContraseña);
        add(textCorreo);
        add(textContraseña);
        add(labelOlvidarContraseña);
        add (btIniciarSesion2);

        // Establecer ubicación de los componentes para la Segunda parte
        btRegGoogle.setBounds (85, 340, 100, 25);
        labelOpcionRegistrarse.setBounds (95, 305, 105, 20);
        btRegCorreo.setBounds (85, 380, 100, 25);
        titulo2Iniciasesion.setBounds (100, 40, 80, 20);
        labelCorreo.setBounds (25, 80, 100, 25);
        labelContraseña.setBounds (25, 150, 100, 25);
        textCorreo.setBounds (25, 105, 220, 25);
        textContraseña.setBounds (25, 175, 225, 25);
        labelOlvidarContraseña.setBounds (60, 210, 160, 20);
        btIniciarSesion2.setBounds (80, 250, 115, 25);
       
        // Construir componentes para la Cuarta parte
        JMenu Menu = new JMenu ("≡");
        JMenuItem MediosDPagoItem = new JMenuItem ("Medios de pago");
        Menu.add (MediosDPagoItem);
        JMenuItem mi_billeteraItem = new JMenuItem ("Mi billetera");
        Menu.add (mi_billeteraItem);
        JMenuItem tu_informaciónItem = new JMenuItem ("Tu información");
        Menu.add (tu_informaciónItem);
        JMenuItem configuracionItem = new JMenuItem ("Configuracion");
        Menu.add (configuracionItem);
        JMenu Menu1 = new JMenu (" ");
        JMenuItem tu_informacionItem = new JMenuItem ("Tu informacion");
        Menu1.add (tu_informacionItem);
        JMenuItem configuracionItem1 = new JMenuItem ("Configuracion");
        Menu1.add (configuracionItem1);
        JMenu vertical_parkingMenu = new JMenu ("Vertical Parking");

        
        //construct components form 4
        bt_menubar1 = new JButton ("≡");
        mb_VertPark3 = new JMenuBar();
        mb_VertPark3.add (vertical_parkingMenu);
        mb_VertPark2 = new JMenuBar();
        tex1 = new JPasswordField (5);
        lb_InincioApp5 = new JLabel ("Elige el aparcamiento libre deseado");
        lb_InincioApp = new JLabel ("Mapa de la universidad");
        lb_InincioApp4 = new JLabel ("Con las torres de vertical parking");
        lb_InincioApp2 = new JLabel ("Estacionamientos en rojo o en verde");
        lb_InincioApp3 = new JLabel ("Segun su ocupacion");
        texArea1 = new JTextArea (5, 5);
        lb_InincioApp6 = new JLabel ("Lista corta de Torres ");
        lb_InincioApp7 = new JLabel ("Recientemente Seleccionadas");
        texArea2 = new JTextArea (5, 5);
        bt_Adelante = new JButton ("A");
        bt_atras = new JButton ("R");
        jcomp16 = new JMenuBar();
        
        
        //add components form 4
        add (bt_menubar1);
        add (mb_VertPark3);
        add (mb_VertPark2);
        add (tex1);
        add (lb_InincioApp5);
        add (lb_InincioApp);
        add (lb_InincioApp4);
        add (lb_InincioApp2);
        add (lb_InincioApp3);
        add (texArea1);
        add (lb_InincioApp6);
        add (lb_InincioApp7);
        add (texArea2);
        add (bt_Adelante);
        add (bt_atras);
        add (jcomp16);
        
        //set component bounds form 4
        bt_menubar1.setBounds (-5, 0, 50, 30);
        mb_VertPark3.setBounds (105, 0, 95, 30);
        mb_VertPark2.setBounds (25, 0, 80, 30);
        tex1.setBounds (5, 290, 275, 40);
        lb_InincioApp5.setBounds (10, 265, 210, 30);
        lb_InincioApp.setBounds (85, 70, 140, 25);
        lb_InincioApp4.setBounds (45, 160, 195, 25);
        lb_InincioApp2.setBounds (45, 125, 210, 25);
        lb_InincioApp3.setBounds (85, 145, 120, 20);
        texArea1.setBounds (0, 30, 285, 235);
        lb_InincioApp6.setBounds (90, 365, 130, 25);
        lb_InincioApp7.setBounds (65, 390, 180, 25);
        texArea2.setBounds (0, 330, 285, 135);
        bt_Adelante.setBounds (240, 15, 45, 15);
        bt_atras.setBounds (240, 0, 45, 15);
        jcomp16.setBounds (200, 0, 90, 30);
        
        
        //set components properties form 4
        tex1.setToolTipText ("¿A dónde vamos?");
        
                //construct preComponents Quinta parte
        String[] cb_4_1Items = {"Mi billetera", "Tarjeta Debito", "Carnet", "PSE"};
        
        //construct components Quinta parte 
        lb_form4_8 = new JLabel ("Confirmar");
        texArea_4_2 = new JTextArea (1, 2);
        cb_4_1 = new JComboBox<String>(cb_4_1Items);
        lb_form4_1 = new JLabel ("Direccion de inicio");
        lb_form4_2 = new JLabel ("Direccion de llegada");
        lb_form4_5 = new JLabel ("Mapa con ruta la de destino");
        lb_form4_4 = new JLabel ("Mapa con ruta la de destino");
        bt_Cambiar1 = new JButton ("Cambiar");
        lb_form4_3 = new JLabel ("Mapa con ruta la de destino");
        lb_form4_6 = new JLabel ("Mapa con ruta la de destino");
        texArea_4_1 = new JTextArea (5, 5);
        lb_form4_7 = new JLabel ("Descripcion del estado del parqueadero");

        //set components properties Quinta parte
        texArea_4_2.setEnabled (false);
        
        //add components Quinta parte
        add (lb_form4_8);
        add (texArea_4_2);
        add (cb_4_1);
        add (lb_form4_1);
        add (lb_form4_2);
        add (lb_form4_5);
        add (lb_form4_4);
        add (bt_Cambiar1);
        add (lb_form4_3);
        add (lb_form4_6);
        add (texArea_4_1);
        add (lb_form4_7);

        //set component bounds Quinta parte
        lb_form4_8.setBounds (115, 425, 65, 30);
        texArea_4_2.setBounds (-5, 410, 295, 60);
        cb_4_1.setBounds (0, 385, 110, 25);
        lb_form4_1.setBounds (100, 5, 115, 25);
        lb_form4_2.setBounds (100, 25, 125, 20);
        lb_form4_5.setBounds (70, 215, 175, 30);
        lb_form4_4.setBounds (70, 160, 165, 25);
        bt_Cambiar1.setBounds (10, 15, 80, 25);
        lb_form4_3.setBounds (70, 110, 160, 25);
        lb_form4_6.setBounds (65, 265, 165, 30);
        texArea_4_1.setBounds (-5, 65, 295, 265);
        lb_form4_7.setBounds (0, 330, 230, 25);
        
        
        //construct preComponents form6
        JMenu mi_billeteraMenu = new JMenu ("Mi Billetera");

        //construct components form6
        mb_Billetera2_5 = new JMenuBar();
        mb_Billetera2_5.add (mi_billeteraMenu);
        mb_Billetera1_5 = new JMenuBar();
        lb_Billt2_5 = new JLabel ("Descubre lo nuevo");
        lb_Saldo1_5 = new JLabel ("Saldo en la billetera");
        lb_Billet7_5 = new JLabel ("📊 Transacciones ");
        lb_Billet6_5 = new JLabel ("🗓");
        lb_Billet5_5 = new JLabel ("Historial");
        txA_Saldo1 = new JTextArea (5, 5);
        lb_Billet4_5 = new JLabel ("acerca de la app");
        lb_Billet3_5 = new JLabel ("acerca de la app");
        mb_Billetera3_5 = new JMenuBar();
        bt_Ajuste1_5 = new JButton ("🛠");
        bt_RecargBllt2_5 = new JButton ("Recargar billetera");
        bt_PagoQ4_5 = new JButton ("Pago QR");
        bt_CompBllt3_5 = new JButton ("Compra");
        bt_Not6_5 = new JButton ("Noticias");
        bt_Sug7_5 = new JButton ("Sugerencias");
        lb_Billet10_5 = new JLabel ("Transacción");
        lb_Billet12_5 = new JLabel ("Fecha");
        lb_Billet9_5 = new JLabel ("Descripcion");
        lb_Billet8_5 = new JLabel ("✅");
        lb_Billet11_5 = new JLabel ("Valor");
        bt_Masinfo8_5 = new JButton (">");
        jcomp27 = new JTextArea (5, 5);

        //set components properties form6
        txA_Saldo1.setEnabled (false);
        jcomp27.setEnabled (false);
        
        
        //add components form6
        add (mb_Billetera2_5);
        add (mb_Billetera1_5);
        add (lb_Billt2_5);
        add (lb_Saldo1_5);
        add (lb_Billet7_5);
        add (lb_Billet6_5);
        add (lb_Billet5_5);
        add (txA_Saldo1);
        add (lb_Billet4_5);
        add (lb_Billet3_5);
        add (mb_Billetera3_5);
        add (bt_Ajuste1_5);
        add (bt_RecargBllt2_5);
        add (bt_PagoQ4_5);
        add (bt_CompBllt3_5);
        add (bt_Not6_5);
        add (bt_Sug7_5);
        add (lb_Billet10_5);
        add (lb_Billet12_5);
        add (lb_Billet9_5);
        add (lb_Billet8_5);
        add (lb_Billet11_5);
        add (bt_Masinfo8_5);
        add (jcomp27);

        //set component bounds form6
        mb_Billetera2_5.setBounds (115, 0, 70, 30);
        mb_Billetera1_5.setBounds (50, 0, 65, 30);
        lb_Billt2_5.setBounds (10, 195, 115, 30);
        lb_Saldo1_5.setBounds (85, 50, 115, 25);
        lb_Billet7_5.setBounds (10, 380, 110, 20);
        lb_Billet6_5.setBounds (260, 350, 20, 25);
        lb_Billet5_5.setBounds (10, 355, 60, 15);
        txA_Saldo1.setBounds (0, 40, 285, 45);
        lb_Billet4_5.setBounds (170, 275, 105, 25);
        lb_Billet3_5.setBounds (25, 275, 95, 25);
        mb_Billetera3_5.setBounds (180, 0, 60, 30);
        bt_Ajuste1_5.setBounds (0, 0, 50, 30);
        bt_RecargBllt2_5.setBounds (70, 90, 140, 30);
        bt_PagoQ4_5.setBounds (145, 140, 95, 30);
        bt_CompBllt3_5.setBounds (060, 140, 85, 30);
        bt_Not6_5.setBounds (0, 225, 140, 95);
        bt_Sug7_5.setBounds (145, 225, 140, 95);
        lb_Billet10_5.setBounds (40, 425, 75, 20);
        lb_Billet12_5.setBounds (190, 425, 40, 20);
        lb_Billet9_5.setBounds (40, 410, 80, 25);
        lb_Billet8_5.setBounds (10, 415, 20, 20);
        lb_Billet11_5.setBounds (190, 405, 40, 25);
        bt_Masinfo8_5.setBounds (240, 410, 45, 30);
        jcomp27.setBounds (0, 345, 285, 120);
        
        //construct preComponents form7
        String[] cb_form7_1Items = {"Estudiante", "Particular", "Personal administrativo", "Educador"};
        String[] cb_form7_2Items = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] cb_form7_3Items = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};
        String[] cb_form7_4Items = {"2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920"};
        String[] cb_form7_6Items = {"Cedula de ciudadania", "Cedula de extranjeria", "Tarjeta de identidad", "Permiso especial de permanencia", "Permiso por proteccion temporal"};
        String[] cb_form7_5Items = {"Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania (Myanmar)", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Eswatini", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guinea", "Guinea Ecuatorial", "Guinea-Bisáu", "Guyana", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos (Holanda)", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumania", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia (ahora Eswatini)", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Taiwán", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Vaticano", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue"};

        //construct components form7
        lb_form7_1 = new JLabel ("Registrarte");
        lb_form7_2 = new JLabel ("Es rápido y fácil");
        txFld_Form7_1 = new JTextField (5);
        txFld_Form7_2 = new JTextField (5);
        txFld_Form7_4 = new JTextField (5);
        txFld_Form7_3 = new JTextField (5);
        lb_form7_3 = new JLabel ("Nombre");
        lb_form7_4 = new JLabel ("Apellido");
        lb_form7_6 = new JLabel ("Celular");
        lb_form7_5 = new JLabel ("Correo");
        cb_form7_1 = new JComboBox<String>(cb_form7_1Items);
        cb_form7_2 = new JComboBox<String>(cb_form7_2Items);
        cb_form7_3 = new JComboBox<String>(cb_form7_3Items);
        cb_form7_4 = new JComboBox<String>(cb_form7_4Items);
        lb_form7_7 = new JLabel ("Fecha de nacimiento");
        txFld_Form7_6 = new JTextField (5);
        lb_form7_11 = new JLabel ("Contraseña");
        cb_form7_6 = new JComboBox<String>(cb_form7_6Items);
        lb_form7_9 = new JLabel ("Tipo de documento");
        txFld_Form7_5 = new JTextField (5);
        lb_form7_10 = new JLabel ("Numero de documento");
        cb_form7_5 = new JComboBox<String>(cb_form7_5Items);
        lb_form7_8 = new JLabel ("Pais de nacimiento");

        //set components properties form7
        txFld_Form7_6.setToolTipText ("Minimo 8 caracteres, una letra mayuscula y una minuscula.");
        
        //add components form7
        add (lb_form7_1);
        add (lb_form7_2);
        add (txFld_Form7_1);
        add (txFld_Form7_2);
        add (txFld_Form7_4);
        add (txFld_Form7_3);
        add (lb_form7_3);
        add (lb_form7_4);
        add (lb_form7_6);
        add (lb_form7_5);
        add (cb_form7_1);
        add (cb_form7_2);
        add (cb_form7_3);
        add (cb_form7_4);
        add (lb_form7_7);
        add (txFld_Form7_6);
        add (lb_form7_11);
        add (cb_form7_6);
        add (lb_form7_9);
        add (txFld_Form7_5);
        add (lb_form7_10);
        add (cb_form7_5);
        add (lb_form7_8);

        //set component bounds form7
        lb_form7_1.setBounds (5, 10, 100, 25);
        lb_form7_2.setBounds (5, 30, 100, 25);
        txFld_Form7_1.setBounds (10, 95, 120, 25);
        txFld_Form7_2.setBounds (140, 95, 135, 25);
        txFld_Form7_4.setBounds (10, 225, 100, 25);
        txFld_Form7_3.setBounds (10, 160, 155, 25);
        lb_form7_3.setBounds (10, 70, 100, 25);
        lb_form7_4.setBounds (140, 70, 100, 25);
        lb_form7_6.setBounds (10, 200, 100, 25);
        lb_form7_5.setBounds (10, 135, 100, 25);
        cb_form7_1.setBounds (175, 160, 100, 25);
        cb_form7_2.setBounds (115, 225, 40, 25);
        cb_form7_3.setBounds (165, 225, 50, 25);
        cb_form7_4.setBounds (220, 225, 55, 25);
        lb_form7_7.setBounds (120, 200, 145, 25);
        txFld_Form7_6.setBounds (10, 415, 140, 25);
        lb_form7_11.setBounds (10, 390, 100, 25);
        cb_form7_6.setBounds (135, 285, 140, 25);
        lb_form7_9.setBounds (135, 260, 130, 25);
        txFld_Form7_5.setBounds (10, 350, 165, 25);
        lb_form7_10.setBounds (10, 325, 140, 25);
        cb_form7_5.setBounds (10, 285, 105, 25);
        lb_form7_8.setBounds (10, 260, 110, 25);
        
        //construct preComponents form8
        JMenu metodos_de_pagoMenu = new JMenu ("Metodos de pago");

        //construct components form 8
        lb_Form8_5 = new JLabel ("Saldo a favor en la billetera");
        lb_Form8_6 = new JLabel ("Usar solo la billatera");
        jcomp3 = new JLabel ("🎫");
        lb_Form8_1 = new JLabel ("Seleccionar metodo de pago ⬇️");
        mb_Form8_2 = new JMenuBar();
        mb_Form8_2.add (metodos_de_pagoMenu);
        mb_Form8_1 = new JMenuBar();
        rb_Form8_2 = new JRadioButton ("");
        tA_Form8_4 = new JTextArea (5, 5);
        bt_Form8_3 = new JButton ("Recargar");
        tA_Form8_3 = new JTextArea (5, 5);
        lb_Form8_4 = new JLabel ("    ➕");
        bt_Form8_2 = new JButton ("Agregar codigo promocional");
        lb_Form8_3 = new JLabel ("💳");
        tA_Form8_2 = new JTextArea (5, 5);
        bt_Form8_1 = new JButton ("Agregar metodo de pago");
        rb_Form8_1 = new JRadioButton ("");
        lb_Form8_2 = new JLabel ("Tarjeta de debito");
        tA_Form8_1 = new JTextArea (5, 5);

        //set components properties form8
        tA_Form8_4.setEnabled (false);
        tA_Form8_3.setEnabled (false);
        tA_Form8_2.setEnabled (false);
        tA_Form8_1.setEnabled (false);
        
        //add components form8
        add (lb_Form8_5);
        add (lb_Form8_6);
        add (jcomp3);
        add (lb_Form8_1);
        add (mb_Form8_2);
        add (mb_Form8_1);
        add (rb_Form8_2);
        add (tA_Form8_4);
        add (bt_Form8_3);
        add (tA_Form8_3);
        add (lb_Form8_4);
        add (bt_Form8_2);
        add (lb_Form8_3);
        add (tA_Form8_2);
        add (bt_Form8_1);
        add (rb_Form8_1);
        add (lb_Form8_2);
        add (tA_Form8_1);

        //set component bounds form8
        lb_Form8_5.setBounds (10, 370, 160, 20);
        lb_Form8_6.setBounds (60, 425, 125, 25);
        jcomp3.setBounds (15, 320, 20, 20);
        lb_Form8_1.setBounds (60, 40, 185, 25);
        mb_Form8_2.setBounds (85, 0, 100, 30);
        mb_Form8_1.setBounds (0, 0, 240, 30);
        rb_Form8_2.setBounds (195, 425, 25, 25);
        tA_Form8_4.setBounds (0, 415, 285, 50);
        bt_Form8_3.setBounds (185, 365, 90, 30);
        tA_Form8_3.setBounds (0, 350, 285, 70);
        lb_Form8_4.setBounds (20, 110, 30, 30);
        bt_Form8_2.setBounds (40, 315, 195, 25);
        lb_Form8_3.setBounds (45, 75, 25, 25);
        tA_Form8_2.setBounds (0, 305, 285, 45);
        bt_Form8_1.setBounds (50, 110, 210, 30);
        rb_Form8_1.setBounds (220, 80, 25, 20);
        lb_Form8_2.setBounds (70, 75, 100, 25);
        tA_Form8_1.setBounds (0, 30, 285, 275);
        
        // Inicialmente, ocultar los componentes de la Segunda parte 
        btRegGoogle.setVisible(false);
        labelOpcionRegistrarse.setVisible(false);
        btRegCorreo.setVisible(false);
        titulo2Iniciasesion.setVisible(false);
        labelCorreo.setVisible(false);
        labelContraseña.setVisible(false);
        textCorreo.setVisible(false);
        textContraseña.setVisible(false);
        labelOlvidarContraseña.setVisible(false);
        btIniciarSesion2.setVisible(false);

        // Inicialmente, ocultar los componentes de la Cuarta parte
        bt_menubar1.setVisible(false);
        mb_VertPark3.setVisible(false);
        mb_VertPark2.setVisible(false);
        tex1.setVisible(false);
        lb_InincioApp5.setVisible(false);
        lb_InincioApp.setVisible(false);
        lb_InincioApp4.setVisible(false);
        lb_InincioApp2.setVisible(false);
        lb_InincioApp3.setVisible(false);
        texArea1.setVisible(false);
        lb_InincioApp6.setVisible(false);
        lb_InincioApp7.setVisible(false);
        texArea2.setVisible(false);
        bt_Adelante.setVisible(true);
        bt_atras.setVisible(true);
        jcomp16.setVisible(false);
        
        
        // Inicialmente, ocultar los componentes de la Quinta parte
        lb_form4_8.setVisible(false);
        texArea_4_2.setVisible(false);
        cb_4_1.setVisible(false);
        lb_form4_1.setVisible(false);
        lb_form4_2.setVisible(false);
        lb_form4_5.setVisible(false);                    
        lb_form4_4.setVisible(false);
        bt_Cambiar1.setVisible(false);
        lb_form4_3.setVisible(false);
        lb_form4_6.setVisible(false);
        texArea_4_1.setVisible(false);
        lb_form4_7.setVisible(false);        
        
        
        // Inicialmente, ocultar los componentes de la Sexta parte
        mb_Billetera2_5.setVisible(false);
        mb_Billetera1_5.setVisible(false);
        lb_Billt2_5.setVisible(false);
        lb_Saldo1_5.setVisible(false);
        lb_Billet7_5.setVisible(false);
        lb_Billet6_5.setVisible(false);
        lb_Billet5_5.setVisible(false);
        txA_Saldo1.setVisible(false);
        lb_Billet4_5.setVisible(false);
        lb_Billet3_5.setVisible(false);
        mb_Billetera3_5.setVisible(false);
        bt_Ajuste1_5.setVisible(false);
        bt_RecargBllt2_5.setVisible(false);
        bt_PagoQ4_5.setVisible(false);
        bt_CompBllt3_5.setVisible(false);
        bt_Not6_5.setVisible(false);
        bt_Sug7_5.setVisible(false);
        lb_Billet10_5.setVisible(false);
        lb_Billet12_5.setVisible(false);
        lb_Billet9_5.setVisible(false);
        lb_Billet8_5.setVisible(false);
        lb_Billet11_5.setVisible(false);
        bt_Masinfo8_5.setVisible(false);
        jcomp27.setVisible(false);
        
        // Inicialmente, ocultar los componentes de la Septima parte
        lb_form7_1.setVisible(false);
        lb_form7_2.setVisible(false);
        txFld_Form7_1.setVisible(false);
        txFld_Form7_2.setVisible(false);
        txFld_Form7_4.setVisible(false);
        txFld_Form7_3.setVisible(false);
        lb_form7_3.setVisible(false);
        lb_form7_4.setVisible(false);
        lb_form7_6.setVisible(false);
        lb_form7_5.setVisible(false);
        cb_form7_1.setVisible(false);
        cb_form7_2.setVisible(false);
        cb_form7_3.setVisible(false);
        cb_form7_4.setVisible(false);
        lb_form7_7.setVisible(false);
        txFld_Form7_6.setVisible(false);
        lb_form7_11.setVisible(false);
        cb_form7_6.setVisible(false);
        lb_form7_9.setVisible(false);
        txFld_Form7_5.setVisible(false);
        lb_form7_10.setVisible(false);
        cb_form7_5.setVisible(false);
        lb_form7_8.setVisible(false);
        
        // Inicialmente, ocultar los componentes de la Octava parte
        lb_Form8_5.setVisible(false);
        lb_Form8_6.setVisible(false);
        jcomp3.setVisible(false);
        lb_Form8_1.setVisible(false);
        mb_Form8_2.setVisible(false);
        mb_Form8_1.setVisible(false);
        rb_Form8_2.setVisible(false);
        tA_Form8_4.setVisible(false);
        bt_Form8_3.setVisible(false);
        tA_Form8_3.setVisible(false);
        lb_Form8_4.setVisible(false);
        bt_Form8_2.setVisible(false);
        lb_Form8_3.setVisible(false);
        tA_Form8_2.setVisible(false);
        bt_Form8_1.setVisible(false);
        rb_Form8_1.setVisible(false);
        lb_Form8_2.setVisible(false);
        tA_Form8_1.setVisible(false);
        
        
        // Agregar ActionListener al botón "Adelante" (btDevolverIntroduccion)
        bt_Adelante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mostrar los componentes de la primera parte y ocultar los de la segunda y tercera parte
                if (introduccionPart1.isVisible()){
                    //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(true);
                    labelOpcionRegistrarse.setVisible(true);
                    btRegCorreo.setVisible(true);
                    titulo2Iniciasesion.setVisible(true);
                    labelCorreo.setVisible(true);
                    labelContraseña.setVisible(true);
                    textCorreo.setVisible(true);
                    textContraseña.setVisible(true);
                    labelOlvidarContraseña.setVisible(true);
                    btIniciarSesion2.setVisible(true);


                    //form4 
                    bt_menubar1.setVisible(false);
                    mb_VertPark3.setVisible(false);
                    mb_VertPark2.setVisible(false);
                    tex1.setVisible(false);
                    lb_InincioApp5.setVisible(false);
                    lb_InincioApp.setVisible(false);
                    lb_InincioApp4.setVisible(false);
                    lb_InincioApp2.setVisible(false);
                    lb_InincioApp3.setVisible(false);
                    texArea1.setVisible(false);
                    lb_InincioApp6.setVisible(false);
                    lb_InincioApp7.setVisible(false);
                    texArea2.setVisible(false);
                    jcomp16.setVisible(false);
                    
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form6
                    mb_Billetera2_5.setVisible(false);
                    mb_Billetera1_5.setVisible(false);
                    lb_Billt2_5.setVisible(false);
                    lb_Saldo1_5.setVisible(false);
                    lb_Billet7_5.setVisible(false);
                    lb_Billet6_5.setVisible(false);
                    lb_Billet5_5.setVisible(false);
                    txA_Saldo1.setVisible(false);
                    lb_Billet4_5.setVisible(false);
                    lb_Billet3_5.setVisible(false);
                    mb_Billetera3_5.setVisible(false);
                    bt_Ajuste1_5.setVisible(false);
                    bt_RecargBllt2_5.setVisible(false);
                    bt_PagoQ4_5.setVisible(false);
                    bt_CompBllt3_5.setVisible(false);
                    bt_Not6_5.setVisible(false);
                    bt_Sug7_5.setVisible(false);
                    lb_Billet10_5.setVisible(false);
                    lb_Billet12_5.setVisible(false);
                    lb_Billet9_5.setVisible(false);
                    lb_Billet8_5.setVisible(false);
                    lb_Billet11_5.setVisible(false);
                    bt_Masinfo8_5.setVisible(false);
                    jcomp27.setVisible(false);
                    
                    //form 7
                    lb_form7_1.setVisible(false);
                    lb_form7_2.setVisible(false);
                    txFld_Form7_1.setVisible(false);
                    txFld_Form7_2.setVisible(false);
                    txFld_Form7_4.setVisible(false);
                    txFld_Form7_3.setVisible(false);
                    lb_form7_3.setVisible(false);
                    lb_form7_4.setVisible(false);
                    lb_form7_6.setVisible(false);
                    lb_form7_5.setVisible(false);
                    cb_form7_1.setVisible(false);
                    cb_form7_2.setVisible(false);
                    cb_form7_3.setVisible(false);
                    cb_form7_4.setVisible(false);
                    lb_form7_7.setVisible(false);
                    txFld_Form7_6.setVisible(false);
                    lb_form7_11.setVisible(false);
                    cb_form7_6.setVisible(false);
                    lb_form7_9.setVisible(false);
                    txFld_Form7_5.setVisible(false);
                    lb_form7_10.setVisible(false);
                    cb_form7_5.setVisible(false);
                    lb_form7_8.setVisible(false);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);
                    
                } else if(labelOlvidarContraseña.isVisible()){
                    //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(false);
                    labelOpcionRegistrarse.setVisible(false);
                    btRegCorreo.setVisible(false);
                    titulo2Iniciasesion.setVisible(false);
                    labelCorreo.setVisible(false);
                    labelContraseña.setVisible(false);
                    textCorreo.setVisible(false);
                    textContraseña.setVisible(false);
                    labelOlvidarContraseña.setVisible(false);
                    btIniciarSesion2.setVisible(false);

                    //form4 
                    bt_menubar1.setVisible(true);
                    mb_VertPark3.setVisible(true);
                    mb_VertPark2.setVisible(true);
                    tex1.setVisible(true);
                    lb_InincioApp5.setVisible(true);
                    lb_InincioApp.setVisible(true);
                    lb_InincioApp4.setVisible(true);
                    lb_InincioApp2.setVisible(true);
                    lb_InincioApp3.setVisible(true);
                    texArea1.setVisible(true);
                    lb_InincioApp6.setVisible(true);
                    lb_InincioApp7.setVisible(true);
                    texArea2.setVisible(true);
                    jcomp16.setVisible(true);  
                    
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form6
                    mb_Billetera2_5.setVisible(false);
                    mb_Billetera1_5.setVisible(false);
                    lb_Billt2_5.setVisible(false);
                    lb_Saldo1_5.setVisible(false);
                    lb_Billet7_5.setVisible(false);
                    lb_Billet6_5.setVisible(false);
                    lb_Billet5_5.setVisible(false);
                    txA_Saldo1.setVisible(false);
                    lb_Billet4_5.setVisible(false);
                    lb_Billet3_5.setVisible(false);
                    mb_Billetera3_5.setVisible(false);
                    bt_Ajuste1_5.setVisible(false);
                    bt_RecargBllt2_5.setVisible(false);
                    bt_PagoQ4_5.setVisible(false);
                    bt_CompBllt3_5.setVisible(false);
                    bt_Not6_5.setVisible(false);
                    bt_Sug7_5.setVisible(false);
                    lb_Billet10_5.setVisible(false);
                    lb_Billet12_5.setVisible(false);
                    lb_Billet9_5.setVisible(false);
                    lb_Billet8_5.setVisible(false);
                    lb_Billet11_5.setVisible(false);
                    bt_Masinfo8_5.setVisible(false);
                    jcomp27.setVisible(false);
                    
                    //form 7
                    lb_form7_1.setVisible(false);
                    lb_form7_2.setVisible(false);
                    txFld_Form7_1.setVisible(false);
                    txFld_Form7_2.setVisible(false);
                    txFld_Form7_4.setVisible(false);
                    txFld_Form7_3.setVisible(false);
                    lb_form7_3.setVisible(false);
                    lb_form7_4.setVisible(false);
                    lb_form7_6.setVisible(false);
                    lb_form7_5.setVisible(false);
                    cb_form7_1.setVisible(false);
                    cb_form7_2.setVisible(false);
                    cb_form7_3.setVisible(false);
                    cb_form7_4.setVisible(false);
                    lb_form7_7.setVisible(false);
                    txFld_Form7_6.setVisible(false);
                    lb_form7_11.setVisible(false);
                    cb_form7_6.setVisible(false);
                    lb_form7_9.setVisible(false);
                    txFld_Form7_5.setVisible(false);
                    lb_form7_10.setVisible(false);
                    cb_form7_5.setVisible(false);
                    lb_form7_8.setVisible(false);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);
                    
                }else if (lb_InincioApp5.isVisible()){
                    //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(false);
                    labelOpcionRegistrarse.setVisible(false);
                    btRegCorreo.setVisible(false);
                    titulo2Iniciasesion.setVisible(false);
                    labelCorreo.setVisible(false);
                    labelContraseña.setVisible(false);
                    textCorreo.setVisible(false);
                    textContraseña.setVisible(false);
                    labelOlvidarContraseña.setVisible(false);
                    btIniciarSesion2.setVisible(false);

                    //form4 
                    bt_menubar1.setVisible(false);
                    mb_VertPark3.setVisible(false);
                    mb_VertPark2.setVisible(false);
                    tex1.setVisible(false);
                    lb_InincioApp5.setVisible(false);
                    lb_InincioApp.setVisible(false);
                    lb_InincioApp4.setVisible(false);
                    lb_InincioApp2.setVisible(false);
                    lb_InincioApp3.setVisible(false);
                    texArea1.setVisible(false);
                    lb_InincioApp6.setVisible(false);
                    lb_InincioApp7.setVisible(false);
                    texArea2.setVisible(false);
                    jcomp16.setVisible(false);  
                    
                    //form 5
                    lb_form4_8.setVisible(true);
                    texArea_4_2.setVisible(true);
                    cb_4_1.setVisible(true);
                    lb_form4_1.setVisible(true);
                    lb_form4_2.setVisible(true);
                    lb_form4_5.setVisible(true);                    
                    lb_form4_4.setVisible(true);
                    bt_Cambiar1.setVisible(true);
                    lb_form4_3.setVisible(true);
                    lb_form4_6.setVisible(true);
                    texArea_4_1.setVisible(true);
                    lb_form4_7.setVisible(true);
                    
                    //form6
                    mb_Billetera2_5.setVisible(false);
                    mb_Billetera1_5.setVisible(false);
                    lb_Billt2_5.setVisible(false);
                    lb_Saldo1_5.setVisible(false);
                    lb_Billet7_5.setVisible(false);
                    lb_Billet6_5.setVisible(false);
                    lb_Billet5_5.setVisible(false);
                    txA_Saldo1.setVisible(false);
                    lb_Billet4_5.setVisible(false);
                    lb_Billet3_5.setVisible(false);
                    mb_Billetera3_5.setVisible(false);
                    bt_Ajuste1_5.setVisible(false);
                    bt_RecargBllt2_5.setVisible(false);
                    bt_PagoQ4_5.setVisible(false);
                    bt_CompBllt3_5.setVisible(false);
                    bt_Not6_5.setVisible(false);
                    bt_Sug7_5.setVisible(false);
                    lb_Billet10_5.setVisible(false);
                    lb_Billet12_5.setVisible(false);
                    lb_Billet9_5.setVisible(false);
                    lb_Billet8_5.setVisible(false);
                    lb_Billet11_5.setVisible(false);
                    bt_Masinfo8_5.setVisible(false);
                    jcomp27.setVisible(false);
                    
                    //form 7
                    lb_form7_1.setVisible(false);
                    lb_form7_2.setVisible(false);
                    txFld_Form7_1.setVisible(false);
                    txFld_Form7_2.setVisible(false);
                    txFld_Form7_4.setVisible(false);
                    txFld_Form7_3.setVisible(false);
                    lb_form7_3.setVisible(false);
                    lb_form7_4.setVisible(false);
                    lb_form7_6.setVisible(false);
                    lb_form7_5.setVisible(false);
                    cb_form7_1.setVisible(false);
                    cb_form7_2.setVisible(false);
                    cb_form7_3.setVisible(false);
                    cb_form7_4.setVisible(false);
                    lb_form7_7.setVisible(false);
                    txFld_Form7_6.setVisible(false);
                    lb_form7_11.setVisible(false);
                    cb_form7_6.setVisible(false);
                    lb_form7_9.setVisible(false);
                    txFld_Form7_5.setVisible(false);
                    lb_form7_10.setVisible(false);
                    cb_form7_5.setVisible(false);
                    lb_form7_8.setVisible(false);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);
                    
                    
                } else if (lb_form4_8.isVisible()){
                    
                    //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(false);
                    labelOpcionRegistrarse.setVisible(false);
                    btRegCorreo.setVisible(false);
                    titulo2Iniciasesion.setVisible(false);
                    labelCorreo.setVisible(false);
                    labelContraseña.setVisible(false);
                    textCorreo.setVisible(false);
                    textContraseña.setVisible(false);
                    labelOlvidarContraseña.setVisible(false);
                    btIniciarSesion2.setVisible(false);

                    //form4 
                    bt_menubar1.setVisible(false);
                    mb_VertPark3.setVisible(false);
                    mb_VertPark2.setVisible(false);
                    tex1.setVisible(false);
                    lb_InincioApp5.setVisible(false);
                    lb_InincioApp.setVisible(false);
                    lb_InincioApp4.setVisible(false);
                    lb_InincioApp2.setVisible(false);
                    lb_InincioApp3.setVisible(false);
                    texArea1.setVisible(false);
                    lb_InincioApp6.setVisible(false);
                    lb_InincioApp7.setVisible(false);
                    texArea2.setVisible(false);
                    jcomp16.setVisible(false);
                            
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form6
                    mb_Billetera2_5.setVisible(true);
                    mb_Billetera1_5.setVisible(true);
                    lb_Billt2_5.setVisible(true);
                    lb_Saldo1_5.setVisible(true);
                    lb_Billet7_5.setVisible(true);
                    lb_Billet6_5.setVisible(true);
                    lb_Billet5_5.setVisible(true);
                    txA_Saldo1.setVisible(true);
                    lb_Billet4_5.setVisible(true);
                    lb_Billet3_5.setVisible(true);
                    mb_Billetera3_5.setVisible(true);
                    bt_Ajuste1_5.setVisible(true);
                    bt_RecargBllt2_5.setVisible(true);
                    bt_PagoQ4_5.setVisible(true);
                    bt_CompBllt3_5.setVisible(true);
                    bt_Not6_5.setVisible(true);
                    bt_Sug7_5.setVisible(true);
                    lb_Billet10_5.setVisible(true);
                    lb_Billet12_5.setVisible(true);
                    lb_Billet9_5.setVisible(true);
                    lb_Billet8_5.setVisible(true);
                    lb_Billet11_5.setVisible(true);
                    bt_Masinfo8_5.setVisible(true);
                    jcomp27.setVisible(true);
                    
                    //form 7
                    lb_form7_1.setVisible(false);
                    lb_form7_2.setVisible(false);
                    txFld_Form7_1.setVisible(false);
                    txFld_Form7_2.setVisible(false);
                    txFld_Form7_4.setVisible(false);
                    txFld_Form7_3.setVisible(false);
                    lb_form7_3.setVisible(false);
                    lb_form7_4.setVisible(false);
                    lb_form7_6.setVisible(false);
                    lb_form7_5.setVisible(false);
                    cb_form7_1.setVisible(false);
                    cb_form7_2.setVisible(false);
                    cb_form7_3.setVisible(false);
                    cb_form7_4.setVisible(false);
                    lb_form7_7.setVisible(false);
                    txFld_Form7_6.setVisible(false);
                    lb_form7_11.setVisible(false);
                    cb_form7_6.setVisible(false);
                    lb_form7_9.setVisible(false);
                    txFld_Form7_5.setVisible(false);
                    lb_form7_10.setVisible(false);
                    cb_form7_5.setVisible(false);
                    lb_form7_8.setVisible(false);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);
                    
                } else if (bt_CompBllt3_5.isVisible()){
                    
                    //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(false);
                    labelOpcionRegistrarse.setVisible(false);
                    btRegCorreo.setVisible(false);
                    titulo2Iniciasesion.setVisible(false);
                    labelCorreo.setVisible(false);
                    labelContraseña.setVisible(false);
                    textCorreo.setVisible(false);
                    textContraseña.setVisible(false);
                    labelOlvidarContraseña.setVisible(false);
                    btIniciarSesion2.setVisible(false);

                    //form4 
                    bt_menubar1.setVisible(false);
                    mb_VertPark3.setVisible(false);
                    mb_VertPark2.setVisible(false);
                    tex1.setVisible(false);
                    lb_InincioApp5.setVisible(false);
                    lb_InincioApp.setVisible(false);
                    lb_InincioApp4.setVisible(false);
                    lb_InincioApp2.setVisible(false);
                    lb_InincioApp3.setVisible(false);
                    texArea1.setVisible(false);
                    lb_InincioApp6.setVisible(false);
                    lb_InincioApp7.setVisible(false);
                    texArea2.setVisible(false);
                    jcomp16.setVisible(false);
                            
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form6
                    mb_Billetera2_5.setVisible(false);
                    mb_Billetera1_5.setVisible(false);
                    lb_Billt2_5.setVisible(false);
                    lb_Saldo1_5.setVisible(false);
                    lb_Billet7_5.setVisible(false);
                    lb_Billet6_5.setVisible(false);
                    lb_Billet5_5.setVisible(false);
                    txA_Saldo1.setVisible(false);
                    lb_Billet4_5.setVisible(false);
                    lb_Billet3_5.setVisible(false);
                    mb_Billetera3_5.setVisible(false);
                    bt_Ajuste1_5.setVisible(false);
                    bt_RecargBllt2_5.setVisible(false);
                    bt_PagoQ4_5.setVisible(false);
                    bt_CompBllt3_5.setVisible(false);
                    bt_Not6_5.setVisible(false);
                    bt_Sug7_5.setVisible(false);
                    lb_Billet10_5.setVisible(false);
                    lb_Billet12_5.setVisible(false);
                    lb_Billet9_5.setVisible(false);
                    lb_Billet8_5.setVisible(false);
                    lb_Billet11_5.setVisible(false);
                    bt_Masinfo8_5.setVisible(false);
                    jcomp27.setVisible(false);
                    
                    //form 7
                    lb_form7_1.setVisible(true);
                    lb_form7_2.setVisible(true);
                    txFld_Form7_1.setVisible(true);
                    txFld_Form7_2.setVisible(true);
                    txFld_Form7_4.setVisible(true);
                    txFld_Form7_3.setVisible(true);
                    lb_form7_3.setVisible(true);
                    lb_form7_4.setVisible(true);
                    lb_form7_6.setVisible(true);
                    lb_form7_5.setVisible(true);
                    cb_form7_1.setVisible(true);
                    cb_form7_2.setVisible(true);
                    cb_form7_3.setVisible(true);
                    cb_form7_4.setVisible(true);
                    lb_form7_7.setVisible(true);
                    txFld_Form7_6.setVisible(true);
                    lb_form7_11.setVisible(true);
                    cb_form7_6.setVisible(true);
                    lb_form7_9.setVisible(true);
                    txFld_Form7_5.setVisible(true);
                    lb_form7_10.setVisible(true);
                    cb_form7_5.setVisible(true);
                    lb_form7_8.setVisible(true);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);
                    
                } else if (txFld_Form7_3.isVisible()){
                    
                    //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(false);
                    labelOpcionRegistrarse.setVisible(false);
                    btRegCorreo.setVisible(false);
                    titulo2Iniciasesion.setVisible(false);
                    labelCorreo.setVisible(false);
                    labelContraseña.setVisible(false);
                    textCorreo.setVisible(false);
                    textContraseña.setVisible(false);
                    labelOlvidarContraseña.setVisible(false);
                    btIniciarSesion2.setVisible(false);

                    //form4 
                    bt_menubar1.setVisible(false);
                    mb_VertPark3.setVisible(false);
                    mb_VertPark2.setVisible(false);
                    tex1.setVisible(false);
                    lb_InincioApp5.setVisible(false);
                    lb_InincioApp.setVisible(false);
                    lb_InincioApp4.setVisible(false);
                    lb_InincioApp2.setVisible(false);
                    lb_InincioApp3.setVisible(false);
                    texArea1.setVisible(false);
                    lb_InincioApp6.setVisible(false);
                    lb_InincioApp7.setVisible(false);
                    texArea2.setVisible(false);
                    jcomp16.setVisible(false);
                            
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form6
                    mb_Billetera2_5.setVisible(false);
                    mb_Billetera1_5.setVisible(false);
                    lb_Billt2_5.setVisible(false);
                    lb_Saldo1_5.setVisible(false);
                    lb_Billet7_5.setVisible(false);
                    lb_Billet6_5.setVisible(false);
                    lb_Billet5_5.setVisible(false);
                    txA_Saldo1.setVisible(false);
                    lb_Billet4_5.setVisible(false);
                    lb_Billet3_5.setVisible(false);
                    mb_Billetera3_5.setVisible(false);
                    bt_Ajuste1_5.setVisible(false);
                    bt_RecargBllt2_5.setVisible(false);
                    bt_PagoQ4_5.setVisible(false);
                    bt_CompBllt3_5.setVisible(false);
                    bt_Not6_5.setVisible(false);
                    bt_Sug7_5.setVisible(false);
                    lb_Billet10_5.setVisible(false);
                    lb_Billet12_5.setVisible(false);
                    lb_Billet9_5.setVisible(false);
                    lb_Billet8_5.setVisible(false);
                    lb_Billet11_5.setVisible(false);
                    bt_Masinfo8_5.setVisible(false);
                    jcomp27.setVisible(false);    
                    
                    //form 7
                    lb_form7_1.setVisible(false);
                    lb_form7_2.setVisible(false);
                    txFld_Form7_1.setVisible(false);
                    txFld_Form7_2.setVisible(false);
                    txFld_Form7_4.setVisible(false);
                    txFld_Form7_3.setVisible(false);
                    lb_form7_3.setVisible(false);
                    lb_form7_4.setVisible(false);
                    lb_form7_6.setVisible(false);
                    lb_form7_5.setVisible(false);
                    cb_form7_1.setVisible(false);
                    cb_form7_2.setVisible(false);
                    cb_form7_3.setVisible(false);
                    cb_form7_4.setVisible(false);
                    lb_form7_7.setVisible(false);
                    txFld_Form7_6.setVisible(false);
                    lb_form7_11.setVisible(false);
                    cb_form7_6.setVisible(false);
                    lb_form7_9.setVisible(false);
                    txFld_Form7_5.setVisible(false);
                    lb_form7_10.setVisible(false);
                    cb_form7_5.setVisible(false);
                    lb_form7_8.setVisible(false);
                    
                    //form8
                    lb_Form8_5.setVisible(true);
                    lb_Form8_6.setVisible(true);
                    jcomp3.setVisible(true);
                    lb_Form8_1.setVisible(true);
                    mb_Form8_2.setVisible(true);
                    mb_Form8_1.setVisible(true);
                    rb_Form8_2.setVisible(true);
                    tA_Form8_4.setVisible(true);
                    bt_Form8_3.setVisible(true);
                    tA_Form8_3.setVisible(true);
                    lb_Form8_4.setVisible(true);
                    bt_Form8_2.setVisible(true);
                    lb_Form8_3.setVisible(true);
                    tA_Form8_2.setVisible(true);
                    bt_Form8_1.setVisible(true);
                    rb_Form8_1.setVisible(true);
                    lb_Form8_2.setVisible(true);
                    tA_Form8_1.setVisible(true);
                    
                }
 

                 

            }
        });
            
        
        // Agregar ActionListener al botón "Devolver" (btDevolverIntroduccion)
        bt_atras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (introduccionPart1.isVisible() || labelOlvidarContraseña.isVisible()){
                    //form1
                    titulo1.setVisible(true);
                    introduccionPart1.setVisible(true);
                    bt_IniciaSesion.setVisible(true);
                    bt_Registrar.setVisible(true);
                    introduccionPart2.setVisible(true);
                    introduccionPart3.setVisible(true);
                    introduccionPart4.setVisible(true);
                    introduccionPart5.setVisible(true);
                    introduccionPart6.setVisible(true);
                    introduccionPart7.setVisible(true);
                    
                    //form 2
                    btRegGoogle.setVisible(false);
                    labelOpcionRegistrarse.setVisible(false);
                    btRegCorreo.setVisible(false);
                    titulo2Iniciasesion.setVisible(false);
                    labelCorreo.setVisible(false);
                    labelContraseña.setVisible(false);
                    textCorreo.setVisible(false);
                    textContraseña.setVisible(false);
                    labelOlvidarContraseña.setVisible(false);
                    btIniciarSesion2.setVisible(false);

                    //form4 
                    bt_menubar1.setVisible(false);
                    mb_VertPark3.setVisible(false);
                    mb_VertPark2.setVisible(false);
                    tex1.setVisible(false);
                    lb_InincioApp5.setVisible(false);
                    lb_InincioApp.setVisible(false);
                    lb_InincioApp4.setVisible(false);
                    lb_InincioApp2.setVisible(false);
                    lb_InincioApp3.setVisible(false);
                    texArea1.setVisible(false);
                    lb_InincioApp6.setVisible(false);
                    lb_InincioApp7.setVisible(false);
                    texArea2.setVisible(false);
                    jcomp16.setVisible(false);
                    
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form6
                    mb_Billetera2_5.setVisible(false);
                    mb_Billetera1_5.setVisible(false);
                    lb_Billt2_5.setVisible(false);
                    lb_Saldo1_5.setVisible(false);
                    lb_Billet7_5.setVisible(false);
                    lb_Billet6_5.setVisible(false);
                    lb_Billet5_5.setVisible(false);
                    txA_Saldo1.setVisible(false);
                    lb_Billet4_5.setVisible(false);
                    lb_Billet3_5.setVisible(false);
                    mb_Billetera3_5.setVisible(false);
                    bt_Ajuste1_5.setVisible(false);
                    bt_RecargBllt2_5.setVisible(false);
                    bt_PagoQ4_5.setVisible(false);
                    bt_CompBllt3_5.setVisible(false);
                    bt_Not6_5.setVisible(false);
                    bt_Sug7_5.setVisible(false);
                    lb_Billet10_5.setVisible(false);
                    lb_Billet12_5.setVisible(false);
                    lb_Billet9_5.setVisible(false);
                    lb_Billet8_5.setVisible(false);
                    lb_Billet11_5.setVisible(false);
                    bt_Masinfo8_5.setVisible(false);
                    jcomp27.setVisible(false);
                    
                    //form 7
                    lb_form7_1.setVisible(false);
                    lb_form7_2.setVisible(false);
                    txFld_Form7_1.setVisible(false);
                    txFld_Form7_2.setVisible(false);
                    txFld_Form7_4.setVisible(false);
                    txFld_Form7_3.setVisible(false);
                    lb_form7_3.setVisible(false);
                    lb_form7_4.setVisible(false);
                    lb_form7_6.setVisible(false);
                    lb_form7_5.setVisible(false);
                    cb_form7_1.setVisible(false);
                    cb_form7_2.setVisible(false);
                    cb_form7_3.setVisible(false);
                    cb_form7_4.setVisible(false);
                    lb_form7_7.setVisible(false);
                    txFld_Form7_6.setVisible(false);
                    lb_form7_11.setVisible(false);
                    cb_form7_6.setVisible(false);
                    lb_form7_9.setVisible(false);
                    txFld_Form7_5.setVisible(false);
                    lb_form7_10.setVisible(false);
                    cb_form7_5.setVisible(false);
                    lb_form7_8.setVisible(false);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);
                    
                } else if(mb_VertPark2.isVisible()){
                    //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(true);
                    labelOpcionRegistrarse.setVisible(true);
                    btRegCorreo.setVisible(true);
                    titulo2Iniciasesion.setVisible(true);
                    labelCorreo.setVisible(true);
                    labelContraseña.setVisible(true);
                    textCorreo.setVisible(true);
                    textContraseña.setVisible(true);
                    labelOlvidarContraseña.setVisible(true);
                    btIniciarSesion2.setVisible(true);

                    //form4 
                    bt_menubar1.setVisible(false);
                    mb_VertPark3.setVisible(false);
                    mb_VertPark2.setVisible(false);
                    tex1.setVisible(false);
                    lb_InincioApp5.setVisible(false);
                    lb_InincioApp.setVisible(false);
                    lb_InincioApp4.setVisible(false);
                    lb_InincioApp2.setVisible(false);
                    lb_InincioApp3.setVisible(false);
                    texArea1.setVisible(false);
                    lb_InincioApp6.setVisible(false);
                    lb_InincioApp7.setVisible(false);
                    texArea2.setVisible(false);
                    jcomp16.setVisible(false); 
                    
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form6
                    mb_Billetera2_5.setVisible(false);
                    mb_Billetera1_5.setVisible(false);
                    lb_Billt2_5.setVisible(false);
                    lb_Saldo1_5.setVisible(false);
                    lb_Billet7_5.setVisible(false);
                    lb_Billet6_5.setVisible(false);
                    lb_Billet5_5.setVisible(false);
                    txA_Saldo1.setVisible(false);
                    lb_Billet4_5.setVisible(false);
                    lb_Billet3_5.setVisible(false);
                    mb_Billetera3_5.setVisible(false);
                    bt_Ajuste1_5.setVisible(false);
                    bt_RecargBllt2_5.setVisible(false);
                    bt_PagoQ4_5.setVisible(false);
                    bt_CompBllt3_5.setVisible(false);
                    bt_Not6_5.setVisible(false);
                    bt_Sug7_5.setVisible(false);
                    lb_Billet10_5.setVisible(false);
                    lb_Billet12_5.setVisible(false);
                    lb_Billet9_5.setVisible(false);
                    lb_Billet8_5.setVisible(false);
                    lb_Billet11_5.setVisible(false);
                    bt_Masinfo8_5.setVisible(false);
                    jcomp27.setVisible(false);
                    
                    //form 7
                    lb_form7_1.setVisible(false);
                    lb_form7_2.setVisible(false);
                    txFld_Form7_1.setVisible(false);
                    txFld_Form7_2.setVisible(false);
                    txFld_Form7_4.setVisible(false);
                    txFld_Form7_3.setVisible(false);
                    lb_form7_3.setVisible(false);
                    lb_form7_4.setVisible(false);
                    lb_form7_6.setVisible(false);
                    lb_form7_5.setVisible(false);
                    cb_form7_1.setVisible(false);
                    cb_form7_2.setVisible(false);
                    cb_form7_3.setVisible(false);
                    cb_form7_4.setVisible(false);
                    lb_form7_7.setVisible(false);
                    txFld_Form7_6.setVisible(false);
                    lb_form7_11.setVisible(false);
                    cb_form7_6.setVisible(false);
                    lb_form7_9.setVisible(false);
                    txFld_Form7_5.setVisible(false);
                    lb_form7_10.setVisible(false);
                    cb_form7_5.setVisible(false);
                    lb_form7_8.setVisible(false);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);
                    
                } else if (lb_form4_5.isVisible()){
                    
                    //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(false);
                    labelOpcionRegistrarse.setVisible(false);
                    btRegCorreo.setVisible(false);
                    titulo2Iniciasesion.setVisible(false);
                    labelCorreo.setVisible(false);
                    labelContraseña.setVisible(false);
                    textCorreo.setVisible(false);
                    textContraseña.setVisible(false);
                    labelOlvidarContraseña.setVisible(false);
                    btIniciarSesion2.setVisible(false);

                    //form4 
                    bt_menubar1.setVisible(true);
                    mb_VertPark3.setVisible(true);
                    mb_VertPark2.setVisible(true);
                    tex1.setVisible(true);
                    lb_InincioApp5.setVisible(true);
                    lb_InincioApp.setVisible(true);
                    lb_InincioApp4.setVisible(true);
                    lb_InincioApp2.setVisible(true);
                    lb_InincioApp3.setVisible(true);
                    texArea1.setVisible(true);
                    lb_InincioApp6.setVisible(true);
                    lb_InincioApp7.setVisible(true);
                    texArea2.setVisible(true);
                    jcomp16.setVisible(true);
                            
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form6
                    mb_Billetera2_5.setVisible(false);
                    mb_Billetera1_5.setVisible(false);
                    lb_Billt2_5.setVisible(false);
                    lb_Saldo1_5.setVisible(false);
                    lb_Billet7_5.setVisible(false);
                    lb_Billet6_5.setVisible(false);
                    lb_Billet5_5.setVisible(false);
                    txA_Saldo1.setVisible(false);
                    lb_Billet4_5.setVisible(false);
                    lb_Billet3_5.setVisible(false);
                    mb_Billetera3_5.setVisible(false);
                    bt_Ajuste1_5.setVisible(false);
                    bt_RecargBllt2_5.setVisible(false);
                    bt_PagoQ4_5.setVisible(false);
                    bt_CompBllt3_5.setVisible(false);
                    bt_Not6_5.setVisible(false);
                    bt_Sug7_5.setVisible(false);
                    lb_Billet10_5.setVisible(false);
                    lb_Billet12_5.setVisible(false);
                    lb_Billet9_5.setVisible(false);
                    lb_Billet8_5.setVisible(false);
                    lb_Billet11_5.setVisible(false);
                    bt_Masinfo8_5.setVisible(false);
                    jcomp27.setVisible(false);
                    
                    //form 7
                    lb_form7_1.setVisible(false);
                    lb_form7_2.setVisible(false);
                    txFld_Form7_1.setVisible(false);
                    txFld_Form7_2.setVisible(false);
                    txFld_Form7_4.setVisible(false);
                    txFld_Form7_3.setVisible(false);
                    lb_form7_3.setVisible(false);
                    lb_form7_4.setVisible(false);
                    lb_form7_6.setVisible(false);
                    lb_form7_5.setVisible(false);
                    cb_form7_1.setVisible(false);
                    cb_form7_2.setVisible(false);
                    cb_form7_3.setVisible(false);
                    cb_form7_4.setVisible(false);
                    lb_form7_7.setVisible(false);
                    txFld_Form7_6.setVisible(false);
                    lb_form7_11.setVisible(false);
                    cb_form7_6.setVisible(false);
                    lb_form7_9.setVisible(false);
                    txFld_Form7_5.setVisible(false);
                    lb_form7_10.setVisible(false);
                    cb_form7_5.setVisible(false);
                    lb_form7_8.setVisible(false);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);
                    
                }else if (mb_Billetera1_5.isVisible()){
                    
                    //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(false);
                    labelOpcionRegistrarse.setVisible(false);
                    btRegCorreo.setVisible(false);
                    titulo2Iniciasesion.setVisible(false);
                    labelCorreo.setVisible(false);
                    labelContraseña.setVisible(false);
                    textCorreo.setVisible(false);
                    textContraseña.setVisible(false);
                    labelOlvidarContraseña.setVisible(false);
                    btIniciarSesion2.setVisible(false);

                    //form4 
                    bt_menubar1.setVisible(false);
                    mb_VertPark3.setVisible(false);
                    mb_VertPark2.setVisible(false);
                    tex1.setVisible(false);
                    lb_InincioApp5.setVisible(false);
                    lb_InincioApp.setVisible(false);
                    lb_InincioApp4.setVisible(false);
                    lb_InincioApp2.setVisible(false);
                    lb_InincioApp3.setVisible(false);
                    texArea1.setVisible(false);
                    lb_InincioApp6.setVisible(false);
                    lb_InincioApp7.setVisible(false);
                    texArea2.setVisible(false);
                    jcomp16.setVisible(false);
                            
                    //form 5
                    lb_form4_8.setVisible(true);
                    texArea_4_2.setVisible(true);
                    cb_4_1.setVisible(true);
                    lb_form4_1.setVisible(true);
                    lb_form4_2.setVisible(true);
                    lb_form4_5.setVisible(true);                    
                    lb_form4_4.setVisible(true);
                    bt_Cambiar1.setVisible(true);
                    lb_form4_3.setVisible(true);
                    lb_form4_6.setVisible(true);
                    texArea_4_1.setVisible(true);
                    lb_form4_7.setVisible(true);
                    
                    //form6
                    mb_Billetera2_5.setVisible(false);
                    mb_Billetera1_5.setVisible(false);
                    lb_Billt2_5.setVisible(false);
                    lb_Saldo1_5.setVisible(false);
                    lb_Billet7_5.setVisible(false);
                    lb_Billet6_5.setVisible(false);
                    lb_Billet5_5.setVisible(false);
                    txA_Saldo1.setVisible(false);
                    lb_Billet4_5.setVisible(false);
                    lb_Billet3_5.setVisible(false);
                    mb_Billetera3_5.setVisible(false);
                    bt_Ajuste1_5.setVisible(false);
                    bt_RecargBllt2_5.setVisible(false);
                    bt_PagoQ4_5.setVisible(false);
                    bt_CompBllt3_5.setVisible(false);
                    bt_Not6_5.setVisible(false);
                    bt_Sug7_5.setVisible(false);
                    lb_Billet10_5.setVisible(false);
                    lb_Billet12_5.setVisible(false);
                    lb_Billet9_5.setVisible(false);
                    lb_Billet8_5.setVisible(false);
                    lb_Billet11_5.setVisible(false);
                    bt_Masinfo8_5.setVisible(false);
                    jcomp27.setVisible(false);
                    
                    //form 7
                    lb_form7_1.setVisible(false);
                    lb_form7_2.setVisible(false);
                    txFld_Form7_1.setVisible(false);
                    txFld_Form7_2.setVisible(false);
                    txFld_Form7_4.setVisible(false);
                    txFld_Form7_3.setVisible(false);
                    lb_form7_3.setVisible(false);
                    lb_form7_4.setVisible(false);
                    lb_form7_6.setVisible(false);
                    lb_form7_5.setVisible(false);
                    cb_form7_1.setVisible(false);
                    cb_form7_2.setVisible(false);
                    cb_form7_3.setVisible(false);
                    cb_form7_4.setVisible(false);
                    lb_form7_7.setVisible(false);
                    txFld_Form7_6.setVisible(false);
                    lb_form7_11.setVisible(false);
                    cb_form7_6.setVisible(false);
                    lb_form7_9.setVisible(false);
                    txFld_Form7_5.setVisible(false);
                    lb_form7_10.setVisible(false);
                    cb_form7_5.setVisible(false);
                    lb_form7_8.setVisible(false);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);
                    
                    
                } else if (txFld_Form7_2.isVisible()){
                    
                    //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(false);
                    labelOpcionRegistrarse.setVisible(false);
                    btRegCorreo.setVisible(false);
                    titulo2Iniciasesion.setVisible(false);
                    labelCorreo.setVisible(false);
                    labelContraseña.setVisible(false);
                    textCorreo.setVisible(false);
                    textContraseña.setVisible(false);
                    labelOlvidarContraseña.setVisible(false);
                    btIniciarSesion2.setVisible(false);

                    //form4 
                    bt_menubar1.setVisible(false);
                    mb_VertPark3.setVisible(false);
                    mb_VertPark2.setVisible(false);
                    tex1.setVisible(false);
                    lb_InincioApp5.setVisible(false);
                    lb_InincioApp.setVisible(false);
                    lb_InincioApp4.setVisible(false);
                    lb_InincioApp2.setVisible(false);
                    lb_InincioApp3.setVisible(false);
                    texArea1.setVisible(false);
                    lb_InincioApp6.setVisible(false);
                    lb_InincioApp7.setVisible(false);
                    texArea2.setVisible(false);
                    jcomp16.setVisible(false);
                            
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form6
                    mb_Billetera2_5.setVisible(true);
                    mb_Billetera1_5.setVisible(true);
                    lb_Billt2_5.setVisible(true);
                    lb_Saldo1_5.setVisible(true);
                    lb_Billet7_5.setVisible(true);
                    lb_Billet6_5.setVisible(true);
                    lb_Billet5_5.setVisible(true);
                    txA_Saldo1.setVisible(true);
                    lb_Billet4_5.setVisible(true);
                    lb_Billet3_5.setVisible(true);
                    mb_Billetera3_5.setVisible(true);
                    bt_Ajuste1_5.setVisible(true);
                    bt_RecargBllt2_5.setVisible(true);
                    bt_PagoQ4_5.setVisible(true);
                    bt_CompBllt3_5.setVisible(true);
                    bt_Not6_5.setVisible(true);
                    bt_Sug7_5.setVisible(true);
                    lb_Billet10_5.setVisible(true);
                    lb_Billet12_5.setVisible(true);
                    lb_Billet9_5.setVisible(true);
                    lb_Billet8_5.setVisible(true);
                    lb_Billet11_5.setVisible(true);
                    bt_Masinfo8_5.setVisible(true);
                    jcomp27.setVisible(true);
                    
                    //form 7
                    lb_form7_1.setVisible(false);
                    lb_form7_2.setVisible(false);
                    txFld_Form7_1.setVisible(false);
                    txFld_Form7_2.setVisible(false);
                    txFld_Form7_4.setVisible(false);
                    txFld_Form7_3.setVisible(false);
                    lb_form7_3.setVisible(false);
                    lb_form7_4.setVisible(false);
                    lb_form7_6.setVisible(false);
                    lb_form7_5.setVisible(false);
                    cb_form7_1.setVisible(false);
                    cb_form7_2.setVisible(false);
                    cb_form7_3.setVisible(false);
                    cb_form7_4.setVisible(false);
                    lb_form7_7.setVisible(false);
                    txFld_Form7_6.setVisible(false);
                    lb_form7_11.setVisible(false);
                    cb_form7_6.setVisible(false);
                    lb_form7_9.setVisible(false);
                    txFld_Form7_5.setVisible(false);
                    lb_form7_10.setVisible(false);
                    cb_form7_5.setVisible(false);
                    lb_form7_8.setVisible(false);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);
                    
                } else if (bt_Form8_3.isVisible()){
                    
                    //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(false);
                    labelOpcionRegistrarse.setVisible(false);
                    btRegCorreo.setVisible(false);
                    titulo2Iniciasesion.setVisible(false);
                    labelCorreo.setVisible(false);
                    labelContraseña.setVisible(false);
                    textCorreo.setVisible(false);
                    textContraseña.setVisible(false);
                    labelOlvidarContraseña.setVisible(false);
                    btIniciarSesion2.setVisible(false);

                    //form4 
                    bt_menubar1.setVisible(false);
                    mb_VertPark3.setVisible(false);
                    mb_VertPark2.setVisible(false);
                    tex1.setVisible(false);
                    lb_InincioApp5.setVisible(false);
                    lb_InincioApp.setVisible(false);
                    lb_InincioApp4.setVisible(false);
                    lb_InincioApp2.setVisible(false);
                    lb_InincioApp3.setVisible(false);
                    texArea1.setVisible(false);
                    lb_InincioApp6.setVisible(false);
                    lb_InincioApp7.setVisible(false);
                    texArea2.setVisible(false);
                    jcomp16.setVisible(false);
                            
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form6
                    mb_Billetera2_5.setVisible(false);
                    mb_Billetera1_5.setVisible(false);
                    lb_Billt2_5.setVisible(false);
                    lb_Saldo1_5.setVisible(false);
                    lb_Billet7_5.setVisible(false);
                    lb_Billet6_5.setVisible(false);
                    lb_Billet5_5.setVisible(false);
                    txA_Saldo1.setVisible(false);
                    lb_Billet4_5.setVisible(false);
                    lb_Billet3_5.setVisible(false);
                    mb_Billetera3_5.setVisible(false);
                    bt_Ajuste1_5.setVisible(false);
                    bt_RecargBllt2_5.setVisible(false);
                    bt_PagoQ4_5.setVisible(false);
                    bt_CompBllt3_5.setVisible(false);
                    bt_Not6_5.setVisible(false);
                    bt_Sug7_5.setVisible(false);
                    lb_Billet10_5.setVisible(false);
                    lb_Billet12_5.setVisible(false);
                    lb_Billet9_5.setVisible(false);
                    lb_Billet8_5.setVisible(false);
                    lb_Billet11_5.setVisible(false);
                    bt_Masinfo8_5.setVisible(false);
                    jcomp27.setVisible(false);
                    
                    //form 7
                    lb_form7_1.setVisible(true);
                    lb_form7_2.setVisible(true);
                    txFld_Form7_1.setVisible(true);
                    txFld_Form7_2.setVisible(true);
                    txFld_Form7_4.setVisible(true);
                    txFld_Form7_3.setVisible(true);
                    lb_form7_3.setVisible(true);
                    lb_form7_4.setVisible(true);
                    lb_form7_6.setVisible(true);
                    lb_form7_5.setVisible(true);
                    cb_form7_1.setVisible(true);
                    cb_form7_2.setVisible(true);
                    cb_form7_3.setVisible(true);
                    cb_form7_4.setVisible(true);
                    lb_form7_7.setVisible(true);
                    txFld_Form7_6.setVisible(true);
                    lb_form7_11.setVisible(true);
                    cb_form7_6.setVisible(true);
                    lb_form7_9.setVisible(true);
                    txFld_Form7_5.setVisible(true);
                    lb_form7_10.setVisible(true);
                    cb_form7_5.setVisible(true);
                    lb_form7_8.setVisible(true);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);
                    
                }
                
                

            }
        });

        
        // Agregar ActionListener al botón "Registrar" (bt_IniciaSesion)
        bt_Registrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(false);
                    labelOpcionRegistrarse.setVisible(false);
                    btRegCorreo.setVisible(false);
                    titulo2Iniciasesion.setVisible(false);
                    labelCorreo.setVisible(false);
                    labelContraseña.setVisible(false);
                    textCorreo.setVisible(false);
                    textContraseña.setVisible(false);
                    labelOlvidarContraseña.setVisible(false);
                    btIniciarSesion2.setVisible(false);

                    //form4 
                    bt_menubar1.setVisible(false);
                    mb_VertPark3.setVisible(false);
                    mb_VertPark2.setVisible(false);
                    tex1.setVisible(false);
                    lb_InincioApp5.setVisible(false);
                    lb_InincioApp.setVisible(false);
                    lb_InincioApp4.setVisible(false);
                    lb_InincioApp2.setVisible(false);
                    lb_InincioApp3.setVisible(false);
                    texArea1.setVisible(false);
                    lb_InincioApp6.setVisible(false);
                    lb_InincioApp7.setVisible(false);
                    texArea2.setVisible(false);
                    jcomp16.setVisible(false);
                    
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form6
                    mb_Billetera2_5.setVisible(false);
                    mb_Billetera1_5.setVisible(false);
                    lb_Billt2_5.setVisible(false);
                    lb_Saldo1_5.setVisible(false);
                    lb_Billet7_5.setVisible(false);
                    lb_Billet6_5.setVisible(false);
                    lb_Billet5_5.setVisible(false);
                    txA_Saldo1.setVisible(false);
                    lb_Billet4_5.setVisible(false);
                    lb_Billet3_5.setVisible(false);
                    mb_Billetera3_5.setVisible(false);
                    bt_Ajuste1_5.setVisible(false);
                    bt_RecargBllt2_5.setVisible(false);
                    bt_PagoQ4_5.setVisible(false);
                    bt_CompBllt3_5.setVisible(false);
                    bt_Not6_5.setVisible(false);
                    bt_Sug7_5.setVisible(false);
                    lb_Billet10_5.setVisible(false);
                    lb_Billet12_5.setVisible(false);
                    lb_Billet9_5.setVisible(false);
                    lb_Billet8_5.setVisible(false);
                    lb_Billet11_5.setVisible(false);
                    bt_Masinfo8_5.setVisible(false);
                    jcomp27.setVisible(false);
                    
                    
                    //form 7
                    lb_form7_1.setVisible(true);
                    lb_form7_2.setVisible(true);
                    txFld_Form7_1.setVisible(true);
                    txFld_Form7_2.setVisible(true);
                    txFld_Form7_4.setVisible(true);
                    txFld_Form7_3.setVisible(true);
                    lb_form7_3.setVisible(true);
                    lb_form7_4.setVisible(true);
                    lb_form7_6.setVisible(true);
                    lb_form7_5.setVisible(true);
                    cb_form7_1.setVisible(true);
                    cb_form7_2.setVisible(true);
                    cb_form7_3.setVisible(true);
                    cb_form7_4.setVisible(true);
                    lb_form7_7.setVisible(true);
                    txFld_Form7_6.setVisible(true);
                    lb_form7_11.setVisible(true);
                    cb_form7_6.setVisible(true);
                    lb_form7_9.setVisible(true);
                    txFld_Form7_5.setVisible(true);
                    lb_form7_10.setVisible(true);
                    cb_form7_5.setVisible(true);
                    lb_form7_8.setVisible(true);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);
                
                

            }
        });
        
        
        
        // Agregar ActionListener al botón "Inicia Sesión" (bt_IniciaSesion)
        bt_IniciaSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(true);
                    labelOpcionRegistrarse.setVisible(true);
                    btRegCorreo.setVisible(true);
                    titulo2Iniciasesion.setVisible(true);
                    labelCorreo.setVisible(true);
                    labelContraseña.setVisible(true);
                    textCorreo.setVisible(true);
                    textContraseña.setVisible(true);
                    labelOlvidarContraseña.setVisible(true);
                    btIniciarSesion2.setVisible(true);


                    //form4 
                    bt_menubar1.setVisible(false);
                    mb_VertPark3.setVisible(false);
                    mb_VertPark2.setVisible(false);
                    tex1.setVisible(false);
                    lb_InincioApp5.setVisible(false);
                    lb_InincioApp.setVisible(false);
                    lb_InincioApp4.setVisible(false);
                    lb_InincioApp2.setVisible(false);
                    lb_InincioApp3.setVisible(false);
                    texArea1.setVisible(false);
                    lb_InincioApp6.setVisible(false);
                    lb_InincioApp7.setVisible(false);
                    texArea2.setVisible(false);
                    jcomp16.setVisible(false);
                            
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form6
                    mb_Billetera2_5.setVisible(false);
                    mb_Billetera1_5.setVisible(false);
                    lb_Billt2_5.setVisible(false);
                    lb_Saldo1_5.setVisible(false);
                    lb_Billet7_5.setVisible(false);
                    lb_Billet6_5.setVisible(false);
                    lb_Billet5_5.setVisible(false);
                    txA_Saldo1.setVisible(false);
                    lb_Billet4_5.setVisible(false);
                    lb_Billet3_5.setVisible(false);
                    mb_Billetera3_5.setVisible(false);
                    bt_Ajuste1_5.setVisible(false);
                    bt_RecargBllt2_5.setVisible(false);
                    bt_PagoQ4_5.setVisible(false);
                    bt_CompBllt3_5.setVisible(false);
                    bt_Not6_5.setVisible(false);
                    bt_Sug7_5.setVisible(false);
                    lb_Billet10_5.setVisible(false);
                    lb_Billet12_5.setVisible(false);
                    lb_Billet9_5.setVisible(false);
                    lb_Billet8_5.setVisible(false);
                    lb_Billet11_5.setVisible(false);
                    bt_Masinfo8_5.setVisible(false);
                    jcomp27.setVisible(false);
                    
                    //form 7
                    lb_form7_1.setVisible(false);
                    lb_form7_2.setVisible(false);
                    txFld_Form7_1.setVisible(false);
                    txFld_Form7_2.setVisible(false);
                    txFld_Form7_4.setVisible(false);
                    txFld_Form7_3.setVisible(false);
                    lb_form7_3.setVisible(false);
                    lb_form7_4.setVisible(false);
                    lb_form7_6.setVisible(false);
                    lb_form7_5.setVisible(false);
                    cb_form7_1.setVisible(false);
                    cb_form7_2.setVisible(false);
                    cb_form7_3.setVisible(false);
                    cb_form7_4.setVisible(false);
                    lb_form7_7.setVisible(false);
                    txFld_Form7_6.setVisible(false);
                    lb_form7_11.setVisible(false);
                    cb_form7_6.setVisible(false);
                    lb_form7_9.setVisible(false);
                    txFld_Form7_5.setVisible(false);
                    lb_form7_10.setVisible(false);
                    cb_form7_5.setVisible(false);
                    lb_form7_8.setVisible(false);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);

            }
        });

        btIniciarSesion2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //form1
                    titulo1.setVisible(false);
                    introduccionPart1.setVisible(false);
                    bt_IniciaSesion.setVisible(false);
                    bt_Registrar.setVisible(false);
                    introduccionPart2.setVisible(false);
                    introduccionPart3.setVisible(false);
                    introduccionPart4.setVisible(false);
                    introduccionPart5.setVisible(false);
                    introduccionPart6.setVisible(false);
                    introduccionPart7.setVisible(false);
                    
                    //form 2
                    btRegGoogle.setVisible(false);
                    labelOpcionRegistrarse.setVisible(false);
                    btRegCorreo.setVisible(false);
                    titulo2Iniciasesion.setVisible(false);
                    labelCorreo.setVisible(false);
                    labelContraseña.setVisible(false);
                    textCorreo.setVisible(false);
                    textContraseña.setVisible(false);
                    labelOlvidarContraseña.setVisible(false);
                    btIniciarSesion2.setVisible(false);


                    //form4 
                    bt_menubar1.setVisible(true);
                    mb_VertPark3.setVisible(true);
                    mb_VertPark2.setVisible(true);
                    tex1.setVisible(true);
                    lb_InincioApp5.setVisible(true);
                    lb_InincioApp.setVisible(true);
                    lb_InincioApp4.setVisible(true);
                    lb_InincioApp2.setVisible(true);
                    lb_InincioApp3.setVisible(true);
                    texArea1.setVisible(true);
                    lb_InincioApp6.setVisible(true);
                    lb_InincioApp7.setVisible(true);
                    texArea2.setVisible(true);
                    jcomp16.setVisible(true);
                            
                    //form 5
                    lb_form4_8.setVisible(false);
                    texArea_4_2.setVisible(false);
                    cb_4_1.setVisible(false);
                    lb_form4_1.setVisible(false);
                    lb_form4_2.setVisible(false);
                    lb_form4_5.setVisible(false);                    
                    lb_form4_4.setVisible(false);
                    bt_Cambiar1.setVisible(false);
                    lb_form4_3.setVisible(false);
                    lb_form4_6.setVisible(false);
                    texArea_4_1.setVisible(false);
                    lb_form4_7.setVisible(false);
                    
                    //form6
                    mb_Billetera2_5.setVisible(false);
                    mb_Billetera1_5.setVisible(false);
                    lb_Billt2_5.setVisible(false);
                    lb_Saldo1_5.setVisible(false);
                    lb_Billet7_5.setVisible(false);
                    lb_Billet6_5.setVisible(false);
                    lb_Billet5_5.setVisible(false);
                    txA_Saldo1.setVisible(false);
                    lb_Billet4_5.setVisible(false);
                    lb_Billet3_5.setVisible(false);
                    mb_Billetera3_5.setVisible(false);
                    bt_Ajuste1_5.setVisible(false);
                    bt_RecargBllt2_5.setVisible(false);
                    bt_PagoQ4_5.setVisible(false);
                    bt_CompBllt3_5.setVisible(false);
                    bt_Not6_5.setVisible(false);
                    bt_Sug7_5.setVisible(false);
                    lb_Billet10_5.setVisible(false);
                    lb_Billet12_5.setVisible(false);
                    lb_Billet9_5.setVisible(false);
                    lb_Billet8_5.setVisible(false);
                    lb_Billet11_5.setVisible(false);
                    bt_Masinfo8_5.setVisible(false);
                    jcomp27.setVisible(false);
                    
                    //form 7
                    lb_form7_1.setVisible(false);
                    lb_form7_2.setVisible(false);
                    txFld_Form7_1.setVisible(false);
                    txFld_Form7_2.setVisible(false);
                    txFld_Form7_4.setVisible(false);
                    txFld_Form7_3.setVisible(false);
                    lb_form7_3.setVisible(false);
                    lb_form7_4.setVisible(false);
                    lb_form7_6.setVisible(false);
                    lb_form7_5.setVisible(false);
                    cb_form7_1.setVisible(false);
                    cb_form7_2.setVisible(false);
                    cb_form7_3.setVisible(false);
                    cb_form7_4.setVisible(false);
                    lb_form7_7.setVisible(false);
                    txFld_Form7_6.setVisible(false);
                    lb_form7_11.setVisible(false);
                    cb_form7_6.setVisible(false);
                    lb_form7_9.setVisible(false);
                    txFld_Form7_5.setVisible(false);
                    lb_form7_10.setVisible(false);
                    cb_form7_5.setVisible(false);
                    lb_form7_8.setVisible(false);
                    
                    //form8
                    lb_Form8_5.setVisible(false);
                    lb_Form8_6.setVisible(false);
                    jcomp3.setVisible(false);
                    lb_Form8_1.setVisible(false);
                    mb_Form8_2.setVisible(false);
                    mb_Form8_1.setVisible(false);
                    rb_Form8_2.setVisible(false);
                    tA_Form8_4.setVisible(false);
                    bt_Form8_3.setVisible(false);
                    tA_Form8_3.setVisible(false);
                    lb_Form8_4.setVisible(false);
                    bt_Form8_2.setVisible(false);
                    lb_Form8_3.setVisible(false);
                    tA_Form8_2.setVisible(false);
                    bt_Form8_1.setVisible(false);
                    rb_Form8_1.setVisible(false);
                    lb_Form8_2.setVisible(false);
                    tA_Form8_1.setVisible(false);
                
                
                
                
                
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyPanel_1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MyPanel_1());
        frame.pack();
        frame.setVisible(true);
    }
}
