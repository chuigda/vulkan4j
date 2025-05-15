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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH264ProfileInfoKHR.html"><code>VkVideoDecodeH264ProfileInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoDecodeH264ProfileInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     StdVideoH264ProfileIdc stdProfileIdc;
///     VkVideoDecodeH264PictureLayoutFlagsKHR pictureLayout; // optional
/// } VkVideoDecodeH264ProfileInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PROFILE_INFO_KHR`
///
/// The {@link VkVideoDecodeH264ProfileInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoDecodeH264ProfileInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH264ProfileInfoKHR.html"><code>VkVideoDecodeH264ProfileInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoDecodeH264ProfileInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoDecodeH264ProfileInfoKHR allocate(Arena arena) {
        VkVideoDecodeH264ProfileInfoKHR ret = new VkVideoDecodeH264ProfileInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_DECODE_H264_PROFILE_INFO_KHR);
        return ret;
    }

    public static VkVideoDecodeH264ProfileInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH264ProfileInfoKHR[] ret = new VkVideoDecodeH264ProfileInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH264ProfileInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_DECODE_H264_PROFILE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoDecodeH264ProfileInfoKHR clone(Arena arena, VkVideoDecodeH264ProfileInfoKHR src) {
        VkVideoDecodeH264ProfileInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeH264ProfileInfoKHR[] clone(Arena arena, VkVideoDecodeH264ProfileInfoKHR[] src) {
        VkVideoDecodeH264ProfileInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_DECODE_H264_PROFILE_INFO_KHR);
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

    public @enumtype(StdVideoH264ProfileIdc.class) int stdProfileIdc() {
        return segment.get(LAYOUT$stdProfileIdc, OFFSET$stdProfileIdc);
    }

    public void stdProfileIdc(@enumtype(StdVideoH264ProfileIdc.class) int value) {
        segment.set(LAYOUT$stdProfileIdc, OFFSET$stdProfileIdc, value);
    }

    public @enumtype(VkVideoDecodeH264PictureLayoutFlagsKHR.class) int pictureLayout() {
        return segment.get(LAYOUT$pictureLayout, OFFSET$pictureLayout);
    }

    public void pictureLayout(@enumtype(VkVideoDecodeH264PictureLayoutFlagsKHR.class) int value) {
        segment.set(LAYOUT$pictureLayout, OFFSET$pictureLayout, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdProfileIdc"),
        ValueLayout.JAVA_INT.withName("pictureLayout")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stdProfileIdc = PathElement.groupElement("PATH$stdProfileIdc");
    public static final PathElement PATH$pictureLayout = PathElement.groupElement("PATH$pictureLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stdProfileIdc = (OfInt) LAYOUT.select(PATH$stdProfileIdc);
    public static final OfInt LAYOUT$pictureLayout = (OfInt) LAYOUT.select(PATH$pictureLayout);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stdProfileIdc = LAYOUT$stdProfileIdc.byteSize();
    public static final long SIZE$pictureLayout = LAYOUT$pictureLayout.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stdProfileIdc = LAYOUT.byteOffset(PATH$stdProfileIdc);
    public static final long OFFSET$pictureLayout = LAYOUT.byteOffset(PATH$pictureLayout);
}
