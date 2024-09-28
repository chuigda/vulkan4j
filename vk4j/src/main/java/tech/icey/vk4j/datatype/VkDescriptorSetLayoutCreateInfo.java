package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkDescriptorSetLayoutCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorSetLayoutCreateFlags flags;
///     uint32_t bindingCount;
///     const VkDescriptorSetLayoutBinding* pBindings;
/// } VkDescriptorSetLayoutCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDescriptorSetLayoutCreateInfo.html">VkDescriptorSetLayoutCreateInfo</a>
public record VkDescriptorSetLayoutCreateInfo(MemorySegment segment) implements IPointer {
    public VkDescriptorSetLayoutCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkDescriptorSetLayoutCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDescriptorSetLayoutCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int bindingCount() {
        return segment.get(LAYOUT$bindingCount, OFFSET$bindingCount);
    }

    public void bindingCount(@unsigned int value) {
        segment.set(LAYOUT$bindingCount, OFFSET$bindingCount, value);
    }

    public @pointer(comment="VkDescriptorSetLayoutBinding*") MemorySegment pBindingsRaw() {
        return segment.get(LAYOUT$pBindings, OFFSET$pBindings);
    }

    public void pBindingsRaw(@pointer(comment="VkDescriptorSetLayoutBinding*") MemorySegment value) {
        segment.set(LAYOUT$pBindings, OFFSET$pBindings, value);
    }

    public @nullable VkDescriptorSetLayoutBinding pBindings() {
        MemorySegment s = pBindingsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorSetLayoutBinding(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkDescriptorSetLayoutBinding[] pBindings(int assumedCount) {
        MemorySegment s = pBindingsRaw().reinterpret(assumedCount * VkDescriptorSetLayoutBinding.SIZE);
        VkDescriptorSetLayoutBinding[] arr = new VkDescriptorSetLayoutBinding[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDescriptorSetLayoutBinding(s.asSlice(i * VkDescriptorSetLayoutBinding.SIZE, VkDescriptorSetLayoutBinding.SIZE));
        }
        return arr;
    }

    public void pBindings(@nullable VkDescriptorSetLayoutBinding value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBindingsRaw(s);
    }

    public static VkDescriptorSetLayoutCreateInfo allocate(Arena arena) {
        return new VkDescriptorSetLayoutCreateInfo(arena.allocate(LAYOUT));
    }
    
    public static VkDescriptorSetLayoutCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetLayoutCreateInfo[] ret = new VkDescriptorSetLayoutCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDescriptorSetLayoutCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("bindingCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetLayoutBinding.LAYOUT).withName("pBindings")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$bindingCount = PathElement.groupElement("bindingCount");
    public static final PathElement PATH$pBindings = PathElement.groupElement("pBindings");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$bindingCount = (OfInt) LAYOUT.select(PATH$bindingCount);
    public static final AddressLayout LAYOUT$pBindings = (AddressLayout) LAYOUT.select(PATH$pBindings);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$bindingCount = LAYOUT.byteOffset(PATH$bindingCount);
    public static final long OFFSET$pBindings = LAYOUT.byteOffset(PATH$pBindings);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$bindingCount = LAYOUT$bindingCount.byteSize();
    public static final long SIZE$pBindings = LAYOUT$pBindings.byteSize();

}
