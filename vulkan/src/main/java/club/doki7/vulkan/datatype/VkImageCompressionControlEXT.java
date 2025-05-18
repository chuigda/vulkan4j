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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageCompressionControlEXT.html"><code>VkImageCompressionControlEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageCompressionControlEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkImageCompressionFlagsEXT flags; // @link substring="VkImageCompressionFlagsEXT" target="VkImageCompressionFlagsEXT" @link substring="flags" target="#flags"
///     uint32_t compressionControlPlaneCount; // optional // @link substring="compressionControlPlaneCount" target="#compressionControlPlaneCount"
///     VkImageCompressionFixedRateFlagsEXT* pFixedRateFlags; // @link substring="VkImageCompressionFixedRateFlagsEXT" target="VkImageCompressionFixedRateFlagsEXT" @link substring="pFixedRateFlags" target="#pFixedRateFlags"
/// } VkImageCompressionControlEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT`
///
/// The {@link VkImageCompressionControlEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkImageCompressionControlEXT#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageCompressionControlEXT.html"><code>VkImageCompressionControlEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageCompressionControlEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkImageCompressionControlEXT allocate(Arena arena) {
        VkImageCompressionControlEXT ret = new VkImageCompressionControlEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMAGE_COMPRESSION_CONTROL_EXT);
        return ret;
    }

    public static VkImageCompressionControlEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageCompressionControlEXT[] ret = new VkImageCompressionControlEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageCompressionControlEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.IMAGE_COMPRESSION_CONTROL_EXT);
        }
        return ret;
    }

    public static VkImageCompressionControlEXT clone(Arena arena, VkImageCompressionControlEXT src) {
        VkImageCompressionControlEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageCompressionControlEXT[] clone(Arena arena, VkImageCompressionControlEXT[] src) {
        VkImageCompressionControlEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMAGE_COMPRESSION_CONTROL_EXT);
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

    public @enumtype(VkImageCompressionFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImageCompressionFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int compressionControlPlaneCount() {
        return segment.get(LAYOUT$compressionControlPlaneCount, OFFSET$compressionControlPlaneCount);
    }

    public void compressionControlPlaneCount(@unsigned int value) {
        segment.set(LAYOUT$compressionControlPlaneCount, OFFSET$compressionControlPlaneCount, value);
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkImageCompressionFixedRateFlagsEXT.class) IntPtr pFixedRateFlags() {
        MemorySegment s = pFixedRateFlagsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pFixedRateFlags(@Nullable @enumtype(VkImageCompressionFixedRateFlagsEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFixedRateFlagsRaw(s);
    }

    public @pointer(target=VkImageCompressionFixedRateFlagsEXT.class) MemorySegment pFixedRateFlagsRaw() {
        return segment.get(LAYOUT$pFixedRateFlags, OFFSET$pFixedRateFlags);
    }

    public void pFixedRateFlagsRaw(@pointer(target=VkImageCompressionFixedRateFlagsEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pFixedRateFlags, OFFSET$pFixedRateFlags, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("compressionControlPlaneCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pFixedRateFlags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$compressionControlPlaneCount = PathElement.groupElement("PATH$compressionControlPlaneCount");
    public static final PathElement PATH$pFixedRateFlags = PathElement.groupElement("PATH$pFixedRateFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$compressionControlPlaneCount = (OfInt) LAYOUT.select(PATH$compressionControlPlaneCount);
    public static final AddressLayout LAYOUT$pFixedRateFlags = (AddressLayout) LAYOUT.select(PATH$pFixedRateFlags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$compressionControlPlaneCount = LAYOUT$compressionControlPlaneCount.byteSize();
    public static final long SIZE$pFixedRateFlags = LAYOUT$pFixedRateFlags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$compressionControlPlaneCount = LAYOUT.byteOffset(PATH$compressionControlPlaneCount);
    public static final long OFFSET$pFixedRateFlags = LAYOUT.byteOffset(PATH$pFixedRateFlags);
}
