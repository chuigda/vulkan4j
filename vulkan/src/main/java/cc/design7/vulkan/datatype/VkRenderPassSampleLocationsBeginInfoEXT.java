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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassSampleLocationsBeginInfoEXT.html">VkRenderPassSampleLocationsBeginInfoEXT</a>
@ValueBasedCandidate
public record VkRenderPassSampleLocationsBeginInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$attachmentInitialSampleLocationsCount = ValueLayout.JAVA_INT.withName("attachmentInitialSampleLocationsCount");
    public static final AddressLayout LAYOUT$pAttachmentInitialSampleLocations = ValueLayout.ADDRESS.withTargetLayout(VkAttachmentSampleLocationsEXT.LAYOUT).withName("pAttachmentInitialSampleLocations");
    public static final OfInt LAYOUT$postSubpassSampleLocationsCount = ValueLayout.JAVA_INT.withName("postSubpassSampleLocationsCount");
    public static final AddressLayout LAYOUT$pPostSubpassSampleLocations = ValueLayout.ADDRESS.withTargetLayout(VkSubpassSampleLocationsEXT.LAYOUT).withName("pPostSubpassSampleLocations");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$attachmentInitialSampleLocationsCount, LAYOUT$pAttachmentInitialSampleLocations, LAYOUT$postSubpassSampleLocationsCount, LAYOUT$pPostSubpassSampleLocations);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRenderPassSampleLocationsBeginInfoEXT allocate(Arena arena) {
        return new VkRenderPassSampleLocationsBeginInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkRenderPassSampleLocationsBeginInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassSampleLocationsBeginInfoEXT[] ret = new VkRenderPassSampleLocationsBeginInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassSampleLocationsBeginInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRenderPassSampleLocationsBeginInfoEXT clone(Arena arena, VkRenderPassSampleLocationsBeginInfoEXT src) {
        VkRenderPassSampleLocationsBeginInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassSampleLocationsBeginInfoEXT[] clone(Arena arena, VkRenderPassSampleLocationsBeginInfoEXT[] src) {
        VkRenderPassSampleLocationsBeginInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$attachmentInitialSampleLocationsCount = PathElement.groupElement("PATH$attachmentInitialSampleLocationsCount");
    public static final PathElement PATH$pAttachmentInitialSampleLocations = PathElement.groupElement("PATH$pAttachmentInitialSampleLocations");
    public static final PathElement PATH$postSubpassSampleLocationsCount = PathElement.groupElement("PATH$postSubpassSampleLocationsCount");
    public static final PathElement PATH$pPostSubpassSampleLocations = PathElement.groupElement("PATH$pPostSubpassSampleLocations");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$attachmentInitialSampleLocationsCount = LAYOUT$attachmentInitialSampleLocationsCount.byteSize();
    public static final long SIZE$pAttachmentInitialSampleLocations = LAYOUT$pAttachmentInitialSampleLocations.byteSize();
    public static final long SIZE$postSubpassSampleLocationsCount = LAYOUT$postSubpassSampleLocationsCount.byteSize();
    public static final long SIZE$pPostSubpassSampleLocations = LAYOUT$pPostSubpassSampleLocations.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$attachmentInitialSampleLocationsCount = LAYOUT.byteOffset(PATH$attachmentInitialSampleLocationsCount);
    public static final long OFFSET$pAttachmentInitialSampleLocations = LAYOUT.byteOffset(PATH$pAttachmentInitialSampleLocations);
    public static final long OFFSET$postSubpassSampleLocationsCount = LAYOUT.byteOffset(PATH$postSubpassSampleLocationsCount);
    public static final long OFFSET$pPostSubpassSampleLocations = LAYOUT.byteOffset(PATH$pPostSubpassSampleLocations);

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

    public @unsigned int attachmentInitialSampleLocationsCount() {
        return segment.get(LAYOUT$attachmentInitialSampleLocationsCount, OFFSET$attachmentInitialSampleLocationsCount);
    }

    public void attachmentInitialSampleLocationsCount(@unsigned int value) {
        segment.set(LAYOUT$attachmentInitialSampleLocationsCount, OFFSET$attachmentInitialSampleLocationsCount, value);
    }

    public @pointer(comment="VkAttachmentSampleLocationsEXT*") MemorySegment pAttachmentInitialSampleLocationsRaw() {
        return segment.get(LAYOUT$pAttachmentInitialSampleLocations, OFFSET$pAttachmentInitialSampleLocations);
    }

    public void pAttachmentInitialSampleLocationsRaw(@pointer(comment="VkAttachmentSampleLocationsEXT*") MemorySegment value) {
        segment.set(LAYOUT$pAttachmentInitialSampleLocations, OFFSET$pAttachmentInitialSampleLocations, value);
    }

    public @Nullable VkAttachmentSampleLocationsEXT pAttachmentInitialSampleLocations() {
        MemorySegment s = pAttachmentInitialSampleLocationsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentSampleLocationsEXT(s);
    }

    public void pAttachmentInitialSampleLocations(@Nullable VkAttachmentSampleLocationsEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAttachmentInitialSampleLocationsRaw(s);
    }

    @unsafe public @Nullable VkAttachmentSampleLocationsEXT[] pAttachmentInitialSampleLocations(int assumedCount) {
        MemorySegment s = pAttachmentInitialSampleLocationsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentSampleLocationsEXT.SIZE);
        VkAttachmentSampleLocationsEXT[] ret = new VkAttachmentSampleLocationsEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentSampleLocationsEXT(s.asSlice(i * VkAttachmentSampleLocationsEXT.SIZE, VkAttachmentSampleLocationsEXT.SIZE));
        }
        return ret;
    }

    public @unsigned int postSubpassSampleLocationsCount() {
        return segment.get(LAYOUT$postSubpassSampleLocationsCount, OFFSET$postSubpassSampleLocationsCount);
    }

    public void postSubpassSampleLocationsCount(@unsigned int value) {
        segment.set(LAYOUT$postSubpassSampleLocationsCount, OFFSET$postSubpassSampleLocationsCount, value);
    }

    public @pointer(comment="VkSubpassSampleLocationsEXT*") MemorySegment pPostSubpassSampleLocationsRaw() {
        return segment.get(LAYOUT$pPostSubpassSampleLocations, OFFSET$pPostSubpassSampleLocations);
    }

    public void pPostSubpassSampleLocationsRaw(@pointer(comment="VkSubpassSampleLocationsEXT*") MemorySegment value) {
        segment.set(LAYOUT$pPostSubpassSampleLocations, OFFSET$pPostSubpassSampleLocations, value);
    }

    public @Nullable VkSubpassSampleLocationsEXT pPostSubpassSampleLocations() {
        MemorySegment s = pPostSubpassSampleLocationsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSubpassSampleLocationsEXT(s);
    }

    public void pPostSubpassSampleLocations(@Nullable VkSubpassSampleLocationsEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPostSubpassSampleLocationsRaw(s);
    }

    @unsafe public @Nullable VkSubpassSampleLocationsEXT[] pPostSubpassSampleLocations(int assumedCount) {
        MemorySegment s = pPostSubpassSampleLocationsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSubpassSampleLocationsEXT.SIZE);
        VkSubpassSampleLocationsEXT[] ret = new VkSubpassSampleLocationsEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSubpassSampleLocationsEXT(s.asSlice(i * VkSubpassSampleLocationsEXT.SIZE, VkSubpassSampleLocationsEXT.SIZE));
        }
        return ret;
    }

}
