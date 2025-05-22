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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBlitImageCubicWeightsInfoQCOM.html"><code>VkBlitImageCubicWeightsInfoQCOM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBlitImageCubicWeightsInfoQCOM {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkCubicFilterWeightsQCOM cubicWeights; // @link substring="VkCubicFilterWeightsQCOM" target="VkCubicFilterWeightsQCOM" @link substring="cubicWeights" target="#cubicWeights"
/// } VkBlitImageCubicWeightsInfoQCOM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM`
///
/// The {@code allocate} ({@link VkBlitImageCubicWeightsInfoQCOM#allocate(Arena)}, {@link VkBlitImageCubicWeightsInfoQCOM#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkBlitImageCubicWeightsInfoQCOM#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBlitImageCubicWeightsInfoQCOM.html"><code>VkBlitImageCubicWeightsInfoQCOM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBlitImageCubicWeightsInfoQCOM(@NotNull MemorySegment segment) implements IVkBlitImageCubicWeightsInfoQCOM {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBlitImageCubicWeightsInfoQCOM.html"><code>VkBlitImageCubicWeightsInfoQCOM</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkBlitImageCubicWeightsInfoQCOM}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkBlitImageCubicWeightsInfoQCOM to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkBlitImageCubicWeightsInfoQCOM.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkBlitImageCubicWeightsInfoQCOM {
        public long size() {
            return segment.byteSize() / VkBlitImageCubicWeightsInfoQCOM.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkBlitImageCubicWeightsInfoQCOM at(long index) {
            return new VkBlitImageCubicWeightsInfoQCOM(segment.asSlice(index * VkBlitImageCubicWeightsInfoQCOM.BYTES, VkBlitImageCubicWeightsInfoQCOM.BYTES));
        }
        public void write(long index, @NotNull VkBlitImageCubicWeightsInfoQCOM value) {
            MemorySegment s = segment.asSlice(index * VkBlitImageCubicWeightsInfoQCOM.BYTES, VkBlitImageCubicWeightsInfoQCOM.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkBlitImageCubicWeightsInfoQCOM allocate(Arena arena) {
        VkBlitImageCubicWeightsInfoQCOM ret = new VkBlitImageCubicWeightsInfoQCOM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM);
        return ret;
    }

    public static VkBlitImageCubicWeightsInfoQCOM.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBlitImageCubicWeightsInfoQCOM.Ptr ret = new VkBlitImageCubicWeightsInfoQCOM.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM);
        }
        return ret;
    }

    public static VkBlitImageCubicWeightsInfoQCOM clone(Arena arena, VkBlitImageCubicWeightsInfoQCOM src) {
        VkBlitImageCubicWeightsInfoQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM);
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

    public @enumtype(VkCubicFilterWeightsQCOM.class) int cubicWeights() {
        return segment.get(LAYOUT$cubicWeights, OFFSET$cubicWeights);
    }

    public void cubicWeights(@enumtype(VkCubicFilterWeightsQCOM.class) int value) {
        segment.set(LAYOUT$cubicWeights, OFFSET$cubicWeights, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cubicWeights")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$cubicWeights = PathElement.groupElement("cubicWeights");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$cubicWeights = (OfInt) LAYOUT.select(PATH$cubicWeights);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$cubicWeights = LAYOUT$cubicWeights.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cubicWeights = LAYOUT.byteOffset(PATH$cubicWeights);
}
