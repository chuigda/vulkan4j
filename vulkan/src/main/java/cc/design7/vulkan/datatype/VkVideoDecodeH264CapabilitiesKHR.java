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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH264CapabilitiesKHR.html"><code>VkVideoDecodeH264CapabilitiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoDecodeH264CapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext; // optional
///     StdVideoH264LevelIdc maxLevelIdc;
///     VkOffset2D fieldOffsetGranularity;
/// } VkVideoDecodeH264CapabilitiesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR`
///
/// The {@link VkVideoDecodeH264CapabilitiesKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoDecodeH264CapabilitiesKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH264CapabilitiesKHR.html"><code>VkVideoDecodeH264CapabilitiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoDecodeH264CapabilitiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoDecodeH264CapabilitiesKHR allocate(Arena arena) {
        VkVideoDecodeH264CapabilitiesKHR ret = new VkVideoDecodeH264CapabilitiesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_DECODE_H264_CAPABILITIES_KHR);
        return ret;
    }

    public static VkVideoDecodeH264CapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH264CapabilitiesKHR[] ret = new VkVideoDecodeH264CapabilitiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH264CapabilitiesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_DECODE_H264_CAPABILITIES_KHR);
        }
        return ret;
    }

    public static VkVideoDecodeH264CapabilitiesKHR clone(Arena arena, VkVideoDecodeH264CapabilitiesKHR src) {
        VkVideoDecodeH264CapabilitiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeH264CapabilitiesKHR[] clone(Arena arena, VkVideoDecodeH264CapabilitiesKHR[] src) {
        VkVideoDecodeH264CapabilitiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_DECODE_H264_CAPABILITIES_KHR);
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

    public @enumtype(StdVideoH264LevelIdc.class) int maxLevelIdc() {
        return segment.get(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc);
    }

    public void maxLevelIdc(@enumtype(StdVideoH264LevelIdc.class) int value) {
        segment.set(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc, value);
    }

    public VkOffset2D fieldOffsetGranularity() {
        return new VkOffset2D(segment.asSlice(OFFSET$fieldOffsetGranularity, LAYOUT$fieldOffsetGranularity));
    }

    public void fieldOffsetGranularity(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fieldOffsetGranularity, SIZE$fieldOffsetGranularity);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc"),
        VkOffset2D.LAYOUT.withName("fieldOffsetGranularity")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxLevelIdc = PathElement.groupElement("PATH$maxLevelIdc");
    public static final PathElement PATH$fieldOffsetGranularity = PathElement.groupElement("PATH$fieldOffsetGranularity");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxLevelIdc = (OfInt) LAYOUT.select(PATH$maxLevelIdc);
    public static final StructLayout LAYOUT$fieldOffsetGranularity = (StructLayout) LAYOUT.select(PATH$fieldOffsetGranularity);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxLevelIdc = LAYOUT$maxLevelIdc.byteSize();
    public static final long SIZE$fieldOffsetGranularity = LAYOUT$fieldOffsetGranularity.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxLevelIdc = LAYOUT.byteOffset(PATH$maxLevelIdc);
    public static final long OFFSET$fieldOffsetGranularity = LAYOUT.byteOffset(PATH$fieldOffsetGranularity);
}
