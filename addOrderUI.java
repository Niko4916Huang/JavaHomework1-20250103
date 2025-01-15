package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JFormattedTextField;

public class addOrderUI extends JFrame {

	private JPanel contentPane;
	private JTextField qtyField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addOrderUI frame = new addOrderUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	/**
	 * Create the frame.
	 */
	public addOrderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel title_panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) title_panel.getLayout();
		title_panel.setBackground(new Color(255, 191, 124));
		title_panel.setToolTipText("");
		title_panel.setBounds(150, 6, 204, 23);
		contentPane.add(title_panel);
		
		JLabel lblNewLabel = new JLabel("飲 料 單");
		title_panel.add(lblNewLabel);
		
		JPanel selecti_panel = new JPanel();
		selecti_panel.setBackground(new Color(218, 221, 215));
		selecti_panel.setBounds(36, 30, 482, 228);
		contentPane.add(selecti_panel);
		selecti_panel.setLayout(null);

		
		String s1[] = { "請選擇", "紅茶", "綠茶", "烏龍茶", "無憂茶" };
		JComboBox itemNameBox = new JComboBox(s1);
		itemNameBox.setBounds(37, 35, 104, 27);
		selecti_panel.add(itemNameBox);
		
		JLabel midCupPrice = new JLabel("中杯：25元  大杯：35元");
		midCupPrice.setBounds(309, 6, 144, 16);
		selecti_panel.add(midCupPrice);
		
		JRadioButton cupRadioButton = new JRadioButton("大杯");
		cupRadioButton.setBounds(178, 35, 64, 23);
		cupRadioButton.setActionCommand("大杯");
		cupRadioButton.setSelected(true);
		selecti_panel.add(cupRadioButton);
		
		JRadioButton cupRadioButton_1 = new JRadioButton("中杯");
		cupRadioButton_1.setBounds(239, 35, 64, 23);
		cupRadioButton_1.setActionCommand("中杯");
		selecti_panel.add(cupRadioButton_1);
		
		// Group the radio buttons
		ButtonGroup cupGroup = new ButtonGroup();
		cupGroup.add(cupRadioButton);
		cupGroup.add(cupRadioButton_1);
		
		JLabel pricelabel = new JLabel("數  量:");
		pricelabel.setBounds(319, 39, 46, 16);
		selecti_panel.add(pricelabel);
		
		qtyField = new JTextField();
		qtyField.setText("1");
		qtyField.setBounds(371, 34, 34, 26);
		selecti_panel.add(qtyField);
		qtyField.setColumns(10);
		
		
		JRadioButton selfcup = new JRadioButton("自備環保杯 少 5元");
		selfcup.setBounds(71, 153, 141, 23);
		selecti_panel.add(selfcup);
		
		JRadioButton baggage = new JRadioButton("加購手提袋 加 2元");
		baggage.setBounds(239, 153, 141, 23);
		selecti_panel.add(baggage);
		
		JRadioButton sugar0 = new JRadioButton("正常糖");
		sugar0.setBounds(80, 70, 71, 23);
		sugar0.setSelected(true);
		selecti_panel.add(sugar0);
	
		JRadioButton sugar1 = new JRadioButton("半糖");
		sugar1.setBounds(178, 70, 64, 23);
		selecti_panel.add(sugar1);
		
		JRadioButton sugar2 = new JRadioButton("去糖");
		sugar2.setBounds(260, 70, 64, 23);
		selecti_panel.add(sugar2);
		
		// Group the radio buttons
		ButtonGroup sugarGroup = new ButtonGroup();
		sugarGroup.add(sugar0);
		sugarGroup.add(sugar1);
		sugarGroup.add(sugar2);
		
		JRadioButton ice0 = new JRadioButton("正常冰");
		ice0.setBounds(80, 104, 71, 23);
		ice0.setSelected(true);
		selecti_panel.add(ice0);

		JRadioButton ice1 = new JRadioButton("少冰");
		ice1.setBounds(178, 104, 64, 23);
		selecti_panel.add(ice1);
		
		JRadioButton ice2 = new JRadioButton("去冰");
		ice2.setBounds(260, 104, 64, 23);
		selecti_panel.add(ice2);
		
		// Group the radio buttons
		ButtonGroup iceGroup = new ButtonGroup();
		iceGroup.add(ice0);
		iceGroup.add(ice1);
		iceGroup.add(ice2);		
		
		JPanel output_panel = new JPanel();
		output_panel.setBackground(new Color(120, 217, 221));
		output_panel.setBounds(33, 270, 482, 85);
		contentPane.add(output_panel);
		output_panel.setLayout(null);
	
		JTextArea output = new JTextArea();
		output.setBounds(7, 7, 341, 72);
		output_panel.add(output);
				
		JButton printingButton = new JButton("列  印");
		printingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					output.print();
				} catch (Exception exc) {
					System.out.println(exc);
				}

			}
		});
		printingButton.setBounds(359, 10, 117, 23);
		output_panel.add(printingButton);
		
		JButton exitButton = new JButton("結  束");
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// System.exit(0);
				Change_pagetest t=new Change_pagetest();
				t.setVisible(true);
				dispose();
				
			}
		});
		exitButton.setBounds(360, 45, 117, 23);
		output_panel.add(exitButton);
				
		JButton confirmButton = new JButton("確  認");
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String itemSelected = itemNameBox.getSelectedItem().toString();
				
				if (itemSelected.equals("請選擇"))
					itemSelected = "想要喝什麼 ?";
				else
				{
					
					Integer cup = 0;		//大杯
					if (cupRadioButton_1.isSelected())
					{
						cup = 1;		//中杯
						itemSelected = itemSelected + " 中杯 ";
					}
					else
					{
						itemSelected = itemSelected + " 大杯 ";
					}
					
					String qtyText = qtyField.getText();
					Integer qty = new Integer(qtyText);
					itemSelected = itemSelected + qty +"杯 ";
					
					Integer sugar = 0;		//正常糖
					if (sugar1.isSelected())
					{
						sugar = 1;			//半糖
						itemSelected = itemSelected + " 半糖 ";
					}				
					if (sugar2.isSelected())
					{
						sugar = 2;			//去糖
						itemSelected = itemSelected + " 去糖 ";
					}
					
					Integer ice = 0;		//正常冰
					if (ice1.isSelected())
					{
						ice = 1;			//少冰
						itemSelected = itemSelected + " 少冰 ";
					}
					if (ice2.isSelected())
					{
						ice = 2;			//去冰
						itemSelected = itemSelected + " 去冰 ";
					}
								
					Order o = new Order(itemSelected, cup, qty, sugar, ice);
					int price = o.getBigprice();
					if (cup == 1)
						price = o.getMidprice();
					
					int totalPrice = o.getSum();
					itemSelected = itemSelected + price +"*"+qty+"= "+totalPrice+"元";
					
					if (selfcup.isSelected())
					{
						itemSelected = itemSelected +"\n自備環保杯 少 5元  "+ totalPrice + "-5= ";
						totalPrice -= 5;
						itemSelected = itemSelected + totalPrice+"元";
					}
					if (baggage.isSelected())
					{
						itemSelected = itemSelected +"\n加購手提袋 加 2元  "+ totalPrice + "+2= ";
						totalPrice += 2;
						itemSelected = itemSelected + totalPrice+"元";
					}						
				}
				output.setText(itemSelected);
				 
			}
		});
		confirmButton.setBounds(260, 193, 78, 29);
		selecti_panel.add(confirmButton);
		
		JButton clearButton = new JButton("清  除");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemNameBox.setSelectedItem("請選擇");
				cupRadioButton.setSelected(true);
				qtyField.setText("1");
				sugar0.setSelected(true);
				ice0.setSelected(true);
				selfcup.setSelected(false);				
				baggage.setSelected(false);
				output.setText("");
			}
		});
		clearButton.setBounds(115, 193, 78, 29);
		selecti_panel.add(clearButton);
		
	}
}
