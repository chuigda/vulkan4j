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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineExecutablePropertiesKHR.html">VkPipelineExecutablePropertiesKHR</a>
@ValueBasedCandidate
public record VkPipelineExecutablePropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$stages = ValueLayout.JAVA_INT.withName("stages");
    public static final OfByte LAYOUT$name = ValueLayout.JAVA_BYTE.withName("name");
    public static final OfByte LAYOUT$description = ValueLayout.JAVA_BYTE.withName("description");
    public static final OfInt LAYOUT$subgroupSize = ValueLayout.JAVA_INT.withName("subgroupSize");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$stages, LAYOUT$name, LAYOUT$description, LAYOUT$subgroupSize);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineExecutablePropertiesKHR allocate(Arena arena) {
        return new VkPipelineExecutablePropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkPipelineExecutablePropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineExecutablePropertiesKHR[] ret = new VkPipelineExecutablePropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineExecutablePropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineExecutablePropertiesKHR clone(Arena arena, VkPipelineExecutablePropertiesKHR src) {
        VkPipelineExecutablePropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineExecutablePropertiesKHR[] clone(Arena arena, VkPipelineExecutablePropertiesKHR[] src) {
        VkPipelineExecutablePropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stages = PathElement.groupElement("PATH$stages");
    public static final PathElement PATH$name = PathElement.groupElement("PATH$name");
    public static final PathElement PATH$description = PathElement.groupElement("PATH$description");
    public static final PathElement PATH$subgroupSize = PathElement.groupElement("PATH$subgroupSize");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stages = LAYOUT$stages.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$subgroupSize = LAYOUT$subgroupSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stages = LAYOUT.byteOffset(PATH$stages);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$subgroupSize = LAYOUT.byteOffset(PATH$subgroupSize);

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

    public @enumtype(VkShaderStageFlags.class) int stages() {
        return segment.get(LAYOUT$stages, OFFSET$stages);
    }

    public void stages(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$stages, OFFSET$stages, value);
    }

    public byte name() {
        return segment.get(LAYOUT$name, OFFSET$name);
    }

    public void name(byte value) {
        segment.set(LAYOUT$name, OFFSET$name, value);
    }

    public byte description() {
        return segment.get(LAYOUT$description, OFFSET$description);
    }

    public void description(byte value) {
        segment.set(LAYOUT$description, OFFSET$description, value);
    }

    public @unsigned int subgroupSize() {
        return segment.get(LAYOUT$subgroupSize, OFFSET$subgroupSize);
    }

    public void subgroupSize(@unsigned int value) {
        segment.set(LAYOUT$subgroupSize, OFFSET$subgroupSize, value);
    }

}
