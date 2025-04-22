package Expt_3;
import Expt_3.Mathoper;
import Expt_3.Sample;
import Expt_2.University;

public class Pack1 {

    public static void main(String[] args) {
        Mathoper m = new Mathoper();
        int sum = m.add(10, 20);
        int product = m.product(8, 10);

        System.out.println("Sum " + sum);
        System.out.println("Product " + product);

        Sample s= new Sample();
        s.first();

        University un = new University();
        un.initializeUniversity("Jain University", "Bengaluru");
        un.displayUniversity();
    }
}
