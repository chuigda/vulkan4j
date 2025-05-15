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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.html">VkPhysicalDeviceShaderSMBuiltinsPropertiesNV</a>
@ValueBasedCandidate
public record VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$shaderSMCount = ValueLayout.JAVA_INT.withName("shaderSMCount");
    public static final OfInt LAYOUT$shaderWarpsPerSM = ValueLayout.JAVA_INT.withName("shaderWarpsPerSM");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$shaderSMCount, LAYOUT$shaderWarpsPerSM);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderSMBuiltinsPropertiesNV[] ret = new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV clone(Arena arena, VkPhysicalDeviceShaderSMBuiltinsPropertiesNV src) {
        VkPhysicalDeviceShaderSMBuiltinsPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV[] clone(Arena arena, VkPhysicalDeviceShaderSMBuiltinsPropertiesNV[] src) {
        VkPhysicalDeviceShaderSMBuiltinsPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderSMCount = PathElement.groupElement("PATH$shaderSMCount");
    public static final PathElement PATH$shaderWarpsPerSM = PathElement.groupElement("PATH$shaderWarpsPerSM");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderSMCount = LAYOUT$shaderSMCount.byteSize();
    public static final long SIZE$shaderWarpsPerSM = LAYOUT$shaderWarpsPerSM.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderSMCount = LAYOUT.byteOffset(PATH$shaderSMCount);
    public static final long OFFSET$shaderWarpsPerSM = LAYOUT.byteOffset(PATH$shaderWarpsPerSM);

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

    public @unsigned int shaderSMCount() {
        return segment.get(LAYOUT$shaderSMCount, OFFSET$shaderSMCount);
    }

    public void shaderSMCount(@unsigned int value) {
        segment.set(LAYOUT$shaderSMCount, OFFSET$shaderSMCount, value);
    }

    public @unsigned int shaderWarpsPerSM() {
        return segment.get(LAYOUT$shaderWarpsPerSM, OFFSET$shaderWarpsPerSM);
    }

    public void shaderWarpsPerSM(@unsigned int value) {
        segment.set(LAYOUT$shaderWarpsPerSM, OFFSET$shaderWarpsPerSM, value);
    }

}
