package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkFormatProperties3 {
///     VkStructureType sType;
///     void* pNext;
///     VkFormatFeatureFlags2 linearTilingFeatures;
///     VkFormatFeatureFlags2 optimalTilingFeatures;
///     VkFormatFeatureFlags2 bufferFeatures;
/// } VkFormatProperties3;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkFormatProperties3.html">VkFormatProperties3</a>
public record VkFormatProperties3(MemorySegment segment) implements IPointer {
    public VkFormatProperties3(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public static VkFormatProperties3 allocate(Arena arena) {
        return new VkFormatProperties3(arena.allocate(LAYOUT));
    }

    public static VkFormatProperties3[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFormatProperties3[] ret = new VkFormatProperties3[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("linearTilingFeatures"),
        ValueLayout.JAVA_LONG.withName("optimalTilingFeatures"),
        ValueLayout.JAVA_LONG.withName("bufferFeatures")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$linearTilingFeatures = PathElement.groupElement("linearTilingFeatures");
    public static final PathElement PATH$optimalTilingFeatures = PathElement.groupElement("optimalTilingFeatures");
    public static final PathElement PATH$bufferFeatures = PathElement.groupElement("bufferFeatures");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$linearTilingFeatures = (OfLong) LAYOUT.select(PATH$linearTilingFeatures);
    public static final OfLong LAYOUT$optimalTilingFeatures = (OfLong) LAYOUT.select(PATH$optimalTilingFeatures);
    public static final OfLong LAYOUT$bufferFeatures = (OfLong) LAYOUT.select(PATH$bufferFeatures);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$linearTilingFeatures = LAYOUT.byteOffset(PATH$linearTilingFeatures);
    public static final long OFFSET$optimalTilingFeatures = LAYOUT.byteOffset(PATH$optimalTilingFeatures);
    public static final long OFFSET$bufferFeatures = LAYOUT.byteOffset(PATH$bufferFeatures);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$linearTilingFeatures = LAYOUT$linearTilingFeatures.byteSize();
    public static final long SIZE$optimalTilingFeatures = LAYOUT$optimalTilingFeatures.byteSize();
    public static final long SIZE$bufferFeatures = LAYOUT$bufferFeatures.byteSize();
}
