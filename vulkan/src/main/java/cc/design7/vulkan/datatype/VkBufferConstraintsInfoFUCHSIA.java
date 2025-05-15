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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBufferConstraintsInfoFUCHSIA.html">VkBufferConstraintsInfoFUCHSIA</a>
@ValueBasedCandidate
public record VkBufferConstraintsInfoFUCHSIA(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final StructLayout LAYOUT$createInfo = VkBufferCreateInfo.LAYOUT.withName("createInfo");
    public static final OfInt LAYOUT$requiredFormatFeatures = ValueLayout.JAVA_INT.withName("requiredFormatFeatures");
    public static final StructLayout LAYOUT$bufferCollectionConstraints = VkBufferCollectionConstraintsInfoFUCHSIA.LAYOUT.withName("bufferCollectionConstraints");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$createInfo, LAYOUT$requiredFormatFeatures, LAYOUT$bufferCollectionConstraints);
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$createInfo = PathElement.groupElement("PATH$createInfo");
    public static final PathElement PATH$requiredFormatFeatures = PathElement.groupElement("PATH$requiredFormatFeatures");
    public static final PathElement PATH$bufferCollectionConstraints = PathElement.groupElement("PATH$bufferCollectionConstraints");

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
