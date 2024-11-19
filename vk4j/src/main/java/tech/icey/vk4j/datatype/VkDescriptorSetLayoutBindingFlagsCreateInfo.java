package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
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
/// typedef struct VkDescriptorSetLayoutBindingFlagsCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t bindingCount;
///     const VkDescriptorBindingFlags* pBindingFlags;
/// } VkDescriptorSetLayoutBindingFlagsCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDescriptorSetLayoutBindingFlagsCreateInfo.html">VkDescriptorSetLayoutBindingFlagsCreateInfo</a>
public record VkDescriptorSetLayoutBindingFlagsCreateInfo(MemorySegment segment) implements IPointer {
    public VkDescriptorSetLayoutBindingFlagsCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int bindingCount() {
        return segment.get(LAYOUT$bindingCount, OFFSET$bindingCount);
    }

    public void bindingCount(@unsigned int value) {
        segment.set(LAYOUT$bindingCount, OFFSET$bindingCount, value);
    }

    public @pointer(target=VkDescriptorBindingFlags.class) MemorySegment pBindingFlagsRaw() {
        return segment.get(LAYOUT$pBindingFlags, OFFSET$pBindingFlags);
    }

    public void pBindingFlagsRaw(@pointer(target=VkDescriptorBindingFlags.class) MemorySegment value) {
        segment.set(LAYOUT$pBindingFlags, OFFSET$pBindingFlags, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @Nullable @enumtype(VkDescriptorBindingFlags.class) IntBuffer pBindingFlags() {
        MemorySegment s = pBindingFlagsRaw();
        if (s.address() == 0) {
            return null;
        }

        return new IntBuffer(s);
    }

    public void pBindingFlags(@Nullable @enumtype(VkDescriptorBindingFlags.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBindingFlagsRaw(s);
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo allocate(Arena arena) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetLayoutBindingFlagsCreateInfo[] ret = new VkDescriptorSetLayoutBindingFlagsCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDescriptorSetLayoutBindingFlagsCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo clone(Arena arena, VkDescriptorSetLayoutBindingFlagsCreateInfo src) {
        VkDescriptorSetLayoutBindingFlagsCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo[] clone(Arena arena, VkDescriptorSetLayoutBindingFlagsCreateInfo[] src) {
        VkDescriptorSetLayoutBindingFlagsCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bindingCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pBindingFlags")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$bindingCount = PathElement.groupElement("bindingCount");
    public static final PathElement PATH$pBindingFlags = PathElement.groupElement("pBindingFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$bindingCount = (OfInt) LAYOUT.select(PATH$bindingCount);
    public static final AddressLayout LAYOUT$pBindingFlags = (AddressLayout) LAYOUT.select(PATH$pBindingFlags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$bindingCount = LAYOUT.byteOffset(PATH$bindingCount);
    public static final long OFFSET$pBindingFlags = LAYOUT.byteOffset(PATH$pBindingFlags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$bindingCount = LAYOUT$bindingCount.byteSize();
    public static final long SIZE$pBindingFlags = LAYOUT$pBindingFlags.byteSize();
}
