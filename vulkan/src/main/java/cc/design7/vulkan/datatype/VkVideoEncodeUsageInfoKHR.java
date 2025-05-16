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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeUsageInfoKHR.html"><code>VkVideoEncodeUsageInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeUsageInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkVideoEncodeUsageFlagsKHR videoUsageHints; // optional
///     VkVideoEncodeContentFlagsKHR videoContentHints; // optional
///     VkVideoEncodeTuningModeKHR tuningMode; // optional
/// } VkVideoEncodeUsageInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR`
///
/// The {@link VkVideoEncodeUsageInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeUsageInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeUsageInfoKHR.html"><code>VkVideoEncodeUsageInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeUsageInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeUsageInfoKHR allocate(Arena arena) {
        VkVideoEncodeUsageInfoKHR ret = new VkVideoEncodeUsageInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_USAGE_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeUsageInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeUsageInfoKHR[] ret = new VkVideoEncodeUsageInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeUsageInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_USAGE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeUsageInfoKHR clone(Arena arena, VkVideoEncodeUsageInfoKHR src) {
        VkVideoEncodeUsageInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeUsageInfoKHR[] clone(Arena arena, VkVideoEncodeUsageInfoKHR[] src) {
        VkVideoEncodeUsageInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_USAGE_INFO_KHR);
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

    public @enumtype(VkVideoEncodeUsageFlagsKHR.class) int videoUsageHints() {
        return segment.get(LAYOUT$videoUsageHints, OFFSET$videoUsageHints);
    }

    public void videoUsageHints(@enumtype(VkVideoEncodeUsageFlagsKHR.class) int value) {
        segment.set(LAYOUT$videoUsageHints, OFFSET$videoUsageHints, value);
    }

    public @enumtype(VkVideoEncodeContentFlagsKHR.class) int videoContentHints() {
        return segment.get(LAYOUT$videoContentHints, OFFSET$videoContentHints);
    }

    public void videoContentHints(@enumtype(VkVideoEncodeContentFlagsKHR.class) int value) {
        segment.set(LAYOUT$videoContentHints, OFFSET$videoContentHints, value);
    }

    public @enumtype(VkVideoEncodeTuningModeKHR.class) int tuningMode() {
        return segment.get(LAYOUT$tuningMode, OFFSET$tuningMode);
    }

    public void tuningMode(@enumtype(VkVideoEncodeTuningModeKHR.class) int value) {
        segment.set(LAYOUT$tuningMode, OFFSET$tuningMode, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoUsageHints"),
        ValueLayout.JAVA_INT.withName("videoContentHints"),
        ValueLayout.JAVA_INT.withName("tuningMode")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$videoUsageHints = PathElement.groupElement("PATH$videoUsageHints");
    public static final PathElement PATH$videoContentHints = PathElement.groupElement("PATH$videoContentHints");
    public static final PathElement PATH$tuningMode = PathElement.groupElement("PATH$tuningMode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$videoUsageHints = (OfInt) LAYOUT.select(PATH$videoUsageHints);
    public static final OfInt LAYOUT$videoContentHints = (OfInt) LAYOUT.select(PATH$videoContentHints);
    public static final OfInt LAYOUT$tuningMode = (OfInt) LAYOUT.select(PATH$tuningMode);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$videoUsageHints = LAYOUT$videoUsageHints.byteSize();
    public static final long SIZE$videoContentHints = LAYOUT$videoContentHints.byteSize();
    public static final long SIZE$tuningMode = LAYOUT$tuningMode.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$videoUsageHints = LAYOUT.byteOffset(PATH$videoUsageHints);
    public static final long OFFSET$videoContentHints = LAYOUT.byteOffset(PATH$videoContentHints);
    public static final long OFFSET$tuningMode = LAYOUT.byteOffset(PATH$tuningMode);
}
