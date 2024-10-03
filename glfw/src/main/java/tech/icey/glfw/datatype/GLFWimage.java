package tech.icey.glfw.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.glfw.datatype.*;
import static tech.icey.glfw.GLFWConstants.*;

public record GLFWimage(MemorySegment segment) implements IPointer {
    public int width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public void width(int value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
    }

    public int height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public void height(int value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
    }

    public @pointer(comment="byte*") MemorySegment pixelsRaw() {
        return segment.get(LAYOUT$pixels, OFFSET$pixels);
    }

    public void pixelsRaw(@pointer(comment="byte*") MemorySegment value) {
        segment.set(LAYOUT$pixels, OFFSET$pixels, value);
    }

    /// Note: the returned {@link ByteBuffer} does not have correct 
    /// {@link ByteBuffer#size} property. it's up to user to track the size of the buffer,
    /// and use {@link ByteBuffer#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @nullable @unsigned ByteBuffer pixels() {
        MemorySegment s = pixelsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new ByteBuffer(s);
    }

    public void pixels(@nullable @unsigned ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pixelsRaw(s);
    }

    public static GLFWimage allocate(Arena arena) {
        return new GLFWimage(arena.allocate(LAYOUT));
    }

    public static GLFWimage[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        GLFWimage[] ret = new GLFWimage[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new GLFWimage(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static GLFWimage clone(Arena arena, GLFWimage src) {
        GLFWimage ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static GLFWimage[] clone(Arena arena, GLFWimage[] src) {
        GLFWimage[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pixels")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$pixels = PathElement.groupElement("pixels");

    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);
    public static final AddressLayout LAYOUT$pixels = (AddressLayout) LAYOUT.select(PATH$pixels);

    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$pixels = LAYOUT.byteOffset(PATH$pixels);

    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$pixels = LAYOUT$pixels.byteSize();
}

