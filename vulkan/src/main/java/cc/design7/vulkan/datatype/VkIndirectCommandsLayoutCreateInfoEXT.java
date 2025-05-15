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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsLayoutCreateInfoEXT.html"><code>VkIndirectCommandsLayoutCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkIndirectCommandsLayoutCreateInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkIndirectCommandsLayoutUsageFlagsEXT flags; // optional
///     VkShaderStageFlags shaderStages;
///     uint32_t indirectStride;
///     VkPipelineLayout pipelineLayout; // optional
///     uint32_t tokenCount;
///     VkIndirectCommandsLayoutTokenEXT const* pTokens;
/// } VkIndirectCommandsLayoutCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT`
///
/// The {@link VkIndirectCommandsLayoutCreateInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkIndirectCommandsLayoutCreateInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsLayoutCreateInfoEXT.html"><code>VkIndirectCommandsLayoutCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectCommandsLayoutCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkIndirectCommandsLayoutCreateInfoEXT allocate(Arena arena) {
        VkIndirectCommandsLayoutCreateInfoEXT ret = new VkIndirectCommandsLayoutCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT);
        return ret;
    }

    public static VkIndirectCommandsLayoutCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsLayoutCreateInfoEXT[] ret = new VkIndirectCommandsLayoutCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectCommandsLayoutCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkIndirectCommandsLayoutCreateInfoEXT clone(Arena arena, VkIndirectCommandsLayoutCreateInfoEXT src) {
        VkIndirectCommandsLayoutCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectCommandsLayoutCreateInfoEXT[] clone(Arena arena, VkIndirectCommandsLayoutCreateInfoEXT[] src) {
        VkIndirectCommandsLayoutCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkIndirectCommandsLayoutUsageFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkIndirectCommandsLayoutUsageFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkShaderStageFlags.class) int shaderStages() {
        return segment.get(LAYOUT$shaderStages, OFFSET$shaderStages);
    }

    public void shaderStages(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$shaderStages, OFFSET$shaderStages, value);
    }

    public @unsigned int indirectStride() {
        return segment.get(LAYOUT$indirectStride, OFFSET$indirectStride);
    }

    public void indirectStride(@unsigned int value) {
        segment.set(LAYOUT$indirectStride, OFFSET$indirectStride, value);
    }

    public @Nullable VkPipelineLayout pipelineLayout() {
        MemorySegment s = segment.asSlice(OFFSET$pipelineLayout, SIZE$pipelineLayout);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void pipelineLayout(@Nullable VkPipelineLayout value) {
        segment.set(LAYOUT$pipelineLayout, OFFSET$pipelineLayout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int tokenCount() {
        return segment.get(LAYOUT$tokenCount, OFFSET$tokenCount);
    }

    public void tokenCount(@unsigned int value) {
        segment.set(LAYOUT$tokenCount, OFFSET$tokenCount, value);
    }

    public @pointer(comment="VkIndirectCommandsLayoutTokenEXT*") MemorySegment pTokensRaw() {
        return segment.get(LAYOUT$pTokens, OFFSET$pTokens);
    }

    public void pTokensRaw(@pointer(comment="VkIndirectCommandsLayoutTokenEXT*") MemorySegment value) {
        segment.set(LAYOUT$pTokens, OFFSET$pTokens, value);
    }

    public @Nullable VkIndirectCommandsLayoutTokenEXT pTokens() {
        MemorySegment s = pTokensRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkIndirectCommandsLayoutTokenEXT(s);
    }

    public void pTokens(@Nullable VkIndirectCommandsLayoutTokenEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTokensRaw(s);
    }

    @unsafe public @Nullable VkIndirectCommandsLayoutTokenEXT[] pTokens(int assumedCount) {
        MemorySegment s = pTokensRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectCommandsLayoutTokenEXT.SIZE);
        VkIndirectCommandsLayoutTokenEXT[] ret = new VkIndirectCommandsLayoutTokenEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectCommandsLayoutTokenEXT(s.asSlice(i * VkIndirectCommandsLayoutTokenEXT.SIZE, VkIndirectCommandsLayoutTokenEXT.SIZE));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("shaderStages"),
        ValueLayout.JAVA_INT.withName("indirectStride"),
        ValueLayout.ADDRESS.withName("pipelineLayout"),
        ValueLayout.JAVA_INT.withName("tokenCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkIndirectCommandsLayoutTokenEXT.LAYOUT).withName("pTokens")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$shaderStages = PathElement.groupElement("PATH$shaderStages");
    public static final PathElement PATH$indirectStride = PathElement.groupElement("PATH$indirectStride");
    public static final PathElement PATH$pipelineLayout = PathElement.groupElement("PATH$pipelineLayout");
    public static final PathElement PATH$tokenCount = PathElement.groupElement("PATH$tokenCount");
    public static final PathElement PATH$pTokens = PathElement.groupElement("PATH$pTokens");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$shaderStages = (OfInt) LAYOUT.select(PATH$shaderStages);
    public static final OfInt LAYOUT$indirectStride = (OfInt) LAYOUT.select(PATH$indirectStride);
    public static final AddressLayout LAYOUT$pipelineLayout = (AddressLayout) LAYOUT.select(PATH$pipelineLayout);
    public static final OfInt LAYOUT$tokenCount = (OfInt) LAYOUT.select(PATH$tokenCount);
    public static final AddressLayout LAYOUT$pTokens = (AddressLayout) LAYOUT.select(PATH$pTokens);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$shaderStages = LAYOUT$shaderStages.byteSize();
    public static final long SIZE$indirectStride = LAYOUT$indirectStride.byteSize();
    public static final long SIZE$pipelineLayout = LAYOUT$pipelineLayout.byteSize();
    public static final long SIZE$tokenCount = LAYOUT$tokenCount.byteSize();
    public static final long SIZE$pTokens = LAYOUT$pTokens.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$shaderStages = LAYOUT.byteOffset(PATH$shaderStages);
    public static final long OFFSET$indirectStride = LAYOUT.byteOffset(PATH$indirectStride);
    public static final long OFFSET$pipelineLayout = LAYOUT.byteOffset(PATH$pipelineLayout);
    public static final long OFFSET$tokenCount = LAYOUT.byteOffset(PATH$tokenCount);
    public static final long OFFSET$pTokens = LAYOUT.byteOffset(PATH$pTokens);
}
