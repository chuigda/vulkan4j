import de.javagl.obj.ObjData;
import de.javagl.obj.ObjReader;
import de.javagl.obj.ObjUtils;

import java.io.IOException;
import java.util.Objects;

public class LoadModelTest {
    public static void main(String[] args) {
        try (var stream = LoadModelTest.class.getResourceAsStream("/model/viking_room.obj")) {
            var obj = ObjUtils.convertToRenderable(ObjReader.read(Objects.requireNonNull(stream)));

            var indices = ObjData.getFaceVertexIndices(obj);
            var vertices = ObjData.getVertices(obj);
            var texCoords = ObjData.getTexCoords(obj, 2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
