package Main;

import Models.Model;
import Models.ModelsRenderer;
import Utils.ApplicationEventsManager;
import Utils.Constants;
import Utils.DisplayManager;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import shaders.StaticShader;

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

        float[] vertices = { -0.5f, 0.5f, 0f, -0.5f, -0.5f, 0f, 0.5f, -0.5f, 0f, 0.5f, -0.5f, 0f, 0.5f, 0.5f, 0f, -0.5f, 0.5f, 0f };
        ModelsRenderer renderer = new ModelsRenderer();


        Model model = new Model(vertices);
        renderer.addModelsToRender(model);
        StaticShader shader = new StaticShader();


        if (DEBUG) {
            SystemInfo();
        }

        while (!Display.isCloseRequested()) {
            prepare();
            shader.start();
            renderer.renderModels();
            shader.stop();
            displayManager.update();
        }



        ApplicationEventsManager.getInstance().onApplicationEnded();
        shader.cleanUp();
        displayManager.destroy();

    }

    public void prepare() {
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
        GL11.glClearColor(Constants.BACKGROUND_COLOR.x, Constants.BACKGROUND_COLOR.y, Constants.BACKGROUND_COLOR.z, Constants.BACKGROUND_COLOR.w);
    }

}