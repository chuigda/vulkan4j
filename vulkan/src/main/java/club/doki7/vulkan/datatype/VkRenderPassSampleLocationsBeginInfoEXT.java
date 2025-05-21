package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassSampleLocationsBeginInfoEXT.html"><code>VkRenderPassSampleLocationsBeginInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderPassSampleLocationsBeginInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t attachmentInitialSampleLocationsCount; // optional // @link substring="attachmentInitialSampleLocationsCount" target="#attachmentInitialSampleLocationsCount"
///     VkAttachmentSampleLocationsEXT const* pAttachmentInitialSampleLocations; // @link substring="VkAttachmentSampleLocationsEXT" target="VkAttachmentSampleLocationsEXT" @link substring="pAttachmentInitialSampleLocations" target="#pAttachmentInitialSampleLocations"
///     uint32_t postSubpassSampleLocationsCount; // optional // @link substring="postSubpassSampleLocationsCount" target="#postSubpassSampleLocationsCount"
///     VkSubpassSampleLocationsEXT const* pPostSubpassSampleLocations; // @link substring="VkSubpassSampleLocationsEXT" target="VkSubpassSampleLocationsEXT" @link substring="pPostSubpassSampleLocations" target="#pPostSubpassSampleLocations"
/// } VkRenderPassSampleLocationsBeginInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT`
///
/// The {@code allocate} ({@link VkRenderPassSampleLocationsBeginInfoEXT#allocate(Arena)}, {@link VkRenderPassSampleLocationsBeginInfoEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkRenderPassSampleLocationsBeginInfoEXT#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassSampleLocationsBeginInfoEXT.html"><code>VkRenderPassSampleLocationsBeginInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderPassSampleLocationsBeginInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkRenderPassSampleLocationsBeginInfoEXT allocate(Arena arena) {
        VkRenderPassSampleLocationsBeginInfoEXT ret = new VkRenderPassSampleLocationsBeginInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT);
        return ret;
    }

    public static VkRenderPassSampleLocationsBeginInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassSampleLocationsBeginInfoEXT[] ret = new VkRenderPassSampleLocationsBeginInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassSampleLocationsBeginInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT);
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

    public void autoInit() {
        sType(VkStructureType.RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int attachmentInitialSampleLocationsCount() {
        return segment.get(LAYOUT$attachmentInitialSampleLocationsCount, OFFSET$attachmentInitialSampleLocationsCount);
    }

    public void attachmentInitialSampleLocationsCount(@unsigned int value) {
        segment.set(LAYOUT$attachmentInitialSampleLocationsCount, OFFSET$attachmentInitialSampleLocationsCount, value);
    }

    public @Nullable VkAttachmentSampleLocationsEXT pAttachmentInitialSampleLocations() {
        MemorySegment s = pAttachmentInitialSampleLocationsRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentSampleLocationsEXT.BYTES);
        VkAttachmentSampleLocationsEXT[] ret = new VkAttachmentSampleLocationsEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentSampleLocationsEXT(s.asSlice(i * VkAttachmentSampleLocationsEXT.BYTES, VkAttachmentSampleLocationsEXT.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkAttachmentSampleLocationsEXT.class) MemorySegment pAttachmentInitialSampleLocationsRaw() {
        return segment.get(LAYOUT$pAttachmentInitialSampleLocations, OFFSET$pAttachmentInitialSampleLocations);
    }

    public void pAttachmentInitialSampleLocationsRaw(@pointer(target=VkAttachmentSampleLocationsEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pAttachmentInitialSampleLocations, OFFSET$pAttachmentInitialSampleLocations, value);
    }

    public @unsigned int postSubpassSampleLocationsCount() {
        return segment.get(LAYOUT$postSubpassSampleLocationsCount, OFFSET$postSubpassSampleLocationsCount);
    }

    public void postSubpassSampleLocationsCount(@unsigned int value) {
        segment.set(LAYOUT$postSubpassSampleLocationsCount, OFFSET$postSubpassSampleLocationsCount, value);
    }

    public @Nullable VkSubpassSampleLocationsEXT pPostSubpassSampleLocations() {
        MemorySegment s = pPostSubpassSampleLocationsRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSubpassSampleLocationsEXT.BYTES);
        VkSubpassSampleLocationsEXT[] ret = new VkSubpassSampleLocationsEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSubpassSampleLocationsEXT(s.asSlice(i * VkSubpassSampleLocationsEXT.BYTES, VkSubpassSampleLocationsEXT.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkSubpassSampleLocationsEXT.class) MemorySegment pPostSubpassSampleLocationsRaw() {
        return segment.get(LAYOUT$pPostSubpassSampleLocations, OFFSET$pPostSubpassSampleLocations);
    }

    public void pPostSubpassSampleLocationsRaw(@pointer(target=VkSubpassSampleLocationsEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pPostSubpassSampleLocations, OFFSET$pPostSubpassSampleLocations, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentInitialSampleLocationsCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkAttachmentSampleLocationsEXT.LAYOUT).withName("pAttachmentInitialSampleLocations"),
        ValueLayout.JAVA_INT.withName("postSubpassSampleLocationsCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSubpassSampleLocationsEXT.LAYOUT).withName("pPostSubpassSampleLocations")
    );
    public static final long BYTES = LAYOUT.byteSize();

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
}
