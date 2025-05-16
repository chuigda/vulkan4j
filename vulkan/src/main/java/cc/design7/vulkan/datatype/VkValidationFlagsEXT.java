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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkValidationFlagsEXT.html"><code>VkValidationFlagsEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkValidationFlagsEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t disabledValidationCheckCount;
///     VkValidationCheckEXT const* pDisabledValidationChecks;
/// } VkValidationFlagsEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VALIDATION_FLAGS_EXT`
///
/// The {@link VkValidationFlagsEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkValidationFlagsEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkValidationFlagsEXT.html"><code>VkValidationFlagsEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkValidationFlagsEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkValidationFlagsEXT allocate(Arena arena) {
        VkValidationFlagsEXT ret = new VkValidationFlagsEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VALIDATION_FLAGS_EXT);
        return ret;
    }

    public static VkValidationFlagsEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkValidationFlagsEXT[] ret = new VkValidationFlagsEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkValidationFlagsEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VALIDATION_FLAGS_EXT);
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

    public void autoInit() {
        sType(VkStructureType.VALIDATION_FLAGS_EXT);
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pDisabledValidationChecks(@Nullable @enumtype(VkValidationCheckEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDisabledValidationChecksRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disabledValidationCheckCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDisabledValidationChecks")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$disabledValidationCheckCount = PathElement.groupElement("PATH$disabledValidationCheckCount");
    public static final PathElement PATH$pDisabledValidationChecks = PathElement.groupElement("PATH$pDisabledValidationChecks");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$disabledValidationCheckCount = (OfInt) LAYOUT.select(PATH$disabledValidationCheckCount);
    public static final AddressLayout LAYOUT$pDisabledValidationChecks = (AddressLayout) LAYOUT.select(PATH$pDisabledValidationChecks);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$disabledValidationCheckCount = LAYOUT$disabledValidationCheckCount.byteSize();
    public static final long SIZE$pDisabledValidationChecks = LAYOUT$pDisabledValidationChecks.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$disabledValidationCheckCount = LAYOUT.byteOffset(PATH$disabledValidationCheckCount);
    public static final long OFFSET$pDisabledValidationChecks = LAYOUT.byteOffset(PATH$pDisabledValidationChecks);
}
