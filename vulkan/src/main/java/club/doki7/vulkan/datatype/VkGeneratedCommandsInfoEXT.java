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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeneratedCommandsInfoEXT.html"><code>VkGeneratedCommandsInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkGeneratedCommandsInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkShaderStageFlags shaderStages; // @link substring="VkShaderStageFlags" target="VkShaderStageFlags" @link substring="shaderStages" target="#shaderStages"
///     VkIndirectExecutionSetEXT indirectExecutionSet; // optional // @link substring="VkIndirectExecutionSetEXT" target="VkIndirectExecutionSetEXT" @link substring="indirectExecutionSet" target="#indirectExecutionSet"
///     VkIndirectCommandsLayoutEXT indirectCommandsLayout; // @link substring="VkIndirectCommandsLayoutEXT" target="VkIndirectCommandsLayoutEXT" @link substring="indirectCommandsLayout" target="#indirectCommandsLayout"
///     VkDeviceAddress indirectAddress; // @link substring="indirectAddress" target="#indirectAddress"
///     VkDeviceSize indirectAddressSize; // @link substring="indirectAddressSize" target="#indirectAddressSize"
///     VkDeviceAddress preprocessAddress; // optional // @link substring="preprocessAddress" target="#preprocessAddress"
///     VkDeviceSize preprocessSize; // @link substring="preprocessSize" target="#preprocessSize"
///     uint32_t maxSequenceCount; // @link substring="maxSequenceCount" target="#maxSequenceCount"
///     VkDeviceAddress sequenceCountAddress; // optional // @link substring="sequenceCountAddress" target="#sequenceCountAddress"
///     uint32_t maxDrawCount; // @link substring="maxDrawCount" target="#maxDrawCount"
/// } VkGeneratedCommandsInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT`
///
/// The {@code allocate} ({@link VkGeneratedCommandsInfoEXT#allocate(Arena)}, {@link VkGeneratedCommandsInfoEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkGeneratedCommandsInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeneratedCommandsInfoEXT.html"><code>VkGeneratedCommandsInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkGeneratedCommandsInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkGeneratedCommandsInfoEXT allocate(Arena arena) {
        VkGeneratedCommandsInfoEXT ret = new VkGeneratedCommandsInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.GENERATED_COMMANDS_INFO_EXT);
        return ret;
    }

    public static VkGeneratedCommandsInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeneratedCommandsInfoEXT[] ret = new VkGeneratedCommandsInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkGeneratedCommandsInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.GENERATED_COMMANDS_INFO_EXT);
        }
        return ret;
    }

    public static VkGeneratedCommandsInfoEXT clone(Arena arena, VkGeneratedCommandsInfoEXT src) {
        VkGeneratedCommandsInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkGeneratedCommandsInfoEXT[] clone(Arena arena, VkGeneratedCommandsInfoEXT[] src) {
        VkGeneratedCommandsInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.GENERATED_COMMANDS_INFO_EXT);
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

    public @enumtype(VkShaderStageFlags.class) int shaderStages() {
        return segment.get(LAYOUT$shaderStages, OFFSET$shaderStages);
    }

    public void shaderStages(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$shaderStages, OFFSET$shaderStages, value);
    }

    public @Nullable VkIndirectExecutionSetEXT indirectExecutionSet() {
        MemorySegment s = segment.asSlice(OFFSET$indirectExecutionSet, SIZE$indirectExecutionSet);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkIndirectExecutionSetEXT(s);
    }

    public void indirectExecutionSet(@Nullable VkIndirectExecutionSetEXT value) {
        segment.set(LAYOUT$indirectExecutionSet, OFFSET$indirectExecutionSet, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkIndirectCommandsLayoutEXT indirectCommandsLayout() {
        MemorySegment s = segment.asSlice(OFFSET$indirectCommandsLayout, SIZE$indirectCommandsLayout);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkIndirectCommandsLayoutEXT(s);
    }

    public void indirectCommandsLayout(@Nullable VkIndirectCommandsLayoutEXT value) {
        segment.set(LAYOUT$indirectCommandsLayout, OFFSET$indirectCommandsLayout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long indirectAddress() {
        return segment.get(LAYOUT$indirectAddress, OFFSET$indirectAddress);
    }

    public void indirectAddress(@unsigned long value) {
        segment.set(LAYOUT$indirectAddress, OFFSET$indirectAddress, value);
    }

    public @unsigned long indirectAddressSize() {
        return segment.get(LAYOUT$indirectAddressSize, OFFSET$indirectAddressSize);
    }

    public void indirectAddressSize(@unsigned long value) {
        segment.set(LAYOUT$indirectAddressSize, OFFSET$indirectAddressSize, value);
    }

    public @unsigned long preprocessAddress() {
        return segment.get(LAYOUT$preprocessAddress, OFFSET$preprocessAddress);
    }

    public void preprocessAddress(@unsigned long value) {
        segment.set(LAYOUT$preprocessAddress, OFFSET$preprocessAddress, value);
    }

    public @unsigned long preprocessSize() {
        return segment.get(LAYOUT$preprocessSize, OFFSET$preprocessSize);
    }

    public void preprocessSize(@unsigned long value) {
        segment.set(LAYOUT$preprocessSize, OFFSET$preprocessSize, value);
    }

    public @unsigned int maxSequenceCount() {
        return segment.get(LAYOUT$maxSequenceCount, OFFSET$maxSequenceCount);
    }

    public void maxSequenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxSequenceCount, OFFSET$maxSequenceCount, value);
    }

    public @unsigned long sequenceCountAddress() {
        return segment.get(LAYOUT$sequenceCountAddress, OFFSET$sequenceCountAddress);
    }

    public void sequenceCountAddress(@unsigned long value) {
        segment.set(LAYOUT$sequenceCountAddress, OFFSET$sequenceCountAddress, value);
    }

    public @unsigned int maxDrawCount() {
        return segment.get(LAYOUT$maxDrawCount, OFFSET$maxDrawCount);
    }

    public void maxDrawCount(@unsigned int value) {
        segment.set(LAYOUT$maxDrawCount, OFFSET$maxDrawCount, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderStages"),
        ValueLayout.ADDRESS.withName("indirectExecutionSet"),
        ValueLayout.ADDRESS.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_LONG.withName("indirectAddress"),
        ValueLayout.JAVA_LONG.withName("indirectAddressSize"),
        ValueLayout.JAVA_LONG.withName("preprocessAddress"),
        ValueLayout.JAVA_LONG.withName("preprocessSize"),
        ValueLayout.JAVA_INT.withName("maxSequenceCount"),
        ValueLayout.JAVA_LONG.withName("sequenceCountAddress"),
        ValueLayout.JAVA_INT.withName("maxDrawCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderStages = PathElement.groupElement("PATH$shaderStages");
    public static final PathElement PATH$indirectExecutionSet = PathElement.groupElement("PATH$indirectExecutionSet");
    public static final PathElement PATH$indirectCommandsLayout = PathElement.groupElement("PATH$indirectCommandsLayout");
    public static final PathElement PATH$indirectAddress = PathElement.groupElement("PATH$indirectAddress");
    public static final PathElement PATH$indirectAddressSize = PathElement.groupElement("PATH$indirectAddressSize");
    public static final PathElement PATH$preprocessAddress = PathElement.groupElement("PATH$preprocessAddress");
    public static final PathElement PATH$preprocessSize = PathElement.groupElement("PATH$preprocessSize");
    public static final PathElement PATH$maxSequenceCount = PathElement.groupElement("PATH$maxSequenceCount");
    public static final PathElement PATH$sequenceCountAddress = PathElement.groupElement("PATH$sequenceCountAddress");
    public static final PathElement PATH$maxDrawCount = PathElement.groupElement("PATH$maxDrawCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderStages = (OfInt) LAYOUT.select(PATH$shaderStages);
    public static final AddressLayout LAYOUT$indirectExecutionSet = (AddressLayout) LAYOUT.select(PATH$indirectExecutionSet);
    public static final AddressLayout LAYOUT$indirectCommandsLayout = (AddressLayout) LAYOUT.select(PATH$indirectCommandsLayout);
    public static final OfLong LAYOUT$indirectAddress = (OfLong) LAYOUT.select(PATH$indirectAddress);
    public static final OfLong LAYOUT$indirectAddressSize = (OfLong) LAYOUT.select(PATH$indirectAddressSize);
    public static final OfLong LAYOUT$preprocessAddress = (OfLong) LAYOUT.select(PATH$preprocessAddress);
    public static final OfLong LAYOUT$preprocessSize = (OfLong) LAYOUT.select(PATH$preprocessSize);
    public static final OfInt LAYOUT$maxSequenceCount = (OfInt) LAYOUT.select(PATH$maxSequenceCount);
    public static final OfLong LAYOUT$sequenceCountAddress = (OfLong) LAYOUT.select(PATH$sequenceCountAddress);
    public static final OfInt LAYOUT$maxDrawCount = (OfInt) LAYOUT.select(PATH$maxDrawCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderStages = LAYOUT$shaderStages.byteSize();
    public static final long SIZE$indirectExecutionSet = LAYOUT$indirectExecutionSet.byteSize();
    public static final long SIZE$indirectCommandsLayout = LAYOUT$indirectCommandsLayout.byteSize();
    public static final long SIZE$indirectAddress = LAYOUT$indirectAddress.byteSize();
    public static final long SIZE$indirectAddressSize = LAYOUT$indirectAddressSize.byteSize();
    public static final long SIZE$preprocessAddress = LAYOUT$preprocessAddress.byteSize();
    public static final long SIZE$preprocessSize = LAYOUT$preprocessSize.byteSize();
    public static final long SIZE$maxSequenceCount = LAYOUT$maxSequenceCount.byteSize();
    public static final long SIZE$sequenceCountAddress = LAYOUT$sequenceCountAddress.byteSize();
    public static final long SIZE$maxDrawCount = LAYOUT$maxDrawCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderStages = LAYOUT.byteOffset(PATH$shaderStages);
    public static final long OFFSET$indirectExecutionSet = LAYOUT.byteOffset(PATH$indirectExecutionSet);
    public static final long OFFSET$indirectCommandsLayout = LAYOUT.byteOffset(PATH$indirectCommandsLayout);
    public static final long OFFSET$indirectAddress = LAYOUT.byteOffset(PATH$indirectAddress);
    public static final long OFFSET$indirectAddressSize = LAYOUT.byteOffset(PATH$indirectAddressSize);
    public static final long OFFSET$preprocessAddress = LAYOUT.byteOffset(PATH$preprocessAddress);
    public static final long OFFSET$preprocessSize = LAYOUT.byteOffset(PATH$preprocessSize);
    public static final long OFFSET$maxSequenceCount = LAYOUT.byteOffset(PATH$maxSequenceCount);
    public static final long OFFSET$sequenceCountAddress = LAYOUT.byteOffset(PATH$sequenceCountAddress);
    public static final long OFFSET$maxDrawCount = LAYOUT.byteOffset(PATH$maxDrawCount);
}
