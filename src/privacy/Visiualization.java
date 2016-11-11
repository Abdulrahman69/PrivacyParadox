/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package privacy;

import java.awt.Desktop;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Abdulrahman_69
 */
public class Visiualization extends javax.swing.JFrame {

    /**
     * Creates new form Visiualization
     */
    public Visiualization() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        butBack = new javax.swing.JButton();
        labChoosing = new javax.swing.JLabel();
        labChoosePlace = new javax.swing.JLabel();
        radHome = new javax.swing.JRadioButton();
        radWork = new javax.swing.JRadioButton();
        butShow = new javax.swing.JButton();
        labWarnning = new javax.swing.JLabel();
        radRoadMap = new javax.swing.JRadioButton();
        radHybird = new javax.swing.JRadioButton();
        labChooseZoom = new javax.swing.JLabel();
        rad13 = new javax.swing.JRadioButton();
        rad16 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualization");

        butBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        butBack.setText("Back ");
        butBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackActionPerformed(evt);
            }
        });

        labChoosing.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labChoosing.setForeground(new java.awt.Color(102, 102, 102));
        labChoosing.setText("Choose the map Type: ");

        labChoosePlace.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labChoosePlace.setForeground(new java.awt.Color(102, 102, 102));
        labChoosePlace.setText("Choose The place to Visualize it: ");

        buttonGroup2.add(radHome);
        radHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radHome.setText("Home");

        buttonGroup2.add(radWork);
        radWork.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radWork.setText("Work");

        butShow.setText("Show");
        butShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butShowActionPerformed(evt);
            }
        });

        buttonGroup1.add(radRoadMap);
        radRoadMap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radRoadMap.setText("Road Map");

        buttonGroup1.add(radHybird);
        radHybird.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radHybird.setText("Hybird Map");

        labChooseZoom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labChooseZoom.setForeground(new java.awt.Color(102, 102, 102));
        labChooseZoom.setText("Choose the Map Zoom: ");

        buttonGroup4.add(rad13);
        rad13.setText("13");

        buttonGroup4.add(rad16);
        rad16.setText("16");

        jButton1.setText("Advanced Map");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labChoosePlace)
                                        .addGap(70, 70, 70)
                                        .addComponent(radHome)
                                        .addGap(102, 102, 102)
                                        .addComponent(radWork))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labChoosing)
                                            .addComponent(labChooseZoom))
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rad13)
                                            .addComponent(radRoadMap))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(radHybird))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(124, 124, 124)
                                                .addComponent(rad16)))
                                        .addGap(55, 55, 55)
                                        .addComponent(labWarnning, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(butShow))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labWarnning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labChoosing)
                    .addComponent(radHybird)
                    .addComponent(radRoadMap))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labChooseZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rad13)
                        .addComponent(rad16)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labChoosePlace)
                    .addComponent(radHome)
                    .addComponent(radWork))
                .addGap(43, 43, 43)
                .addComponent(butShow)
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(butBack))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-702)/2, (screenSize.height-430)/2, 702, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void butBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackActionPerformed
         PrivacyAttacker go = new PrivacyAttacker();
         go.setVisible(true);
         super.dispose();
    }//GEN-LAST:event_butBackActionPerformed

    private void butShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butShowActionPerformed
        // Request Home Places  
       
        System.out.println(  "   "+Home.new_info.home.Lng+"   "+Home.new_info.home.Lat);
        System.out.println(  "   "+Home.new_info.work.Lng+"   "+Home.new_info.work.Lat);
        URL url ;
        Image image = null;
        String u ; 
       // Rwquest Home Places 
        if (radHome.isSelected()){
                if (radRoadMap.isSelected()){
                    if (rad13.isSelected()){
                       try {  
                        u = "http://maps.google.com/maps/api/staticmap?center="+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&zoom=13&markers=size:mid|color:blue|label:A|"+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&size=600x600&sensor=false";
                        url = new URL(u);//"http://maps.googleapis.com/maps/api/staticmap?center="+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&zoom=14&markers=color:blue%7Clabel:S%7C11211%7C11206%7C11222&maptype=roadmap&size=640x640&sensor=false");
                        image = ImageIO.read(url);
                        JFrame frame = new JFrame();
                        frame.setSize(640,640);
                        JLabel label = new JLabel(new ImageIcon(image));
                        JButton H = new JButton();            
                        frame.add(label);
                        frame.setVisible(true);
                        } catch (IOException e) {
                                e.printStackTrace();
                           }       
                     } else {
                        try {  
                        u = "http://maps.google.com/maps/api/staticmap?center="+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&zoom=16&markers=size:mid|color:white|label:A|"+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&size=600x600&sensor=false";
                        url = new URL(u);//"http://maps.googleapis.com/maps/api/staticmap?center="+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&zoom=14&markers=color:blue%7Clabel:S%7C11211%7C11206%7C11222&maptype=roadmap&size=640x640&sensor=false");
                        image = ImageIO.read(url);
                        JFrame frame = new JFrame();
                        frame.setSize(640,640);
                        JLabel label = new JLabel(new ImageIcon(image));
                        JButton H = new JButton();            
                        frame.add(label);
                        frame.setVisible(true);
                        } catch (IOException e) {
                                e.printStackTrace();
                           }       
                    }
                }
               else if (radHybird.isSelected()){
                   if (rad13.isSelected()){ 
                   try {          
                       u = "http://maps.google.com/maps/api/staticmap?center="+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&zoom=13&markers=size:mid|color:white|label:A|"+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&maptype=hybrid&size=600x600&sensor=false";
                       url = new URL(u);
                       image = ImageIO.read(url);
                       JFrame frame = new JFrame();
                       frame.setSize(640,640);
                       JLabel label = new JLabel(new ImageIcon(image));
                       JButton H = new JButton();            
                       frame.add(label);
                       frame.setVisible(true);
                    } catch (IOException e) {
                            e.printStackTrace();
                    }
                }else {
                        u = "http://maps.google.com/maps/api/staticmap?center="+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&zoom=16&markers=size:mid|color:white|label:A|"+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&maptype=hybrid&size=600x600&sensor=false";
                      try{
                        url = new URL(u);
                       image = ImageIO.read(url);
                       JFrame frame = new JFrame();
                       frame.setSize(640,640);
                       JLabel label = new JLabel(new ImageIcon(image));
                       JButton H = new JButton();            
                       frame.add(label);
                       frame.setVisible(true);
                      }catch(Exception e){
                          e.printStackTrace();
                      }
                   }
               }
        }

        // Request Work Places 
         if (radWork.isSelected()){
                if (radRoadMap.isSelected()){   
                try {          
                        u = "http://maps.google.com/maps/api/staticmap?center="+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&zoom=16&markers=size:mid|color:white|label:A|"+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&size=600x600&sensor=false";
                       url = new URL(u);
                       image = ImageIO.read(url);
                       JFrame frame = new JFrame();
                        frame.setSize(640,640);
                        JLabel label = new JLabel(new ImageIcon(image));
                        JButton H = new JButton();            
                        frame.add(label);
                        frame.setVisible(true);
                   
	        }catch (IOException e) {
	        	e.printStackTrace();
	        }
             }
                else if (radHybird.isSelected()){
                    try {          
                        u = "http://maps.google.com/maps/api/staticmap?center="+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&zoom=16&markers=size:mid|color:black|label:A|"+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&size=600x600&sensor=false";
                       url = new URL(u);
                       image = ImageIO.read(url);
                       JFrame frame = new JFrame();
                       frame.setSize(640,640);
                       JLabel label = new JLabel(new ImageIcon(image));
                       JButton H = new JButton();            
                       frame.add(label);
                       frame.setVisible(true);
	        }catch (IOException e) {
	        	e.printStackTrace();
	        }
                }
           }
         // Request Most Visited Places 
        
    }//GEN-LAST:event_butShowActionPerformed

     public static void openWebpage(int zoom) {
    try {
        if (zoom > 19 || zoom >8){
         String path = "https://maps.google.com/?q="+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&z=" ;
         Desktop.getDesktop().browse(new URL(path+zoom).toURI());
        }else {
        String path = "https://maps.google.com/?q="+Home.new_info.home.Lng+","+Home.new_info.home.Lat+"&z=" ;
                Desktop.getDesktop().browse(new URL(path+15).toURI());
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
         openWebpage(19);
        // http://www.openstreetmap.org/#map=17/24.71879/46.62268
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Visiualization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visiualization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visiualization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visiualization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Visiualization().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBack;
    private javax.swing.JButton butShow;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labChoosePlace;
    private javax.swing.JLabel labChooseZoom;
    private javax.swing.JLabel labChoosing;
    private javax.swing.JLabel labWarnning;
    private javax.swing.JRadioButton rad13;
    private javax.swing.JRadioButton rad16;
    private javax.swing.JRadioButton radHome;
    private javax.swing.JRadioButton radHybird;
    private javax.swing.JRadioButton radRoadMap;
    private javax.swing.JRadioButton radWork;
    // End of variables declaration//GEN-END:variables
}
