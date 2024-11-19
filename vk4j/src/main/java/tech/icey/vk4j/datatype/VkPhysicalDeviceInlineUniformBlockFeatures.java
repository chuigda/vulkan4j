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
/// typedef struct VkPhysicalDeviceInlineUniformBlockFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 inlineUniformBlock;
///     VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
/// } VkPhysicalDeviceInlineUniformBlockFeatures;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceInlineUniformBlockFeatures.html">VkPhysicalDeviceInlineUniformBlockFeatures</a>
public record VkPhysicalDeviceInlineUniformBlockFeatures(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceInlineUniformBlockFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES);
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

    public @unsigned int inlineUniformBlock() {
        return segment.get(LAYOUT$inlineUniformBlock, OFFSET$inlineUniformBlock);
    }

    public void inlineUniformBlock(@unsigned int value) {
        segment.set(LAYOUT$inlineUniformBlock, OFFSET$inlineUniformBlock, value);
    }

    public @unsigned int descriptorBindingInlineUniformBlockUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind, OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind);
    }

    public void descriptorBindingInlineUniformBlockUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind, OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind, value);
    }

    public static VkPhysicalDeviceInlineUniformBlockFeatures allocate(Arena arena) {
        return new VkPhysicalDeviceInlineUniformBlockFeatures(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceInlineUniformBlockFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceInlineUniformBlockFeatures[] ret = new VkPhysicalDeviceInlineUniformBlockFeatures[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceInlineUniformBlockFeatures(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceInlineUniformBlockFeatures clone(Arena arena, VkPhysicalDeviceInlineUniformBlockFeatures src) {
        VkPhysicalDeviceInlineUniformBlockFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceInlineUniformBlockFeatures[] clone(Arena arena, VkPhysicalDeviceInlineUniformBlockFeatures[] src) {
        VkPhysicalDeviceInlineUniformBlockFeatures[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("inlineUniformBlock"),
        ValueLayout.JAVA_INT.withName("descriptorBindingInlineUniformBlockUpdateAfterBind")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$inlineUniformBlock = PathElement.groupElement("inlineUniformBlock");
    public static final PathElement PATH$descriptorBindingInlineUniformBlockUpdateAfterBind = PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$inlineUniformBlock = (OfInt) LAYOUT.select(PATH$inlineUniformBlock);
    public static final OfInt LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingInlineUniformBlockUpdateAfterBind);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$inlineUniformBlock = LAYOUT.byteOffset(PATH$inlineUniformBlock);
    public static final long OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingInlineUniformBlockUpdateAfterBind);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$inlineUniformBlock = LAYOUT$inlineUniformBlock.byteSize();
    public static final long SIZE$descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind.byteSize();
}
