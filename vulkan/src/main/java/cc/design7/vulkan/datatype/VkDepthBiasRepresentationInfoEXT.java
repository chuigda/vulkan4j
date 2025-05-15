package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDepthBiasRepresentationInfoEXT.html"><code>VkDepthBiasRepresentationInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDepthBiasRepresentationInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkDepthBiasRepresentationEXT depthBiasRepresentation;
///     VkBool32 depthBiasExact;
/// } VkDepthBiasRepresentationInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT`
///
/// The {@link VkDepthBiasRepresentationInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDepthBiasRepresentationInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDepthBiasRepresentationInfoEXT.html"><code>VkDepthBiasRepresentationInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDepthBiasRepresentationInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDepthBiasRepresentationInfoEXT allocate(Arena arena) {
        VkDepthBiasRepresentationInfoEXT ret = new VkDepthBiasRepresentationInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEPTH_BIAS_REPRESENTATION_INFO_EXT);
        return ret;
    }

    public static VkDepthBiasRepresentationInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDepthBiasRepresentationInfoEXT[] ret = new VkDepthBiasRepresentationInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDepthBiasRepresentationInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEPTH_BIAS_REPRESENTATION_INFO_EXT);
        }
        return ret;
    }

    public static VkDepthBiasRepresentationInfoEXT clone(Arena arena, VkDepthBiasRepresentationInfoEXT src) {
        VkDepthBiasRepresentationInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDepthBiasRepresentationInfoEXT[] clone(Arena arena, VkDepthBiasRepresentationInfoEXT[] src) {
        VkDepthBiasRepresentationInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEPTH_BIAS_REPRESENTATION_INFO_EXT);
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

    public @enumtype(VkDepthBiasRepresentationEXT.class) int depthBiasRepresentation() {
        return segment.get(LAYOUT$depthBiasRepresentation, OFFSET$depthBiasRepresentation);
    }

    public void depthBiasRepresentation(@enumtype(VkDepthBiasRepresentationEXT.class) int value) {
        segment.set(LAYOUT$depthBiasRepresentation, OFFSET$depthBiasRepresentation, value);
    }

    public @unsigned int depthBiasExact() {
        return segment.get(LAYOUT$depthBiasExact, OFFSET$depthBiasExact);
    }

    public void depthBiasExact(@unsigned int value) {
        segment.set(LAYOUT$depthBiasExact, OFFSET$depthBiasExact, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthBiasRepresentation"),
        ValueLayout.JAVA_INT.withName("depthBiasExact")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$depthBiasRepresentation = PathElement.groupElement("PATH$depthBiasRepresentation");
    public static final PathElement PATH$depthBiasExact = PathElement.groupElement("PATH$depthBiasExact");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$depthBiasRepresentation = (OfInt) LAYOUT.select(PATH$depthBiasRepresentation);
    public static final OfInt LAYOUT$depthBiasExact = (OfInt) LAYOUT.select(PATH$depthBiasExact);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$depthBiasRepresentation = LAYOUT$depthBiasRepresentation.byteSize();
    public static final long SIZE$depthBiasExact = LAYOUT$depthBiasExact.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$depthBiasRepresentation = LAYOUT.byteOffset(PATH$depthBiasRepresentation);
    public static final long OFFSET$depthBiasExact = LAYOUT.byteOffset(PATH$depthBiasExact);
}
