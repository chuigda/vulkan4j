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
/// typedef struct VkDisplayPresentInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkRect2D srcRect;
///     VkRect2D dstRect;
///     VkBool32 persistent;
/// } VkDisplayPresentInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDisplayPresentInfoKHR.html">VkDisplayPresentInfoKHR</a>
public record VkDisplayPresentInfoKHR(MemorySegment segment) implements IPointer {
    public VkDisplayPresentInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR);
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

    public VkRect2D srcRect() {
        return new VkRect2D(segment.asSlice(OFFSET$srcRect, LAYOUT$srcRect));
    }

    public void srcRect(VkRect2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcRect, SIZE$srcRect);
    }

    public VkRect2D dstRect() {
        return new VkRect2D(segment.asSlice(OFFSET$dstRect, LAYOUT$dstRect));
    }

    public void dstRect(VkRect2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstRect, SIZE$dstRect);
    }

    public @unsigned int persistent() {
        return segment.get(LAYOUT$persistent, OFFSET$persistent);
    }

    public void persistent(@unsigned int value) {
        segment.set(LAYOUT$persistent, OFFSET$persistent, value);
    }

    public static VkDisplayPresentInfoKHR allocate(Arena arena) {
        return new VkDisplayPresentInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkDisplayPresentInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayPresentInfoKHR[] ret = new VkDisplayPresentInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDisplayPresentInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDisplayPresentInfoKHR clone(Arena arena, VkDisplayPresentInfoKHR src) {
        VkDisplayPresentInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayPresentInfoKHR[] clone(Arena arena, VkDisplayPresentInfoKHR[] src) {
        VkDisplayPresentInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkRect2D.LAYOUT.withName("srcRect"),
        VkRect2D.LAYOUT.withName("dstRect"),
        ValueLayout.JAVA_INT.withName("persistent")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$srcRect = PathElement.groupElement("srcRect");
    public static final PathElement PATH$dstRect = PathElement.groupElement("dstRect");
    public static final PathElement PATH$persistent = PathElement.groupElement("persistent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$srcRect = (StructLayout) LAYOUT.select(PATH$srcRect);
    public static final StructLayout LAYOUT$dstRect = (StructLayout) LAYOUT.select(PATH$dstRect);
    public static final OfInt LAYOUT$persistent = (OfInt) LAYOUT.select(PATH$persistent);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcRect = LAYOUT.byteOffset(PATH$srcRect);
    public static final long OFFSET$dstRect = LAYOUT.byteOffset(PATH$dstRect);
    public static final long OFFSET$persistent = LAYOUT.byteOffset(PATH$persistent);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcRect = LAYOUT$srcRect.byteSize();
    public static final long SIZE$dstRect = LAYOUT$dstRect.byteSize();
    public static final long SIZE$persistent = LAYOUT$persistent.byteSize();
}
