/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USER
 */
public class ViewMovie extends JFrame implements ActionListener{
    JLabel ljudul = new JLabel("Judul");
    JLabel lAlur = new JLabel("Alur");
    JLabel lPenokohan = new JLabel("Penokohan");
    JLabel lAkting = new JLabel("Akting");
    
    public JTextField tfJudul = new JTextField();
    public JTextField tfAlur = new JTextField();
    public JTextField tfPenokohan = new JTextField();
    public JTextField tfAkting = new JTextField();
    
    public JButton btnTambah = new JButton("Tambah");
    public JButton btnUpdate = new JButton("Update");
    public JButton btnDelete = new JButton("Delete");
    public JButton btnReset = new JButton("Clear");
    
    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"Judul", "Alur", "Penokohan", "Akting", "Nilai"};

    public ViewMovie() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Movie");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setSize(700,600);
        
        add(scrollPane);
        scrollPane.setBounds(20, 20, 480, 400);
        
        add(ljudul);
        ljudul.setBounds(520, 20, 90, 20);
        add(tfJudul);
        tfJudul.setBounds(520, 40, 130, 20);
        
        add(lAlur);
        lAlur.setBounds(520, 60, 90, 20);
        add(tfAlur);
        tfAlur.setBounds(520, 80, 130, 20);
        
        add(lPenokohan);
        lPenokohan.setBounds(520, 100, 90, 20);
        add(tfPenokohan);
        tfPenokohan.setBounds(520, 120, 130, 20);
        
        add(lAkting);
        lAkting.setBounds(520, 140, 90, 20);
        add(tfAkting);
        tfAkting.setBounds(520, 160, 130, 20);
        
        add(btnTambah);
        btnTambah.setBounds(520, 190, 90, 20);
        
        add(btnUpdate);
        btnUpdate.setBounds(520, 220, 90, 20);
        
        add(btnDelete);
        btnDelete.setBounds(520, 250, 90, 20);
        
        add(btnReset);
        btnReset.setBounds(520, 280, 90, 20);
        btnReset.addActionListener(this);
    }
    
     public void actionPerformed(ActionEvent e) {
     if(e.getSource() == btnReset){
            tfJudul.setText("");
            tfAlur.setText("");
            tfPenokohan.setText("");
            tfAkting.setText("");
                
        }
     }
    
    
    
    public String getJudul(){
        return tfJudul.getText();
    }
    
    public String getAlur(){
        return tfAlur.getText();
    }
    
    public String getPenokohan(){
        return tfPenokohan.getText();
    }
    
    public String getAkting(){
        return tfAkting.getText();
    }
   
}
