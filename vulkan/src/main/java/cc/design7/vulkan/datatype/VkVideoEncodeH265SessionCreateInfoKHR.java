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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265SessionCreateInfoKHR.html"><code>VkVideoEncodeH265SessionCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH265SessionCreateInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkBool32 useMaxLevelIdc;
///     StdVideoH265LevelIdc maxLevelIdc;
/// } VkVideoEncodeH265SessionCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_KHR`
///
/// The {@link VkVideoEncodeH265SessionCreateInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeH265SessionCreateInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265SessionCreateInfoKHR.html"><code>VkVideoEncodeH265SessionCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265SessionCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH265SessionCreateInfoKHR allocate(Arena arena) {
        VkVideoEncodeH265SessionCreateInfoKHR ret = new VkVideoEncodeH265SessionCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H265_SESSION_CREATE_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH265SessionCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265SessionCreateInfoKHR[] ret = new VkVideoEncodeH265SessionCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265SessionCreateInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H265_SESSION_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH265SessionCreateInfoKHR clone(Arena arena, VkVideoEncodeH265SessionCreateInfoKHR src) {
        VkVideoEncodeH265SessionCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH265SessionCreateInfoKHR[] clone(Arena arena, VkVideoEncodeH265SessionCreateInfoKHR[] src) {
        VkVideoEncodeH265SessionCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H265_SESSION_CREATE_INFO_KHR);
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

    public @unsigned int useMaxLevelIdc() {
        return segment.get(LAYOUT$useMaxLevelIdc, OFFSET$useMaxLevelIdc);
    }

    public void useMaxLevelIdc(@unsigned int value) {
        segment.set(LAYOUT$useMaxLevelIdc, OFFSET$useMaxLevelIdc, value);
    }

    public @enumtype(StdVideoH265LevelIdc.class) int maxLevelIdc() {
        return segment.get(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc);
    }

    public void maxLevelIdc(@enumtype(StdVideoH265LevelIdc.class) int value) {
        segment.set(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMaxLevelIdc"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$useMaxLevelIdc = PathElement.groupElement("PATH$useMaxLevelIdc");
    public static final PathElement PATH$maxLevelIdc = PathElement.groupElement("PATH$maxLevelIdc");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$useMaxLevelIdc = (OfInt) LAYOUT.select(PATH$useMaxLevelIdc);
    public static final OfInt LAYOUT$maxLevelIdc = (OfInt) LAYOUT.select(PATH$maxLevelIdc);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$useMaxLevelIdc = LAYOUT$useMaxLevelIdc.byteSize();
    public static final long SIZE$maxLevelIdc = LAYOUT$maxLevelIdc.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$useMaxLevelIdc = LAYOUT.byteOffset(PATH$useMaxLevelIdc);
    public static final long OFFSET$maxLevelIdc = LAYOUT.byteOffset(PATH$maxLevelIdc);
}
