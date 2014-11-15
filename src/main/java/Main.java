import java.io.File;

/**
 * Created by Cayde on 15/11/2014.
 */
public class Main {
    public static void main(String[] args) {
        File x = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath()); // this returns classes/main
        System.out.println(x);
        File example = new File(x, "example.txt"); // this will look for classes/main/example.txt but we know it is resources/main/example.txt
        System.out.println(example.exists());
    }
}
