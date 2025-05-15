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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265SessionParametersGetInfoKHR.html">VkVideoEncodeH265SessionParametersGetInfoKHR</a>
@ValueBasedCandidate
public record VkVideoEncodeH265SessionParametersGetInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$writeStdVPS = ValueLayout.JAVA_INT.withName("writeStdVPS");
    public static final OfInt LAYOUT$writeStdSPS = ValueLayout.JAVA_INT.withName("writeStdSPS");
    public static final OfInt LAYOUT$writeStdPPS = ValueLayout.JAVA_INT.withName("writeStdPPS");
    public static final OfInt LAYOUT$stdVPSId = ValueLayout.JAVA_INT.withName("stdVPSId");
    public static final OfInt LAYOUT$stdSPSId = ValueLayout.JAVA_INT.withName("stdSPSId");
    public static final OfInt LAYOUT$stdPPSId = ValueLayout.JAVA_INT.withName("stdPPSId");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$writeStdVPS, LAYOUT$writeStdSPS, LAYOUT$writeStdPPS, LAYOUT$stdVPSId, LAYOUT$stdSPSId, LAYOUT$stdPPSId);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeH265SessionParametersGetInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeH265SessionParametersGetInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265SessionParametersGetInfoKHR[] ret = new VkVideoEncodeH265SessionParametersGetInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265SessionParametersGetInfoKHR(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$writeStdVPS = PathElement.groupElement("PATH$writeStdVPS");
    public static final PathElement PATH$writeStdSPS = PathElement.groupElement("PATH$writeStdSPS");
    public static final PathElement PATH$writeStdPPS = PathElement.groupElement("PATH$writeStdPPS");
    public static final PathElement PATH$stdVPSId = PathElement.groupElement("PATH$stdVPSId");
    public static final PathElement PATH$stdSPSId = PathElement.groupElement("PATH$stdSPSId");
    public static final PathElement PATH$stdPPSId = PathElement.groupElement("PATH$stdPPSId");

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

}
