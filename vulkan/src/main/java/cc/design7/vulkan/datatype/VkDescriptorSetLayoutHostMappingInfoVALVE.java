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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetLayoutHostMappingInfoVALVE.html">VkDescriptorSetLayoutHostMappingInfoVALVE</a>
@ValueBasedCandidate
public record VkDescriptorSetLayoutHostMappingInfoVALVE(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final ValueLayout LAYOUT$descriptorOffset = NativeLayout.C_SIZE_T.withName("descriptorOffset");
    public static final OfInt LAYOUT$descriptorSize = ValueLayout.JAVA_INT.withName("descriptorSize");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$descriptorOffset, LAYOUT$descriptorSize);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDescriptorSetLayoutHostMappingInfoVALVE allocate(Arena arena) {
        return new VkDescriptorSetLayoutHostMappingInfoVALVE(arena.allocate(LAYOUT));
    }

    public static VkDescriptorSetLayoutHostMappingInfoVALVE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetLayoutHostMappingInfoVALVE[] ret = new VkDescriptorSetLayoutHostMappingInfoVALVE[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorSetLayoutHostMappingInfoVALVE(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorSetLayoutHostMappingInfoVALVE clone(Arena arena, VkDescriptorSetLayoutHostMappingInfoVALVE src) {
        VkDescriptorSetLayoutHostMappingInfoVALVE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorSetLayoutHostMappingInfoVALVE[] clone(Arena arena, VkDescriptorSetLayoutHostMappingInfoVALVE[] src) {
        VkDescriptorSetLayoutHostMappingInfoVALVE[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$descriptorOffset = PathElement.groupElement("PATH$descriptorOffset");
    public static final PathElement PATH$descriptorSize = PathElement.groupElement("PATH$descriptorSize");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorOffset = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$descriptorSize = LAYOUT$descriptorSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorOffset = LAYOUT.byteOffset(PATH$descriptorOffset);
    public static final long OFFSET$descriptorSize = LAYOUT.byteOffset(PATH$descriptorSize);

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

    public @unsigned long descriptorOffset() {
        return NativeLayout.readCSizeT(segment, OFFSET$descriptorOffset);
    }

    public void descriptorOffset(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$descriptorOffset, value);
    }

    public @unsigned int descriptorSize() {
        return segment.get(LAYOUT$descriptorSize, OFFSET$descriptorSize);
    }

    public void descriptorSize(@unsigned int value) {
        segment.set(LAYOUT$descriptorSize, OFFSET$descriptorSize, value);
    }

}
