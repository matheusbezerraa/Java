
package aula04;

/**
 *
 * @author Matheus Bezerra
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("bic","vermelha",0.5f);
        c1.status();
        System.out.println("-------------------------");
       Caneta c2 = new Caneta("castel", "preta", 1.0f);
       c2.status();
    }
}
