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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMemoryRequirementsInfoNV.html">VkAccelerationStructureMemoryRequirementsInfoNV</a>
@ValueBasedCandidate
public record VkAccelerationStructureMemoryRequirementsInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$type = ValueLayout.JAVA_INT.withName("type");
    public static final AddressLayout LAYOUT$accelerationStructure = ValueLayout.ADDRESS.withName("accelerationStructure");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$type, LAYOUT$accelerationStructure);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAccelerationStructureMemoryRequirementsInfoNV allocate(Arena arena) {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureMemoryRequirementsInfoNV[] ret = new VkAccelerationStructureMemoryRequirementsInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureMemoryRequirementsInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV clone(Arena arena, VkAccelerationStructureMemoryRequirementsInfoNV src) {
        VkAccelerationStructureMemoryRequirementsInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV[] clone(Arena arena, VkAccelerationStructureMemoryRequirementsInfoNV[] src) {
        VkAccelerationStructureMemoryRequirementsInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("PATH$accelerationStructure");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$accelerationStructure = LAYOUT$accelerationStructure.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);

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

    public @enumtype(VkAccelerationStructureMemoryRequirementsTypeNV.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkAccelerationStructureMemoryRequirementsTypeNV.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @Nullable VkAccelerationStructureNV accelerationStructure() {
        MemorySegment s = segment.asSlice(OFFSET$accelerationStructure, SIZE$accelerationStructure);
        if (s.address() == 0) {
            return null;
        }
        return new VkAccelerationStructureNV(s);
    }

    public void accelerationStructure() {
        segment.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value != null ? value.segment() : MemorySegment.NULL);
    }

}
