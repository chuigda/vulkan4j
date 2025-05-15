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

/// Represents a pointer to a {@code VkBufferConstraintsInfoFUCHSIA} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBufferConstraintsInfoFUCHSIA.html">VkBufferConstraintsInfoFUCHSIA</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBufferConstraintsInfoFUCHSIA(@NotNull MemorySegment segment) implements IPointer {
    public VkBufferConstraintsInfoFUCHSIA {
        sType(VkStructureType.BUFFER_CONSTRAINTS_INFO_FUCHSIA);
    }

    public static VkBufferConstraintsInfoFUCHSIA allocate(Arena arena) {
        return new VkBufferConstraintsInfoFUCHSIA(arena.allocate(LAYOUT));
    }

    public static VkBufferConstraintsInfoFUCHSIA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBufferConstraintsInfoFUCHSIA[] ret = new VkBufferConstraintsInfoFUCHSIA[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBufferConstraintsInfoFUCHSIA(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBufferConstraintsInfoFUCHSIA clone(Arena arena, VkBufferConstraintsInfoFUCHSIA src) {
        VkBufferConstraintsInfoFUCHSIA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBufferConstraintsInfoFUCHSIA[] clone(Arena arena, VkBufferConstraintsInfoFUCHSIA[] src) {
        VkBufferConstraintsInfoFUCHSIA[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkBufferCreateInfo.LAYOUT.withName("createInfo"),
        ValueLayout.JAVA_INT.withName("requiredFormatFeatures"),
        VkBufferCollectionConstraintsInfoFUCHSIA.LAYOUT.withName("bufferCollectionConstraints")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$createInfo = PathElement.groupElement("PATH$createInfo");
    public static final PathElement PATH$requiredFormatFeatures = PathElement.groupElement("PATH$requiredFormatFeatures");
    public static final PathElement PATH$bufferCollectionConstraints = PathElement.groupElement("PATH$bufferCollectionConstraints");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$createInfo = (StructLayout) LAYOUT.select(PATH$createInfo);
    public static final OfInt LAYOUT$requiredFormatFeatures = (OfInt) LAYOUT.select(PATH$requiredFormatFeatures);
    public static final StructLayout LAYOUT$bufferCollectionConstraints = (StructLayout) LAYOUT.select(PATH$bufferCollectionConstraints);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$createInfo = LAYOUT$createInfo.byteSize();
    public static final long SIZE$requiredFormatFeatures = LAYOUT$requiredFormatFeatures.byteSize();
    public static final long SIZE$bufferCollectionConstraints = LAYOUT$bufferCollectionConstraints.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$createInfo = LAYOUT.byteOffset(PATH$createInfo);
    public static final long OFFSET$requiredFormatFeatures = LAYOUT.byteOffset(PATH$requiredFormatFeatures);
    public static final long OFFSET$bufferCollectionConstraints = LAYOUT.byteOffset(PATH$bufferCollectionConstraints);

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

    public VkBufferCreateInfo createInfo() {
        return new VkBufferCreateInfo(segment.asSlice(OFFSET$createInfo, LAYOUT$createInfo));
    }

    public void createInfo(VkBufferCreateInfo value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$createInfo, SIZE$createInfo);
    }

    public @enumtype(VkFormatFeatureFlags.class) int requiredFormatFeatures() {
        return segment.get(LAYOUT$requiredFormatFeatures, OFFSET$requiredFormatFeatures);
    }

    public void requiredFormatFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$requiredFormatFeatures, OFFSET$requiredFormatFeatures, value);
    }

    public VkBufferCollectionConstraintsInfoFUCHSIA bufferCollectionConstraints() {
        return new VkBufferCollectionConstraintsInfoFUCHSIA(segment.asSlice(OFFSET$bufferCollectionConstraints, LAYOUT$bufferCollectionConstraints));
    }

    public void bufferCollectionConstraints(VkBufferCollectionConstraintsInfoFUCHSIA value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$bufferCollectionConstraints, SIZE$bufferCollectionConstraints);
    }

}
