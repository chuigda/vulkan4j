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
/// typedef struct VkRenderPassSampleLocationsBeginInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t attachmentInitialSampleLocationsCount;
///     const VkAttachmentSampleLocationsEXT* pAttachmentInitialSampleLocations;
///     uint32_t postSubpassSampleLocationsCount;
///     const VkSubpassSampleLocationsEXT* pPostSubpassSampleLocations;
/// } VkRenderPassSampleLocationsBeginInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRenderPassSampleLocationsBeginInfoEXT.html">VkRenderPassSampleLocationsBeginInfoEXT</a>
public record VkRenderPassSampleLocationsBeginInfoEXT(MemorySegment segment) implements IPointer {
    public VkRenderPassSampleLocationsBeginInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT);
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

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkAttachmentSampleLocationsEXT[] pAttachmentInitialSampleLocations(int assumedCount) {
        MemorySegment s = pAttachmentInitialSampleLocationsRaw().reinterpret(assumedCount * VkAttachmentSampleLocationsEXT.SIZE);
        VkAttachmentSampleLocationsEXT[] arr = new VkAttachmentSampleLocationsEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkAttachmentSampleLocationsEXT(s.asSlice(i * VkAttachmentSampleLocationsEXT.SIZE, VkAttachmentSampleLocationsEXT.SIZE));
        }
        return arr;
    }

    public void pAttachmentInitialSampleLocations(@Nullable VkAttachmentSampleLocationsEXT value) {
        pAttachmentInitialSampleLocationsRaw(value == null ? MemorySegment.NULL : value.segment());
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

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkSubpassSampleLocationsEXT[] pPostSubpassSampleLocations(int assumedCount) {
        MemorySegment s = pPostSubpassSampleLocationsRaw().reinterpret(assumedCount * VkSubpassSampleLocationsEXT.SIZE);
        VkSubpassSampleLocationsEXT[] arr = new VkSubpassSampleLocationsEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSubpassSampleLocationsEXT(s.asSlice(i * VkSubpassSampleLocationsEXT.SIZE, VkSubpassSampleLocationsEXT.SIZE));
        }
        return arr;
    }

    public void pPostSubpassSampleLocations(@Nullable VkSubpassSampleLocationsEXT value) {
        pPostSubpassSampleLocationsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkRenderPassSampleLocationsBeginInfoEXT allocate(Arena arena) {
        return new VkRenderPassSampleLocationsBeginInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkRenderPassSampleLocationsBeginInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassSampleLocationsBeginInfoEXT[] ret = new VkRenderPassSampleLocationsBeginInfoEXT[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentInitialSampleLocationsCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkAttachmentSampleLocationsEXT.LAYOUT).withName("pAttachmentInitialSampleLocations"),
        ValueLayout.JAVA_INT.withName("postSubpassSampleLocationsCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSubpassSampleLocationsEXT.LAYOUT).withName("pPostSubpassSampleLocations")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$attachmentInitialSampleLocationsCount = PathElement.groupElement("attachmentInitialSampleLocationsCount");
    public static final PathElement PATH$pAttachmentInitialSampleLocations = PathElement.groupElement("pAttachmentInitialSampleLocations");
    public static final PathElement PATH$postSubpassSampleLocationsCount = PathElement.groupElement("postSubpassSampleLocationsCount");
    public static final PathElement PATH$pPostSubpassSampleLocations = PathElement.groupElement("pPostSubpassSampleLocations");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$attachmentInitialSampleLocationsCount = (OfInt) LAYOUT.select(PATH$attachmentInitialSampleLocationsCount);
    public static final AddressLayout LAYOUT$pAttachmentInitialSampleLocations = (AddressLayout) LAYOUT.select(PATH$pAttachmentInitialSampleLocations);
    public static final OfInt LAYOUT$postSubpassSampleLocationsCount = (OfInt) LAYOUT.select(PATH$postSubpassSampleLocationsCount);
    public static final AddressLayout LAYOUT$pPostSubpassSampleLocations = (AddressLayout) LAYOUT.select(PATH$pPostSubpassSampleLocations);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$attachmentInitialSampleLocationsCount = LAYOUT.byteOffset(PATH$attachmentInitialSampleLocationsCount);
    public static final long OFFSET$pAttachmentInitialSampleLocations = LAYOUT.byteOffset(PATH$pAttachmentInitialSampleLocations);
    public static final long OFFSET$postSubpassSampleLocationsCount = LAYOUT.byteOffset(PATH$postSubpassSampleLocationsCount);
    public static final long OFFSET$pPostSubpassSampleLocations = LAYOUT.byteOffset(PATH$pPostSubpassSampleLocations);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$attachmentInitialSampleLocationsCount = LAYOUT$attachmentInitialSampleLocationsCount.byteSize();
    public static final long SIZE$pAttachmentInitialSampleLocations = LAYOUT$pAttachmentInitialSampleLocations.byteSize();
    public static final long SIZE$postSubpassSampleLocationsCount = LAYOUT$postSubpassSampleLocationsCount.byteSize();
    public static final long SIZE$pPostSubpassSampleLocations = LAYOUT$pPostSubpassSampleLocations.byteSize();
}
