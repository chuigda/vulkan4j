package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// typedef struct VkRenderPassCreationFeedbackCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkRenderPassCreationFeedbackInfoEXT* pRenderPassFeedback;
/// } VkRenderPassCreationFeedbackCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRenderPassCreationFeedbackCreateInfoEXT.html">VkRenderPassCreationFeedbackCreateInfoEXT</a>
public record VkRenderPassCreationFeedbackCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkRenderPassCreationFeedbackCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT);
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

    public @pointer(comment="VkRenderPassCreationFeedbackInfoEXT*") MemorySegment pRenderPassFeedbackRaw() {
        return segment.get(LAYOUT$pRenderPassFeedback, OFFSET$pRenderPassFeedback);
    }

    public void pRenderPassFeedbackRaw(@pointer(comment="VkRenderPassCreationFeedbackInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pRenderPassFeedback, OFFSET$pRenderPassFeedback, value);
    }

    public @nullable VkRenderPassCreationFeedbackInfoEXT pRenderPassFeedback() {
        MemorySegment s = pRenderPassFeedbackRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRenderPassCreationFeedbackInfoEXT(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkRenderPassCreationFeedbackInfoEXT[] pRenderPassFeedback(int assumedCount) {
        MemorySegment s = pRenderPassFeedbackRaw().reinterpret(assumedCount * VkRenderPassCreationFeedbackInfoEXT.SIZE);
        VkRenderPassCreationFeedbackInfoEXT[] arr = new VkRenderPassCreationFeedbackInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkRenderPassCreationFeedbackInfoEXT(s.asSlice(i * VkRenderPassCreationFeedbackInfoEXT.SIZE, VkRenderPassCreationFeedbackInfoEXT.SIZE));
        }
        return arr;
    }

    public void pRenderPassFeedback(@nullable VkRenderPassCreationFeedbackInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRenderPassFeedbackRaw(s);
    }

    public static VkRenderPassCreationFeedbackCreateInfoEXT allocate(Arena arena) {
        return new VkRenderPassCreationFeedbackCreateInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkRenderPassCreationFeedbackCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassCreationFeedbackCreateInfoEXT[] ret = new VkRenderPassCreationFeedbackCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderPassCreationFeedbackCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRenderPassCreationFeedbackCreateInfoEXT clone(Arena arena, VkRenderPassCreationFeedbackCreateInfoEXT src) {
        VkRenderPassCreationFeedbackCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassCreationFeedbackCreateInfoEXT[] clone(Arena arena, VkRenderPassCreationFeedbackCreateInfoEXT[] src) {
        VkRenderPassCreationFeedbackCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkRenderPassCreationFeedbackInfoEXT.LAYOUT).withName("pRenderPassFeedback")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pRenderPassFeedback = PathElement.groupElement("pRenderPassFeedback");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pRenderPassFeedback = (AddressLayout) LAYOUT.select(PATH$pRenderPassFeedback);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pRenderPassFeedback = LAYOUT.byteOffset(PATH$pRenderPassFeedback);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pRenderPassFeedback = LAYOUT$pRenderPassFeedback.byteSize();
}
