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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeUsageInfoKHR.html">VkVideoEncodeUsageInfoKHR</a>
@ValueBasedCandidate
public record VkVideoEncodeUsageInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$videoUsageHints = ValueLayout.JAVA_INT.withName("videoUsageHints");
    public static final OfInt LAYOUT$videoContentHints = ValueLayout.JAVA_INT.withName("videoContentHints");
    public static final OfInt LAYOUT$tuningMode = ValueLayout.JAVA_INT.withName("tuningMode");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$videoUsageHints, LAYOUT$videoContentHints, LAYOUT$tuningMode);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeUsageInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeUsageInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeUsageInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeUsageInfoKHR[] ret = new VkVideoEncodeUsageInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeUsageInfoKHR(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$videoUsageHints = PathElement.groupElement("PATH$videoUsageHints");
    public static final PathElement PATH$videoContentHints = PathElement.groupElement("PATH$videoContentHints");
    public static final PathElement PATH$tuningMode = PathElement.groupElement("PATH$tuningMode");

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

}
