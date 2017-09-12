package Models;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

import java.util.ArrayList;
import java.util.List;

public class ModelsRenderer {

    private List<Model> modelsToRender = new ArrayList<>();

    public List<Model> getModelsToRender() {
        return modelsToRender;
    }

    public void setModelsToRender(List<Model> modelsToRender) {
        this.modelsToRender = modelsToRender;
    }

    public void  prepare()
    {
        GL11.glClearColor(1,0,0,1);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);


    }

    public void renderModels()
    {
        for(Model model : modelsToRender)
        {
            GL30.glBindVertexArray(model.vaoID);
            GL20.glEnableVertexAttribArray(0);
            GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, model.vertexCount);
            GL20.glDisableVertexAttribArray(0);
            GL30.glBindVertexArray(0);
        }
    }

}
