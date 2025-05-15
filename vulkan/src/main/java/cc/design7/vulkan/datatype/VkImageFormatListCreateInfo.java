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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageFormatListCreateInfo.html">VkImageFormatListCreateInfo</a>
@ValueBasedCandidate
public record VkImageFormatListCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$viewFormatCount = ValueLayout.JAVA_INT.withName("viewFormatCount");
    public static final AddressLayout LAYOUT$pViewFormats = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pViewFormats");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$viewFormatCount, LAYOUT$pViewFormats);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageFormatListCreateInfo allocate(Arena arena) {
        return new VkImageFormatListCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkImageFormatListCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageFormatListCreateInfo[] ret = new VkImageFormatListCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageFormatListCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageFormatListCreateInfo clone(Arena arena, VkImageFormatListCreateInfo src) {
        VkImageFormatListCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageFormatListCreateInfo[] clone(Arena arena, VkImageFormatListCreateInfo[] src) {
        VkImageFormatListCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$viewFormatCount = PathElement.groupElement("PATH$viewFormatCount");
    public static final PathElement PATH$pViewFormats = PathElement.groupElement("PATH$pViewFormats");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$viewFormatCount = LAYOUT$viewFormatCount.byteSize();
    public static final long SIZE$pViewFormats = LAYOUT$pViewFormats.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$viewFormatCount = LAYOUT.byteOffset(PATH$viewFormatCount);
    public static final long OFFSET$pViewFormats = LAYOUT.byteOffset(PATH$pViewFormats);

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

    public @unsigned int viewFormatCount() {
        return segment.get(LAYOUT$viewFormatCount, OFFSET$viewFormatCount);
    }

    public void viewFormatCount(@unsigned int value) {
        segment.set(LAYOUT$viewFormatCount, OFFSET$viewFormatCount, value);
    }

    public @pointer(target=VkFormat.class) MemorySegment pViewFormatsRaw() {
        return segment.get(LAYOUT$pViewFormats, OFFSET$pViewFormats);
    }

    public void pViewFormatsRaw(@pointer(target=VkFormat.class) MemorySegment value) {
        segment.set(LAYOUT$pViewFormats, OFFSET$pViewFormats, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkFormat.class) IntPtr pViewFormats() {
        MemorySegment s = pViewFormatsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pViewFormats(@Nullable @enumtype(VkFormat.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewFormatsRaw(s);
    }

}
