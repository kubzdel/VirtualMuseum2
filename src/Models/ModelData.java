package Models;

import java.util.ArrayList;
import java.util.List;

public class ModelData {

    float [] vertices ;
    float [] normals ;
    float[] texCoords;



    public float[] getNormals() {
        return normals;
    }

    public float[] getVertices() {
        return vertices;
    }

    public float[] getTexCoords() {
        return texCoords;
    }

    public void setVertices(float[] vertices) {
        this.vertices = vertices;
    }

    public void setNormals(float[] normals) {
        this.normals = normals;
    }

    public void setTexCoords(float[] texCoords) {
        this.texCoords = texCoords;
    }

    int vertexCount;

    public ModelData(int vertexCount)
    {
        this.vertexCount = vertexCount;
        vertices = new float[vertexCount];
        normals = new float[vertexCount];
        texCoords = new float[vertexCount];

    }
}
