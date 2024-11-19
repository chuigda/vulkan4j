package tech.icey.glfw.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.glfw.datatype.*;
import static tech.icey.glfw.GLFWConstants.*;

public record GLFWvidmode(MemorySegment segment) implements IPointer {
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

    public int redBits() {
        return segment.get(LAYOUT$redBits, OFFSET$redBits);
    }

    public void redBits(int value) {
        segment.set(LAYOUT$redBits, OFFSET$redBits, value);
    }

    public int greenBits() {
        return segment.get(LAYOUT$greenBits, OFFSET$greenBits);
    }

    public void greenBits(int value) {
        segment.set(LAYOUT$greenBits, OFFSET$greenBits, value);
    }

    public int blueBits() {
        return segment.get(LAYOUT$blueBits, OFFSET$blueBits);
    }

    public void blueBits(int value) {
        segment.set(LAYOUT$blueBits, OFFSET$blueBits, value);
    }

    public int refreshRate() {
        return segment.get(LAYOUT$refreshRate, OFFSET$refreshRate);
    }

    public void refreshRate(int value) {
        segment.set(LAYOUT$refreshRate, OFFSET$refreshRate, value);
    }

    public static GLFWvidmode allocate(Arena arena) {
        return new GLFWvidmode(arena.allocate(LAYOUT));
    }

    public static GLFWvidmode[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        GLFWvidmode[] ret = new GLFWvidmode[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new GLFWvidmode(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static GLFWvidmode clone(Arena arena, GLFWvidmode src) {
        GLFWvidmode ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static GLFWvidmode[] clone(Arena arena, GLFWvidmode[] src) {
        GLFWvidmode[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("redBits"),
        ValueLayout.JAVA_INT.withName("greenBits"),
        ValueLayout.JAVA_INT.withName("blueBits"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$redBits = PathElement.groupElement("redBits");
    public static final PathElement PATH$greenBits = PathElement.groupElement("greenBits");
    public static final PathElement PATH$blueBits = PathElement.groupElement("blueBits");
    public static final PathElement PATH$refreshRate = PathElement.groupElement("refreshRate");

    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);
    public static final OfInt LAYOUT$redBits = (OfInt) LAYOUT.select(PATH$redBits);
    public static final OfInt LAYOUT$greenBits = (OfInt) LAYOUT.select(PATH$greenBits);
    public static final OfInt LAYOUT$blueBits = (OfInt) LAYOUT.select(PATH$blueBits);
    public static final OfInt LAYOUT$refreshRate = (OfInt) LAYOUT.select(PATH$refreshRate);

    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$redBits = LAYOUT.byteOffset(PATH$redBits);
    public static final long OFFSET$greenBits = LAYOUT.byteOffset(PATH$greenBits);
    public static final long OFFSET$blueBits = LAYOUT.byteOffset(PATH$blueBits);
    public static final long OFFSET$refreshRate = LAYOUT.byteOffset(PATH$refreshRate);

    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$redBits = LAYOUT$redBits.byteSize();
    public static final long SIZE$greenBits = LAYOUT$greenBits.byteSize();
    public static final long SIZE$blueBits = LAYOUT$blueBits.byteSize();
    public static final long SIZE$refreshRate = LAYOUT$refreshRate.byteSize();
}

