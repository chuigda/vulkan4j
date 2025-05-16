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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassCreateInfo.html"><code>VkRenderPassCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderPassCreateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkRenderPassCreateFlags flags; // optional
///     uint32_t attachmentCount; // optional
///     VkAttachmentDescription const* pAttachments;
///     uint32_t subpassCount;
///     VkSubpassDescription const* pSubpasses;
///     uint32_t dependencyCount; // optional
///     VkSubpassDependency const* pDependencies;
/// } VkRenderPassCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO`
///
/// The {@link VkRenderPassCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkRenderPassCreateInfo#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassCreateInfo.html"><code>VkRenderPassCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderPassCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkRenderPassCreateInfo allocate(Arena arena) {
        VkRenderPassCreateInfo ret = new VkRenderPassCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RENDER_PASS_CREATE_INFO);
        return ret;
    }

    public static VkRenderPassCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassCreateInfo[] ret = new VkRenderPassCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RENDER_PASS_CREATE_INFO);
        }
        return ret;
    }

    public static VkRenderPassCreateInfo clone(Arena arena, VkRenderPassCreateInfo src) {
        VkRenderPassCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassCreateInfo[] clone(Arena arena, VkRenderPassCreateInfo[] src) {
        VkRenderPassCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RENDER_PASS_CREATE_INFO);
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

    public @enumtype(VkRenderPassCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkRenderPassCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int attachmentCount() {
        return segment.get(LAYOUT$attachmentCount, OFFSET$attachmentCount);
    }

    public void attachmentCount(@unsigned int value) {
        segment.set(LAYOUT$attachmentCount, OFFSET$attachmentCount, value);
    }

    public @pointer(comment="VkAttachmentDescription*") MemorySegment pAttachmentsRaw() {
        return segment.get(LAYOUT$pAttachments, OFFSET$pAttachments);
    }

    public void pAttachmentsRaw(@pointer(comment="VkAttachmentDescription*") MemorySegment value) {
        segment.set(LAYOUT$pAttachments, OFFSET$pAttachments, value);
    }

    public @Nullable VkAttachmentDescription pAttachments() {
        MemorySegment s = pAttachmentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAttachmentDescription(s);
    }

    public void pAttachments(@Nullable VkAttachmentDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAttachmentsRaw(s);
    }

    @unsafe public @Nullable VkAttachmentDescription[] pAttachments(int assumedCount) {
        MemorySegment s = pAttachmentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentDescription.BYTES);
        VkAttachmentDescription[] ret = new VkAttachmentDescription[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentDescription(s.asSlice(i * VkAttachmentDescription.BYTES, VkAttachmentDescription.BYTES));
        }
        return ret;
    }

    public @unsigned int subpassCount() {
        return segment.get(LAYOUT$subpassCount, OFFSET$subpassCount);
    }

    public void subpassCount(@unsigned int value) {
        segment.set(LAYOUT$subpassCount, OFFSET$subpassCount, value);
    }

    public @pointer(comment="VkSubpassDescription*") MemorySegment pSubpassesRaw() {
        return segment.get(LAYOUT$pSubpasses, OFFSET$pSubpasses);
    }

    public void pSubpassesRaw(@pointer(comment="VkSubpassDescription*") MemorySegment value) {
        segment.set(LAYOUT$pSubpasses, OFFSET$pSubpasses, value);
    }

    public @Nullable VkSubpassDescription pSubpasses() {
        MemorySegment s = pSubpassesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSubpassDescription(s);
    }

    public void pSubpasses(@Nullable VkSubpassDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSubpassesRaw(s);
    }

    @unsafe public @Nullable VkSubpassDescription[] pSubpasses(int assumedCount) {
        MemorySegment s = pSubpassesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSubpassDescription.BYTES);
        VkSubpassDescription[] ret = new VkSubpassDescription[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSubpassDescription(s.asSlice(i * VkSubpassDescription.BYTES, VkSubpassDescription.BYTES));
        }
        return ret;
    }

    public @unsigned int dependencyCount() {
        return segment.get(LAYOUT$dependencyCount, OFFSET$dependencyCount);
    }

    public void dependencyCount(@unsigned int value) {
        segment.set(LAYOUT$dependencyCount, OFFSET$dependencyCount, value);
    }

    public @pointer(comment="VkSubpassDependency*") MemorySegment pDependenciesRaw() {
        return segment.get(LAYOUT$pDependencies, OFFSET$pDependencies);
    }

    public void pDependenciesRaw(@pointer(comment="VkSubpassDependency*") MemorySegment value) {
        segment.set(LAYOUT$pDependencies, OFFSET$pDependencies, value);
    }

    public @Nullable VkSubpassDependency pDependencies() {
        MemorySegment s = pDependenciesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSubpassDependency(s);
    }

    public void pDependencies(@Nullable VkSubpassDependency value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDependenciesRaw(s);
    }

    @unsafe public @Nullable VkSubpassDependency[] pDependencies(int assumedCount) {
        MemorySegment s = pDependenciesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSubpassDependency.BYTES);
        VkSubpassDependency[] ret = new VkSubpassDependency[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSubpassDependency(s.asSlice(i * VkSubpassDependency.BYTES, VkSubpassDependency.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkAttachmentDescription.LAYOUT).withName("pAttachments"),
        ValueLayout.JAVA_INT.withName("subpassCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSubpassDescription.LAYOUT).withName("pSubpasses"),
        ValueLayout.JAVA_INT.withName("dependencyCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSubpassDependency.LAYOUT).withName("pDependencies")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$attachmentCount = PathElement.groupElement("PATH$attachmentCount");
    public static final PathElement PATH$pAttachments = PathElement.groupElement("PATH$pAttachments");
    public static final PathElement PATH$subpassCount = PathElement.groupElement("PATH$subpassCount");
    public static final PathElement PATH$pSubpasses = PathElement.groupElement("PATH$pSubpasses");
    public static final PathElement PATH$dependencyCount = PathElement.groupElement("PATH$dependencyCount");
    public static final PathElement PATH$pDependencies = PathElement.groupElement("PATH$pDependencies");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$attachmentCount = (OfInt) LAYOUT.select(PATH$attachmentCount);
    public static final AddressLayout LAYOUT$pAttachments = (AddressLayout) LAYOUT.select(PATH$pAttachments);
    public static final OfInt LAYOUT$subpassCount = (OfInt) LAYOUT.select(PATH$subpassCount);
    public static final AddressLayout LAYOUT$pSubpasses = (AddressLayout) LAYOUT.select(PATH$pSubpasses);
    public static final OfInt LAYOUT$dependencyCount = (OfInt) LAYOUT.select(PATH$dependencyCount);
    public static final AddressLayout LAYOUT$pDependencies = (AddressLayout) LAYOUT.select(PATH$pDependencies);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$attachmentCount = LAYOUT$attachmentCount.byteSize();
    public static final long SIZE$pAttachments = LAYOUT$pAttachments.byteSize();
    public static final long SIZE$subpassCount = LAYOUT$subpassCount.byteSize();
    public static final long SIZE$pSubpasses = LAYOUT$pSubpasses.byteSize();
    public static final long SIZE$dependencyCount = LAYOUT$dependencyCount.byteSize();
    public static final long SIZE$pDependencies = LAYOUT$pDependencies.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$attachmentCount = LAYOUT.byteOffset(PATH$attachmentCount);
    public static final long OFFSET$pAttachments = LAYOUT.byteOffset(PATH$pAttachments);
    public static final long OFFSET$subpassCount = LAYOUT.byteOffset(PATH$subpassCount);
    public static final long OFFSET$pSubpasses = LAYOUT.byteOffset(PATH$pSubpasses);
    public static final long OFFSET$dependencyCount = LAYOUT.byteOffset(PATH$dependencyCount);
    public static final long OFFSET$pDependencies = LAYOUT.byteOffset(PATH$pDependencies);
}
