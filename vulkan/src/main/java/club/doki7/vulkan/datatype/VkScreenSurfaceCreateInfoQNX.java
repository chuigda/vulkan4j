package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkScreenSurfaceCreateInfoQNX.html"><code>VkScreenSurfaceCreateInfoQNX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkScreenSurfaceCreateInfoQNX {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkScreenSurfaceCreateFlagsQNX flags; // optional // @link substring="VkScreenSurfaceCreateFlagsQNX" target="VkScreenSurfaceCreateFlagsQNX" @link substring="flags" target="#flags"
///     _screen_context* context; // @link substring="context" target="#context"
///     _screen_window* window; // @link substring="window" target="#window"
/// } VkScreenSurfaceCreateInfoQNX;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SCREEN_SURFACE_CREATE_INFO_QNX`
///
/// The {@code allocate} ({@link VkScreenSurfaceCreateInfoQNX#allocate(Arena)}, {@link VkScreenSurfaceCreateInfoQNX#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkScreenSurfaceCreateInfoQNX#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkScreenSurfaceCreateInfoQNX.html"><code>VkScreenSurfaceCreateInfoQNX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkScreenSurfaceCreateInfoQNX(@NotNull MemorySegment segment) implements IPointer {
    public static VkScreenSurfaceCreateInfoQNX allocate(Arena arena) {
        VkScreenSurfaceCreateInfoQNX ret = new VkScreenSurfaceCreateInfoQNX(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SCREEN_SURFACE_CREATE_INFO_QNX);
        return ret;
    }

    public static VkScreenSurfaceCreateInfoQNX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkScreenSurfaceCreateInfoQNX[] ret = new VkScreenSurfaceCreateInfoQNX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkScreenSurfaceCreateInfoQNX(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SCREEN_SURFACE_CREATE_INFO_QNX);
        }
        return ret;
    }

    public static VkScreenSurfaceCreateInfoQNX clone(Arena arena, VkScreenSurfaceCreateInfoQNX src) {
        VkScreenSurfaceCreateInfoQNX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkScreenSurfaceCreateInfoQNX[] clone(Arena arena, VkScreenSurfaceCreateInfoQNX[] src) {
        VkScreenSurfaceCreateInfoQNX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SCREEN_SURFACE_CREATE_INFO_QNX);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkScreenSurfaceCreateFlagsQNX.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkScreenSurfaceCreateFlagsQNX.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr context() {
        MemorySegment s = contextRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public void context(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        contextRaw(s);
    }

    public @pointer(comment="void**") MemorySegment contextRaw() {
        return segment.get(LAYOUT$context, OFFSET$context);
    }

    public void contextRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$context, OFFSET$context, value);
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr window() {
        MemorySegment s = windowRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public void window(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        windowRaw(s);
    }

    public @pointer(comment="void**") MemorySegment windowRaw() {
        return segment.get(LAYOUT$window, OFFSET$window);
    }

    public void windowRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$window, OFFSET$window, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("context"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("window")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$context = PathElement.groupElement("PATH$context");
    public static final PathElement PATH$window = PathElement.groupElement("PATH$window");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$context = (AddressLayout) LAYOUT.select(PATH$context);
    public static final AddressLayout LAYOUT$window = (AddressLayout) LAYOUT.select(PATH$window);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$context = LAYOUT$context.byteSize();
    public static final long SIZE$window = LAYOUT$window.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$context = LAYOUT.byteOffset(PATH$context);
    public static final long OFFSET$window = LAYOUT.byteOffset(PATH$window);
}
