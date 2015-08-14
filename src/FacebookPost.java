/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfacebook9a;

import facebook4j.Comment;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Like;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Landero.
 */
public class FacebookPost extends javax.swing.JFrame {

    /**
     * Creates new form FacebookPost
     */
    private static String appId;
    private static String appSecret;
    private static String accessToken;
    String[] tablaPost;
    LinkedList<String> idUSuarios;
    DefaultTableModel table;
    ResponseList<Post> listaDePost;
    PagableList<Comment> comentarios;
    facebook4j.Facebook facebook;
    
    public FacebookPost(String id, String secret, String token) {
        initComponents();
        this.appId = id;
        this.appSecret = secret;
        this.accessToken = token;
        facebook = new FacebookFactory().getInstance();
        idUSuarios = new LinkedList<>();
        tablaPost = new String[2];
        table = new DefaultTableModel();
    }
    
    public FacebookPost() {
        initComponents();
        this.appId = "688932461237396";
        this.appSecret = "0c6f569c5f2bc75d057647a0f3f2100d";
        this.accessToken = "CAACEdEose0cBAG5EnaS17uTCrXjB1Qv8P1f8CWWXLo6eLIpxdntE8MSrpjpuY70voqb7sHmKZAfo4tbzV5u8DQJCY24ezFOOo9VlNZCRlNP5dbUnXST1UnYaoq1YM3mVoZC8s3kLfZAYvDBvG1sTeEGbM8cPOT8zpeziCZA2PMbAFobAWasZAXuNviAgekrQhTZCetMQ89ZBZBiDgz5jZBfYntagQy3pFEHRQZD";
        facebook = new FacebookFactory().getInstance();
        idUSuarios = new LinkedList<>();
        tablaPost = new String[2];
        table = new DefaultTableModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        amigosFB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        foto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        publicacion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        comentariosText = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));
        setFocusTraversalPolicyProvider(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Facebook"));

        amigosFB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escoge a un amigo" }));
        amigosFB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amigosFBActionPerformed(evt);
            }
        });

        jLabel1.setText("¿Cuantos post quieres ver?:");

        jButton1.setText("Mostrar post");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        foto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imagen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        publicacion.setColumns(20);
        publicacion.setRows(5);
        publicacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Post", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jScrollPane2.setViewportView(publicacion);

        comentariosText.setColumns(20);
        comentariosText.setRows(5);
        comentariosText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comentarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jScrollPane3.setViewportView(comentariosText);

        jLabel3.setText("Nombre de perfil:");

        jLabel4.setText("Sexo:");

        jLabel5.setText("Correo electronico:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(amigosFB, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(104, 104, 104)
                                .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(amigosFB, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
        facebook.setOAuthAppId(appId, appSecret);
        facebook.setOAuthPermissions("ads_management, ads_read, read_friendlists, create_event, create_note, email, export_stream, read_stream, user_friends, friends_about_me, friends_actions.books, friends_actions.music, friends_actions.news, friends_actions.video, friends_activities, friends_birthday, friends_education_history, friends_events, friends_games_activity, friends_groups, friends_hometown, friends_interests, friends_likes, friends_location, friends_notes, friends_online_presence, friends_photo_video_tags, friends_photos, friends_questions, friends_relationship_details, friends_relationships, friends_religion_politics, friends_status, friends_subscriptions, friends_videos, friends_website, friends_work_history, manage_friendlists, manage_notifications, manage_pages, photo_upload, publish_actions, publish_stream, read_friendlists, read_insights, read_mailbox, read_page_mailboxes, read_requests, read_stream, rsvp_event, share_item, sms, status_update, user_about_me, user_actions.books, user_actions.music, user_actions.news, user_actions.video, user_activities, user_birthday, user_education_history, user_events, user_friends, user_games_activity, user_groups, user_hometown, user_interests, user_likes, user_location, user_notes, user_online_presence, user_photo_video_tags, user_photos, user_questions, user_relationship_details, user_relationships, user_religion_politics, user_status, user_subscriptions, user_videos, user_website, user_work_history, user_posts, video_upload, xmpp_login");
        facebook.setOAuthAccessToken(new AccessToken(accessToken, null));
        try {
            for (int i = 0; i < facebook.getFriends().size(); i++) {
                User usuarioLista = facebook.getFriends().get(i);
                User personalInformationUser = facebook.getUser(usuarioLista.getId(), new Reading().fields());
                amigosFB.addItem(usuarioLista.getName());
                idUSuarios.add(personalInformationUser.getId());
            }
            amigosFB.addItem(facebook.getMe().getName());
        } catch (Exception e) {
        }//end of try
    }                                 
    
    public void imprimirTabla(int indiceUsuario, int numeroDePost) throws FacebookException {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Numero de post");
        table.addColumn("Post");
        if (indiceUsuario == amigosFB.getItemCount() - 1) {
            listaDePost = facebook.getFeed(facebook.getMe().getId(), new Reading().limit(numeroDePost));
            //System.out.println("hola chava");
        } else {
            listaDePost = facebook.getFeed(idUSuarios.get(indiceUsuario), new Reading().limit(numeroDePost));
            //System.out.println("hola quien seas");
        }
        for (int i = 0; i < listaDePost.size(); i++) {
            // Get (string) message.
            tablaPost[0] = String.valueOf(i + 1);
            if (listaDePost.get(i).getMessage() == null) {
                tablaPost[1] = "Titulo del post no disponible";
            } else {
                tablaPost[1] = listaDePost.get(i).getMessage();
            }
            table.addRow(tablaPost);
            jTable1.setModel(table);
        }
    }//end of buscarPostFromUser

    public void informacionPersonalUsuario(int indiceUsuario) throws FacebookException {
        if (indiceUsuario == amigosFB.getItemCount() - 1) {
            User miCuentaFacebook = facebook.getMe();
            nombre.setText(miCuentaFacebook.getName());
            genero.setText(miCuentaFacebook.getGender());
            email.setText(miCuentaFacebook.getEmail());
        } else {
            User amigoFacebook = facebook.getUser(idUSuarios.get(indiceUsuario));
            nombre.setText(amigoFacebook.getName());
            if (amigoFacebook.getEmail() == null) {
                email.setText("Datos no diponibles");
            } else {
                email.setText(amigoFacebook.getEmail());
            }
            nombre.setText(amigoFacebook.getName());
            genero.setText(amigoFacebook.getGender());
        }
    }//end of informacionPersonalUsuario

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.out.println("kbjhbjh: " + amigosFB.getSelectedIndex());
        if (!jTextField1.getText().isEmpty()) {
            if (amigosFB.getSelectedIndex() != 0) {
                int indiceMiPerfil = amigosFB.getItemCount() - 1;
                if (amigosFB.getSelectedIndex() == indiceMiPerfil) {
                    try {
                        System.out.println("aca entra");
                        informacionPersonalUsuario(amigosFB.getItemCount() - 1);
                        imprimirTabla(indiceMiPerfil, Integer.parseInt(jTextField1.getText()));
                    } catch (FacebookException ex) {
                        Logger.getLogger(FacebookPost.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        informacionPersonalUsuario(amigosFB.getSelectedIndex() - 1);
                        imprimirTabla(amigosFB.getSelectedIndex() - 1, Integer.parseInt(jTextField1.getText()));
                    } catch (FacebookException ex) {
                        Logger.getLogger(FacebookPost.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Indique cuantos post quiere ver", null, JOptionPane.INFORMATION_MESSAGE);
        }
    }                                        

    public void detallesPublicacionDeUnPost(int fila) throws MalformedURLException, IOException {
        //ciclo for que lleva el conteo de los post de la variable feeds
        for (int i = 0; i < listaDePost.size(); i++) {
            if (fila == i) {//condicion if que se cumple si la fila es igual al conteo de i en el ciclo
                Post postUsuario = listaDePost.get(i);
                publicacion.setText(postUsuario.getMessage());
                //PagableList<Like> likes = postUsuario.getLikes();
                //jTextFieldLikesNumber.setText(String.valueOf(likes.size()));
                comentarios = listaDePost.get(i).getComments();
                for (int j = 0; j < comentarios.size(); j++) {
                    System.out.println("jjhbjhb: " + comentarios);
                    comentariosText.setText("\n" + comentariosText.getText() + "\n" + comentarios.get(j).getFrom().getName() + ": " + comentarios.get(j).getMessage()  + "  likes: " +comentarios.get(j).getLikeCount());
                }
                ImageIcon image;
                if (listaDePost.get(i).getPicture() != null) {
                    System.out.println("url: " + listaDePost.get(i).getPicture());
                    URL url = new URL(listaDePost.get(i).getPicture().toString());
                    BufferedImage c = ImageIO.read(url);
                    image = new ImageIcon(c);
                    foto.setIcon(image);
                } else {
                    foto.getGraphics().clearRect(1, 1, foto.getWidth(), foto.getHeight());
                    foto.setEnabled(false);
                    foto.setText("null");
                }

            }
        }
    }//end of mostrarPost
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        comentariosText.setText("");
        int fila = jTable1.getSelectedRow();
        try {
            detallesPublicacionDeUnPost(fila);
        } catch (IOException ex) {
            Logger.getLogger(FacebookPost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                    

    private void amigosFBActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FacebookPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacebookPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IFacebookPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacebookPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacebookPost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox amigosFB;
    private javax.swing.JTextArea comentariosText;
    private javax.swing.JTextField email;
    private javax.swing.JLabel foto;
    private javax.swing.JTextField genero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextArea publicacion;
    // End of variables declaration                   
}
