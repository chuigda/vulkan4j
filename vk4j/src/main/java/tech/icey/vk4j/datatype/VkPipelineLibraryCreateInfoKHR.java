package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPipelineLibraryCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t libraryCount;
///     const VkPipeline* pLibraries;
/// } VkPipelineLibraryCreateInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineLibraryCreateInfoKHR.html">VkPipelineLibraryCreateInfoKHR</a>
public record VkPipelineLibraryCreateInfoKHR(MemorySegment segment) implements IPointer {
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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
    public @Nullable VkPipeline.Buffer pLibraries() {
        MemorySegment s = pLibrariesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipeline.Buffer(s);
    }

    public void pLibraries(@Nullable VkPipeline.Buffer value) {
        pLibrariesRaw(value == null ? MemorySegment.NULL : value.segment());
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

    public static VkPipelineLibraryCreateInfoKHR clone(Arena arena, VkPipelineLibraryCreateInfoKHR src) {
        VkPipelineLibraryCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineLibraryCreateInfoKHR[] clone(Arena arena, VkPipelineLibraryCreateInfoKHR[] src) {
        VkPipelineLibraryCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

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
}
