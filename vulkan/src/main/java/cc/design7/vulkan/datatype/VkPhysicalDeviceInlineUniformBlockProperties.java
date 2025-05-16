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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceInlineUniformBlockProperties.html"><code>VkPhysicalDeviceInlineUniformBlockProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceInlineUniformBlockProperties {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint32_t maxInlineUniformBlockSize;
///     uint32_t maxPerStageDescriptorInlineUniformBlocks;
///     uint32_t maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
///     uint32_t maxDescriptorSetInlineUniformBlocks;
///     uint32_t maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
/// } VkPhysicalDeviceInlineUniformBlockProperties;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES`
///
/// The {@link VkPhysicalDeviceInlineUniformBlockProperties#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceInlineUniformBlockProperties#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceInlineUniformBlockProperties.html"><code>VkPhysicalDeviceInlineUniformBlockProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceInlineUniformBlockProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceInlineUniformBlockProperties allocate(Arena arena) {
        VkPhysicalDeviceInlineUniformBlockProperties ret = new VkPhysicalDeviceInlineUniformBlockProperties(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES);
        return ret;
    }

    public static VkPhysicalDeviceInlineUniformBlockProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceInlineUniformBlockProperties[] ret = new VkPhysicalDeviceInlineUniformBlockProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceInlineUniformBlockProperties(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES);
        }
        return ret;
    }

    public static VkPhysicalDeviceInlineUniformBlockProperties clone(Arena arena, VkPhysicalDeviceInlineUniformBlockProperties src) {
        VkPhysicalDeviceInlineUniformBlockProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceInlineUniformBlockProperties[] clone(Arena arena, VkPhysicalDeviceInlineUniformBlockProperties[] src) {
        VkPhysicalDeviceInlineUniformBlockProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES);
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

    public @unsigned int maxInlineUniformBlockSize() {
        return segment.get(LAYOUT$maxInlineUniformBlockSize, OFFSET$maxInlineUniformBlockSize);
    }

    public void maxInlineUniformBlockSize(@unsigned int value) {
        segment.set(LAYOUT$maxInlineUniformBlockSize, OFFSET$maxInlineUniformBlockSize, value);
    }

    public @unsigned int maxPerStageDescriptorInlineUniformBlocks() {
        return segment.get(LAYOUT$maxPerStageDescriptorInlineUniformBlocks, OFFSET$maxPerStageDescriptorInlineUniformBlocks);
    }

    public void maxPerStageDescriptorInlineUniformBlocks(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorInlineUniformBlocks, OFFSET$maxPerStageDescriptorInlineUniformBlocks, value);
    }

    public @unsigned int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() {
        return segment.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);
    }

    public void maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, value);
    }

    public @unsigned int maxDescriptorSetInlineUniformBlocks() {
        return segment.get(LAYOUT$maxDescriptorSetInlineUniformBlocks, OFFSET$maxDescriptorSetInlineUniformBlocks);
    }

    public void maxDescriptorSetInlineUniformBlocks(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetInlineUniformBlocks, OFFSET$maxDescriptorSetInlineUniformBlocks, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks);
    }

    public void maxDescriptorSetUpdateAfterBindInlineUniformBlocks(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformBlockSize"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInlineUniformBlocks")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxInlineUniformBlockSize = PathElement.groupElement("PATH$maxInlineUniformBlockSize");
    public static final PathElement PATH$maxPerStageDescriptorInlineUniformBlocks = PathElement.groupElement("PATH$maxPerStageDescriptorInlineUniformBlocks");
    public static final PathElement PATH$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = PathElement.groupElement("PATH$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks");
    public static final PathElement PATH$maxDescriptorSetInlineUniformBlocks = PathElement.groupElement("PATH$maxDescriptorSetInlineUniformBlocks");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindInlineUniformBlocks = PathElement.groupElement("PATH$maxDescriptorSetUpdateAfterBindInlineUniformBlocks");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxInlineUniformBlockSize = (OfInt) LAYOUT.select(PATH$maxInlineUniformBlockSize);
    public static final OfInt LAYOUT$maxPerStageDescriptorInlineUniformBlocks = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorInlineUniformBlocks);
    public static final OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);
    public static final OfInt LAYOUT$maxDescriptorSetInlineUniformBlocks = (OfInt) LAYOUT.select(PATH$maxDescriptorSetInlineUniformBlocks);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindInlineUniformBlocks);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxInlineUniformBlockSize = LAYOUT$maxInlineUniformBlockSize.byteSize();
    public static final long SIZE$maxPerStageDescriptorInlineUniformBlocks = LAYOUT$maxPerStageDescriptorInlineUniformBlocks.byteSize();
    public static final long SIZE$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.byteSize();
    public static final long SIZE$maxDescriptorSetInlineUniformBlocks = LAYOUT$maxDescriptorSetInlineUniformBlocks.byteSize();
    public static final long SIZE$maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxInlineUniformBlockSize = LAYOUT.byteOffset(PATH$maxInlineUniformBlockSize);
    public static final long OFFSET$maxPerStageDescriptorInlineUniformBlocks = LAYOUT.byteOffset(PATH$maxPerStageDescriptorInlineUniformBlocks);
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.byteOffset(PATH$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);
    public static final long OFFSET$maxDescriptorSetInlineUniformBlocks = LAYOUT.byteOffset(PATH$maxDescriptorSetInlineUniformBlocks);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindInlineUniformBlocks);
}
