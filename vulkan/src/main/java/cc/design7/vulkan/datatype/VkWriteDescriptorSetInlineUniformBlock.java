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

/// Represents a pointer to a {@code VkWriteDescriptorSetInlineUniformBlock} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWriteDescriptorSetInlineUniformBlock.html">VkWriteDescriptorSetInlineUniformBlock</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkWriteDescriptorSetInlineUniformBlock(@NotNull MemorySegment segment) implements IPointer {
    public VkWriteDescriptorSetInlineUniformBlock {
        sType(VkStructureType.WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK);
    }

    public static VkWriteDescriptorSetInlineUniformBlock allocate(Arena arena) {
        return new VkWriteDescriptorSetInlineUniformBlock(arena.allocate(LAYOUT));
    }

    public static VkWriteDescriptorSetInlineUniformBlock[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWriteDescriptorSetInlineUniformBlock[] ret = new VkWriteDescriptorSetInlineUniformBlock[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkWriteDescriptorSetInlineUniformBlock(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkWriteDescriptorSetInlineUniformBlock clone(Arena arena, VkWriteDescriptorSetInlineUniformBlock src) {
        VkWriteDescriptorSetInlineUniformBlock ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkWriteDescriptorSetInlineUniformBlock[] clone(Arena arena, VkWriteDescriptorSetInlineUniformBlock[] src) {
        VkWriteDescriptorSetInlineUniformBlock[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$dataSize = PathElement.groupElement("PATH$dataSize");
    public static final PathElement PATH$pData = PathElement.groupElement("PATH$pData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$dataSize = (OfInt) LAYOUT.select(PATH$dataSize);
    public static final AddressLayout LAYOUT$pData = (AddressLayout) LAYOUT.select(PATH$pData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$dataSize = LAYOUT$dataSize.byteSize();
    public static final long SIZE$pData = LAYOUT$pData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dataSize = LAYOUT.byteOffset(PATH$dataSize);
    public static final long OFFSET$pData = LAYOUT.byteOffset(PATH$pData);

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int dataSize() {
        return segment.get(LAYOUT$dataSize, OFFSET$dataSize);
    }

    public void dataSize(@unsigned int value) {
        segment.set(LAYOUT$dataSize, OFFSET$dataSize, value);
    }

    public @pointer(comment="void*") MemorySegment pData() {
        return segment.get(LAYOUT$pData, OFFSET$pData);
    }

    public void pData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pData, OFFSET$pData, value);
    }

    public void pData(IPointer pointer) {
        pData(pointer.segment());
    }

}
