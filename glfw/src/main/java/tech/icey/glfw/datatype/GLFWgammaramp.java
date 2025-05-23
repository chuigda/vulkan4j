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

public record GLFWgammaramp(MemorySegment segment) implements IPointer {
    public @pointer(comment="short*") MemorySegment redRaw() {
        return segment.get(LAYOUT$red, OFFSET$red);
    }

    public void redRaw(@pointer(comment="short*") MemorySegment value) {
        segment.set(LAYOUT$red, OFFSET$red, value);
    }

    /// Note: the returned {@link ShortBuffer} does not have correct 
    /// {@link ShortBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortBuffer#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned ShortBuffer red() {
        MemorySegment s = redRaw();
        if (s.address() == 0) {
            return null;
        }
        return new ShortBuffer(s);
    }

    public void red(@Nullable @unsigned ShortBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        redRaw(s);
    }

    public @pointer(comment="short*") MemorySegment greenRaw() {
        return segment.get(LAYOUT$green, OFFSET$green);
    }

    public void greenRaw(@pointer(comment="short*") MemorySegment value) {
        segment.set(LAYOUT$green, OFFSET$green, value);
    }

    /// Note: the returned {@link ShortBuffer} does not have correct 
    /// {@link ShortBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortBuffer#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned ShortBuffer green() {
        MemorySegment s = greenRaw();
        if (s.address() == 0) {
            return null;
        }
        return new ShortBuffer(s);
    }

    public void green(@Nullable @unsigned ShortBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        greenRaw(s);
    }

    public @pointer(comment="short*") MemorySegment blueRaw() {
        return segment.get(LAYOUT$blue, OFFSET$blue);
    }

    public void blueRaw(@pointer(comment="short*") MemorySegment value) {
        segment.set(LAYOUT$blue, OFFSET$blue, value);
    }

    /// Note: the returned {@link ShortBuffer} does not have correct 
    /// {@link ShortBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortBuffer#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned ShortBuffer blue() {
        MemorySegment s = blueRaw();
        if (s.address() == 0) {
            return null;
        }
        return new ShortBuffer(s);
    }

    public void blue(@Nullable @unsigned ShortBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        blueRaw(s);
    }

    public int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public static GLFWgammaramp allocate(Arena arena) {
        return new GLFWgammaramp(arena.allocate(LAYOUT));
    }

    public static GLFWgammaramp[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        GLFWgammaramp[] ret = new GLFWgammaramp[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new GLFWgammaramp(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static GLFWgammaramp clone(Arena arena, GLFWgammaramp src) {
        GLFWgammaramp ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static GLFWgammaramp[] clone(Arena arena, GLFWgammaramp[] src) {
        GLFWgammaramp[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("red"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("green"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("blue"),
        ValueLayout.JAVA_INT.withName("size")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$red = PathElement.groupElement("red");
    public static final PathElement PATH$green = PathElement.groupElement("green");
    public static final PathElement PATH$blue = PathElement.groupElement("blue");
    public static final PathElement PATH$size = PathElement.groupElement("size");

    public static final AddressLayout LAYOUT$red = (AddressLayout) LAYOUT.select(PATH$red);
    public static final AddressLayout LAYOUT$green = (AddressLayout) LAYOUT.select(PATH$green);
    public static final AddressLayout LAYOUT$blue = (AddressLayout) LAYOUT.select(PATH$blue);
    public static final OfInt LAYOUT$size = (OfInt) LAYOUT.select(PATH$size);

    public static final long OFFSET$red = LAYOUT.byteOffset(PATH$red);
    public static final long OFFSET$green = LAYOUT.byteOffset(PATH$green);
    public static final long OFFSET$blue = LAYOUT.byteOffset(PATH$blue);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);

    public static final long SIZE$red = LAYOUT$red.byteSize();
    public static final long SIZE$green = LAYOUT$green.byteSize();
    public static final long SIZE$blue = LAYOUT$blue.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
}

