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
/// typedef struct VkPresentFrameTokenGGP {
///     VkStructureType sType;
///     const void* pNext;
///     GgpFrameToken frameToken;
/// } VkPresentFrameTokenGGP;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPresentFrameTokenGGP.html">VkPresentFrameTokenGGP</a>
public record VkPresentFrameTokenGGP(MemorySegment segment) implements IPointer {
    public VkPresentFrameTokenGGP(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PRESENT_FRAME_TOKEN_GGP);
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

    public @unsigned int frameToken() {
        return segment.get(LAYOUT$frameToken, OFFSET$frameToken);
    }

    public void frameToken(@unsigned int value) {
        segment.set(LAYOUT$frameToken, OFFSET$frameToken, value);
    }

    public static VkPresentFrameTokenGGP allocate(Arena arena) {
        return new VkPresentFrameTokenGGP(arena.allocate(LAYOUT));
    }

    public static VkPresentFrameTokenGGP[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPresentFrameTokenGGP[] ret = new VkPresentFrameTokenGGP[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPresentFrameTokenGGP(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPresentFrameTokenGGP clone(Arena arena, VkPresentFrameTokenGGP src) {
        VkPresentFrameTokenGGP ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPresentFrameTokenGGP[] clone(Arena arena, VkPresentFrameTokenGGP[] src) {
        VkPresentFrameTokenGGP[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("frameToken")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$frameToken = PathElement.groupElement("frameToken");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$frameToken = (OfInt) LAYOUT.select(PATH$frameToken);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$frameToken = LAYOUT.byteOffset(PATH$frameToken);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$frameToken = LAYOUT$frameToken.byteSize();
}
