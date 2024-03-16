/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package music;

/**
 * 14/04/24
 * @author dongyiyoo
 */
public class MusicApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainGUI myGUI = new MainGUI();
        myGUI.setVisible(true);
    }
    
}

/* Create a playlist of songs they "liked". These songs will then be used to populate
at least two playlists organised by criteria, such as genre for example

• Add a song from the "liked" playlist to one of the two genre playlists

o The limitation of the system is that only the last song added to the "liked"
playlist can be moved to the appropriate genre-based playlist -> 남아있어야됨. 피크 써야됨. 디엘엘 있어야됨. 

• Add, search, delete and move songs around on their playlists -> 플레이리스트 사이를 움직이는 것. 버블솔트 침고하기 스왑으러 시작하는 거 사용하기. 
•뭔뜻이여? See a printed list (on screen) of whichever playlists they wish -> 둘 다 
• Display how many songs are in each list 플레이버튼 하나 만들고 버튼 누르면 ~가 플레이중임 하면서 다음 노래로 넘어가는데 계속 반복해야됨.
• Create a playlist that can be set to repeat 

화면 위에 메뉴바 추가하기 
플리의 무브 버튼은 같은 플레이 리스트 내에서 위치를 이동하는것

*/

