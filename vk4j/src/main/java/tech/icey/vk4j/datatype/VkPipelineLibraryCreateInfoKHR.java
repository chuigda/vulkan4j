package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkPipelineLibraryCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("libraryCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pLibraries")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$libraryCount = PathElement.groupElement("libraryCount");
    public static final PathElement PATH$pLibraries = PathElement.groupElement("pLibraries");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$libraryCount = (OfInt) LAYOUT.select(PATH$libraryCount);
    public static final AddressLayout LAYOUT$pLibraries = (AddressLayout) LAYOUT.select(PATH$pLibraries);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$libraryCount = LAYOUT.byteOffset(PATH$libraryCount);
    public static final long OFFSET$pLibraries = LAYOUT.byteOffset(PATH$pLibraries);

    public VkPipelineLibraryCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR);
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

    public @unsigned int libraryCount() {
        return segment.get(LAYOUT$libraryCount, OFFSET$libraryCount);
    }

    public void libraryCount(@unsigned int value) {
        segment.set(LAYOUT$libraryCount, OFFSET$libraryCount, value);
    }

    public @pointer(comment="VkPipeline*") MemorySegment pLibrariesRaw() {
        return segment.get(LAYOUT$pLibraries, OFFSET$pLibraries);
    }

    public void pLibrariesRaw(@pointer(comment="VkPipeline*") MemorySegment value) {
        segment.set(LAYOUT$pLibraries, OFFSET$pLibraries, value);
    }
    
    public @nullable VkPipeline pLibraries() {
        MemorySegment s = pLibrariesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void pLibraries(@nullable VkPipeline value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLibrariesRaw(s);
    }


    public static final class Factory implements IFactory<VkPipelineLibraryCreateInfoKHR> {
        @Override
        public Class<VkPipelineLibraryCreateInfoKHR> clazz() {
            return VkPipelineLibraryCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineLibraryCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkPipelineLibraryCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineLibraryCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkPipelineLibraryCreateInfoKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
