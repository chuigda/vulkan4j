package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPipelineCompilerControlCreateInfoAMD(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("compilerControlFlags")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$compilerControlFlags = PathElement.groupElement("compilerControlFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$compilerControlFlags = (OfInt) LAYOUT.select(PATH$compilerControlFlags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$compilerControlFlags = LAYOUT.byteOffset(PATH$compilerControlFlags);

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

    public @enumtype(VkPipelineCompilerControlFlagsAMD.class) int compilerControlFlags() {
        return segment.get(LAYOUT$compilerControlFlags, OFFSET$compilerControlFlags);
    }

    public void compilerControlFlags(@enumtype(VkPipelineCompilerControlFlagsAMD.class) int value) {
        segment.set(LAYOUT$compilerControlFlags, OFFSET$compilerControlFlags, value);
    }


    public static final class Factory implements IFactory<VkPipelineCompilerControlCreateInfoAMD> {
        @Override
        public Class<VkPipelineCompilerControlCreateInfoAMD> clazz() {
            return VkPipelineCompilerControlCreateInfoAMD.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineCompilerControlCreateInfoAMD.LAYOUT;
        }

        @Override
        public VkPipelineCompilerControlCreateInfoAMD create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineCompilerControlCreateInfoAMD createUninit(MemorySegment segment) {
            return new VkPipelineCompilerControlCreateInfoAMD(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
