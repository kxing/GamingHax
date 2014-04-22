/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package derp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author kxing
 */
public class Troll {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot r = new Robot();

        while (true) {
            r.keyPress(KeyEvent.VK_LEFT);
            r.keyRelease(KeyEvent.VK_LEFT);
            r.keyPress(KeyEvent.VK_RIGHT);
            r.keyRelease(KeyEvent.VK_RIGHT);
            Thread.sleep(10);
        }
    }
}
