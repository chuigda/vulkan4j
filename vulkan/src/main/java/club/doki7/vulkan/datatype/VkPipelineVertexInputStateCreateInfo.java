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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineVertexInputStateCreateInfo.html"><code>VkPipelineVertexInputStateCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineVertexInputStateCreateInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipelineVertexInputStateCreateFlags flags; // optional // @link substring="VkPipelineVertexInputStateCreateFlags" target="VkPipelineVertexInputStateCreateFlags" @link substring="flags" target="#flags"
///     uint32_t vertexBindingDescriptionCount; // optional // @link substring="vertexBindingDescriptionCount" target="#vertexBindingDescriptionCount"
///     VkVertexInputBindingDescription const* pVertexBindingDescriptions; // @link substring="VkVertexInputBindingDescription" target="VkVertexInputBindingDescription" @link substring="pVertexBindingDescriptions" target="#pVertexBindingDescriptions"
///     uint32_t vertexAttributeDescriptionCount; // optional // @link substring="vertexAttributeDescriptionCount" target="#vertexAttributeDescriptionCount"
///     VkVertexInputAttributeDescription const* pVertexAttributeDescriptions; // @link substring="VkVertexInputAttributeDescription" target="VkVertexInputAttributeDescription" @link substring="pVertexAttributeDescriptions" target="#pVertexAttributeDescriptions"
/// } VkPipelineVertexInputStateCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO`
///
/// The {@code allocate} ({@link VkPipelineVertexInputStateCreateInfo#allocate(Arena)}, {@link VkPipelineVertexInputStateCreateInfo#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineVertexInputStateCreateInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineVertexInputStateCreateInfo.html"><code>VkPipelineVertexInputStateCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineVertexInputStateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineVertexInputStateCreateInfo allocate(Arena arena) {
        VkPipelineVertexInputStateCreateInfo ret = new VkPipelineVertexInputStateCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO);
        return ret;
    }

    public static VkPipelineVertexInputStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineVertexInputStateCreateInfo[] ret = new VkPipelineVertexInputStateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineVertexInputStateCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO);
        }
        return ret;
    }

    public static VkPipelineVertexInputStateCreateInfo clone(Arena arena, VkPipelineVertexInputStateCreateInfo src) {
        VkPipelineVertexInputStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineVertexInputStateCreateInfo[] clone(Arena arena, VkPipelineVertexInputStateCreateInfo[] src) {
        VkPipelineVertexInputStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO);
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

    public @enumtype(VkPipelineVertexInputStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineVertexInputStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int vertexBindingDescriptionCount() {
        return segment.get(LAYOUT$vertexBindingDescriptionCount, OFFSET$vertexBindingDescriptionCount);
    }

    public void vertexBindingDescriptionCount(@unsigned int value) {
        segment.set(LAYOUT$vertexBindingDescriptionCount, OFFSET$vertexBindingDescriptionCount, value);
    }

    public @Nullable VkVertexInputBindingDescription pVertexBindingDescriptions() {
        MemorySegment s = pVertexBindingDescriptionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkVertexInputBindingDescription(s);
    }

    public void pVertexBindingDescriptions(@Nullable VkVertexInputBindingDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVertexBindingDescriptionsRaw(s);
    }

    @unsafe public @Nullable VkVertexInputBindingDescription[] pVertexBindingDescriptions(int assumedCount) {
        MemorySegment s = pVertexBindingDescriptionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVertexInputBindingDescription.BYTES);
        VkVertexInputBindingDescription[] ret = new VkVertexInputBindingDescription[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVertexInputBindingDescription(s.asSlice(i * VkVertexInputBindingDescription.BYTES, VkVertexInputBindingDescription.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkVertexInputBindingDescription.class) MemorySegment pVertexBindingDescriptionsRaw() {
        return segment.get(LAYOUT$pVertexBindingDescriptions, OFFSET$pVertexBindingDescriptions);
    }

    public void pVertexBindingDescriptionsRaw(@pointer(target=VkVertexInputBindingDescription.class) MemorySegment value) {
        segment.set(LAYOUT$pVertexBindingDescriptions, OFFSET$pVertexBindingDescriptions, value);
    }

    public @unsigned int vertexAttributeDescriptionCount() {
        return segment.get(LAYOUT$vertexAttributeDescriptionCount, OFFSET$vertexAttributeDescriptionCount);
    }

    public void vertexAttributeDescriptionCount(@unsigned int value) {
        segment.set(LAYOUT$vertexAttributeDescriptionCount, OFFSET$vertexAttributeDescriptionCount, value);
    }

    public @Nullable VkVertexInputAttributeDescription pVertexAttributeDescriptions() {
        MemorySegment s = pVertexAttributeDescriptionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkVertexInputAttributeDescription(s);
    }

    public void pVertexAttributeDescriptions(@Nullable VkVertexInputAttributeDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVertexAttributeDescriptionsRaw(s);
    }

    @unsafe public @Nullable VkVertexInputAttributeDescription[] pVertexAttributeDescriptions(int assumedCount) {
        MemorySegment s = pVertexAttributeDescriptionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVertexInputAttributeDescription.BYTES);
        VkVertexInputAttributeDescription[] ret = new VkVertexInputAttributeDescription[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVertexInputAttributeDescription(s.asSlice(i * VkVertexInputAttributeDescription.BYTES, VkVertexInputAttributeDescription.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkVertexInputAttributeDescription.class) MemorySegment pVertexAttributeDescriptionsRaw() {
        return segment.get(LAYOUT$pVertexAttributeDescriptions, OFFSET$pVertexAttributeDescriptions);
    }

    public void pVertexAttributeDescriptionsRaw(@pointer(target=VkVertexInputAttributeDescription.class) MemorySegment value) {
        segment.set(LAYOUT$pVertexAttributeDescriptions, OFFSET$pVertexAttributeDescriptions, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("vertexBindingDescriptionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVertexInputBindingDescription.LAYOUT).withName("pVertexBindingDescriptions"),
        ValueLayout.JAVA_INT.withName("vertexAttributeDescriptionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVertexInputAttributeDescription.LAYOUT).withName("pVertexAttributeDescriptions")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$vertexBindingDescriptionCount = PathElement.groupElement("PATH$vertexBindingDescriptionCount");
    public static final PathElement PATH$pVertexBindingDescriptions = PathElement.groupElement("PATH$pVertexBindingDescriptions");
    public static final PathElement PATH$vertexAttributeDescriptionCount = PathElement.groupElement("PATH$vertexAttributeDescriptionCount");
    public static final PathElement PATH$pVertexAttributeDescriptions = PathElement.groupElement("PATH$pVertexAttributeDescriptions");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$vertexBindingDescriptionCount = (OfInt) LAYOUT.select(PATH$vertexBindingDescriptionCount);
    public static final AddressLayout LAYOUT$pVertexBindingDescriptions = (AddressLayout) LAYOUT.select(PATH$pVertexBindingDescriptions);
    public static final OfInt LAYOUT$vertexAttributeDescriptionCount = (OfInt) LAYOUT.select(PATH$vertexAttributeDescriptionCount);
    public static final AddressLayout LAYOUT$pVertexAttributeDescriptions = (AddressLayout) LAYOUT.select(PATH$pVertexAttributeDescriptions);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$vertexBindingDescriptionCount = LAYOUT$vertexBindingDescriptionCount.byteSize();
    public static final long SIZE$pVertexBindingDescriptions = LAYOUT$pVertexBindingDescriptions.byteSize();
    public static final long SIZE$vertexAttributeDescriptionCount = LAYOUT$vertexAttributeDescriptionCount.byteSize();
    public static final long SIZE$pVertexAttributeDescriptions = LAYOUT$pVertexAttributeDescriptions.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$vertexBindingDescriptionCount = LAYOUT.byteOffset(PATH$vertexBindingDescriptionCount);
    public static final long OFFSET$pVertexBindingDescriptions = LAYOUT.byteOffset(PATH$pVertexBindingDescriptions);
    public static final long OFFSET$vertexAttributeDescriptionCount = LAYOUT.byteOffset(PATH$vertexAttributeDescriptionCount);
    public static final long OFFSET$pVertexAttributeDescriptions = LAYOUT.byteOffset(PATH$pVertexAttributeDescriptions);
}
