package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkValidationFlagsEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t disabledValidationCheckCount;
///     const VkValidationCheckEXT* pDisabledValidationChecks;
/// } VkValidationFlagsEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkValidationFlagsEXT.html">VkValidationFlagsEXT</a>
public record VkValidationFlagsEXT(MemorySegment segment) implements IPointer {
    public VkValidationFlagsEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_VALIDATION_FLAGS_EXT);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @Nullable @enumtype(VkValidationCheckEXT.class) IntBuffer pDisabledValidationChecks() {
        MemorySegment s = pDisabledValidationChecksRaw();
        if (s.address() == 0) {
            return null;
        }

        return new IntBuffer(s);
    }

    public void pDisabledValidationChecks(@Nullable @enumtype(VkValidationCheckEXT.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDisabledValidationChecksRaw(s);
    }

    public static VkValidationFlagsEXT allocate(Arena arena) {
        return new VkValidationFlagsEXT(arena.allocate(LAYOUT));
    }

    public static VkValidationFlagsEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkValidationFlagsEXT[] ret = new VkValidationFlagsEXT[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disabledValidationCheckCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDisabledValidationChecks")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$disabledValidationCheckCount = PathElement.groupElement("disabledValidationCheckCount");
    public static final PathElement PATH$pDisabledValidationChecks = PathElement.groupElement("pDisabledValidationChecks");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$disabledValidationCheckCount = (OfInt) LAYOUT.select(PATH$disabledValidationCheckCount);
    public static final AddressLayout LAYOUT$pDisabledValidationChecks = (AddressLayout) LAYOUT.select(PATH$pDisabledValidationChecks);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$disabledValidationCheckCount = LAYOUT.byteOffset(PATH$disabledValidationCheckCount);
    public static final long OFFSET$pDisabledValidationChecks = LAYOUT.byteOffset(PATH$pDisabledValidationChecks);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$disabledValidationCheckCount = LAYOUT$disabledValidationCheckCount.byteSize();
    public static final long SIZE$pDisabledValidationChecks = LAYOUT$pDisabledValidationChecks.byteSize();
}
