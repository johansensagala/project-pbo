/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Johansen
 */
public class loadingScreen {
    public static void main(String[] args){
        splashScreen splash = new splashScreen();
        splash.setVisible(true);
        menuUtama menu = new menuUtama();
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                splash.loadingnumber.setText(Integer.toString(i)+"%");
                splash.loading.setValue(i);
                if(i==100){
                    splash.setVisible(false);
                    menu.setVisible(true);
                }
            }
        } catch (Exception e){}
    }
}
