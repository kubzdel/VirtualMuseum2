package Models;

import Utils.Constants;
import Utils.ObjectLoader;
import Utils.VAOManager;

import java.io.File;
import java.io.IOException;

public class Model {


    int vaoID;
    int vertexCount;

    ModelData data;


    public ModelData getData() {
        return data;
    }

    public void setData(ModelData data) {
        this.data = data;
    }

    public Model(String filename)
            throws IOException
    {
        File file = new File(filename);
        if(!file.exists())
            throw new IOException(String.format("Plik %s nie istnieje", filename));

    }

    public void load()
    {
        loadToVAO();
    }

    private void loadToVAO()
    {
        VAOManager.getInstance().loadToVAO(this);
    }


    public void loadModel(String fileName) {
        String fullPath = Constants.MODELSPATH + fileName;
        ObjectLoader objectLoader = new ObjectLoader();

        //use object loader to put data into vertices, normals and texCoords lists

    }

    public  int getVaoID()
    {
        return  vaoID;
    }

    public void setVaoID(int vaoID) {
        this.vaoID = vaoID;
    }

    public int getVartexCount()
    {
        return vertexCount;
    }
}
