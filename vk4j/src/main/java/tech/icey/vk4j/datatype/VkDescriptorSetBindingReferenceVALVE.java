package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkDescriptorSetBindingReferenceVALVE {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorSetLayout descriptorSetLayout;
///     uint32_t binding;
/// } VkDescriptorSetBindingReferenceVALVE;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDescriptorSetBindingReferenceVALVE.html">VkDescriptorSetBindingReferenceVALVE</a>
public record VkDescriptorSetBindingReferenceVALVE(MemorySegment segment) implements IPointer {
    public VkDescriptorSetBindingReferenceVALVE(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @nullable VkDescriptorSetLayout descriptorSetLayout() {
        MemorySegment s = segment.get(LAYOUT$descriptorSetLayout, OFFSET$descriptorSetLayout);
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorSetLayout(s);
    }

    public void descriptorSetLayout(@nullable VkDescriptorSetLayout value) {
        segment.set(
            LAYOUT$descriptorSetLayout,
            OFFSET$descriptorSetLayout,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }

    public static VkDescriptorSetBindingReferenceVALVE allocate(Arena arena) {
        return new VkDescriptorSetBindingReferenceVALVE(arena.allocate(LAYOUT));
    }

    public static VkDescriptorSetBindingReferenceVALVE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetBindingReferenceVALVE[] ret = new VkDescriptorSetBindingReferenceVALVE[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDescriptorSetBindingReferenceVALVE(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorSetBindingReferenceVALVE clone(Arena arena, VkDescriptorSetBindingReferenceVALVE src) {
        VkDescriptorSetBindingReferenceVALVE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorSetBindingReferenceVALVE[] clone(Arena arena, VkDescriptorSetBindingReferenceVALVE[] src) {
        VkDescriptorSetBindingReferenceVALVE[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("descriptorSetLayout"),
        ValueLayout.JAVA_INT.withName("binding")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorSetLayout = PathElement.groupElement("descriptorSetLayout");
    public static final PathElement PATH$binding = PathElement.groupElement("binding");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$descriptorSetLayout = (AddressLayout) LAYOUT.select(PATH$descriptorSetLayout);
    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorSetLayout = LAYOUT.byteOffset(PATH$descriptorSetLayout);
    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorSetLayout = LAYOUT$descriptorSetLayout.byteSize();
    public static final long SIZE$binding = LAYOUT$binding.byteSize();
}
