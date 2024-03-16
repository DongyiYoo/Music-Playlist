/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package music;

import javax.swing.JOptionPane;


/**
 *
 * @author dongyiyoo
 */
public class PlaylistGUI extends javax.swing.JFrame {

    
    StackInterface stackInterface;
    LinearListInterface dllInterface;
    private DLList popList = new DLList();
    private DLList rockList = new DLList();
   
    public PlaylistGUI() {
        dllInterface = new DLList();
        initComponents();
    }

    private void updatePopTextArea() {
        // Compose a new string with all songs from popList and update popTa
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= popList.size(); i++) {
            DlNode node = (DlNode) popList.get(i);
            sb.append(node.getElement().toString()).append("\n");
        }
        popTa.setText(sb.toString());
    }

    private void updateRockTextArea() {
           // Compose a new string with all songs from rockList and update rockTa
           StringBuilder sb = new StringBuilder();
           for (int i = 1; i <= rockList.size(); i++) {
               DlNode node = (DlNode) rockList.get(i);
               sb.append(node.getElement().toString()).append("\n");
           }
           rockTa.setText(sb.toString());
    }
    
    //Variable to track the index of the currently playing song in rocklist and poplist
    private int popPlayIndex = 1;
    private int rockPlayIndex = 1;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mainBtn = new javax.swing.JButton();
        likedBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        searchTf = new javax.swing.JTextField();
        popPan = new javax.swing.JPanel();
        popaddBtn = new javax.swing.JButton();
        popdeleteBtn = new javax.swing.JButton();
        popmoveBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        popTa = new javax.swing.JTextArea();
        popplayBtn = new javax.swing.JButton();
        nosBtn = new javax.swing.JButton();
        poplistBtn = new javax.swing.JButton();
        rockPan = new javax.swing.JPanel();
        rockaddBtn = new javax.swing.JButton();
        rockdeleteBtn = new javax.swing.JButton();
        rockmoveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rockTa = new javax.swing.JTextArea();
        rockplayBtn = new javax.swing.JButton();
        nosBtn2 = new javax.swing.JButton();
        rocklistBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        bgLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainBtn.setText("Main");
        mainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mainBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, -1, -1));

        likedBtn.setText("Liked Songs");
        likedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likedBtnActionPerformed(evt);
            }
        });
        getContentPane().add(likedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, -1, -1));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));
        getContentPane().add(searchTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 180, -1));

        popPan.setBackground(new java.awt.Color(230, 230, 254));
        popPan.setBorder(javax.swing.BorderFactory.createTitledBorder("POP"));

        popaddBtn.setText("Add");
        popaddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popaddBtnActionPerformed(evt);
            }
        });

        popdeleteBtn.setText("Delete");
        popdeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popdeleteBtnActionPerformed(evt);
            }
        });

        popmoveBtn.setText("Move");
        popmoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popmoveBtnActionPerformed(evt);
            }
        });

        popTa.setColumns(20);
        popTa.setRows(5);
        jScrollPane2.setViewportView(popTa);

        popplayBtn.setText("Play");
        popplayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popplayBtnActionPerformed(evt);
            }
        });

        nosBtn.setText("Num of songs");
        nosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nosBtnActionPerformed(evt);
            }
        });

        poplistBtn.setText("List");
        poplistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poplistBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout popPanLayout = new javax.swing.GroupLayout(popPan);
        popPan.setLayout(popPanLayout);
        popPanLayout.setHorizontalGroup(
            popPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popPanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(popPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(popaddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(popdeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(popmoveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(popplayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(poplistBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        popPanLayout.setVerticalGroup(
            popPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popPanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(popPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(popPanLayout.createSequentialGroup()
                        .addComponent(popaddBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(popdeleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(popmoveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(popplayBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nosBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(poplistBtn)))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        getContentPane().add(popPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 370, 240));

        rockPan.setBackground(new java.awt.Color(230, 230, 254));
        rockPan.setBorder(javax.swing.BorderFactory.createTitledBorder("ROCK"));

        rockaddBtn.setText("Add");
        rockaddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockaddBtnActionPerformed(evt);
            }
        });

        rockdeleteBtn.setText("Delete");
        rockdeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockdeleteBtnActionPerformed(evt);
            }
        });

        rockmoveBtn.setText("Move");
        rockmoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockmoveBtnActionPerformed(evt);
            }
        });

        rockTa.setColumns(20);
        rockTa.setRows(5);
        jScrollPane1.setViewportView(rockTa);

        rockplayBtn.setText("Play");
        rockplayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockplayBtnActionPerformed(evt);
            }
        });

        nosBtn2.setText("Num of songs");
        nosBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nosBtn2ActionPerformed(evt);
            }
        });

        rocklistBtn.setText("List");
        rocklistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocklistBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rockPanLayout = new javax.swing.GroupLayout(rockPan);
        rockPan.setLayout(rockPanLayout);
        rockPanLayout.setHorizontalGroup(
            rockPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rockPanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rockPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rockaddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rockdeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rockmoveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rockplayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nosBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rocklistBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        rockPanLayout.setVerticalGroup(
            rockPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rockPanLayout.createSequentialGroup()
                .addComponent(rockaddBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rockdeleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rockmoveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rockplayBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nosBtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rocklistBtn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(rockPanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(rockPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 370, 230));

        titleLbl.setFont(new java.awt.Font("Noto Sans Myanmar", 1, 30)); // NOI18N
        titleLbl.setText("My Playlist");
        getContentPane().add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        bgLbl.setBackground(new java.awt.Color(255, 255, 255));
        bgLbl.setOpaque(true);
        getContentPane().add(bgLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 650));

        pack();
    }// </editor-fold>                        

    private void likedBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        LikedSongGUI myGUI = new LikedSongGUI();
        myGUI.setVisible(true); // make the new ui appear
        
        // close the Project GUI
        this.dispose();
    }                                        

    private void mainBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        MainGUI myGUI = new MainGUI();
        myGUI.setVisible(true); // make the new ui appear
        
        // close the Project GUI
        this.dispose();
    }                                       

    private void popdeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
  
    // Retrieve the search text
    String search = searchTf.getText().trim();

    // Check if the searchTf is empty
    if (search.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the title of the song to delete.", "Deletion Error", JOptionPane.WARNING_MESSAGE);
        return; // Stop if no search text is provided
    }
    
    // Split the text area content
    String[] songs = popTa.getText().split("\n");
    boolean found = false;

    // New StringBuilder to hold the updated list
    StringBuilder updatedSongs = new StringBuilder();

    for (int i = 0; i < songs.length; i++) {
        // Check if the current song matches the serchTf
        if (songs[i].equals(search)) {
            // If it is, remove the song from popList
            popList.remove(i + 1); // -> list indexing starts at 1
            found = true;
        } else {
            // If not the song to delete, add it to the updated list
            updatedSongs.append(songs[i]).append("\n");
        }
    }

    // Update the popTa 
    popTa.setText(updatedSongs.toString());

    // Display the result to users
    if (found) {
        JOptionPane.showMessageDialog(this, "The song is deleted successfully.", "Deletion Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Song not found in the playlist.", " Error", JOptionPane.WARNING_MESSAGE);
    }
    
    }                                            

    private void popaddBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
      
        // Check if popStack is empty
    if (!LikedSongGUI.popStack.isEmpty()) {
        // Retrieve the latest song title categorized under the pop genre from popStack
        String title = (String) LikedSongGUI.popStack.peek();
        // Add the last song title with rock genre to the popTa
        popTa.append(title + "\n");
        // Add the song in popList
        popList.add(popList.size() + 1, title); 
        // Delete the last song in popStack
        LikedSongGUI.popStack.pop();
    } else {
        // Display a message when popStack is empty
        JOptionPane.showMessageDialog(this, "No POP songs in the liked list anymore.", "Info", JOptionPane.INFORMATION_MESSAGE);
    }
        
        
    }                                         

    private void rockaddBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:

    // Check if rockStack is empty
    if (!LikedSongGUI.rockStack.isEmpty()) {
        // Retrieve the latest song title categorized under the rock genre from rockStack
        String title = (String) LikedSongGUI.rockStack.peek();
        // Add the last song title with rock genre to the rockTa
        rockTa.append(title + "\n");
        // Delete the last song in rockStack
        LikedSongGUI.rockStack.pop();
    } else {
        // Display a message when rockStack is empty
        JOptionPane.showMessageDialog(this, "No ROCK songs in the liked list anymore.", "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    }                                          

    private void nosBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    
        String text = popTa.getText();
    String[] lines = text.split("\n"); // Split by new line
    
    // Filter the lines that are not song titles
    int songCount = 0;
    for(String songLine : lines) {
        if(!songLine.contains("Number of songs in POP playlist") && !songLine.trim().isEmpty()) {
            songCount++;
        }
    }

    // Append the count of song titles to popTa
    if(songCount > 0) {
        popTa.append("Number of songs in POP playlist: " + songCount + "\n");
    } else {
       JOptionPane.showMessageDialog(null, "The POP playlist is empty.", "Playlist Empty", JOptionPane.WARNING_MESSAGE);
    
    }
    }                                      

    private void nosBtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    
    String text = rockTa.getText();
    String[] lines = text.split("\n"); // Split by new line
    
    // Filter the lines that are not song titles
    int songCount = 0;
    for(String song : lines) {
        if(!song.contains("Number of songs in ROCK playlist") && !song.trim().isEmpty()) {
            songCount++;
        }
    }

    // Append the count of song titles to rockTa
    if(songCount > 0) {
        rockTa.append("Number of songs in ROCK playlist: " + songCount + "\n");
    } else {
        JOptionPane.showMessageDialog(null, "The ROCK playlist is empty.", "Playlist Empty", JOptionPane.WARNING_MESSAGE);
    
    }
    }                                       

    private void rockdeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
       
    // Retrieve the search text
    String search = searchTf.getText().trim();

    // Check if the searchTf is empty
    if (search.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the title of the song to delete.", "Deletion Error", JOptionPane.WARNING_MESSAGE);
        return; // Stop if no search text is provided
    }
    
    // Split the text area content
    String[] songs = rockTa.getText().split("\n");
    boolean found = false;

    // New StringBuilder to hold the updated list
    StringBuilder updatedSongs = new StringBuilder();

    for (int i = 0; i < songs.length; i++) {
        // Check if the current song matches the serchTf
        if (songs[i].equals(search)) {
            // If it is, remove the song from rockList
            rockList.remove(i + 1); // -> list indexing starts at 1
            found = true;
        } else {
            // If not the song to delete, add it to the updated list
            updatedSongs.append(songs[i]).append("\n");
        }
    }

    // Update the rockTa 
    rockTa.setText(updatedSongs.toString());

    // Display the result to users
    if (found) {
        JOptionPane.showMessageDialog(this, "The song is deleted successfully.", "Deletion Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Song not found in the playlist.", "Error", JOptionPane.WARNING_MESSAGE);
    }
    }                                             

    private void popmoveBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
     
    // Check if popList is not empty
    if (!popList.isEmpty()) {
        // Check if there is only one song left in the popTa
        if (popList.size() == 1) {
            // Display a message that the last song in the playlist cannot be moved
            JOptionPane.showMessageDialog(this, "At least one song must remain in the playlist.", "Move Error", JOptionPane.WARNING_MESSAGE);
            return; // Stop if there's only one song
        }
        
        // If there are more than one song,move the last song to rockTa
        int lastIndex = popList.size();
        
        // Extract information of the last song
        DlNode lastNode = (DlNode) popList.get(lastIndex);
        String lastSong = lastNode.getElement().toString();

        // Remove the last song from popList
        popList.remove(lastIndex);

        // Add the song to rockList and update rockTa
        rockList.add(rockList.size() + 1, lastSong);
        rockTa.append(lastSong + "\n");

        // Update popList and popTa
        updatePopTextArea();
    } else {
        // If the POP playlist is empty, inform the user
        JOptionPane.showMessageDialog(this, "The POP playlist is empty.", "Playlist Empty", JOptionPane.WARNING_MESSAGE);
    }
    
    }                                          

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
     // Retrieve the text entered by the user
    String search = searchTf.getText().trim(); 
    
    // Check if searchTf is empty
    if (search.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the title of the song.", "Search Error", JOptionPane.WARNING_MESSAGE);
        return; // Stop if no search text is provided
    }


    // Retrieve the text from popTa and rockTa
    String popText = popTa.getText();
    String rockText = rockTa.getText();

    // // Variables to store search results
    boolean foundInPop = false;
    boolean foundInRock = false;

    // Check if search term is included in popTa
    if (popText.contains(search)) {
        foundInPop = true;
    }

    // Check if search term is included in rockTa
    if (rockText.contains(search)) {
        foundInRock = true;
    }

    // Display the message to the user by the result
    if (foundInPop || foundInRock) {
        String foundMessage = "The song is found in ";
        if (foundInPop) {
            foundMessage += "POP playlist";
            if (foundInRock) {
                foundMessage += " and ROCK playlist.";
            }
        } else if (foundInRock) {
            foundMessage += "ROCK playlist.";
        }
        JOptionPane.showMessageDialog(this, foundMessage, "Search Result", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "No result for " + search, ".", JOptionPane.INFORMATION_MESSAGE);
    }
        
    }                                         

    private void rockmoveBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // Cannot read rockList. 
        
        // Check if rockList is not empty
    if (!rockList.isEmpty()) {
        // Check if there is only one song left in the rockTa
        if (rockList.size() == 1) {
            // Display a message that the last song in the playlist cannot be moved
            JOptionPane.showMessageDialog(this, "At least one song must remain in the playlist.", "Move Error", JOptionPane.WARNING_MESSAGE);
            return; // Stop if there's only one song
        }
        
        // If there are more than one song,move the last song to popTa
        int lastIndex = rockList.size();
        
        // Extract information of the last song
        DlNode lastNode = (DlNode) rockList.get(lastIndex);
        String lastSong = lastNode.getElement().toString();

        // Remove the last song from rockList
        rockList.remove(lastIndex);

        // Add the song to popList and update popTa
        popList.add(popList.size() + 1, lastSong);
        popTa.append(lastSong + "\n");

        // Update rockList and rockTa
        updateRockTextArea();
    } else {
        // If the ROCK playlist is empty, inform the user
        JOptionPane.showMessageDialog(this, "The ROCK playlist is empty.", "Playlist Empty", JOptionPane.WARNING_MESSAGE);
    }
    }                                           

    private void popplayBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
        // If popList is empty, display the error message
    if (popList.isEmpty()) {
        JOptionPane.showMessageDialog(this, "The playlist is empty.", "Playlist Empty", JOptionPane.WARNING_MESSAGE);
    } else {
         // If there is a song, play the currently playing song
        if (popPlayIndex <= popList.size()) {
            DlNode node = (DlNode) popList.get(popPlayIndex);
            String song = node.getElement().toString();
            
            // Add message to popTa
             popTa.append(song + " is now playing.. .\n");
            
            // Repeat the playlist
            if (popPlayIndex == popList.size()) {
                popPlayIndex = 1; 
            } else {
                popPlayIndex++;
            }
        }
    }
    }                                          

    private void rockplayBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // Cannot read rockList
        
     // If rockList is empty, display the error message
    if (rockList.isEmpty()) {
        JOptionPane.showMessageDialog(this, "The ROCK playlist is empty.", "Playlist Empty", JOptionPane.WARNING_MESSAGE);
    } else {
        // If there is a song, play the currently playing song
        if (rockPlayIndex <= rockList.size()) {
            DlNode node = (DlNode) rockList.get(rockPlayIndex);
            String song = node.getElement().toString();
            
            // Add message to rockTa indicating the song is now playing
            rockTa.append(song + " is now playing.\n");
            
            // Move to the next song or reset to the first song if at the end of the list
            if (rockPlayIndex == rockList.size()) {
                rockPlayIndex = 1;
            } else {
                rockPlayIndex++;
            }
        }
    }

    }                                           

    private void poplistBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
   
    // Append a title for the list
    popTa.append("POP Playlist Songs:\n");
    
    // Use the DLList method to get formatted string of all items
    String allPopSongs = popList.printList();
    
    // Append the formatted string to the popTa
    popTa.append(allPopSongs + "\n");
    }                                          

    private void rocklistBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // Although it's the same code, rock list is not displaying properly.
        
        
    // Append a title for the list
    rockTa.append("ROCK Playlist Songs:\n");
    
    // Use the DLList method to get formatted string of all items
    String allRockSongs = rockList.printList();
    
    // Append the formatted string to the popTa
    rockTa.append(allRockSongs + "\n");
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
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaylistGUI().setVisible(true);
            }
        });
    }
 
 
    // Variables declaration - do not modify                     
    private javax.swing.JLabel bgLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton likedBtn;
    private javax.swing.JButton mainBtn;
    private javax.swing.JButton nosBtn;
    private javax.swing.JButton nosBtn2;
    private javax.swing.JPanel popPan;
    private javax.swing.JTextArea popTa;
    private javax.swing.JButton popaddBtn;
    private javax.swing.JButton popdeleteBtn;
    private javax.swing.JButton poplistBtn;
    private javax.swing.JButton popmoveBtn;
    private javax.swing.JButton popplayBtn;
    private javax.swing.JPanel rockPan;
    private javax.swing.JTextArea rockTa;
    private javax.swing.JButton rockaddBtn;
    private javax.swing.JButton rockdeleteBtn;
    private javax.swing.JButton rocklistBtn;
    private javax.swing.JButton rockmoveBtn;
    private javax.swing.JButton rockplayBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTf;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration                   

    
}
