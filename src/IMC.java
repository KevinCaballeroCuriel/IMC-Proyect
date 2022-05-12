//Kevin Antonio Caballero Curiel

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class IMC extends javax.swing.JFrame {

    public IMC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dietas = new javax.swing.JFrame();
        Dieta = new javax.swing.JLabel();
        ElegirArchivo = new javax.swing.JFileChooser();
        IMC_Titulo = new javax.swing.JLabel();
        IMC_Nombre = new javax.swing.JLabel();
        IMC_Peso = new javax.swing.JLabel();
        IMC_Altura = new javax.swing.JLabel();
        IMC_Edad = new javax.swing.JLabel();
        IMC_Actividad = new javax.swing.JLabel();
        User_Nombre = new javax.swing.JTextField();
        User_Peso = new javax.swing.JTextField();
        User_Altura = new javax.swing.JTextField();
        User_Edad = new javax.swing.JTextField();
        User_Actividad = new javax.swing.JComboBox<>();
        IMC_Calcular = new javax.swing.JButton();
        User_IMC = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        IMC_Aceptar = new javax.swing.JButton();
        User_Calorias = new javax.swing.JLabel();
        IMC_Sexo = new javax.swing.JLabel();
        User_Sexo = new javax.swing.JComboBox<>();
        User_Dieta = new javax.swing.JComboBox<>();
        User_TipoIMC = new javax.swing.JLabel();
        Recomendacion = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Abrir = new javax.swing.JMenu();
        Guardar = new javax.swing.JMenu();

        Dieta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Dieta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dieta.setText("Dieta");

        javax.swing.GroupLayout DietasLayout = new javax.swing.GroupLayout(Dietas.getContentPane());
        Dietas.getContentPane().setLayout(DietasLayout);
        DietasLayout.setHorizontalGroup(
            DietasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DietasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DietasLayout.setVerticalGroup(
            DietasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DietasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dieta)
                .addContainerGap(0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dietas");
        setLocation(new java.awt.Point(500, 2));
        setResizable(false);

        IMC_Titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        IMC_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IMC_Titulo.setText("Medidor de dietas");

        IMC_Nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IMC_Nombre.setText("Nombre:");

        IMC_Peso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IMC_Peso.setText("Peso (kg):");

        IMC_Altura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IMC_Altura.setText("Altura (mts):");

        IMC_Edad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IMC_Edad.setText("Edad:");

        IMC_Actividad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IMC_Actividad.setText("Actividad fisica:");

        User_Actividad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        User_Actividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentaria", "Ligera", "Moderada", "Intensa", "Extremadamente alta (Atleta)" }));
        User_Actividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_ActividadActionPerformed(evt);
            }
        });

        IMC_Calcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IMC_Calcular.setText("Calcular");
        IMC_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMC_CalcularActionPerformed(evt);
            }
        });

        User_IMC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        User_IMC.setText("Tu Indice de Masa Corporal (IMC) es: 0.0");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("• Si quieres adelgazar necesitas una dieta que este debajo de tus calorias diarias actuales.\n\n• Si quieres permanecer en el mismo peso, ocupas una dieta aproximada a tus calorias diarias actuales.\n\n• Si quieres aumentar de peso, necesitas una dieta con mayor cantidad que tus calorias diarias actuales.");
        jScrollPane2.setViewportView(jTextArea2);

        IMC_Aceptar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IMC_Aceptar.setText("Aceptar");
        IMC_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMC_AceptarActionPerformed(evt);
            }
        });

        User_Calorias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        User_Calorias.setText("Calorias diarias actuales: 0.0");

        IMC_Sexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IMC_Sexo.setText("Sexo:");

        User_Sexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        User_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        User_Dieta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        User_Dieta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Elegir dieta)", "Dieta de 1200 calorias", "Dieta de 1400 calorias", "Dieta de 1600 calorias", "Dieta de 1800 calorias", "Dieta de 2000 calorias", "Dieta de 2200 calorias", "Dieta de 2400 calorias", "Dieta de 2600 calorias", "Dieta de 2800 calorias", "Dieta de 3000 calorias", "Dieta de 3200 calorias", "Dieta de 3400 calorias", "Dieta de 3600 calorias" }));

        User_TipoIMC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        User_TipoIMC.setText("Tu IMC es:");

        Recomendacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Recomendacion.setText("Se recomienda:");

        Archivo.setText("Archivo");

        Abrir.setText("Abrir");
        Abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbrirMouseClicked(evt);
            }
        });
        Archivo.add(Abrir);

        Guardar.setText("Guardar");
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarMouseClicked(evt);
            }
        });
        Archivo.add(Guardar);

        jMenuBar1.add(Archivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IMC_Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IMC_Calcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IMC_Edad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IMC_Altura, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IMC_Peso, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IMC_Sexo, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(IMC_Actividad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(User_Sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(User_Actividad, 0, 244, Short.MAX_VALUE)
                            .addComponent(User_Peso)
                            .addComponent(User_Altura)
                            .addComponent(User_Edad)))
                    .addComponent(jScrollPane2)
                    .addComponent(User_Dieta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(IMC_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(User_IMC)
                            .addComponent(User_TipoIMC)
                            .addComponent(Recomendacion)
                            .addComponent(User_Calorias))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(IMC_Nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(User_Nombre)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(IMC_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IMC_Nombre)
                    .addComponent(User_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IMC_Peso)
                    .addComponent(User_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IMC_Altura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IMC_Edad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IMC_Sexo)
                    .addComponent(User_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User_Actividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IMC_Actividad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IMC_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(User_IMC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(User_TipoIMC)
                .addGap(10, 10, 10)
                .addComponent(Recomendacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(User_Calorias)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(User_Dieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IMC_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String UserDieta;
    public double f; 
    public double cal;
    public double a;
    public double p;
    public double e;

    private void leer(String path) throws IOException {
        try {
            BufferedReader lect = new BufferedReader(new FileReader(path));

            String lin = lect.readLine();
            String lineas[] = lin.split(",");
            User_Nombre.setText(lineas[0]);
            User_Peso.setText(lineas[1]);
            User_Altura.setText(lineas[2]);
            User_Edad.setText(lineas[3]);
            User_Sexo.setSelectedIndex(Integer.parseInt(lineas[4]));
            User_Actividad.setSelectedIndex(Integer.parseInt(lineas[5]));
            User_IMC.setText(lineas[6]);
            User_TipoIMC.setText(lineas[7]);
            Recomendacion.setText(lineas[8]);
            User_Calorias.setText(lineas[9]);
            User_Dieta.setSelectedIndex(Integer.parseInt(lineas[10]));
        } catch (Exception e) {
            System.err.println("Lo siento, no se encontro archivo.txt");
        }
    }

    public void escribir(String path) throws IOException {
        File archivo = new File(path);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            PrintWriter wr = new PrintWriter(bw);
            wr.append(User_Nombre.getText() + ",");
            wr.append(User_Peso.getText() + ",");
            wr.append(User_Altura.getText() + ",");
            wr.append(User_Edad.getText() + ",");
            wr.append(String.valueOf(User_Sexo.getSelectedIndex()) + ",");
            wr.append(String.valueOf(User_Actividad.getSelectedIndex()) + ",");
            wr.append(User_IMC.getText() + ",");
            wr.append(User_TipoIMC.getText() + ",");
            wr.append(Recomendacion.getText() + ",");
            wr.append(User_Calorias.getText() + ",");
            wr.append(String.valueOf(User_Dieta.getSelectedIndex()) + ",");
            wr.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("Hubo un problema");
        }
    }

    private void User_ActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_ActividadActionPerformed
        switch (User_Actividad.getSelectedItem().toString()) {
            case "Sedentaria":
                f = 1.2;
                break;
            case "Ligera":
                f = 1.375;
                break;
            case "Moderada":
                f = 1.55;
                break;
            case "Intensa":
                f = 1.725;
                break;
            case "Extremadamente alta (Atleta)":
                f = 1.9;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_User_ActividadActionPerformed

    private void IMC_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMC_AceptarActionPerformed
        UserDieta=User_Dieta.getSelectedItem().toString();
        if (User_Dieta.getSelectedIndex()==0){
            DietasClass obj = new DietasClass();
            obj.setVisible(true);
        }
        else{
            DietasClass obj=new DietasClass(UserDieta);
            obj.setVisible(true);
        }        
        this.setLocation(0, 2);
    }//GEN-LAST:event_IMC_AceptarActionPerformed

    private void IMC_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMC_CalcularActionPerformed
        a = Double.parseDouble(User_Altura.getText());
        p = Double.parseDouble(User_Peso.getText());
        e = Double.parseDouble(User_Edad.getText());
        double IMC=CalcIMC(p,a);
        User_IMC.setText("Tu Indice de Masa Corporal (IMC) es: " + Double.toString(IMC));
        if (IMC <= 18.5) {
            User_TipoIMC.setText("Tu IMC indica: Bajo Peso");
            Recomendacion.setText("Se recomienda: Subir de peso");
        }
        if (IMC > 18.5 && IMC < 25) {
            User_TipoIMC.setText("Tu IMC indica: Peso Normal");
            Recomendacion.setText("Se recomienda: Permanecer en ese peso");
        }
        if (IMC >= 25 && IMC < 30) {
            User_TipoIMC.setText("Tu IMC indica: Sobre Peso");
            Recomendacion.setText("Se recomienda: Bajar de peso");
        }
        if (IMC >= 30) {
            User_TipoIMC.setText("Tu IMC indica: Obecidad");
            Recomendacion.setText("Se recomienda: Bajar de peso");
        }
        switch (User_Sexo.getSelectedItem().toString()) {
            case "Masculino":
                cal = (66 + (13.7 * p)) + ((5 * a * 100) - (6.8 * e)) * (f);
                break;
            case "Femenino":
                cal = (655 + (9.6 * p)) + ((1.8 * a * 100) - (4.7 * e)) * (f);
                break;
            default:
                break;
        }
        User_Calorias.setText("Calorias diarias actuales: " + Double.toString(cal));
        System.out.println(f + " y " + cal);
    }//GEN-LAST:event_IMC_CalcularActionPerformed

    private void AbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbrirMouseClicked
        ElegirArchivo.setApproveButtonText("Abrir");
        ElegirArchivo.setDialogTitle("Abrir");
        int act;
        String path;
        act = ElegirArchivo.showOpenDialog(this);
        if (act == JFileChooser.APPROVE_OPTION) {
            path = ElegirArchivo.getSelectedFile().toString();
            System.out.println(path);
            try {
                leer(path);
            } catch (IOException ex) {
                Logger.getLogger(IMC.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (act == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Se pulsó la opción Cancelar");
        }
    }//GEN-LAST:event_AbrirMouseClicked

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
        int act;
        ElegirArchivo.setApproveButtonText("Guardar");
        ElegirArchivo.setDialogTitle("Guardar");
        ElegirArchivo.setSelectedFile(new File("" + User_Nombre.getText() + ".txt"));
        String path;
        act = ElegirArchivo.showOpenDialog(this);
        if (act == JFileChooser.APPROVE_OPTION) {
            path = ElegirArchivo.getSelectedFile().toString();
            try {
                escribir(path);
            } catch (IOException ex) {
                Logger.getLogger(IMC.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (act == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Se pulsó la opción Cancelar");
        }
    }//GEN-LAST:event_GuardarMouseClicked

    public static double CalcIMC(double p, double a){
        return p / (a * a);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Abrir;
    private javax.swing.JMenu Archivo;
    private javax.swing.JLabel Dieta;
    private javax.swing.JFrame Dietas;
    private javax.swing.JFileChooser ElegirArchivo;
    private javax.swing.JMenu Guardar;
    private javax.swing.JButton IMC_Aceptar;
    private javax.swing.JLabel IMC_Actividad;
    private javax.swing.JLabel IMC_Altura;
    private javax.swing.JButton IMC_Calcular;
    private javax.swing.JLabel IMC_Edad;
    private javax.swing.JLabel IMC_Nombre;
    private javax.swing.JLabel IMC_Peso;
    private javax.swing.JLabel IMC_Sexo;
    private javax.swing.JLabel IMC_Titulo;
    private javax.swing.JLabel Recomendacion;
    private javax.swing.JComboBox<String> User_Actividad;
    private javax.swing.JTextField User_Altura;
    private javax.swing.JLabel User_Calorias;
    private javax.swing.JComboBox<String> User_Dieta;
    private javax.swing.JTextField User_Edad;
    private javax.swing.JLabel User_IMC;
    private javax.swing.JTextField User_Nombre;
    private javax.swing.JTextField User_Peso;
    private javax.swing.JComboBox<String> User_Sexo;
    private javax.swing.JLabel User_TipoIMC;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
