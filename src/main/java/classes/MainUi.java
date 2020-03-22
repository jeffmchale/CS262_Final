// package  main.java.classes; 

// //imports 
// import javax.swing.*;
// import java.awt.*; 
// import java.awt.event.*; 

// /*
// * 1) Construct our super to set title orr call setTitle()
// * 2) Size the frame, manually or automatically 
// * 2.1 Build out components in frame 
// * 3) Position frame 
// * 4) Default close option 
// * 5) Display the frame 
// */
// public class MainUi extends JFrame implements ActionListener,FocusListener{
//     //attributes
//     private static final long serialVersionUID = 1L;
//     private JButton quit;
//     private JButton calc;
//     private JTextField txtA;
//     private JTextField txtB;
//     private JLabel lblResult;
    
//     /**
//      * The constructor of the class should handle the following tasks:
//             1) Construct super class to set title or call setTitle()
//             2) Size the frame, manually or automatically
//             3) position frame
//             4) Default close action
//             5) Display the frame
//      * @param title receives a string to set the frame's title
//      */
//     public MainUi(String title){

        

//         //1) construct the frame with
//         if(title != null)
//             setTitle(title); //same: super(title);

//         //2) size the frame; manually or automatically with pack()<shrinks or expands>
//         setSize(new Dimension(300, 400));

//         //3) default position is top-left corner; 
//         //change position with setBounds(int x,int y,int w,int h)

//         //4) set default close action
//         //If you are creating a frame to serve as an application’s main user interface,
//         //the expected behavior is probably EXIT_ON_CLOSE, which shuts down the application along with the frame.
//         //
//         //EXIT_ON_CLOSE: Exits the application when the frame is closed
//         //DISPOSE_ON_CLOSE: Closes the frame, removes the frame object from Java Virtual Machine (JVM) memory, and keeps running the application
//         //DO_NOTHING_ON_CLOSE: Keeps the frame open and continues running
//         //HIDE_ON_CLOSE: Closes the frame and continues running
//         //---===Do NOTHING FIRST===---
//         //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         //5) set look and feel
//         //there is a default look and feel, however, we can change with UIManager class
//         //contain this methad with a try...catch block
//         //UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//         setLookAndFeel(null);

//         //5.1) create components

//         //Buttons
//         //JButton(String): A button labeled with the specified text
//         //JButton(Icon): A button that displays the specified graphical icon
//         //JButton(String, Icon): A button with the specified text and graphical icon
//         calc = new JButton("Calculate");
//         calc.addActionListener(this);
//         quit = new JButton("Quit");
//         quit.addActionListener(this);
//         //ADD LISTENER BEFORE ADDING COMPONENT TO FRAME

//         //options of components
//         //quit.setEnabled(false);
//         //quit.setVisible(false);
//         //quit.setSize(new Dimension(200, 20));

//         //connection labels and fields
//         //LABELS
//         //JLabel(String): A label with the specified text
//         //JLabel(String, int): A label with the specified text and alignment
//         //JLabel(String, Icon, int): A label with the specified text, icon, and alignment; SwingConstants.LEFT
//         JLabel lblA = new JLabel("Enter A:", SwingConstants.CENTER);
//         JLabel lblB = new JLabel("Enter B:", SwingConstants.CENTER);
//         JLabel lblFormula = new JLabel("A^2 + B^2 = C:", SwingConstants.CENTER);
//         lblResult = new JLabel("RESULT: ", SwingConstants.CENTER);


//         //TEXT FIELDS
//         //JTextField(): An empty text field
//         //JTextField(int): A text field with the specified width
//         //JTextField(String, int): A text field with the specified text and width
//         txtA = new MyJTextField("0",20); //changed to my extended component
//         txtA.addFocusListener(this);
//         txtB = new MyJTextField("0",20); //changed to my extended component
//         txtB.addFocusListener(this);

//         //TEXT AREAS
//         //JTextArea(int, int): A text area with the specified number of rows and columns
//         //JTextArea(String, int, int): A text area with the specified text, rows, and columns

//         //CHECK BOXES AND RADIO BUTTONS
//         //setSelected(boolean): Selects the component if the argument is true and deselects it otherwise
//         //isSelected(): Returns a Boolean indicating whether the component is currently selected
//         //The following constructors can be used for the JCheckBox class:
//         //JCheckBox(String): A check box with the specified text label
//         //JCheckBox(String, boolean): A check box with the specified text label that is selected if the second argument is true
//         //JCheckBox(Icon): A check box with the specified graphical icon
//         //JCheckBox(Icon, boolean): A check box with the specified graphical icon that is selected if the second argument is true
//         //JCheckBox(String, Icon): A check box with the specified text label and graphical icon
//         //JCheckBox(String, Icon, boolean): A check box with the specified text label and graphical icon that is selected if the third argument is true
//         //The JRadioButton class has constructors with the same arguments and functionality.
//         //Use groups to make nonexclusive radio/check boxes exclusive
//         //ButtonGroup saveFormat = new ButtonGroup();
//         //JRadioButton s1 = new JRadioButton("JSON", false);
//         //saveFormat.add(s1);
//         //JRadioButton s2 = new JRadioButton("XML", true);
//         //saveFormat.add(s2);

