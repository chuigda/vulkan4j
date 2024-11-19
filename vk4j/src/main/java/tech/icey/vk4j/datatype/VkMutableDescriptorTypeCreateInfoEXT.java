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
/// typedef struct VkMutableDescriptorTypeCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t mutableDescriptorTypeListCount;
///     const VkMutableDescriptorTypeListEXT* pMutableDescriptorTypeLists;
/// } VkMutableDescriptorTypeCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkMutableDescriptorTypeCreateInfoEXT.html">VkMutableDescriptorTypeCreateInfoEXT</a>
public record VkMutableDescriptorTypeCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkMutableDescriptorTypeCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT);
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

    public @unsigned int mutableDescriptorTypeListCount() {
        return segment.get(LAYOUT$mutableDescriptorTypeListCount, OFFSET$mutableDescriptorTypeListCount);
    }

    public void mutableDescriptorTypeListCount(@unsigned int value) {
        segment.set(LAYOUT$mutableDescriptorTypeListCount, OFFSET$mutableDescriptorTypeListCount, value);
    }

    public @pointer(comment="VkMutableDescriptorTypeListEXT*") MemorySegment pMutableDescriptorTypeListsRaw() {
        return segment.get(LAYOUT$pMutableDescriptorTypeLists, OFFSET$pMutableDescriptorTypeLists);
    }

    public void pMutableDescriptorTypeListsRaw(@pointer(comment="VkMutableDescriptorTypeListEXT*") MemorySegment value) {
        segment.set(LAYOUT$pMutableDescriptorTypeLists, OFFSET$pMutableDescriptorTypeLists, value);
    }

    public @Nullable VkMutableDescriptorTypeListEXT pMutableDescriptorTypeLists() {
        MemorySegment s = pMutableDescriptorTypeListsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkMutableDescriptorTypeListEXT(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkMutableDescriptorTypeListEXT[] pMutableDescriptorTypeLists(int assumedCount) {
        MemorySegment s = pMutableDescriptorTypeListsRaw().reinterpret(assumedCount * VkMutableDescriptorTypeListEXT.SIZE);
        VkMutableDescriptorTypeListEXT[] arr = new VkMutableDescriptorTypeListEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkMutableDescriptorTypeListEXT(s.asSlice(i * VkMutableDescriptorTypeListEXT.SIZE, VkMutableDescriptorTypeListEXT.SIZE));
        }
        return arr;
    }

    public void pMutableDescriptorTypeLists(@Nullable VkMutableDescriptorTypeListEXT value) {
        pMutableDescriptorTypeListsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkMutableDescriptorTypeCreateInfoEXT allocate(Arena arena) {
        return new VkMutableDescriptorTypeCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkMutableDescriptorTypeCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMutableDescriptorTypeCreateInfoEXT[] ret = new VkMutableDescriptorTypeCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMutableDescriptorTypeCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMutableDescriptorTypeCreateInfoEXT clone(Arena arena, VkMutableDescriptorTypeCreateInfoEXT src) {
        VkMutableDescriptorTypeCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMutableDescriptorTypeCreateInfoEXT[] clone(Arena arena, VkMutableDescriptorTypeCreateInfoEXT[] src) {
        VkMutableDescriptorTypeCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mutableDescriptorTypeListCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkMutableDescriptorTypeListEXT.LAYOUT).withName("pMutableDescriptorTypeLists")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$mutableDescriptorTypeListCount = PathElement.groupElement("mutableDescriptorTypeListCount");
    public static final PathElement PATH$pMutableDescriptorTypeLists = PathElement.groupElement("pMutableDescriptorTypeLists");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$mutableDescriptorTypeListCount = (OfInt) LAYOUT.select(PATH$mutableDescriptorTypeListCount);
    public static final AddressLayout LAYOUT$pMutableDescriptorTypeLists = (AddressLayout) LAYOUT.select(PATH$pMutableDescriptorTypeLists);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mutableDescriptorTypeListCount = LAYOUT.byteOffset(PATH$mutableDescriptorTypeListCount);
    public static final long OFFSET$pMutableDescriptorTypeLists = LAYOUT.byteOffset(PATH$pMutableDescriptorTypeLists);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$mutableDescriptorTypeListCount = LAYOUT$mutableDescriptorTypeListCount.byteSize();
    public static final long SIZE$pMutableDescriptorTypeLists = LAYOUT$pMutableDescriptorTypeLists.byteSize();
}
