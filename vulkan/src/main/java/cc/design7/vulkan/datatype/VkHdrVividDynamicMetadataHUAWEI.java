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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkHdrVividDynamicMetadataHUAWEI.html">VkHdrVividDynamicMetadataHUAWEI</a>
@ValueBasedCandidate
public record VkHdrVividDynamicMetadataHUAWEI(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final ValueLayout LAYOUT$dynamicMetadataSize = NativeLayout.C_SIZE_T.withName("dynamicMetadataSize");
    public static final AddressLayout LAYOUT$pDynamicMetadata = ValueLayout.ADDRESS.withName("pDynamicMetadata");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$dynamicMetadataSize, LAYOUT$pDynamicMetadata);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkHdrVividDynamicMetadataHUAWEI allocate(Arena arena) {
        return new VkHdrVividDynamicMetadataHUAWEI(arena.allocate(LAYOUT));
    }

    public static VkHdrVividDynamicMetadataHUAWEI[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkHdrVividDynamicMetadataHUAWEI[] ret = new VkHdrVividDynamicMetadataHUAWEI[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkHdrVividDynamicMetadataHUAWEI(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkHdrVividDynamicMetadataHUAWEI clone(Arena arena, VkHdrVividDynamicMetadataHUAWEI src) {
        VkHdrVividDynamicMetadataHUAWEI ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkHdrVividDynamicMetadataHUAWEI[] clone(Arena arena, VkHdrVividDynamicMetadataHUAWEI[] src) {
        VkHdrVividDynamicMetadataHUAWEI[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$dynamicMetadataSize = PathElement.groupElement("PATH$dynamicMetadataSize");
    public static final PathElement PATH$pDynamicMetadata = PathElement.groupElement("PATH$pDynamicMetadata");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$dynamicMetadataSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$pDynamicMetadata = LAYOUT$pDynamicMetadata.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dynamicMetadataSize = LAYOUT.byteOffset(PATH$dynamicMetadataSize);
    public static final long OFFSET$pDynamicMetadata = LAYOUT.byteOffset(PATH$pDynamicMetadata);

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

    public @unsigned long dynamicMetadataSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$dynamicMetadataSize);
    }

    public void dynamicMetadataSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$dynamicMetadataSize, value);
    }

    public @pointer(comment="void*") MemorySegment pDynamicMetadata() {
        return segment.get(LAYOUT$pDynamicMetadata, OFFSET$pDynamicMetadata);
    }

    public void pDynamicMetadata(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pDynamicMetadata, OFFSET$pDynamicMetadata, value);
    }

    public void pDynamicMetadata(IPointer pointer) {
        pDynamicMetadata(pointer.segment());
    }

}
