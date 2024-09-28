package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPipelineColorBlendStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineColorBlendStateCreateFlags flags;
///     VkBool32 logicOpEnable;
///     VkLogicOp logicOp;
///     uint32_t attachmentCount;
///     const VkPipelineColorBlendAttachmentState* pAttachments;
///     float blendConstants[4];
/// } VkPipelineColorBlendStateCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineColorBlendStateCreateInfo.html">VkPipelineColorBlendStateCreateInfo</a>
public record VkPipelineColorBlendStateCreateInfo(MemorySegment segment) implements IPointer {
    public VkPipelineColorBlendStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO);
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

    public @enumtype(VkPipelineColorBlendStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineColorBlendStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int logicOpEnable() {
        return segment.get(LAYOUT$logicOpEnable, OFFSET$logicOpEnable);
    }

    public void logicOpEnable(@unsigned int value) {
        segment.set(LAYOUT$logicOpEnable, OFFSET$logicOpEnable, value);
    }

    public @enumtype(VkLogicOp.class) int logicOp() {
        return segment.get(LAYOUT$logicOp, OFFSET$logicOp);
    }

    public void logicOp(@enumtype(VkLogicOp.class) int value) {
        segment.set(LAYOUT$logicOp, OFFSET$logicOp, value);
    }

    public @unsigned int attachmentCount() {
        return segment.get(LAYOUT$attachmentCount, OFFSET$attachmentCount);
    }

    public void attachmentCount(@unsigned int value) {
        segment.set(LAYOUT$attachmentCount, OFFSET$attachmentCount, value);
    }

    public @pointer(comment="VkPipelineColorBlendAttachmentState*") MemorySegment pAttachmentsRaw() {
        return segment.get(LAYOUT$pAttachments, OFFSET$pAttachments);
    }

    public void pAttachmentsRaw(@pointer(comment="VkPipelineColorBlendAttachmentState*") MemorySegment value) {
        segment.set(LAYOUT$pAttachments, OFFSET$pAttachments, value);
    }

    public @nullable VkPipelineColorBlendAttachmentState pAttachments() {
        MemorySegment s = pAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineColorBlendAttachmentState(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPipelineColorBlendAttachmentState[] pAttachments(int assumedCount) {
        MemorySegment s = pAttachmentsRaw().reinterpret(assumedCount * VkPipelineColorBlendAttachmentState.SIZE);
        VkPipelineColorBlendAttachmentState[] arr = new VkPipelineColorBlendAttachmentState[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineColorBlendAttachmentState(s.asSlice(i * VkPipelineColorBlendAttachmentState.SIZE, VkPipelineColorBlendAttachmentState.SIZE));
        }
        return arr;
    }

    public void pAttachments(@nullable VkPipelineColorBlendAttachmentState value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAttachmentsRaw(s);
    }

    public MemorySegment blendConstantsRaw() {
        return segment.asSlice(OFFSET$blendConstants, SIZE$blendConstants);
    }

    public FloatBuffer blendConstants() {
        return new FloatBuffer(blendConstantsRaw());
    }

    public void blendConstants(FloatBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$blendConstants, SIZE$blendConstants);
    }

    public static VkPipelineColorBlendStateCreateInfo allocate(Arena arena) {
        return new VkPipelineColorBlendStateCreateInfo(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineColorBlendStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineColorBlendStateCreateInfo[] ret = new VkPipelineColorBlendStateCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineColorBlendStateCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("logicOpEnable"),
        ValueLayout.JAVA_INT.withName("logicOp"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineColorBlendAttachmentState.LAYOUT).withName("pAttachments"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("blendConstants")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$logicOpEnable = PathElement.groupElement("logicOpEnable");
    public static final PathElement PATH$logicOp = PathElement.groupElement("logicOp");
    public static final PathElement PATH$attachmentCount = PathElement.groupElement("attachmentCount");
    public static final PathElement PATH$pAttachments = PathElement.groupElement("pAttachments");
    public static final PathElement PATH$blendConstants = PathElement.groupElement("blendConstants");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$logicOpEnable = (OfInt) LAYOUT.select(PATH$logicOpEnable);
    public static final OfInt LAYOUT$logicOp = (OfInt) LAYOUT.select(PATH$logicOp);
    public static final OfInt LAYOUT$attachmentCount = (OfInt) LAYOUT.select(PATH$attachmentCount);
    public static final AddressLayout LAYOUT$pAttachments = (AddressLayout) LAYOUT.select(PATH$pAttachments);
    public static final SequenceLayout LAYOUT$blendConstants = (SequenceLayout) LAYOUT.select(PATH$blendConstants);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$logicOpEnable = LAYOUT.byteOffset(PATH$logicOpEnable);
    public static final long OFFSET$logicOp = LAYOUT.byteOffset(PATH$logicOp);
    public static final long OFFSET$attachmentCount = LAYOUT.byteOffset(PATH$attachmentCount);
    public static final long OFFSET$pAttachments = LAYOUT.byteOffset(PATH$pAttachments);
    public static final long OFFSET$blendConstants = LAYOUT.byteOffset(PATH$blendConstants);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$logicOpEnable = LAYOUT$logicOpEnable.byteSize();
    public static final long SIZE$logicOp = LAYOUT$logicOp.byteSize();
    public static final long SIZE$attachmentCount = LAYOUT$attachmentCount.byteSize();
    public static final long SIZE$pAttachments = LAYOUT$pAttachments.byteSize();
    public static final long SIZE$blendConstants = LAYOUT$blendConstants.byteSize();

}
