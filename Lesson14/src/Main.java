import Exeption.TrivialException;
import Exeption.VeryImportantEx;

//
public class Main {

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        try {
            main.f();
        } finally {
            main.dispose();
        }
    }

    void f() throws VeryImportantEx {
        throw new VeryImportantEx();
    }

    void dispose() throws TrivialException {
        throw new TrivialException();
    }
}
