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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265SessionParametersGetInfoKHR.html"><code>VkVideoEncodeH265SessionParametersGetInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH265SessionParametersGetInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkBool32 writeStdVPS;
///     VkBool32 writeStdSPS;
///     VkBool32 writeStdPPS;
///     uint32_t stdVPSId;
///     uint32_t stdSPSId;
///     uint32_t stdPPSId;
/// } VkVideoEncodeH265SessionParametersGetInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR`
///
/// The {@link VkVideoEncodeH265SessionParametersGetInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeH265SessionParametersGetInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265SessionParametersGetInfoKHR.html"><code>VkVideoEncodeH265SessionParametersGetInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265SessionParametersGetInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH265SessionParametersGetInfoKHR allocate(Arena arena) {
        VkVideoEncodeH265SessionParametersGetInfoKHR ret = new VkVideoEncodeH265SessionParametersGetInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH265SessionParametersGetInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265SessionParametersGetInfoKHR[] ret = new VkVideoEncodeH265SessionParametersGetInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265SessionParametersGetInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH265SessionParametersGetInfoKHR clone(Arena arena, VkVideoEncodeH265SessionParametersGetInfoKHR src) {
        VkVideoEncodeH265SessionParametersGetInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH265SessionParametersGetInfoKHR[] clone(Arena arena, VkVideoEncodeH265SessionParametersGetInfoKHR[] src) {
        VkVideoEncodeH265SessionParametersGetInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR);
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

    public @unsigned int writeStdVPS() {
        return segment.get(LAYOUT$writeStdVPS, OFFSET$writeStdVPS);
    }

    public void writeStdVPS(@unsigned int value) {
        segment.set(LAYOUT$writeStdVPS, OFFSET$writeStdVPS, value);
    }

    public @unsigned int writeStdSPS() {
        return segment.get(LAYOUT$writeStdSPS, OFFSET$writeStdSPS);
    }

    public void writeStdSPS(@unsigned int value) {
        segment.set(LAYOUT$writeStdSPS, OFFSET$writeStdSPS, value);
    }

    public @unsigned int writeStdPPS() {
        return segment.get(LAYOUT$writeStdPPS, OFFSET$writeStdPPS);
    }

    public void writeStdPPS(@unsigned int value) {
        segment.set(LAYOUT$writeStdPPS, OFFSET$writeStdPPS, value);
    }

    public @unsigned int stdVPSId() {
        return segment.get(LAYOUT$stdVPSId, OFFSET$stdVPSId);
    }

    public void stdVPSId(@unsigned int value) {
        segment.set(LAYOUT$stdVPSId, OFFSET$stdVPSId, value);
    }

    public @unsigned int stdSPSId() {
        return segment.get(LAYOUT$stdSPSId, OFFSET$stdSPSId);
    }

    public void stdSPSId(@unsigned int value) {
        segment.set(LAYOUT$stdSPSId, OFFSET$stdSPSId, value);
    }

    public @unsigned int stdPPSId() {
        return segment.get(LAYOUT$stdPPSId, OFFSET$stdPPSId);
    }

    public void stdPPSId(@unsigned int value) {
        segment.set(LAYOUT$stdPPSId, OFFSET$stdPPSId, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("writeStdVPS"),
        ValueLayout.JAVA_INT.withName("writeStdSPS"),
        ValueLayout.JAVA_INT.withName("writeStdPPS"),
        ValueLayout.JAVA_INT.withName("stdVPSId"),
        ValueLayout.JAVA_INT.withName("stdSPSId"),
        ValueLayout.JAVA_INT.withName("stdPPSId")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$writeStdVPS = PathElement.groupElement("PATH$writeStdVPS");
    public static final PathElement PATH$writeStdSPS = PathElement.groupElement("PATH$writeStdSPS");
    public static final PathElement PATH$writeStdPPS = PathElement.groupElement("PATH$writeStdPPS");
    public static final PathElement PATH$stdVPSId = PathElement.groupElement("PATH$stdVPSId");
    public static final PathElement PATH$stdSPSId = PathElement.groupElement("PATH$stdSPSId");
    public static final PathElement PATH$stdPPSId = PathElement.groupElement("PATH$stdPPSId");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$writeStdVPS = (OfInt) LAYOUT.select(PATH$writeStdVPS);
    public static final OfInt LAYOUT$writeStdSPS = (OfInt) LAYOUT.select(PATH$writeStdSPS);
    public static final OfInt LAYOUT$writeStdPPS = (OfInt) LAYOUT.select(PATH$writeStdPPS);
    public static final OfInt LAYOUT$stdVPSId = (OfInt) LAYOUT.select(PATH$stdVPSId);
    public static final OfInt LAYOUT$stdSPSId = (OfInt) LAYOUT.select(PATH$stdSPSId);
    public static final OfInt LAYOUT$stdPPSId = (OfInt) LAYOUT.select(PATH$stdPPSId);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$writeStdVPS = LAYOUT$writeStdVPS.byteSize();
    public static final long SIZE$writeStdSPS = LAYOUT$writeStdSPS.byteSize();
    public static final long SIZE$writeStdPPS = LAYOUT$writeStdPPS.byteSize();
    public static final long SIZE$stdVPSId = LAYOUT$stdVPSId.byteSize();
    public static final long SIZE$stdSPSId = LAYOUT$stdSPSId.byteSize();
    public static final long SIZE$stdPPSId = LAYOUT$stdPPSId.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$writeStdVPS = LAYOUT.byteOffset(PATH$writeStdVPS);
    public static final long OFFSET$writeStdSPS = LAYOUT.byteOffset(PATH$writeStdSPS);
    public static final long OFFSET$writeStdPPS = LAYOUT.byteOffset(PATH$writeStdPPS);
    public static final long OFFSET$stdVPSId = LAYOUT.byteOffset(PATH$stdVPSId);
    public static final long OFFSET$stdSPSId = LAYOUT.byteOffset(PATH$stdSPSId);
    public static final long OFFSET$stdPPSId = LAYOUT.byteOffset(PATH$stdPPSId);
}