//         //SCROLLING PANES
//         //JScrollPane(Component): A scrolling pane that contains the specified component
//         //JScrollPane(Component, int, int): A scrolling pane with the specified component, vertical scrollbar configuration, and horizontal scrollbar configuration
//         //
//         //Scrollbars are configured using one of six static class variables of the ScrollPaneConstants interface. There are three for vertical scrollbars:
//         //VERTICAL_SCROLLBAR_ALWAYS
//         //VERTICAL_SCROLLBAR_AS_NEEDED
//         //VERTICAL_SCROLLBAR_NEVER
        
//         //Before you can display a user interface component such as a button in a Java program,
//         //you must add it to a container and display that container.
//         JPanel panel = new JPanel();

//         //handle layout
//         //Several AWT and Swing classes provide layout managers for general use:
//         //https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
//         //BorderLayout: A BorderLayout places components in up to five areas: top, bottom, left, right, and center. All extra space is placed in the center area.
//         //BoxLayout: The BoxLayout class puts components in a single row or column. It respects the components' requested maximum sizes and also lets you align components
//         //CardLayout: The CardLayout class lets you implement an area that contains different components at different times
//         //FlowLayout: FlowLayout is the default layout manager for every JPanel. It simply lays out components in a single row, starting a new row if its container is not sufficiently wide.
//         //GridBagLayout: GridBagLayout is a sophisticated, flexible layout manager. It aligns components by placing them within a grid of cells, allowing components to span more than one cell. The rows in the grid can have different heights, and grid columns can have different widths
//         //GridLayout: GridLayout simply makes a bunch of components equal in size and displays them in the requested number of rows and columns.
//         //GroupLayout: GroupLayout is a layout manager that was developed for use by GUI builder tools, but it can also be used manually. GroupLayout works with the horizontal and vertical layouts separately. The layout is defined for each dimension independently. Consequently, however, each component needs to be defined twice in the layout.
//         //SpringLayout: SpringLayout is a flexible layout manager designed for use by GUI builders. It lets you specify precise relationships between the edges of components under its control. 
//         panel.setLayout(new GridLayout(0,2));

//         //add components to panel
//         panel.add(lblA);
//         panel.add(txtA);
//         panel.add(lblB);
//         panel.add(txtB);
//         panel.add(lblFormula);
//         panel.add(lblResult);
//         panel.add(new JLabel());
//         panel.add(new JLabel());
//         panel.add(calc);
//         panel.add(quit);

//         //add panel to frame
//         this.add(panel);

//         //5.2) AFTER FIRST FEW RUNS: pack and auto center on window
//         pack();
//         //java version 1.4 or greater
//         // DO THIS FIRST: setLocationRelativeTo(null);
//         centerWindow(); //works with all version manually

//         //6) display the frame
//         setVisible(true);
//     }

//     /**
//      * set the theme for the user interface window
//      * @param theme default: javax.swing.plaf.nimbus.NimbusLookAndFeel
//      */
//     private void setLookAndFeel(String theme){
//         //set theme default
//         if(theme == null)
//             theme = "javax.swing.plaf.nimbus.NimbusLookAndFeel";

//         //try to set the theme
//         try{
//             UIManager.setLookAndFeel(theme);
//         }
//         catch(ClassNotFoundException e){
//             e.printStackTrace();
//         }
//         catch(InstantiationException e){
//             e.printStackTrace();
//         }
//         catch(IllegalAccessException e){
//             e.printStackTrace();
//         }
//         catch(UnsupportedLookAndFeelException e){
//             e.printStackTrace();
//         }
//         catch(ClassCastException e){
//             e.printStackTrace();
//         }
//         catch(NullPointerException e){
//             e.printStackTrace();
//         }
//     }

//     /**
//      * center the user interface on the screen by getting the screen size, subtracting frame size, and divide by 2
//      */
//     private void centerWindow(){
//         //get the dimensions of current screen
//         Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

//         //get the size of the screen and window, divide by 2 to center
//         int x = (int) (((d.getWidth() - this.getWidth())) / 2);
//         int y = (int) (((d.getHeight() - this.getHeight())) / 2);

//         //set the location
//         this.setLocation(x, y);
//     }

//     /**
//      * performs action based on listener event
//      */
//     public void actionPerformed(ActionEvent event){
//         Object source = event.getSource();

//         if(source == quit)
//             System.exit(0);

//         if(source == calc)
//             compute();
//     }

//     @Override
//     public void focusGained(FocusEvent event){
//         Object source = event.getSource();
//         if(source.getClass().getName() == "main.java.classes.MyJTextField"){
//             if(((MyJTextField)source).getDefaultValue().equals(((MyJTextField)source).getText())){
//                 ((MyJTextField)source).setText("");
//             }
//         }
//     }

//     @Override
//     public void focusLost(FocusEvent event){
//         Object source = event.getSource();
//         if(source.getClass().getName() == "main.java.classes.MyJTextField"){
//             if(((MyJTextField)source).getText().equals("")){
//                 ((MyJTextField)source).setText(((MyJTextField)source).getDefaultValue());
//             }
//         }
//     }

//     private void compute(){
//         //get integers and compute
//         double a = Double.parseDouble(txtA.getText());
//         double b = Double.parseDouble(txtB.getText());
//         double c = Math.pow(a,2) + Math.pow(b,2);

//         //set the result
//         lblResult.setText("RESULT: " + Double.toString(c));
//     }
// }