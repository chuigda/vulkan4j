package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265GopRemainingFrameInfoKHR.html"><code>VkVideoEncodeH265GopRemainingFrameInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH265GopRemainingFrameInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkBool32 useGopRemainingFrames;
///     uint32_t gopRemainingI;
///     uint32_t gopRemainingP;
///     uint32_t gopRemainingB;
/// } VkVideoEncodeH265GopRemainingFrameInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR`
///
/// The {@link VkVideoEncodeH265GopRemainingFrameInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeH265GopRemainingFrameInfoKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265GopRemainingFrameInfoKHR.html"><code>VkVideoEncodeH265GopRemainingFrameInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265GopRemainingFrameInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH265GopRemainingFrameInfoKHR allocate(Arena arena) {
        VkVideoEncodeH265GopRemainingFrameInfoKHR ret = new VkVideoEncodeH265GopRemainingFrameInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265GopRemainingFrameInfoKHR[] ret = new VkVideoEncodeH265GopRemainingFrameInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265GopRemainingFrameInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR clone(Arena arena, VkVideoEncodeH265GopRemainingFrameInfoKHR src) {
        VkVideoEncodeH265GopRemainingFrameInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR[] clone(Arena arena, VkVideoEncodeH265GopRemainingFrameInfoKHR[] src) {
        VkVideoEncodeH265GopRemainingFrameInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int useGopRemainingFrames() {
        return segment.get(LAYOUT$useGopRemainingFrames, OFFSET$useGopRemainingFrames);
    }

    public void useGopRemainingFrames(@unsigned int value) {
        segment.set(LAYOUT$useGopRemainingFrames, OFFSET$useGopRemainingFrames, value);
    }

    public @unsigned int gopRemainingI() {
        return segment.get(LAYOUT$gopRemainingI, OFFSET$gopRemainingI);
    }

    public void gopRemainingI(@unsigned int value) {
        segment.set(LAYOUT$gopRemainingI, OFFSET$gopRemainingI, value);
    }

    public @unsigned int gopRemainingP() {
        return segment.get(LAYOUT$gopRemainingP, OFFSET$gopRemainingP);
    }

    public void gopRemainingP(@unsigned int value) {
        segment.set(LAYOUT$gopRemainingP, OFFSET$gopRemainingP, value);
    }

    public @unsigned int gopRemainingB() {
        return segment.get(LAYOUT$gopRemainingB, OFFSET$gopRemainingB);
    }

    public void gopRemainingB(@unsigned int value) {
        segment.set(LAYOUT$gopRemainingB, OFFSET$gopRemainingB, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("gopRemainingI"),
        ValueLayout.JAVA_INT.withName("gopRemainingP"),
        ValueLayout.JAVA_INT.withName("gopRemainingB")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$useGopRemainingFrames = PathElement.groupElement("PATH$useGopRemainingFrames");
    public static final PathElement PATH$gopRemainingI = PathElement.groupElement("PATH$gopRemainingI");
    public static final PathElement PATH$gopRemainingP = PathElement.groupElement("PATH$gopRemainingP");
    public static final PathElement PATH$gopRemainingB = PathElement.groupElement("PATH$gopRemainingB");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$useGopRemainingFrames = (OfInt) LAYOUT.select(PATH$useGopRemainingFrames);
    public static final OfInt LAYOUT$gopRemainingI = (OfInt) LAYOUT.select(PATH$gopRemainingI);
    public static final OfInt LAYOUT$gopRemainingP = (OfInt) LAYOUT.select(PATH$gopRemainingP);
    public static final OfInt LAYOUT$gopRemainingB = (OfInt) LAYOUT.select(PATH$gopRemainingB);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$useGopRemainingFrames = LAYOUT$useGopRemainingFrames.byteSize();
    public static final long SIZE$gopRemainingI = LAYOUT$gopRemainingI.byteSize();
    public static final long SIZE$gopRemainingP = LAYOUT$gopRemainingP.byteSize();
    public static final long SIZE$gopRemainingB = LAYOUT$gopRemainingB.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$useGopRemainingFrames = LAYOUT.byteOffset(PATH$useGopRemainingFrames);
    public static final long OFFSET$gopRemainingI = LAYOUT.byteOffset(PATH$gopRemainingI);
    public static final long OFFSET$gopRemainingP = LAYOUT.byteOffset(PATH$gopRemainingP);
    public static final long OFFSET$gopRemainingB = LAYOUT.byteOffset(PATH$gopRemainingB);
}
