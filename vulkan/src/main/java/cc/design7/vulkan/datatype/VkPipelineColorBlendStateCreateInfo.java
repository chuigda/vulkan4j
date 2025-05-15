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

/// Represents a pointer to a {@code VkPipelineColorBlendStateCreateInfo} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineColorBlendStateCreateInfo.html">VkPipelineColorBlendStateCreateInfo</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineColorBlendStateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public VkPipelineColorBlendStateCreateInfo {
        sType(VkStructureType.PIPELINE_COLOR_BLEND_STATE_CREATE_INFO);
    }

    public static VkPipelineColorBlendStateCreateInfo allocate(Arena arena) {
        return new VkPipelineColorBlendStateCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineColorBlendStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineColorBlendStateCreateInfo[] ret = new VkPipelineColorBlendStateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineColorBlendStateCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineColorBlendStateCreateInfo clone(Arena arena, VkPipelineColorBlendStateCreateInfo src) {
        VkPipelineColorBlendStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineColorBlendStateCreateInfo[] clone(Arena arena, VkPipelineColorBlendStateCreateInfo[] src) {
        VkPipelineColorBlendStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("logicOpEnable"),
        ValueLayout.JAVA_INT.withName("logicOp"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineColorBlendAttachmentState.LAYOUT).withName("pAttachments"),
        ValueLayout.JAVA_FLOAT.withName("blendConstants")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$logicOpEnable = PathElement.groupElement("PATH$logicOpEnable");
    public static final PathElement PATH$logicOp = PathElement.groupElement("PATH$logicOp");
    public static final PathElement PATH$attachmentCount = PathElement.groupElement("PATH$attachmentCount");
    public static final PathElement PATH$pAttachments = PathElement.groupElement("PATH$pAttachments");
    public static final PathElement PATH$blendConstants = PathElement.groupElement("PATH$blendConstants");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$logicOpEnable = (OfInt) LAYOUT.select(PATH$logicOpEnable);
    public static final OfInt LAYOUT$logicOp = (OfInt) LAYOUT.select(PATH$logicOp);
    public static final OfInt LAYOUT$attachmentCount = (OfInt) LAYOUT.select(PATH$attachmentCount);
    public static final AddressLayout LAYOUT$pAttachments = (AddressLayout) LAYOUT.select(PATH$pAttachments);
    public static final OfFloat LAYOUT$blendConstants = (OfFloat) LAYOUT.select(PATH$blendConstants);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$logicOpEnable = LAYOUT$logicOpEnable.byteSize();
    public static final long SIZE$logicOp = LAYOUT$logicOp.byteSize();
    public static final long SIZE$attachmentCount = LAYOUT$attachmentCount.byteSize();
    public static final long SIZE$pAttachments = LAYOUT$pAttachments.byteSize();
    public static final long SIZE$blendConstants = LAYOUT$blendConstants.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$logicOpEnable = LAYOUT.byteOffset(PATH$logicOpEnable);
    public static final long OFFSET$logicOp = LAYOUT.byteOffset(PATH$logicOp);
    public static final long OFFSET$attachmentCount = LAYOUT.byteOffset(PATH$attachmentCount);
    public static final long OFFSET$pAttachments = LAYOUT.byteOffset(PATH$pAttachments);
    public static final long OFFSET$blendConstants = LAYOUT.byteOffset(PATH$blendConstants);

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

    public @Nullable VkPipelineColorBlendAttachmentState pAttachments() {
        MemorySegment s = pAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineColorBlendAttachmentState(s);
    }

    public void pAttachments(@Nullable VkPipelineColorBlendAttachmentState value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAttachmentsRaw(s);
    }

    @unsafe public @Nullable VkPipelineColorBlendAttachmentState[] pAttachments(int assumedCount) {
        MemorySegment s = pAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineColorBlendAttachmentState.SIZE);
        VkPipelineColorBlendAttachmentState[] ret = new VkPipelineColorBlendAttachmentState[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineColorBlendAttachmentState(s.asSlice(i * VkPipelineColorBlendAttachmentState.SIZE, VkPipelineColorBlendAttachmentState.SIZE));
        }
        return ret;
    }

    public float blendConstants() {
        return segment.get(LAYOUT$blendConstants, OFFSET$blendConstants);
    }

    public void blendConstants(float value) {
        segment.set(LAYOUT$blendConstants, OFFSET$blendConstants, value);
    }

}
