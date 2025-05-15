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

public record VkPipelineLibraryCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$libraryCount = ValueLayout.JAVA_INT.withName("libraryCount");
    public static final AddressLayout LAYOUT$pLibraries = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pLibraries");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$libraryCount, LAYOUT$pLibraries);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineLibraryCreateInfoKHR allocate(Arena arena) {
        return new VkPipelineLibraryCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkPipelineLibraryCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineLibraryCreateInfoKHR[] ret = new VkPipelineLibraryCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$libraryCount = PathElement.groupElement("PATH$libraryCount");
    public static final PathElement PATH$pLibraries = PathElement.groupElement("PATH$pLibraries");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$libraryCount = LAYOUT$libraryCount.byteSize();
    public static final long SIZE$pLibraries = LAYOUT$pLibraries.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$libraryCount = LAYOUT.byteOffset(PATH$libraryCount);
    public static final long OFFSET$pLibraries = LAYOUT.byteOffset(PATH$pLibraries);

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

    public @pointer(comment="VkPipeline*") MemorySegment pLibrariesRaw() {
        return segment.get(LAYOUT$pLibraries, OFFSET$pLibraries);
    }

    public void pLibrariesRaw(@pointer(comment="VkPipeline*") MemorySegment value) {
        segment.set(LAYOUT$pLibraries, OFFSET$pLibraries, value);
    }

    /// Note: the returned {@link VkPipeline.Buffer} does not have correct {@link VkPipeline.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkPipeline.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkPipeline.Buffer pLibraries() {
        MemorySegment s = pLibrariesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipeline.Buffer(s);
    }


}
/// dummy, not implemented yet
