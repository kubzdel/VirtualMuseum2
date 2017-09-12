package Main;

import Utils.ApplicationEventsManager;
import Utils.DisplayManager;
import org.lwjgl.opengl.Display;

import static org.lwjgl.opengl.GL11.*;

public class Main {
    private static final boolean DEBUG = false;


    public static void main(String[] args) {

        new Main();
    }

    private void SystemInfo() {
        System.out.println("OS name " + System.getProperty("os.name"));
        System.out.println("OS version " + System.getProperty("os.version"));
        System.out.println("LWJGL version " + org.lwjgl.Sys.getVersion());
        System.out.println("OpenGL version " + glGetString(GL_VERSION));
    }

    public Main() {
        Utils.DisplayManager displayManager = new DisplayManager();


        ApplicationEventsManager.getInstance().onApplicationStarted();

        if (DEBUG) {
            SystemInfo();
        }

        while (!Display.isCloseRequested()) {
            displayManager.update();
        }



        ApplicationEventsManager.getInstance().onApplicationEnded();
        displayManager.destroy();

    }

}