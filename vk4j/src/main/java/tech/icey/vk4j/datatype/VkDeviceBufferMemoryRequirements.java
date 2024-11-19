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
/// typedef struct VkDeviceBufferMemoryRequirements {
///     VkStructureType sType;
///     const void* pNext;
///     const VkBufferCreateInfo* pCreateInfo;
/// } VkDeviceBufferMemoryRequirements;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceBufferMemoryRequirements.html">VkDeviceBufferMemoryRequirements</a>
public record VkDeviceBufferMemoryRequirements(MemorySegment segment) implements IPointer {
    public VkDeviceBufferMemoryRequirements(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS);
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

    public @pointer(comment="VkBufferCreateInfo*") MemorySegment pCreateInfoRaw() {
        return segment.get(LAYOUT$pCreateInfo, OFFSET$pCreateInfo);
    }

    public void pCreateInfoRaw(@pointer(comment="VkBufferCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pCreateInfo, OFFSET$pCreateInfo, value);
    }

    public @Nullable VkBufferCreateInfo pCreateInfo() {
        MemorySegment s = pCreateInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBufferCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkBufferCreateInfo[] pCreateInfo(int assumedCount) {
        MemorySegment s = pCreateInfoRaw().reinterpret(assumedCount * VkBufferCreateInfo.SIZE);
        VkBufferCreateInfo[] arr = new VkBufferCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkBufferCreateInfo(s.asSlice(i * VkBufferCreateInfo.SIZE, VkBufferCreateInfo.SIZE));
        }
        return arr;
    }

    public void pCreateInfo(@Nullable VkBufferCreateInfo value) {
        pCreateInfoRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkDeviceBufferMemoryRequirements allocate(Arena arena) {
        return new VkDeviceBufferMemoryRequirements(arena.allocate(LAYOUT));
    }

    public static VkDeviceBufferMemoryRequirements[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceBufferMemoryRequirements[] ret = new VkDeviceBufferMemoryRequirements[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceBufferMemoryRequirements(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceBufferMemoryRequirements clone(Arena arena, VkDeviceBufferMemoryRequirements src) {
        VkDeviceBufferMemoryRequirements ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceBufferMemoryRequirements[] clone(Arena arena, VkDeviceBufferMemoryRequirements[] src) {
        VkDeviceBufferMemoryRequirements[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkBufferCreateInfo.LAYOUT).withName("pCreateInfo")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pCreateInfo = PathElement.groupElement("pCreateInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pCreateInfo = (AddressLayout) LAYOUT.select(PATH$pCreateInfo);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pCreateInfo = LAYOUT.byteOffset(PATH$pCreateInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pCreateInfo = LAYOUT$pCreateInfo.byteSize();
}
