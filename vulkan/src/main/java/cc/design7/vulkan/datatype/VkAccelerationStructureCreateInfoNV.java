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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureCreateInfoNV.html">VkAccelerationStructureCreateInfoNV</a>
@ValueBasedCandidate
public record VkAccelerationStructureCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$compactedSize = ValueLayout.JAVA_LONG.withName("compactedSize");
    public static final StructLayout LAYOUT$info = VkAccelerationStructureInfoNV.LAYOUT.withName("info");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$compactedSize, LAYOUT$info);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAccelerationStructureCreateInfoNV allocate(Arena arena) {
        return new VkAccelerationStructureCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureCreateInfoNV[] ret = new VkAccelerationStructureCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureCreateInfoNV clone(Arena arena, VkAccelerationStructureCreateInfoNV src) {
        VkAccelerationStructureCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureCreateInfoNV[] clone(Arena arena, VkAccelerationStructureCreateInfoNV[] src) {
        VkAccelerationStructureCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$compactedSize = PathElement.groupElement("PATH$compactedSize");
    public static final PathElement PATH$info = PathElement.groupElement("PATH$info");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$compactedSize = LAYOUT$compactedSize.byteSize();
    public static final long SIZE$info = LAYOUT$info.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$compactedSize = LAYOUT.byteOffset(PATH$compactedSize);
    public static final long OFFSET$info = LAYOUT.byteOffset(PATH$info);

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

    public @unsigned long compactedSize() {
        return segment.get(LAYOUT$compactedSize, OFFSET$compactedSize);
    }

    public void compactedSize(@unsigned long value) {
        segment.set(LAYOUT$compactedSize, OFFSET$compactedSize, value);
    }

    public VkAccelerationStructureInfoNV info() {
        return new VkAccelerationStructureInfoNV(segment.asSlice(OFFSET$info, LAYOUT$info));
    }

    public void info(VkAccelerationStructureInfoNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$info, SIZE$info);
    }

}
