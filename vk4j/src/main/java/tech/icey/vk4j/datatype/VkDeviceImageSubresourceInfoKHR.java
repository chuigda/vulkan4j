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
/// typedef struct VkDeviceImageSubresourceInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const VkImageCreateInfo* pCreateInfo;
///     const VkImageSubresource2KHR* pSubresource;
/// } VkDeviceImageSubresourceInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceImageSubresourceInfoKHR.html">VkDeviceImageSubresourceInfoKHR</a>
public record VkDeviceImageSubresourceInfoKHR(MemorySegment segment) implements IPointer {
    public VkDeviceImageSubresourceInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR);
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

    public @pointer(comment="VkImageCreateInfo*") MemorySegment pCreateInfoRaw() {
        return segment.get(LAYOUT$pCreateInfo, OFFSET$pCreateInfo);
    }

    public void pCreateInfoRaw(@pointer(comment="VkImageCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pCreateInfo, OFFSET$pCreateInfo, value);
    }

    public @Nullable VkImageCreateInfo pCreateInfo() {
        MemorySegment s = pCreateInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImageCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkImageCreateInfo[] pCreateInfo(int assumedCount) {
        MemorySegment s = pCreateInfoRaw().reinterpret(assumedCount * VkImageCreateInfo.SIZE);
        VkImageCreateInfo[] arr = new VkImageCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkImageCreateInfo(s.asSlice(i * VkImageCreateInfo.SIZE, VkImageCreateInfo.SIZE));
        }
        return arr;
    }

    public void pCreateInfo(@Nullable VkImageCreateInfo value) {
        pCreateInfoRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="VkImageSubresource2KHR*") MemorySegment pSubresourceRaw() {
        return segment.get(LAYOUT$pSubresource, OFFSET$pSubresource);
    }

    public void pSubresourceRaw(@pointer(comment="VkImageSubresource2KHR*") MemorySegment value) {
        segment.set(LAYOUT$pSubresource, OFFSET$pSubresource, value);
    }

    public @Nullable VkImageSubresource2KHR pSubresource() {
        MemorySegment s = pSubresourceRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImageSubresource2KHR(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkImageSubresource2KHR[] pSubresource(int assumedCount) {
        MemorySegment s = pSubresourceRaw().reinterpret(assumedCount * VkImageSubresource2KHR.SIZE);
        VkImageSubresource2KHR[] arr = new VkImageSubresource2KHR[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkImageSubresource2KHR(s.asSlice(i * VkImageSubresource2KHR.SIZE, VkImageSubresource2KHR.SIZE));
        }
        return arr;
    }

    public void pSubresource(@Nullable VkImageSubresource2KHR value) {
        pSubresourceRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkDeviceImageSubresourceInfoKHR allocate(Arena arena) {
        return new VkDeviceImageSubresourceInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkDeviceImageSubresourceInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceImageSubresourceInfoKHR[] ret = new VkDeviceImageSubresourceInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceImageSubresourceInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceImageSubresourceInfoKHR clone(Arena arena, VkDeviceImageSubresourceInfoKHR src) {
        VkDeviceImageSubresourceInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceImageSubresourceInfoKHR[] clone(Arena arena, VkDeviceImageSubresourceInfoKHR[] src) {
        VkDeviceImageSubresourceInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkImageCreateInfo.LAYOUT).withName("pCreateInfo"),
        ValueLayout.ADDRESS.withTargetLayout(VkImageSubresource2KHR.LAYOUT).withName("pSubresource")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pCreateInfo = PathElement.groupElement("pCreateInfo");
    public static final PathElement PATH$pSubresource = PathElement.groupElement("pSubresource");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pCreateInfo = (AddressLayout) LAYOUT.select(PATH$pCreateInfo);
    public static final AddressLayout LAYOUT$pSubresource = (AddressLayout) LAYOUT.select(PATH$pSubresource);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pCreateInfo = LAYOUT.byteOffset(PATH$pCreateInfo);
    public static final long OFFSET$pSubresource = LAYOUT.byteOffset(PATH$pSubresource);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pCreateInfo = LAYOUT$pCreateInfo.byteSize();
    public static final long SIZE$pSubresource = LAYOUT$pSubresource.byteSize();
}
