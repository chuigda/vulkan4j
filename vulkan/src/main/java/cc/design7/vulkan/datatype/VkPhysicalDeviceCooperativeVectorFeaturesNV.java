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

public record VkPhysicalDeviceCooperativeVectorFeaturesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$cooperativeVector = ValueLayout.JAVA_INT.withName("cooperativeVector");
    public static final OfInt LAYOUT$cooperativeVectorTraining = ValueLayout.JAVA_INT.withName("cooperativeVectorTraining");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$cooperativeVector, LAYOUT$cooperativeVectorTraining);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceCooperativeVectorFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceCooperativeVectorFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCooperativeVectorFeaturesNV[] ret = new VkPhysicalDeviceCooperativeVectorFeaturesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceCooperativeVectorFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceCooperativeVectorFeaturesNV clone(Arena arena, VkPhysicalDeviceCooperativeVectorFeaturesNV src) {
        VkPhysicalDeviceCooperativeVectorFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceCooperativeVectorFeaturesNV[] clone(Arena arena, VkPhysicalDeviceCooperativeVectorFeaturesNV[] src) {
        VkPhysicalDeviceCooperativeVectorFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$cooperativeVector = PathElement.groupElement("PATH$cooperativeVector");
    public static final PathElement PATH$cooperativeVectorTraining = PathElement.groupElement("PATH$cooperativeVectorTraining");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$cooperativeVector = LAYOUT$cooperativeVector.byteSize();
    public static final long SIZE$cooperativeVectorTraining = LAYOUT$cooperativeVectorTraining.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cooperativeVector = LAYOUT.byteOffset(PATH$cooperativeVector);
    public static final long OFFSET$cooperativeVectorTraining = LAYOUT.byteOffset(PATH$cooperativeVectorTraining);

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

    public @unsigned int cooperativeVector() {
        return segment.get(LAYOUT$cooperativeVector, OFFSET$cooperativeVector);
    }

    public void cooperativeVector(@unsigned int value) {
        segment.set(LAYOUT$cooperativeVector, OFFSET$cooperativeVector, value);
    }

    public @unsigned int cooperativeVectorTraining() {
        return segment.get(LAYOUT$cooperativeVectorTraining, OFFSET$cooperativeVectorTraining);
    }

    public void cooperativeVectorTraining(@unsigned int value) {
        segment.set(LAYOUT$cooperativeVectorTraining, OFFSET$cooperativeVectorTraining, value);
    }

}
/// dummy, not implemented yet
