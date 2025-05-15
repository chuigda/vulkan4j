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

/// Represents a pointer to a {@code VkVideoEncodeQuantizationMapInfoKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeQuantizationMapInfoKHR.html">VkVideoEncodeQuantizationMapInfoKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeQuantizationMapInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkVideoEncodeQuantizationMapInfoKHR {
        sType(VkStructureType.VIDEO_ENCODE_QUANTIZATION_MAP_INFO_KHR);
    }

    public static VkVideoEncodeQuantizationMapInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeQuantizationMapInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeQuantizationMapInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeQuantizationMapInfoKHR[] ret = new VkVideoEncodeQuantizationMapInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeQuantizationMapInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeQuantizationMapInfoKHR clone(Arena arena, VkVideoEncodeQuantizationMapInfoKHR src) {
        VkVideoEncodeQuantizationMapInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeQuantizationMapInfoKHR[] clone(Arena arena, VkVideoEncodeQuantizationMapInfoKHR[] src) {
        VkVideoEncodeQuantizationMapInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("quantizationMap"),
        VkExtent2D.LAYOUT.withName("quantizationMapExtent")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$quantizationMap = PathElement.groupElement("PATH$quantizationMap");
    public static final PathElement PATH$quantizationMapExtent = PathElement.groupElement("PATH$quantizationMapExtent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$quantizationMap = (AddressLayout) LAYOUT.select(PATH$quantizationMap);
    public static final StructLayout LAYOUT$quantizationMapExtent = (StructLayout) LAYOUT.select(PATH$quantizationMapExtent);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$quantizationMap = LAYOUT$quantizationMap.byteSize();
    public static final long SIZE$quantizationMapExtent = LAYOUT$quantizationMapExtent.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$quantizationMap = LAYOUT.byteOffset(PATH$quantizationMap);
    public static final long OFFSET$quantizationMapExtent = LAYOUT.byteOffset(PATH$quantizationMapExtent);

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

    public @Nullable VkImageView quantizationMap() {
        MemorySegment s = segment.asSlice(OFFSET$quantizationMap, SIZE$quantizationMap);
        if (s.address() == 0) {
            return null;
        }
        return new VkImageView(s);
    }

    public void quantizationMap(@Nullable VkImageView value) {
        segment.set(LAYOUT$quantizationMap, OFFSET$quantizationMap, value != null ? value.segment() : MemorySegment.NULL);
    }

    public VkExtent2D quantizationMapExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$quantizationMapExtent, LAYOUT$quantizationMapExtent));
    }

    public void quantizationMapExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$quantizationMapExtent, SIZE$quantizationMapExtent);
    }

}
