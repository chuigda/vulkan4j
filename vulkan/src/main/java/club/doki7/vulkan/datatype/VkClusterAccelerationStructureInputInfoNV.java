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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureInputInfoNV.html"><code>VkClusterAccelerationStructureInputInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClusterAccelerationStructureInputInfoNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t maxAccelerationStructureCount; // @link substring="maxAccelerationStructureCount" target="#maxAccelerationStructureCount"
///     VkBuildAccelerationStructureFlagsKHR flags; // optional // @link substring="VkBuildAccelerationStructureFlagsKHR" target="VkBuildAccelerationStructureFlagsKHR" @link substring="flags" target="#flags"
///     VkClusterAccelerationStructureOpTypeNV opType; // @link substring="VkClusterAccelerationStructureOpTypeNV" target="VkClusterAccelerationStructureOpTypeNV" @link substring="opType" target="#opType"
///     VkClusterAccelerationStructureOpModeNV opMode; // @link substring="VkClusterAccelerationStructureOpModeNV" target="VkClusterAccelerationStructureOpModeNV" @link substring="opMode" target="#opMode"
///     VkClusterAccelerationStructureOpInputNV opInput; // @link substring="VkClusterAccelerationStructureOpInputNV" target="VkClusterAccelerationStructureOpInputNV" @link substring="opInput" target="#opInput"
/// } VkClusterAccelerationStructureInputInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV`
///
/// The {@code allocate} ({@link VkClusterAccelerationStructureInputInfoNV#allocate(Arena)}, {@link VkClusterAccelerationStructureInputInfoNV#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkClusterAccelerationStructureInputInfoNV#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureInputInfoNV.html"><code>VkClusterAccelerationStructureInputInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClusterAccelerationStructureInputInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkClusterAccelerationStructureInputInfoNV allocate(Arena arena) {
        VkClusterAccelerationStructureInputInfoNV ret = new VkClusterAccelerationStructureInputInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV);
        return ret;
    }

    public static VkClusterAccelerationStructureInputInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureInputInfoNV[] ret = new VkClusterAccelerationStructureInputInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClusterAccelerationStructureInputInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV);
        }
        return ret;
    }

    public static VkClusterAccelerationStructureInputInfoNV clone(Arena arena, VkClusterAccelerationStructureInputInfoNV src) {
        VkClusterAccelerationStructureInputInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClusterAccelerationStructureInputInfoNV[] clone(Arena arena, VkClusterAccelerationStructureInputInfoNV[] src) {
        VkClusterAccelerationStructureInputInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV);
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

    public @unsigned int maxAccelerationStructureCount() {
        return segment.get(LAYOUT$maxAccelerationStructureCount, OFFSET$maxAccelerationStructureCount);
    }

    public void maxAccelerationStructureCount(@unsigned int value) {
        segment.set(LAYOUT$maxAccelerationStructureCount, OFFSET$maxAccelerationStructureCount, value);
    }

    public @enumtype(VkBuildAccelerationStructureFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkBuildAccelerationStructureFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkClusterAccelerationStructureOpTypeNV.class) int opType() {
        return segment.get(LAYOUT$opType, OFFSET$opType);
    }

    public void opType(@enumtype(VkClusterAccelerationStructureOpTypeNV.class) int value) {
        segment.set(LAYOUT$opType, OFFSET$opType, value);
    }

    public @enumtype(VkClusterAccelerationStructureOpModeNV.class) int opMode() {
        return segment.get(LAYOUT$opMode, OFFSET$opMode);
    }

    public void opMode(@enumtype(VkClusterAccelerationStructureOpModeNV.class) int value) {
        segment.set(LAYOUT$opMode, OFFSET$opMode, value);
    }

    public @NotNull VkClusterAccelerationStructureOpInputNV opInput() {
        return new VkClusterAccelerationStructureOpInputNV(segment.asSlice(OFFSET$opInput, LAYOUT$opInput));
    }

    public void opInput(@NotNull VkClusterAccelerationStructureOpInputNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$opInput, SIZE$opInput);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxAccelerationStructureCount"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("opType"),
        ValueLayout.JAVA_INT.withName("opMode"),
        VkClusterAccelerationStructureOpInputNV.LAYOUT.withName("opInput")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxAccelerationStructureCount = PathElement.groupElement("PATH$maxAccelerationStructureCount");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$opType = PathElement.groupElement("PATH$opType");
    public static final PathElement PATH$opMode = PathElement.groupElement("PATH$opMode");
    public static final PathElement PATH$opInput = PathElement.groupElement("PATH$opInput");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxAccelerationStructureCount = (OfInt) LAYOUT.select(PATH$maxAccelerationStructureCount);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$opType = (OfInt) LAYOUT.select(PATH$opType);
    public static final OfInt LAYOUT$opMode = (OfInt) LAYOUT.select(PATH$opMode);
    public static final StructLayout LAYOUT$opInput = (StructLayout) LAYOUT.select(PATH$opInput);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxAccelerationStructureCount = LAYOUT$maxAccelerationStructureCount.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$opType = LAYOUT$opType.byteSize();
    public static final long SIZE$opMode = LAYOUT$opMode.byteSize();
    public static final long SIZE$opInput = LAYOUT$opInput.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxAccelerationStructureCount = LAYOUT.byteOffset(PATH$maxAccelerationStructureCount);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$opType = LAYOUT.byteOffset(PATH$opType);
    public static final long OFFSET$opMode = LAYOUT.byteOffset(PATH$opMode);
    public static final long OFFSET$opInput = LAYOUT.byteOffset(PATH$opInput);
}
