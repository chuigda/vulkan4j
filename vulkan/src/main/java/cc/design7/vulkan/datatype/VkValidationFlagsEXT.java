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

public record VkValidationFlagsEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$disabledValidationCheckCount = ValueLayout.JAVA_INT.withName("disabledValidationCheckCount");
    public static final AddressLayout LAYOUT$pDisabledValidationChecks = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDisabledValidationChecks");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$disabledValidationCheckCount, LAYOUT$pDisabledValidationChecks);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkValidationFlagsEXT allocate(Arena arena) {
        return new VkValidationFlagsEXT(arena.allocate(LAYOUT));
    }

    public static VkValidationFlagsEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkValidationFlagsEXT[] ret = new VkValidationFlagsEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkValidationFlagsEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkValidationFlagsEXT clone(Arena arena, VkValidationFlagsEXT src) {
        VkValidationFlagsEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkValidationFlagsEXT[] clone(Arena arena, VkValidationFlagsEXT[] src) {
        VkValidationFlagsEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$disabledValidationCheckCount = PathElement.groupElement("PATH$disabledValidationCheckCount");
    public static final PathElement PATH$pDisabledValidationChecks = PathElement.groupElement("PATH$pDisabledValidationChecks");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$disabledValidationCheckCount = LAYOUT$disabledValidationCheckCount.byteSize();
    public static final long SIZE$pDisabledValidationChecks = LAYOUT$pDisabledValidationChecks.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$disabledValidationCheckCount = LAYOUT.byteOffset(PATH$disabledValidationCheckCount);
    public static final long OFFSET$pDisabledValidationChecks = LAYOUT.byteOffset(PATH$pDisabledValidationChecks);

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

    public @unsigned int disabledValidationCheckCount() {
        return segment.get(LAYOUT$disabledValidationCheckCount, OFFSET$disabledValidationCheckCount);
    }

    public void disabledValidationCheckCount(@unsigned int value) {
        segment.set(LAYOUT$disabledValidationCheckCount, OFFSET$disabledValidationCheckCount, value);
    }

    public @pointer(target=VkValidationCheckEXT.class) MemorySegment pDisabledValidationChecksRaw() {
        return segment.get(LAYOUT$pDisabledValidationChecks, OFFSET$pDisabledValidationChecks);
    }

    public void pDisabledValidationChecksRaw(@pointer(target=VkValidationCheckEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pDisabledValidationChecks, OFFSET$pDisabledValidationChecks, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkValidationCheckEXT.class) IntPtr pDisabledValidationChecks() {
        MemorySegment s = pDisabledValidationChecksRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pDisabledValidationChecks(@Nullable @enumtype(VkValidationCheckEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDisabledValidationChecksRaw(s);
    }

}
/// dummy, not implemented yet
