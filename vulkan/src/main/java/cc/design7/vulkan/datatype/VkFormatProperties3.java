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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFormatProperties3.html">VkFormatProperties3</a>
@ValueBasedCandidate
public record VkFormatProperties3(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$linearTilingFeatures = ValueLayout.JAVA_LONG.withName("linearTilingFeatures");
    public static final OfLong LAYOUT$optimalTilingFeatures = ValueLayout.JAVA_LONG.withName("optimalTilingFeatures");
    public static final OfLong LAYOUT$bufferFeatures = ValueLayout.JAVA_LONG.withName("bufferFeatures");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$linearTilingFeatures, LAYOUT$optimalTilingFeatures, LAYOUT$bufferFeatures);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkFormatProperties3 allocate(Arena arena) {
        return new VkFormatProperties3(arena.allocate(LAYOUT));
    }

    public static VkFormatProperties3[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFormatProperties3[] ret = new VkFormatProperties3[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkFormatProperties3(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkFormatProperties3 clone(Arena arena, VkFormatProperties3 src) {
        VkFormatProperties3 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkFormatProperties3[] clone(Arena arena, VkFormatProperties3[] src) {
        VkFormatProperties3[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$linearTilingFeatures = PathElement.groupElement("PATH$linearTilingFeatures");
    public static final PathElement PATH$optimalTilingFeatures = PathElement.groupElement("PATH$optimalTilingFeatures");
    public static final PathElement PATH$bufferFeatures = PathElement.groupElement("PATH$bufferFeatures");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$linearTilingFeatures = LAYOUT$linearTilingFeatures.byteSize();
    public static final long SIZE$optimalTilingFeatures = LAYOUT$optimalTilingFeatures.byteSize();
    public static final long SIZE$bufferFeatures = LAYOUT$bufferFeatures.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$linearTilingFeatures = LAYOUT.byteOffset(PATH$linearTilingFeatures);
    public static final long OFFSET$optimalTilingFeatures = LAYOUT.byteOffset(PATH$optimalTilingFeatures);
    public static final long OFFSET$bufferFeatures = LAYOUT.byteOffset(PATH$bufferFeatures);

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

    public @enumtype(VkFormatFeatureFlags2.class) long linearTilingFeatures() {
        return segment.get(LAYOUT$linearTilingFeatures, OFFSET$linearTilingFeatures);
    }

    public void linearTilingFeatures(@enumtype(VkFormatFeatureFlags2.class) long value) {
        segment.set(LAYOUT$linearTilingFeatures, OFFSET$linearTilingFeatures, value);
    }

    public @enumtype(VkFormatFeatureFlags2.class) long optimalTilingFeatures() {
        return segment.get(LAYOUT$optimalTilingFeatures, OFFSET$optimalTilingFeatures);
    }

    public void optimalTilingFeatures(@enumtype(VkFormatFeatureFlags2.class) long value) {
        segment.set(LAYOUT$optimalTilingFeatures, OFFSET$optimalTilingFeatures, value);
    }

    public @enumtype(VkFormatFeatureFlags2.class) long bufferFeatures() {
        return segment.get(LAYOUT$bufferFeatures, OFFSET$bufferFeatures);
    }

    public void bufferFeatures(@enumtype(VkFormatFeatureFlags2.class) long value) {
        segment.set(LAYOUT$bufferFeatures, OFFSET$bufferFeatures, value);
    }

}
