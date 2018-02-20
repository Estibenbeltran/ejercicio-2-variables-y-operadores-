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
/**
 * Esta clase contiene los atributos dia, hora, semana y la variable a, quien será quien reciba los
 * datos por pantalla
 * 
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
        int cs=0, cd=0;//inicializamos los contadores de la semana y el dia, ya que el restante serán las horas
        Horas hor = new Horas();
        System.out.println("Ingresa las horas");//se piden los datos
        hor.a = hor.resp.nextInt();//se reciben
        while(hor.a<=0){//se valida que las horas no sean negatiivas ni 0
            System.out.println("hora invalida");
            hor.a = hor.resp.nextInt();//se vuelven a pedir los datos
        } 
        while(hor.a>=168){//condicion para saber cuantas semanas son
        hor.a= (hor.a-168);
        cs++;//contador de las semanas
        }
        hor.sem = cs;//se le aigna el conrador a la semana
        while(hor.a>=24){//condicion de los dias
        hor.a = (hor.a-24);
        cd++;//contador de los dias
        }
        hor.dia = cd;//asignacion del contador a los dias
        hor.hora = hor.a;//horas totales
        System.out.println("Las horas que digito inicialmente son "+hor.sem+" semana(s) "+hor.dia+" dia(s) y "+hor.hora+" hora(s)"); //mostramos los datos
    }
    
}
