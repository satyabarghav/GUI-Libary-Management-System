# GUI based Libary Management System
The provided code represents a simple graphical user interface (GUI) for a Library Management System. Here's a description of the code:

The necessary Java Swing and AWT libraries are imported to build the GUI.
The GUI class extends the JFrame class and implements the ActionListener interface to handle button clicks.
The serialVersionUID is a unique identifier for the class version, used for serialization.
The class has instance variables: b1, b2, b3, b4 of type JButton, and l1 of type JLabel.
The constructor GUI(String s) initializes the GUI by setting the visibility, title, size, and default close operation of the frame.
The getContentPane() method retrieves the content pane of the frame and sets the layout to a GridLayout with 4 rows and 1 column.
Three buttons (b1, b2, b3) and a label (l1) are created and added to the content pane.
Action listeners are added to the buttons to handle button clicks.
The main method creates an instance of the GUI class and displays the GUI with a welcome message.
The actionPerformed method is invoked when a button is clicked. It creates and displays new frames (Add, Lend, Search) based on the button clicked.
Overall, the code sets up a basic GUI for a Library Management System with buttons for adding books, lending books, and searching. The action listeners handle the button clicks and open new frames for specific functionalities.
