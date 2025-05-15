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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeAV1ProfileInfoKHR.html">VkVideoDecodeAV1ProfileInfoKHR</a>
@ValueBasedCandidate
public record VkVideoDecodeAV1ProfileInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$stdProfile = ValueLayout.JAVA_INT.withName("stdProfile");
    public static final OfInt LAYOUT$filmGrainSupport = ValueLayout.JAVA_INT.withName("filmGrainSupport");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$stdProfile, LAYOUT$filmGrainSupport);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoDecodeAV1ProfileInfoKHR allocate(Arena arena) {
        return new VkVideoDecodeAV1ProfileInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoDecodeAV1ProfileInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeAV1ProfileInfoKHR[] ret = new VkVideoDecodeAV1ProfileInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeAV1ProfileInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoDecodeAV1ProfileInfoKHR clone(Arena arena, VkVideoDecodeAV1ProfileInfoKHR src) {
        VkVideoDecodeAV1ProfileInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeAV1ProfileInfoKHR[] clone(Arena arena, VkVideoDecodeAV1ProfileInfoKHR[] src) {
        VkVideoDecodeAV1ProfileInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stdProfile = PathElement.groupElement("PATH$stdProfile");
    public static final PathElement PATH$filmGrainSupport = PathElement.groupElement("PATH$filmGrainSupport");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stdProfile = LAYOUT$stdProfile.byteSize();
    public static final long SIZE$filmGrainSupport = LAYOUT$filmGrainSupport.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stdProfile = LAYOUT.byteOffset(PATH$stdProfile);
    public static final long OFFSET$filmGrainSupport = LAYOUT.byteOffset(PATH$filmGrainSupport);

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

    public @enumtype(StdVideoAV1Profile.class) int stdProfile() {
        return segment.get(LAYOUT$stdProfile, OFFSET$stdProfile);
    }

    public void stdProfile(@enumtype(StdVideoAV1Profile.class) int value) {
        segment.set(LAYOUT$stdProfile, OFFSET$stdProfile, value);
    }

    public @unsigned int filmGrainSupport() {
        return segment.get(LAYOUT$filmGrainSupport, OFFSET$filmGrainSupport);
    }

    public void filmGrainSupport(@unsigned int value) {
        segment.set(LAYOUT$filmGrainSupport, OFFSET$filmGrainSupport, value);
    }

}
