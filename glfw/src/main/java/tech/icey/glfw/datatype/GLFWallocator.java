package tech.icey.glfw.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.glfw.datatype.*;
import static tech.icey.glfw.GLFWConstants.*;

public record GLFWallocator(MemorySegment segment) implements IPointer {
    public @pointer(comment="GLFWallocatefun") MemorySegment allocate() {
        return segment.get(LAYOUT$allocate, OFFSET$allocate);
    }

    public void allocate(@pointer(comment="GLFWallocatefun") MemorySegment value) {
        segment.set(LAYOUT$allocate, OFFSET$allocate, value);
    }

    public void allocate(IPointer pointer) {
        allocate(pointer.segment());
    }

    public @pointer(comment="GLFWreallocatefun") MemorySegment reallocate() {
        return segment.get(LAYOUT$reallocate, OFFSET$reallocate);
    }

    public void reallocate(@pointer(comment="GLFWreallocatefun") MemorySegment value) {
        segment.set(LAYOUT$reallocate, OFFSET$reallocate, value);
    }

    public void reallocate(IPointer pointer) {
        reallocate(pointer.segment());
    }

    public @pointer(comment="GLFWdeallocatefun") MemorySegment deallocate() {
        return segment.get(LAYOUT$deallocate, OFFSET$deallocate);
    }

    public void deallocate(@pointer(comment="GLFWdeallocatefun") MemorySegment value) {
        segment.set(LAYOUT$deallocate, OFFSET$deallocate, value);
    }

    public void deallocate(IPointer pointer) {
        deallocate(pointer.segment());
    }

    public @pointer(comment="void*") MemorySegment user() {
        return segment.get(LAYOUT$user, OFFSET$user);
    }

    public void user(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$user, OFFSET$user, value);
    }

    public void user(IPointer pointer) {
        user(pointer.segment());
    }

    public static GLFWallocator allocate(Arena arena) {
        return new GLFWallocator(arena.allocate(LAYOUT));
    }

    public static GLFWallocator[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        GLFWallocator[] ret = new GLFWallocator[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new GLFWallocator(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static GLFWallocator clone(Arena arena, GLFWallocator src) {
        GLFWallocator ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static GLFWallocator[] clone(Arena arena, GLFWallocator[] src) {
        GLFWallocator[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("allocate"),
        ValueLayout.ADDRESS.withName("reallocate"),
        ValueLayout.ADDRESS.withName("deallocate"),
        ValueLayout.ADDRESS.withName("user")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$allocate = PathElement.groupElement("allocate");
    public static final PathElement PATH$reallocate = PathElement.groupElement("reallocate");
    public static final PathElement PATH$deallocate = PathElement.groupElement("deallocate");
    public static final PathElement PATH$user = PathElement.groupElement("user");

    public static final AddressLayout LAYOUT$allocate = (AddressLayout) LAYOUT.select(PATH$allocate);
    public static final AddressLayout LAYOUT$reallocate = (AddressLayout) LAYOUT.select(PATH$reallocate);
    public static final AddressLayout LAYOUT$deallocate = (AddressLayout) LAYOUT.select(PATH$deallocate);
    public static final AddressLayout LAYOUT$user = (AddressLayout) LAYOUT.select(PATH$user);

    public static final long OFFSET$allocate = LAYOUT.byteOffset(PATH$allocate);
    public static final long OFFSET$reallocate = LAYOUT.byteOffset(PATH$reallocate);
    public static final long OFFSET$deallocate = LAYOUT.byteOffset(PATH$deallocate);
    public static final long OFFSET$user = LAYOUT.byteOffset(PATH$user);

    public static final long SIZE$allocate = LAYOUT$allocate.byteSize();
    public static final long SIZE$reallocate = LAYOUT$reallocate.byteSize();
    public static final long SIZE$deallocate = LAYOUT$deallocate.byteSize();
    public static final long SIZE$user = LAYOUT$user.byteSize();
}

