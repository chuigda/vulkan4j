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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMeshShaderFeaturesNV.html">VkPhysicalDeviceMeshShaderFeaturesNV</a>
@ValueBasedCandidate
public record VkPhysicalDeviceMeshShaderFeaturesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$taskShader = ValueLayout.JAVA_INT.withName("taskShader");
    public static final OfInt LAYOUT$meshShader = ValueLayout.JAVA_INT.withName("meshShader");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$taskShader, LAYOUT$meshShader);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceMeshShaderFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceMeshShaderFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMeshShaderFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMeshShaderFeaturesNV[] ret = new VkPhysicalDeviceMeshShaderFeaturesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMeshShaderFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceMeshShaderFeaturesNV clone(Arena arena, VkPhysicalDeviceMeshShaderFeaturesNV src) {
        VkPhysicalDeviceMeshShaderFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMeshShaderFeaturesNV[] clone(Arena arena, VkPhysicalDeviceMeshShaderFeaturesNV[] src) {
        VkPhysicalDeviceMeshShaderFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$taskShader = PathElement.groupElement("PATH$taskShader");
    public static final PathElement PATH$meshShader = PathElement.groupElement("PATH$meshShader");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$taskShader = LAYOUT$taskShader.byteSize();
    public static final long SIZE$meshShader = LAYOUT$meshShader.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$taskShader = LAYOUT.byteOffset(PATH$taskShader);
    public static final long OFFSET$meshShader = LAYOUT.byteOffset(PATH$meshShader);

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

    public @unsigned int taskShader() {
        return segment.get(LAYOUT$taskShader, OFFSET$taskShader);
    }

    public void taskShader(@unsigned int value) {
        segment.set(LAYOUT$taskShader, OFFSET$taskShader, value);
    }

    public @unsigned int meshShader() {
        return segment.get(LAYOUT$meshShader, OFFSET$meshShader);
    }

    public void meshShader(@unsigned int value) {
        segment.set(LAYOUT$meshShader, OFFSET$meshShader, value);
    }

}
