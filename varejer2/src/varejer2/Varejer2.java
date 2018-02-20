/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varejer2;
import java.util.Scanner;
/**
 *@version 1.0
 * @author Dairo Estiben Beltran Martinez
 * Este programapermite saber el número de semanas, días y
horas equivalentes. Por ejemplo, dado un total de
1000 horas debe mostrar 5 semanas, 6 días y 16
horas.
 */
class Horas{
    Scanner resp = new Scanner(System.in);
    int dia;
    int hora;
    int sem;
    int a;
}
public class Varejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Horas hor = new Horas();
        System.out.println("Ingresa las horas");
        hor.a = hor.resp.nextInt();
        while(hor.a<=0){
            System.out.println("hora invalida");
            hor.a = hor.resp.nextInt();
        } 
        if(hor.a>=60){
        hor.hora = (hor.a/60);
        }
        if(hor.a>=168){
        hor.sem = (hor.a/168);
        }
        if(hor.a>=24){
        hor.dia = (hor.a/24);
        }
        System.out.println("son "+hor.sem+" semana(s) "+hor.dia+" dia(s) y "+hor.hora+" hora(s)"); 
    }
    
}
