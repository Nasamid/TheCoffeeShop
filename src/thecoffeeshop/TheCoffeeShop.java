package thecoffeeshop;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TheCoffeeShop {
    public TheCoffeeShop(){
    
    //Universal Variables for MenuItem prices
    final int i1p = 50,
    	i2p = 100,
    	i3p = 25,
    	i4p = 100,
    	i5p = 80,
    	i6p = 80,
    	i7p = 80,
    	i8p = 100,
    	i9p = 120,
    	i10p = 150,
    	i11p = 60,
    	i12p = 70,
    	i13p = 80,
    	i14p =100,
    	i15p = 100;
    
    //Frame Title
    final JLabel shopName = new JLabel("THE BEANERY");
    shopName.setForeground(Color.white);
    shopName.setFont(new Font("AMGDT", Font.BOLD, 50));
    shopName.setBounds(40, -20, 500, 200);
    
    //Initial Button 
    final JButton welcomeButton = new JButton("Welcome");
    welcomeButton.setBounds(170, 500, 150, 45);
    welcomeButton.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 26));
    
    //BG image 1 -- Full opacity
    ImageIcon bgi = new ImageIcon("BGs100--lt.png");
    int height = bgi.getIconHeight();
    int width = bgi.getIconWidth();
    final JLabel bg = new JLabel(bgi);
    bg.setBounds(48, 110, width, height);
    bg.setVisible(false);
    
    //BG image 2 -- High Transparency
    ImageIcon bgi2 = new ImageIcon("BGs100.png");
    int height2 = bgi2.getIconHeight();
    int width2 = bgi2.getIconWidth();
    final JLabel bg2 = new JLabel(bgi2);
    bg2.setBounds(48, 110, width2, height2);
    bg2.setVisible(true);
    
    //Clear Selection Button
    Color button1BG = new Color(240, 110, 100);
    final JButton clearButton = new JButton("CLEAR SELECTION");
    clearButton.setBounds(260, 340, 200, 30);
    clearButton.setForeground(Color.white);
    clearButton.setBackground(button1BG);
    clearButton.setVisible(false);
    
    //Place Order Button
    Color button2BG = new Color(152, 251, 152);
    final JButton placeOrderButton = new JButton("PLACE ORDER");
    placeOrderButton.setBounds(260, 380, 200, 30);
    placeOrderButton.setBackground(button2BG);
    placeOrderButton.setVisible(false);
    
    //Place Order Text
    final JLabel placeOrder = new JLabel("Please place your Order");
    placeOrder.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
    placeOrder.setForeground(Color.white);
    placeOrder.setBounds(160, 50, 400, 100);
    placeOrder.setVisible(false);
    
    //Hot Drinks Title
    final JLabel hotDrinks = new JLabel ("Hot Drinks");
    hotDrinks.setFont(new Font("Harlow Solid Italic", Font.BOLD, 25));
    hotDrinks.setForeground(Color.white);
    hotDrinks.setBounds(47, 90, 400, 100);
    hotDrinks.setVisible(false);
    
    //Cold Drinks Title
    final JLabel coldDrinks = new JLabel("Cold Drinks");
    coldDrinks.setFont(new Font("Harlow Solid Italic", Font.BOLD, 25));
    coldDrinks.setForeground(Color.white);
    coldDrinks.setBounds(330, 90, 400, 100);
    coldDrinks.setVisible(false);
    
    //Food Items Title
    final JLabel foodItems = new JLabel ("Food Items");
    foodItems.setFont(new Font("Harlow Solid Italic", Font.BOLD, 25));
    foodItems.setForeground(Color.white);
    foodItems.setBounds(40, 250, 400, 100);
    foodItems.setVisible(false);
    
    //"SubTotal" Components
    final JLabel subtotalPrice = new JLabel ("SubTotal :    ₱ ");
    subtotalPrice.setBounds(150, 470, 200, 20);
    subtotalPrice.setForeground(Color.white);
    subtotalPrice.setFont(new Font("Verdana", Font.BOLD, 12));
    subtotalPrice.setVisible(false);
    final JTextField subtotalPriceText = new JTextField("");
    subtotalPriceText.setBounds(250, 470, 60, 20);
    subtotalPriceText.setVisible(false);
    
    //"Tax" Components
    final JLabel taxPrice = new JLabel ("Tax :            ₱ ");
    taxPrice.setBounds(150, 500, 200, 20);
    taxPrice.setForeground(Color.white);
    taxPrice.setFont(new Font("Verdana", Font.BOLD, 12));
    taxPrice.setVisible(false);
    final JTextField taxPriceText = new JTextField("");
    taxPriceText.setBounds(250, 500, 60, 20);
    taxPriceText.setVisible(false);
    
    //"Total" Components
    final JLabel totalPrice = new JLabel ("Total :          ₱ ");
    totalPrice.setBounds(150, 530, 200, 20);
    totalPrice.setForeground(Color.white);
    totalPrice.setFont(new Font("Verdana", Font.BOLD, 12));
    totalPrice.setVisible(false);
    final JTextField totalPriceText = new JTextField("");
    totalPriceText.setBounds(250, 530, 60, 20);
    totalPriceText.setVisible(false);
    
    //Thank you labels
    final JLabel thanks = new JLabel ("Thank you for your Order!");
    thanks.setBounds(140, 600, 400, 20);
    thanks.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
    thanks.setForeground(Color.white);
    thanks.setVisible(false);
    final JLabel thanks2 = new JLabel ("Please proceed to the Cashier");
    thanks2.setBounds(123, 620, 400, 20);
    thanks2.setFont(new Font("Bookman Old Style", Font.ITALIC, 15));
    thanks2.setForeground(Color.white);
    thanks2.setVisible(false);
    
    //Menu Item 1
    final JRadioButton menuItem1 = new JRadioButton("Espresso                 ₱50");
    menuItem1.setBounds(20, 160, 200, 20);
    menuItem1.setForeground(Color.white);
    menuItem1.setContentAreaFilled(false);
    menuItem1.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem1.setVisible(false);
    
    //Menu Item 2
    final JRadioButton menuItem2 = new JRadioButton("Cappuccino           ₱100");
    menuItem2.setBounds(20, 180, 200, 20);
    menuItem2.setForeground(Color.white);
    menuItem2.setContentAreaFilled(false);
    menuItem2.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem2.setVisible(false);
    
    //Menu Item 3
    final JRadioButton menuItem3 = new JRadioButton("Tea                         ₱25");
    menuItem3.setBounds(20, 200, 200, 20);
    menuItem3.setForeground(Color.white);
    menuItem3.setContentAreaFilled(false);
    menuItem3.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem3.setVisible(false);
    
    //Menu Item 4
    final JRadioButton menuItem4 = new JRadioButton("Hot Chocolate       ₱100");
    menuItem4.setBounds(20, 220, 200, 20);
    menuItem4.setForeground(Color.white);
    menuItem4.setContentAreaFilled(false);
    menuItem4.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem4.setVisible(false);
    
    //Menu Item 5
    final JRadioButton menuItem5 = new JRadioButton("Americano              ₱80");
    menuItem5.setBounds(20, 240, 200, 20);
    menuItem5.setForeground(Color.white);
    menuItem5.setContentAreaFilled(false);
    menuItem5.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem5.setVisible(false);
    
    //Menu Item 6
    final JRadioButton menuItem6 = new JRadioButton("Iced Coffee           ₱80");
    menuItem6.setBounds(310, 160, 200, 20);
    menuItem6.setForeground(Color.white);
    menuItem6.setContentAreaFilled(false);
    menuItem6.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem6.setVisible(false);
    
    //Menu Item 7
    final JRadioButton menuItem7 = new JRadioButton("Iced Tea                ₱80");
    menuItem7.setBounds(310, 180, 200, 20);
    menuItem7.setForeground(Color.white);
    menuItem7.setContentAreaFilled(false);
    menuItem7.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem7.setVisible(false);
    
    //Menu Item 8
    final JRadioButton menuItem8 = new JRadioButton("Iced Latte           ₱100");
    menuItem8.setBounds(310, 200, 200, 20);
    menuItem8.setForeground(Color.white);
    menuItem8.setContentAreaFilled(false);
    menuItem8.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem8.setVisible(false);
    
    //Menu Item 9
    final JRadioButton menuItem9 = new JRadioButton("Cold Brew            ₱120");
    menuItem9.setBounds(310, 220, 200, 20);
    menuItem9.setForeground(Color.white);
    menuItem9.setContentAreaFilled(false);
    menuItem9.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem9.setVisible(false);
    
    //Menu Item 10
    final JRadioButton menuItem10 = new JRadioButton("Iced Cuppuccino  ₱150");
    menuItem10.setBounds(310, 240, 200, 20);
    menuItem10.setForeground(Color.white);
    menuItem10.setContentAreaFilled(false);
    menuItem10.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem10.setVisible(false);
    
    //Menu Item 11
    final JCheckBox menuItem11 = new JCheckBox("Croissant                ₱60");
    menuItem11.setBounds(20, 320, 200, 20);
    menuItem11.setForeground(Color.white);
    menuItem11.setContentAreaFilled(false);
    menuItem11.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem11.setVisible(false);
    
    //Menu Item 12
    final JCheckBox menuItem12 = new JCheckBox("Blueberry Scone     ₱70");
    menuItem12.setBounds(20, 340, 200, 20);
    menuItem12.setForeground(Color.white);
    menuItem12.setContentAreaFilled(false);
    menuItem12.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem12.setVisible(false);
    
    //Menu Item 13
    final JCheckBox menuItem13 = new JCheckBox("Muffin                     ₱80");
    menuItem13.setBounds(20, 360, 200, 20);
    menuItem13.setForeground(Color.white);
    menuItem13.setContentAreaFilled(false);
    menuItem13.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem13.setVisible(false);
    
    //Menu Item 14
    final JCheckBox menuItem14 = new JCheckBox("Bagel                   ₱100");
    menuItem14.setBounds(20, 380, 200, 20);
    menuItem14.setForeground(Color.white);
    menuItem14.setContentAreaFilled(false);
    menuItem14.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem14.setVisible(false);
    
    //Menu Item 15
    final JCheckBox menuItem15 = new JCheckBox("Sandwich             ₱100");
    menuItem15.setBounds(20, 400, 200, 20);
    menuItem15.setForeground(Color.white);
    menuItem15.setContentAreaFilled(false);
    menuItem15.setFont(new Font("Verdana", Font.BOLD, 12));
    menuItem15.setVisible(false);
    
    //Main Frame
    Color bgColor = new Color(58,50,54);
    JFrame frame = new JFrame("THE BEANERY");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,700);
    frame.getContentPane().setBackground(bgColor);
    frame.setLocation(500, 80);
    frame.setVisible(true);
    frame.setLayout(null);
    
    //Frame components
    frame.add(shopName);
    frame.add(welcomeButton);
    frame.add(thanks);
    frame.add(thanks2);
    frame.add(clearButton);
    frame.add(placeOrderButton);
    frame.add(placeOrder);
    frame.add(hotDrinks);
    frame.add(coldDrinks);
    frame.add(foodItems);
    frame.add(totalPrice);
    frame.add(totalPriceText);
    frame.add(subtotalPrice);
    frame.add(subtotalPriceText);
    frame.add(taxPrice);
    frame.add(taxPriceText);
    frame.add(menuItem1);
    frame.add(menuItem2);
    frame.add(menuItem3);
    frame.add(menuItem4);
    frame.add(menuItem5);
    frame.add(menuItem6);
    frame.add(menuItem7);
    frame.add(menuItem8);
    frame.add(menuItem9);
    frame.add(menuItem10);
    frame.add(menuItem11);
    frame.add(menuItem12);
    frame.add(menuItem13);
    frame.add(menuItem14);
    frame.add(menuItem15);

    //Welcome Button Listener
    welcomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                welcomeButton.setVisible(false);
                shopName.setBounds(40, -40, 500, 200);
                
                //components to appear upon clicking
                bg.setVisible(true);
                bg2.setVisible(false);
                clearButton.setVisible(true);
                placeOrderButton.setVisible(true);
                placeOrder.setVisible(true);
                hotDrinks.setVisible(true);
                coldDrinks.setVisible(true);
                foodItems.setVisible(true);
                totalPrice.setVisible(true);
                totalPriceText.setVisible(true);
                subtotalPrice.setVisible(true);
                subtotalPriceText.setVisible(true);
                taxPrice.setVisible(true);
                taxPriceText.setVisible(true);
                menuItem1.setVisible(true);
                menuItem2.setVisible(true);
                menuItem3.setVisible(true);
                menuItem4.setVisible(true);
                menuItem5.setVisible(true);
                menuItem6.setVisible(true);
                menuItem7.setVisible(true);
                menuItem8.setVisible(true);
                menuItem9.setVisible(true);
                menuItem10.setVisible(true);
                menuItem11.setVisible(true);
                menuItem12.setVisible(true);
                menuItem13.setVisible(true);
                menuItem14.setVisible(true);
                menuItem15.setVisible(true);
            }
        });
    
    //Change Frame icon
    Image icon = Toolkit.getDefaultToolkit().getImage("Coffee Shop Icon.png");
    frame.setIconImage(icon);
    frame.add(bg);
    frame.add(bg2);
    
    //Action Listener for Clear Selection
      clearButton.addActionListener(new ActionListener() {
      	 @Override
           public void actionPerformed(ActionEvent e) {
      		 menuItem1.setSelected(false);
      		 menuItem2.setSelected(false);
      	     menuItem3.setSelected(false);
      		 menuItem4.setSelected(false);
      		 menuItem5.setSelected(false);
      		 menuItem6.setSelected(false);
      		 menuItem7.setSelected(false);
      		 menuItem8.setSelected(false);
      		 menuItem9.setSelected(false);
      		 menuItem10.setSelected(false);
      		 menuItem11.setSelected(false);
      		 menuItem12.setSelected(false);
      	     menuItem13.setSelected(false);
      		 menuItem14.setSelected(false);
      		 menuItem15.setSelected(false);
      		 
      		 thanks.setVisible(false);
      		 thanks2.setVisible(false);
      		 
      		 subtotalPriceText.setText("");
      		 taxPriceText.setText("");
      		 totalPriceText.setText("");
      		 
      	 }
      });
    
    //Action Listener for Menu Item 1
    menuItem1.addActionListener(new ActionListener() {
    	 @Override
         public void actionPerformed(ActionEvent e) {
    		 if(menuItem1.isSelected()) {
    		    	menuItem2.setSelected(false);
    		    	menuItem3.setSelected(false);
    		    	menuItem4.setSelected(false);
    		    	menuItem5.setSelected(false);
    		    	menuItem6.setSelected(false);
    		    	menuItem7.setSelected(false);
    		    	menuItem8.setSelected(false);
    		    	menuItem9.setSelected(false);
    		    	menuItem10.setSelected(false);
    		    }
    	 }
    });
    
    //Action Listener for Menu Item 2
    menuItem2.addActionListener(new ActionListener() {
    	 @Override
         public void actionPerformed(ActionEvent e) {
    		 if (menuItem2.isSelected()) {
    		    	menuItem1.setSelected(false);
    		    	menuItem3.setSelected(false);
    		    	menuItem4.setSelected(false);
    		    	menuItem5.setSelected(false);
    		    	menuItem6.setSelected(false);
    		    	menuItem7.setSelected(false);
    		    	menuItem8.setSelected(false);
    		    	menuItem9.setSelected(false);
    		    	menuItem10.setSelected(false);
    		    }
    	 }
    });
    
    //Action Listener for Menu Item 3
    menuItem3.addActionListener(new ActionListener() {
    	 @Override
         public void actionPerformed(ActionEvent e) {
    		 if (menuItem3.isSelected()) {
    		    	menuItem1.setSelected(false);
    		    	menuItem2.setSelected(false);
    		    	menuItem4.setSelected(false);
    		    	menuItem5.setSelected(false);
    		    	menuItem6.setSelected(false);
    		    	menuItem7.setSelected(false);
    		    	menuItem8.setSelected(false);
    		    	menuItem9.setSelected(false);
    		    	menuItem10.setSelected(false);
    		    }
    	 }
    });
    
    //Action Listener for Menu Item 4
    menuItem4.addActionListener(new ActionListener() {
    	 @Override
         public void actionPerformed(ActionEvent e) {
    		 if (menuItem4.isSelected()) {
    		    	menuItem1.setSelected(false);
    		    	menuItem2.setSelected(false);
    		    	menuItem3.setSelected(false);
    		    	menuItem5.setSelected(false);
    		    	menuItem6.setSelected(false);
    		    	menuItem7.setSelected(false);
    		    	menuItem8.setSelected(false);
    		    	menuItem9.setSelected(false);
    		    	menuItem10.setSelected(false);
    		    }
    	 }
    });
    
    //Action Listener for Menu Item 5
    menuItem1.addActionListener(new ActionListener() {
    	 @Override
         public void actionPerformed(ActionEvent e) {
    		 if (menuItem5.isSelected()) {
    		    	menuItem1.setSelected(false);
    		    	menuItem2.setSelected(false);
    		    	menuItem3.setSelected(false);
    		    	menuItem4.setSelected(false);
    		    	menuItem6.setSelected(false);
    		    	menuItem7.setSelected(false);
    		    	menuItem8.setSelected(false);
    		    	menuItem9.setSelected(false);
    		    	menuItem10.setSelected(false);
    		    }
    	 }
    });
    
    //Action Listener for Menu Item 6
    menuItem6.addActionListener(new ActionListener() {
    	 @Override
         public void actionPerformed(ActionEvent e) {
    		 if (menuItem6.isSelected()) {
    		    	menuItem1.setSelected(false);
    		    	menuItem2.setSelected(false);
    		    	menuItem3.setSelected(false);
    		    	menuItem4.setSelected(false);
    		    	menuItem5.setSelected(false);
    		    	menuItem7.setSelected(false);
    		    	menuItem8.setSelected(false);
    		    	menuItem9.setSelected(false);
    		    	menuItem10.setSelected(false);
    		    }
    	 }
    });
    
    //Action Listener for Menu Item 7
    menuItem1.addActionListener(new ActionListener() {
    	 @Override
         public void actionPerformed(ActionEvent e) {
    		 if (menuItem7.isSelected()) {
    		    	menuItem1.setSelected(false);
    		    	menuItem2.setSelected(false);
    		    	menuItem3.setSelected(false);
    		    	menuItem4.setSelected(false);
    		    	menuItem5.setSelected(false);
    		    	menuItem6.setSelected(false);
    		    	menuItem8.setSelected(false);
    		    	menuItem9.setSelected(false);
    		    	menuItem10.setSelected(false);
    		    }
    	 }
    });
    
    //Action Listener for Menu Item 8
    menuItem8.addActionListener(new ActionListener() {
    	 @Override
         public void actionPerformed(ActionEvent e) {
    		 if (menuItem8.isSelected()) {
    		    	menuItem1.setSelected(false);
    		    	menuItem2.setSelected(false);
    		    	menuItem3.setSelected(false);
    		    	menuItem4.setSelected(false);
    		    	menuItem5.setSelected(false);
    		    	menuItem6.setSelected(false);
    		    	menuItem7.setSelected(false);
    		    	menuItem9.setSelected(false);
    		    	menuItem10.setSelected(false);
    		    }
    	 }
    });
    
    //Action Listener for Menu Item 9
    menuItem9.addActionListener(new ActionListener() {
    	 @Override
         public void actionPerformed(ActionEvent e) {
    		 if (menuItem9.isSelected()) {
    		    	menuItem1.setSelected(false);
    		    	menuItem2.setSelected(false);
    		    	menuItem3.setSelected(false);
    		    	menuItem4.setSelected(false);
    		    	menuItem5.setSelected(false);
    		    	menuItem6.setSelected(false);
    		    	menuItem7.setSelected(false);
    		    	menuItem8.setSelected(false);
    		    	menuItem10.setSelected(false);
    		    }
    	 }
    });
    
    //Action Listener for Menu Item 10
    menuItem10.addActionListener(new ActionListener() {
    	 @Override
         public void actionPerformed(ActionEvent e) {
    		 if (menuItem10.isSelected()) {
    		    	menuItem1.setSelected(false);
    		    	menuItem2.setSelected(false);
    		    	menuItem3.setSelected(false);
    		    	menuItem4.setSelected(false);
    		    	menuItem5.setSelected(false);
    		    	menuItem6.setSelected(false);
    		    	menuItem7.setSelected(false);
    		    	menuItem8.setSelected(false);
    		    	menuItem9.setSelected(false);
    		    }
    	 }
    });
    
    //Action Listener for Place Order
    placeOrderButton.addActionListener(new ActionListener() {
    	
    	//Values placeholder
    	public int subTotal = 0;
    	private double tax = 0;
    	private double total = 0;
    	
   	 @Override
        public void actionPerformed(ActionEvent e) {
   		 
   		 //RadioButtons
   		 if (menuItem1.isSelected()) {
   			 subTotal += i1p;
   		 }
   		 else if(menuItem2.isSelected()) {
   			 subTotal += i2p;
   		 }
   		 else if(menuItem3.isSelected()) {
   			 subTotal += i3p;
   		 }
   		 else if(menuItem4.isSelected()) {
   			 subTotal += i4p;
   		 }
   		 else if(menuItem5.isSelected()) {
   			 subTotal += i5p;
   		 }
   		 else if(menuItem6.isSelected()) {
   			 subTotal += i6p;
   		 }
   		 else if(menuItem7.isSelected()) {
   			 subTotal += i7p;
   		 }
   		 else if(menuItem8.isSelected()) {
   			 subTotal += i8p;
   		 }
   		 else if(menuItem9.isSelected()) {
   			 subTotal += i9p;
   		 }
   		 else if(menuItem10.isSelected()) {
   			 subTotal += i10p;
   		 }
   		 
   		 //CheckBoxes
   		 if(menuItem11.isSelected()) {
   			 subTotal += i11p;
   		 }
   		 if(menuItem12.isSelected()) {
  			 subTotal += i12p;
  		 }
   		 if(menuItem13.isSelected()) {
  			 subTotal += i13p;
  		 }
   		 if(menuItem14.isSelected()) {
  			 subTotal += i14p;
  		 }
   		 if(menuItem15.isSelected()) {
  			 subTotal += i15p;
   		 }
   		 
   		 //Formula
   		 tax = subTotal * 0.02;
   		 total = tax +subTotal;
   		
   		 //Update Text
   		 subtotalPriceText.setText(" "+subTotal);
		 taxPriceText.setText(" "+ tax);
		 totalPriceText.setText(" "+ total);
		 
		 //Appear final text
   		 if (total != 0) {
   			 thanks.setVisible(true);
      		 thanks2.setVisible(true);
   		 }
   		 
   		 //Clear Button
   		 if(clearButton.isEnabled()) {
   			 subTotal =0;
   			 tax = 0;
   			 total =0;
   		 }
   				
   	 }
   });
  
}
    public static void main(String[] args) {
       new TheCoffeeShop();
    }
}
