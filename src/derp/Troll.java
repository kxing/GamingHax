package derp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author kxing
 */
public class Troll implements Runnable {
    public static volatile boolean running = true;
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot r = new Robot();
        Thread t = new Thread(new Troll());
        t.start();

        while (running) {
            r.keyPress(KeyEvent.VK_LEFT);
            r.keyRelease(KeyEvent.VK_LEFT);
            r.keyPress(KeyEvent.VK_RIGHT);
            r.keyRelease(KeyEvent.VK_RIGHT);
            Thread.sleep(10);
        }
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            if (br.readLine().equals("x")) {
                running = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
