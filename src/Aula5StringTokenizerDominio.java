

import java.lang.Object;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mari (48) 99618-5728
 */
public class Aula5StringTokenizerDominio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase = "Sejam bem vindos ao curso de Programacao Java";
        StringTokenizer tokenizer = new StringTokenizer(frase,"a");
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }

    }
    
}
