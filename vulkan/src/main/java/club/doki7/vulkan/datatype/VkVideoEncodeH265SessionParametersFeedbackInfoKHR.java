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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265SessionParametersFeedbackInfoKHR.html"><code>VkVideoEncodeH265SessionParametersFeedbackInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH265SessionParametersFeedbackInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 hasStdVPSOverrides; // @link substring="hasStdVPSOverrides" target="#hasStdVPSOverrides"
///     VkBool32 hasStdSPSOverrides; // @link substring="hasStdSPSOverrides" target="#hasStdSPSOverrides"
///     VkBool32 hasStdPPSOverrides; // @link substring="hasStdPPSOverrides" target="#hasStdPPSOverrides"
/// } VkVideoEncodeH265SessionParametersFeedbackInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR`
///
/// The {@link VkVideoEncodeH265SessionParametersFeedbackInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeH265SessionParametersFeedbackInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265SessionParametersFeedbackInfoKHR.html"><code>VkVideoEncodeH265SessionParametersFeedbackInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265SessionParametersFeedbackInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR allocate(Arena arena) {
        VkVideoEncodeH265SessionParametersFeedbackInfoKHR ret = new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265SessionParametersFeedbackInfoKHR[] ret = new VkVideoEncodeH265SessionParametersFeedbackInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR clone(Arena arena, VkVideoEncodeH265SessionParametersFeedbackInfoKHR src) {
        VkVideoEncodeH265SessionParametersFeedbackInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR[] clone(Arena arena, VkVideoEncodeH265SessionParametersFeedbackInfoKHR[] src) {
        VkVideoEncodeH265SessionParametersFeedbackInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR);
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

    public @unsigned int hasStdVPSOverrides() {
        return segment.get(LAYOUT$hasStdVPSOverrides, OFFSET$hasStdVPSOverrides);
    }

    public void hasStdVPSOverrides(@unsigned int value) {
        segment.set(LAYOUT$hasStdVPSOverrides, OFFSET$hasStdVPSOverrides, value);
    }

    public @unsigned int hasStdSPSOverrides() {
        return segment.get(LAYOUT$hasStdSPSOverrides, OFFSET$hasStdSPSOverrides);
    }

    public void hasStdSPSOverrides(@unsigned int value) {
        segment.set(LAYOUT$hasStdSPSOverrides, OFFSET$hasStdSPSOverrides, value);
    }

    public @unsigned int hasStdPPSOverrides() {
        return segment.get(LAYOUT$hasStdPPSOverrides, OFFSET$hasStdPPSOverrides);
    }

    public void hasStdPPSOverrides(@unsigned int value) {
        segment.set(LAYOUT$hasStdPPSOverrides, OFFSET$hasStdPPSOverrides, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasStdVPSOverrides"),
        ValueLayout.JAVA_INT.withName("hasStdSPSOverrides"),
        ValueLayout.JAVA_INT.withName("hasStdPPSOverrides")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$hasStdVPSOverrides = PathElement.groupElement("PATH$hasStdVPSOverrides");
    public static final PathElement PATH$hasStdSPSOverrides = PathElement.groupElement("PATH$hasStdSPSOverrides");
    public static final PathElement PATH$hasStdPPSOverrides = PathElement.groupElement("PATH$hasStdPPSOverrides");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$hasStdVPSOverrides = (OfInt) LAYOUT.select(PATH$hasStdVPSOverrides);
    public static final OfInt LAYOUT$hasStdSPSOverrides = (OfInt) LAYOUT.select(PATH$hasStdSPSOverrides);
    public static final OfInt LAYOUT$hasStdPPSOverrides = (OfInt) LAYOUT.select(PATH$hasStdPPSOverrides);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$hasStdVPSOverrides = LAYOUT$hasStdVPSOverrides.byteSize();
    public static final long SIZE$hasStdSPSOverrides = LAYOUT$hasStdSPSOverrides.byteSize();
    public static final long SIZE$hasStdPPSOverrides = LAYOUT$hasStdPPSOverrides.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$hasStdVPSOverrides = LAYOUT.byteOffset(PATH$hasStdVPSOverrides);
    public static final long OFFSET$hasStdSPSOverrides = LAYOUT.byteOffset(PATH$hasStdSPSOverrides);
    public static final long OFFSET$hasStdPPSOverrides = LAYOUT.byteOffset(PATH$hasStdPPSOverrides);
}
