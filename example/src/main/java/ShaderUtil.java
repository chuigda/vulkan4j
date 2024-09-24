import tech.icey.vk4j.annotation.nullable;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class ShaderUtil {
    public static @nullable MemorySegment readShaderCode(String fileName, Arena arena) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (var inputStream = classLoader.getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new IOException("Resource not found: " + fileName);
            }

            byte[] bytes = inputStream.readAllBytes();
            assert bytes.length % 4 == 0;

            MemorySegment shaderModule = arena.allocate(bytes.length, 4);
            shaderModule.copyFrom(MemorySegment.ofArray(bytes));
            return shaderModule;
        }
    }
}
