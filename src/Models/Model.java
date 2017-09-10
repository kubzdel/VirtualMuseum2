package Models;

import Utils.Constants;
import Utils.ObjectLoader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Model {
    List<Float> vertices = new ArrayList<>();
    List<Float> normals = new ArrayList<>();
    List<Float> texCoords = new ArrayList<>();


    public Model(String filename)
            throws IOException
    {
        File file = new File(filename);
        if(!file.exists())
            throw new IOException(String.format("Plik %s nie istnieje", filename));

    }

    public void Load(String fileName) {
        String fullPath = Constants.MODELSPATH + fileName;
        ObjectLoader objectLoader = new ObjectLoader();

        //use object loader to put data into vertices, normals and texCoords lists

    }




}
