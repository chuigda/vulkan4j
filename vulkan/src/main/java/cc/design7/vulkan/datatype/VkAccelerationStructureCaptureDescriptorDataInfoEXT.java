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

public record VkAccelerationStructureCaptureDescriptorDataInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$accelerationStructure = ValueLayout.ADDRESS.withName("accelerationStructure");
    public static final AddressLayout LAYOUT$accelerationStructureNV = ValueLayout.ADDRESS.withName("accelerationStructureNV");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$accelerationStructure, LAYOUT$accelerationStructureNV);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT allocate(Arena arena) {
        return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureCaptureDescriptorDataInfoEXT[] ret = new VkAccelerationStructureCaptureDescriptorDataInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT clone(Arena arena, VkAccelerationStructureCaptureDescriptorDataInfoEXT src) {
        VkAccelerationStructureCaptureDescriptorDataInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT[] clone(Arena arena, VkAccelerationStructureCaptureDescriptorDataInfoEXT[] src) {
        VkAccelerationStructureCaptureDescriptorDataInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("PATH$accelerationStructure");
    public static final PathElement PATH$accelerationStructureNV = PathElement.groupElement("PATH$accelerationStructureNV");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$accelerationStructure = LAYOUT$accelerationStructure.byteSize();
    public static final long SIZE$accelerationStructureNV = LAYOUT$accelerationStructureNV.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);
    public static final long OFFSET$accelerationStructureNV = LAYOUT.byteOffset(PATH$accelerationStructureNV);

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

    public @Nullable VkAccelerationStructureKHR accelerationStructure() {
        MemorySegment s = segment.asSlice(OFFSET$accelerationStructure, SIZE$accelerationStructure);
        if (s.address() == 0) {
            return null;
        }
        return new VkAccelerationStructureKHR(s);
    }

    public void accelerationStructure() {
        segment.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkAccelerationStructureNV accelerationStructureNV() {
        MemorySegment s = segment.asSlice(OFFSET$accelerationStructureNV, SIZE$accelerationStructureNV);
        if (s.address() == 0) {
            return null;
        }
        return new VkAccelerationStructureNV(s);
    }

    public void accelerationStructureNV() {
        segment.set(LAYOUT$accelerationStructureNV, OFFSET$accelerationStructureNV, value != null ? value.segment() : MemorySegment.NULL);
    }

}
/// dummy, not implemented yet
