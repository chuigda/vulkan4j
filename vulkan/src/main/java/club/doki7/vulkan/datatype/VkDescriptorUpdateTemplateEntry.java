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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorUpdateTemplateEntry.html"><code>VkDescriptorUpdateTemplateEntry</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDescriptorUpdateTemplateEntry {
///     uint32_t dstBinding; // @link substring="dstBinding" target="#dstBinding"
///     uint32_t dstArrayElement; // @link substring="dstArrayElement" target="#dstArrayElement"
///     uint32_t descriptorCount; // @link substring="descriptorCount" target="#descriptorCount"
///     VkDescriptorType descriptorType; // @link substring="VkDescriptorType" target="VkDescriptorType" @link substring="descriptorType" target="#descriptorType"
///     size_t offset; // @link substring="offset" target="#offset"
///     size_t stride; // @link substring="stride" target="#stride"
/// } VkDescriptorUpdateTemplateEntry;
/// }
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorUpdateTemplateEntry.html"><code>VkDescriptorUpdateTemplateEntry</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorUpdateTemplateEntry(@NotNull MemorySegment segment) implements IPointer {
    public static VkDescriptorUpdateTemplateEntry allocate(Arena arena) {
        return new VkDescriptorUpdateTemplateEntry(arena.allocate(LAYOUT));
    }

    public static VkDescriptorUpdateTemplateEntry[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorUpdateTemplateEntry[] ret = new VkDescriptorUpdateTemplateEntry[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorUpdateTemplateEntry(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDescriptorUpdateTemplateEntry clone(Arena arena, VkDescriptorUpdateTemplateEntry src) {
        VkDescriptorUpdateTemplateEntry ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorUpdateTemplateEntry[] clone(Arena arena, VkDescriptorUpdateTemplateEntry[] src) {
        VkDescriptorUpdateTemplateEntry[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int dstBinding() {
        return segment.get(LAYOUT$dstBinding, OFFSET$dstBinding);
    }

    public void dstBinding(@unsigned int value) {
        segment.set(LAYOUT$dstBinding, OFFSET$dstBinding, value);
    }

    public @unsigned int dstArrayElement() {
        return segment.get(LAYOUT$dstArrayElement, OFFSET$dstArrayElement);
    }

    public void dstArrayElement(@unsigned int value) {
        segment.set(LAYOUT$dstArrayElement, OFFSET$dstArrayElement, value);
    }

    public @unsigned int descriptorCount() {
        return segment.get(LAYOUT$descriptorCount, OFFSET$descriptorCount);
    }

    public void descriptorCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorCount, OFFSET$descriptorCount, value);
    }

    public @enumtype(VkDescriptorType.class) int descriptorType() {
        return segment.get(LAYOUT$descriptorType, OFFSET$descriptorType);
    }

    public void descriptorType(@enumtype(VkDescriptorType.class) int value) {
        segment.set(LAYOUT$descriptorType, OFFSET$descriptorType, value);
    }

    public @unsigned long offset() {
        return NativeLayout.readCSizeT(segment, OFFSET$offset);
    }

    public void offset(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$offset, value);
    }

    public @unsigned long stride() {
        return NativeLayout.readCSizeT(segment, OFFSET$stride);
    }

    public void stride(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$stride, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        NativeLayout.C_SIZE_T.withName("offset"),
        NativeLayout.C_SIZE_T.withName("stride")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$dstBinding = PathElement.groupElement("dstBinding");
    public static final PathElement PATH$dstArrayElement = PathElement.groupElement("dstArrayElement");
    public static final PathElement PATH$descriptorCount = PathElement.groupElement("descriptorCount");
    public static final PathElement PATH$descriptorType = PathElement.groupElement("descriptorType");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");

    public static final OfInt LAYOUT$dstBinding = (OfInt) LAYOUT.select(PATH$dstBinding);
    public static final OfInt LAYOUT$dstArrayElement = (OfInt) LAYOUT.select(PATH$dstArrayElement);
    public static final OfInt LAYOUT$descriptorCount = (OfInt) LAYOUT.select(PATH$descriptorCount);
    public static final OfInt LAYOUT$descriptorType = (OfInt) LAYOUT.select(PATH$descriptorType);

    public static final long SIZE$dstBinding = LAYOUT$dstBinding.byteSize();
    public static final long SIZE$dstArrayElement = LAYOUT$dstArrayElement.byteSize();
    public static final long SIZE$descriptorCount = LAYOUT$descriptorCount.byteSize();
    public static final long SIZE$descriptorType = LAYOUT$descriptorType.byteSize();
    public static final long SIZE$offset = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$stride = NativeLayout.C_SIZE_T.byteSize();

    public static final long OFFSET$dstBinding = LAYOUT.byteOffset(PATH$dstBinding);
    public static final long OFFSET$dstArrayElement = LAYOUT.byteOffset(PATH$dstArrayElement);
    public static final long OFFSET$descriptorCount = LAYOUT.byteOffset(PATH$descriptorCount);
    public static final long OFFSET$descriptorType = LAYOUT.byteOffset(PATH$descriptorType);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
}
