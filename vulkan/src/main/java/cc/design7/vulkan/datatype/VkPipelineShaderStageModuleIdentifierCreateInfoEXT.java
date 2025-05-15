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

/// Represents a pointer to a {@code VkPipelineShaderStageModuleIdentifierCreateInfoEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineShaderStageModuleIdentifierCreateInfoEXT.html">VkPipelineShaderStageModuleIdentifierCreateInfoEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineShaderStageModuleIdentifierCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT {
        sType(VkStructureType.PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT);
    }

    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT allocate(Arena arena) {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineShaderStageModuleIdentifierCreateInfoEXT[] ret = new VkPipelineShaderStageModuleIdentifierCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT clone(Arena arena, VkPipelineShaderStageModuleIdentifierCreateInfoEXT src) {
        VkPipelineShaderStageModuleIdentifierCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT[] clone(Arena arena, VkPipelineShaderStageModuleIdentifierCreateInfoEXT[] src) {
        VkPipelineShaderStageModuleIdentifierCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("identifierSize"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pIdentifier")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$identifierSize = PathElement.groupElement("PATH$identifierSize");
    public static final PathElement PATH$pIdentifier = PathElement.groupElement("PATH$pIdentifier");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$identifierSize = (OfInt) LAYOUT.select(PATH$identifierSize);
    public static final AddressLayout LAYOUT$pIdentifier = (AddressLayout) LAYOUT.select(PATH$pIdentifier);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$identifierSize = LAYOUT$identifierSize.byteSize();
    public static final long SIZE$pIdentifier = LAYOUT$pIdentifier.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$identifierSize = LAYOUT.byteOffset(PATH$identifierSize);
    public static final long OFFSET$pIdentifier = LAYOUT.byteOffset(PATH$pIdentifier);

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

    public @unsigned int identifierSize() {
        return segment.get(LAYOUT$identifierSize, OFFSET$identifierSize);
    }

    public void identifierSize(@unsigned int value) {
        segment.set(LAYOUT$identifierSize, OFFSET$identifierSize, value);
    }

    public @pointer(comment="byte*") MemorySegment pIdentifierRaw() {
        return segment.get(LAYOUT$pIdentifier, OFFSET$pIdentifier);
    }

    public void pIdentifierRaw(@pointer(comment="byte*") MemorySegment value) {
        segment.set(LAYOUT$pIdentifier, OFFSET$pIdentifier, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned BytePtr pIdentifier() {
        MemorySegment s = pIdentifierRaw();
        if (s.address() == 0) {
            return null;
        }
        return new BytePtr(s);
    }

    public void pIdentifier(@Nullable @unsigned BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pIdentifierRaw(s);
    }

}
