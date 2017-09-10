package Utils;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.PixelFormat;

import org.lwjgl.opengl.Display;

public class DisplayManager {
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    private static final int FPS = 60;
    public boolean initailized = false;
    private String windowsTitle = "Wirtualne muzeum";
    public DisplayManager() {
        try {

            Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
            //set openGL 3.2
            ContextAttribs contextAttribs = new ContextAttribs(3, 2)
                    .withForwardCompatible(true)
                    .withProfileCore(true);

            Display.setTitle(windowsTitle);

            org.lwjgl.opengl.Display.create(new PixelFormat(), contextAttribs);
            initailized = true;
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
    }

    public void update()
    {
        Display.sync(FPS);
        Display.update();
    }

    public void destroy()
    {
        Display.destroy();
    }
}
