package tech.icey.glfw.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.glfw.datatype.*;
import static tech.icey.glfw.GLFWConstants.*;

public record GLFWgamepadstate(MemorySegment segment) implements IPointer {
    public MemorySegment buttonsRaw() {
        return segment.asSlice(OFFSET$buttons, SIZE$buttons);
    }

    public @unsigned ByteBuffer buttons() {
        return new ByteBuffer(buttonsRaw());
    }

    public void buttons(@unsigned ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$buttons, SIZE$buttons);
    }

    public MemorySegment axesRaw() {
        return segment.asSlice(OFFSET$axes, SIZE$axes);
    }

    public FloatBuffer axes() {
        return new FloatBuffer(axesRaw());
    }

    public void axes(FloatBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$axes, SIZE$axes);
    }

    public static GLFWgamepadstate allocate(Arena arena) {
        return new GLFWgamepadstate(arena.allocate(LAYOUT));
    }

    public static GLFWgamepadstate[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        GLFWgamepadstate[] ret = new GLFWgamepadstate[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new GLFWgamepadstate(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static GLFWgamepadstate clone(Arena arena, GLFWgamepadstate src) {
        GLFWgamepadstate ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static GLFWgamepadstate[] clone(Arena arena, GLFWgamepadstate[] src) {
        GLFWgamepadstate[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("buttons"),
        MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_FLOAT).withName("axes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$buttons = PathElement.groupElement("buttons");
    public static final PathElement PATH$axes = PathElement.groupElement("axes");

    public static final SequenceLayout LAYOUT$buttons = (SequenceLayout) LAYOUT.select(PATH$buttons);
    public static final SequenceLayout LAYOUT$axes = (SequenceLayout) LAYOUT.select(PATH$axes);

    public static final long OFFSET$buttons = LAYOUT.byteOffset(PATH$buttons);
    public static final long OFFSET$axes = LAYOUT.byteOffset(PATH$axes);

    public static final long SIZE$buttons = LAYOUT$buttons.byteSize();
    public static final long SIZE$axes = LAYOUT$axes.byteSize();
}

