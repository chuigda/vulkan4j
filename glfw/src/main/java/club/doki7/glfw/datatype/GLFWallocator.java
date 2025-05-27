package club.doki7.glfw.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import static club.doki7.glfw.GLFWConstants.*;

/// @brief Custom heap memory allocator.
/// *
/// This describes a custom heap memory allocator for GLFW.  To set an allocator, pass it
/// to @ref glfwInitAllocator before initializing the library.
/// *
/// @sa @ref init_allocator
/// @sa @ref glfwInitAllocator
/// *
/// @since Added in version 3.4.
/// *
/// @ingroup init
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct GLFWallocator {
///     GLFWallocatefun allocate; // @link substring="allocate" target="#allocate"
///     GLFWreallocatefun reallocate; // @link substring="reallocate" target="#reallocate"
///     GLFWdeallocatefun deallocate; // @link substring="deallocate" target="#deallocate"
///     void* user; // @link substring="user" target="#user"
/// } GLFWallocator;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// ## Member documentation
///
/// <ul>
/// <li>{@link #allocate} The memory allocation function.  See @ref GLFWallocatefun for details about
/// allocation function.
/// </li>
/// <li>{@link #reallocate} The memory reallocation function.  See @ref GLFWreallocatefun for details about
/// reallocation function.
/// </li>
/// <li>{@link #deallocate} The memory deallocation function.  See @ref GLFWdeallocatefun for details about
/// deallocation function.
/// </li>
/// <li>{@link #user} The user pointer for this custom allocator.  This value will be passed to the
/// allocator functions.
/// </li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record GLFWallocator(@NotNull MemorySegment segment) implements IGLFWallocator {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link GLFWallocator}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IGLFWallocator to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code GLFWallocator.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IGLFWallocator {
        public long size() {
            return segment.byteSize() / GLFWallocator.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull GLFWallocator at(long index) {
            return new GLFWallocator(segment.asSlice(index * GLFWallocator.BYTES, GLFWallocator.BYTES));
        }

        public void write(long index, @NotNull GLFWallocator value) {
            MemorySegment s = segment.asSlice(index * GLFWallocator.BYTES, GLFWallocator.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * GLFWallocator.BYTES, GLFWallocator.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * GLFWallocator.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * GLFWallocator.BYTES,
                (end - start) * GLFWallocator.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * GLFWallocator.BYTES));
        }

        public GLFWallocator[] toArray() {
            GLFWallocator[] ret = new GLFWallocator[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static GLFWallocator allocate(Arena arena) {
        return new GLFWallocator(arena.allocate(LAYOUT));
    }

    public static GLFWallocator.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new GLFWallocator.Ptr(segment);
    }

    public static GLFWallocator clone(Arena arena, GLFWallocator src) {
        GLFWallocator ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Pointer(comment="GLFWallocatefun") MemorySegment allocate() {
        return segment.get(LAYOUT$allocate, OFFSET$allocate);
    }

    public void allocate(@Pointer(comment="GLFWallocatefun") MemorySegment value) {
        segment.set(LAYOUT$allocate, OFFSET$allocate, value);
    }

    public void allocate(@Nullable IPointer pointer) {
        allocate(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @Pointer(comment="GLFWreallocatefun") MemorySegment reallocate() {
        return segment.get(LAYOUT$reallocate, OFFSET$reallocate);
    }

    public void reallocate(@Pointer(comment="GLFWreallocatefun") MemorySegment value) {
        segment.set(LAYOUT$reallocate, OFFSET$reallocate, value);
    }

    public void reallocate(@Nullable IPointer pointer) {
        reallocate(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @Pointer(comment="GLFWdeallocatefun") MemorySegment deallocate() {
        return segment.get(LAYOUT$deallocate, OFFSET$deallocate);
    }

    public void deallocate(@Pointer(comment="GLFWdeallocatefun") MemorySegment value) {
        segment.set(LAYOUT$deallocate, OFFSET$deallocate, value);
    }

    public void deallocate(@Nullable IPointer pointer) {
        deallocate(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @Pointer(comment="void*") MemorySegment user() {
        return segment.get(LAYOUT$user, OFFSET$user);
    }

    public void user(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$user, OFFSET$user, value);
    }

    public void user(@Nullable IPointer pointer) {
        user(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("allocate"),
        ValueLayout.ADDRESS.withName("reallocate"),
        ValueLayout.ADDRESS.withName("deallocate"),
        ValueLayout.ADDRESS.withName("user")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$allocate = PathElement.groupElement("allocate");
    public static final PathElement PATH$reallocate = PathElement.groupElement("reallocate");
    public static final PathElement PATH$deallocate = PathElement.groupElement("deallocate");
    public static final PathElement PATH$user = PathElement.groupElement("user");

    public static final AddressLayout LAYOUT$allocate = (AddressLayout) LAYOUT.select(PATH$allocate);
    public static final AddressLayout LAYOUT$reallocate = (AddressLayout) LAYOUT.select(PATH$reallocate);
    public static final AddressLayout LAYOUT$deallocate = (AddressLayout) LAYOUT.select(PATH$deallocate);
    public static final AddressLayout LAYOUT$user = (AddressLayout) LAYOUT.select(PATH$user);

    public static final long SIZE$allocate = LAYOUT$allocate.byteSize();
    public static final long SIZE$reallocate = LAYOUT$reallocate.byteSize();
    public static final long SIZE$deallocate = LAYOUT$deallocate.byteSize();
    public static final long SIZE$user = LAYOUT$user.byteSize();

    public static final long OFFSET$allocate = LAYOUT.byteOffset(PATH$allocate);
    public static final long OFFSET$reallocate = LAYOUT.byteOffset(PATH$reallocate);
    public static final long OFFSET$deallocate = LAYOUT.byteOffset(PATH$deallocate);
    public static final long OFFSET$user = LAYOUT.byteOffset(PATH$user);
}
