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

public record VkPipelineLibraryCreateInfoKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("libraryCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pLibraries")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$libraryCount = LAYOUT$libraryCount.byteSize();
    public static final long SIZE$pLibraries = LAYOUT$pLibraries.byteSize();

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int libraryCount() {
        return segment.get(LAYOUT$libraryCount, OFFSET$libraryCount);
    }

    public void libraryCount(@unsigned int value) {
        segment.set(LAYOUT$libraryCount, OFFSET$libraryCount, value);
    }

    public @pointer(comment="VkPipeline") MemorySegment pLibrariesRaw() {
        return segment.get(LAYOUT$pLibraries, OFFSET$pLibraries);
    }

    public void pLibrariesRaw(@pointer(comment="VkPipeline") MemorySegment value) {
        segment.set(LAYOUT$pLibraries, OFFSET$pLibraries, value);
    }

    /// Note: the returned {@link VkPipeline.Buffer} does not have correct
    /// {@link VkPipeline.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkPipeline.Buffer#reinterpret} to set the size before actually
    /// {@link VkPipeline.Buffer#read}ing or {@link VkPipeline.Buffer#write}ing
    /// the buffer.
    public @nullable VkPipeline.Buffer pLibraries() {
        MemorySegment s = pLibrariesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipeline.Buffer(s);
    }

    public void pLibraries(@nullable VkPipeline.Buffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLibrariesRaw(s);
    }

    public static VkPipelineLibraryCreateInfoKHR allocate(Arena arena) {
        return new VkPipelineLibraryCreateInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineLibraryCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineLibraryCreateInfoKHR[] ret = new VkPipelineLibraryCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineLibraryCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
