import java.io.File;
import java.util.ArrayList;

/**
 * <h2>Class Main</h2>
 * The Main program implements an application that
 * simply displays data from a "goods_in_the_store.csv" file to the standard output.
 *
 * @see Store
 * @author EgorDubcenco
 */
public class Main {
    public static void main(String[] args) {

        File file = new File(".\\src\\goods_in_the_store.csv");
        ArrayList<Store> arrayList = Store.input(file);
        for(Store s: arrayList){
            System.out.println(s);
        }
    }
}