package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineCompilerControlCreateInfoAMD.html">VkPipelineCompilerControlCreateInfoAMD</a>
public record VkPipelineCompilerControlCreateInfoAMD(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("compilerControlFlags")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$compilerControlFlags = PathElement.groupElement("compilerControlFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$compilerControlFlags = (OfInt) LAYOUT.select(PATH$compilerControlFlags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$compilerControlFlags = LAYOUT.byteOffset(PATH$compilerControlFlags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$compilerControlFlags = LAYOUT$compilerControlFlags.byteSize();

    public VkPipelineCompilerControlCreateInfoAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkPipelineCompilerControlFlagsAMD.class) int compilerControlFlags() {
        return segment.get(LAYOUT$compilerControlFlags, OFFSET$compilerControlFlags);
    }

    public void compilerControlFlags(@enumtype(VkPipelineCompilerControlFlagsAMD.class) int value) {
        segment.set(LAYOUT$compilerControlFlags, OFFSET$compilerControlFlags, value);
    }

    public static VkPipelineCompilerControlCreateInfoAMD allocate(Arena arena) {
        return new VkPipelineCompilerControlCreateInfoAMD(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineCompilerControlCreateInfoAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCompilerControlCreateInfoAMD[] ret = new VkPipelineCompilerControlCreateInfoAMD[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineCompilerControlCreateInfoAMD(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
