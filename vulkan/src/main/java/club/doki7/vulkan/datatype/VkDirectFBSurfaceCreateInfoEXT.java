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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDirectFBSurfaceCreateInfoEXT.html"><code>VkDirectFBSurfaceCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDirectFBSurfaceCreateInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkDirectFBSurfaceCreateFlagsEXT flags; // optional // @link substring="VkDirectFBSurfaceCreateFlagsEXT" target="VkDirectFBSurfaceCreateFlagsEXT" @link substring="flags" target="#flags"
///     IDirectFB* dfb; // @link substring="dfb" target="#dfb"
///     IDirectFBSurface* surface; // @link substring="surface" target="#surface"
/// } VkDirectFBSurfaceCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link VkDirectFBSurfaceCreateInfoEXT#allocate(Arena)}, {@link VkDirectFBSurfaceCreateInfoEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkDirectFBSurfaceCreateInfoEXT#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDirectFBSurfaceCreateInfoEXT.html"><code>VkDirectFBSurfaceCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDirectFBSurfaceCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDirectFBSurfaceCreateInfoEXT allocate(Arena arena) {
        VkDirectFBSurfaceCreateInfoEXT ret = new VkDirectFBSurfaceCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DIRECTFB_SURFACE_CREATE_INFO_EXT);
        return ret;
    }

    public static VkDirectFBSurfaceCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDirectFBSurfaceCreateInfoEXT[] ret = new VkDirectFBSurfaceCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDirectFBSurfaceCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DIRECTFB_SURFACE_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkDirectFBSurfaceCreateInfoEXT clone(Arena arena, VkDirectFBSurfaceCreateInfoEXT src) {
        VkDirectFBSurfaceCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDirectFBSurfaceCreateInfoEXT[] clone(Arena arena, VkDirectFBSurfaceCreateInfoEXT[] src) {
        VkDirectFBSurfaceCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DIRECTFB_SURFACE_CREATE_INFO_EXT);
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

    public @enumtype(VkDirectFBSurfaceCreateFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDirectFBSurfaceCreateFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr dfb() {
        MemorySegment s = dfbRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public void dfb(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        dfbRaw(s);
    }

    public @pointer(comment="void**") MemorySegment dfbRaw() {
        return segment.get(LAYOUT$dfb, OFFSET$dfb);
    }

    public void dfbRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$dfb, OFFSET$dfb, value);
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr surface() {
        MemorySegment s = surfaceRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public void surface(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        surfaceRaw(s);
    }

    public @pointer(comment="void**") MemorySegment surfaceRaw() {
        return segment.get(LAYOUT$surface, OFFSET$surface);
    }

    public void surfaceRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$surface, OFFSET$surface, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("dfb"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("surface")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$dfb = PathElement.groupElement("PATH$dfb");
    public static final PathElement PATH$surface = PathElement.groupElement("PATH$surface");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$dfb = (AddressLayout) LAYOUT.select(PATH$dfb);
    public static final AddressLayout LAYOUT$surface = (AddressLayout) LAYOUT.select(PATH$surface);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$dfb = LAYOUT$dfb.byteSize();
    public static final long SIZE$surface = LAYOUT$surface.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$dfb = LAYOUT.byteOffset(PATH$dfb);
    public static final long OFFSET$surface = LAYOUT.byteOffset(PATH$surface);
}
