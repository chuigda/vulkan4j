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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassDependency2.html"><code>VkSubpassDependency2</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSubpassDependency2 {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t srcSubpass; // @link substring="srcSubpass" target="#srcSubpass"
///     uint32_t dstSubpass; // @link substring="dstSubpass" target="#dstSubpass"
///     VkPipelineStageFlags srcStageMask; // optional // @link substring="VkPipelineStageFlags" target="VkPipelineStageFlags" @link substring="srcStageMask" target="#srcStageMask"
///     VkPipelineStageFlags dstStageMask; // optional // @link substring="VkPipelineStageFlags" target="VkPipelineStageFlags" @link substring="dstStageMask" target="#dstStageMask"
///     VkAccessFlags srcAccessMask; // optional // @link substring="VkAccessFlags" target="VkAccessFlags" @link substring="srcAccessMask" target="#srcAccessMask"
///     VkAccessFlags dstAccessMask; // optional // @link substring="VkAccessFlags" target="VkAccessFlags" @link substring="dstAccessMask" target="#dstAccessMask"
///     VkDependencyFlags dependencyFlags; // optional // @link substring="VkDependencyFlags" target="VkDependencyFlags" @link substring="dependencyFlags" target="#dependencyFlags"
///     int32_t viewOffset; // @link substring="viewOffset" target="#viewOffset"
/// } VkSubpassDependency2;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2`
///
/// The {@code allocate} ({@link VkSubpassDependency2#allocate(Arena)}, {@link VkSubpassDependency2#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkSubpassDependency2#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassDependency2.html"><code>VkSubpassDependency2</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSubpassDependency2(@NotNull MemorySegment segment) implements IPointer {
    public static VkSubpassDependency2 allocate(Arena arena) {
        VkSubpassDependency2 ret = new VkSubpassDependency2(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SUBPASS_DEPENDENCY_2);
        return ret;
    }

    public static VkSubpassDependency2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubpassDependency2[] ret = new VkSubpassDependency2[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSubpassDependency2(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SUBPASS_DEPENDENCY_2);
        }
        return ret;
    }

    public static VkSubpassDependency2 clone(Arena arena, VkSubpassDependency2 src) {
        VkSubpassDependency2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSubpassDependency2[] clone(Arena arena, VkSubpassDependency2[] src) {
        VkSubpassDependency2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SUBPASS_DEPENDENCY_2);
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

    public @unsigned int srcSubpass() {
        return segment.get(LAYOUT$srcSubpass, OFFSET$srcSubpass);
    }

    public void srcSubpass(@unsigned int value) {
        segment.set(LAYOUT$srcSubpass, OFFSET$srcSubpass, value);
    }

    public @unsigned int dstSubpass() {
        return segment.get(LAYOUT$dstSubpass, OFFSET$dstSubpass);
    }

    public void dstSubpass(@unsigned int value) {
        segment.set(LAYOUT$dstSubpass, OFFSET$dstSubpass, value);
    }

    public @enumtype(VkPipelineStageFlags.class) int srcStageMask() {
        return segment.get(LAYOUT$srcStageMask, OFFSET$srcStageMask);
    }

    public void srcStageMask(@enumtype(VkPipelineStageFlags.class) int value) {
        segment.set(LAYOUT$srcStageMask, OFFSET$srcStageMask, value);
    }

    public @enumtype(VkPipelineStageFlags.class) int dstStageMask() {
        return segment.get(LAYOUT$dstStageMask, OFFSET$dstStageMask);
    }

    public void dstStageMask(@enumtype(VkPipelineStageFlags.class) int value) {
        segment.set(LAYOUT$dstStageMask, OFFSET$dstStageMask, value);
    }

    public @enumtype(VkAccessFlags.class) int srcAccessMask() {
        return segment.get(LAYOUT$srcAccessMask, OFFSET$srcAccessMask);
    }

    public void srcAccessMask(@enumtype(VkAccessFlags.class) int value) {
        segment.set(LAYOUT$srcAccessMask, OFFSET$srcAccessMask, value);
    }

    public @enumtype(VkAccessFlags.class) int dstAccessMask() {
        return segment.get(LAYOUT$dstAccessMask, OFFSET$dstAccessMask);
    }

    public void dstAccessMask(@enumtype(VkAccessFlags.class) int value) {
        segment.set(LAYOUT$dstAccessMask, OFFSET$dstAccessMask, value);
    }

    public @enumtype(VkDependencyFlags.class) int dependencyFlags() {
        return segment.get(LAYOUT$dependencyFlags, OFFSET$dependencyFlags);
    }

    public void dependencyFlags(@enumtype(VkDependencyFlags.class) int value) {
        segment.set(LAYOUT$dependencyFlags, OFFSET$dependencyFlags, value);
    }

    public int viewOffset() {
        return segment.get(LAYOUT$viewOffset, OFFSET$viewOffset);
    }

    public void viewOffset(int value) {
        segment.set(LAYOUT$viewOffset, OFFSET$viewOffset, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcSubpass"),
        ValueLayout.JAVA_INT.withName("dstSubpass"),
        ValueLayout.JAVA_INT.withName("srcStageMask"),
        ValueLayout.JAVA_INT.withName("dstStageMask"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("dependencyFlags"),
        ValueLayout.JAVA_INT.withName("viewOffset")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$srcSubpass = PathElement.groupElement("PATH$srcSubpass");
    public static final PathElement PATH$dstSubpass = PathElement.groupElement("PATH$dstSubpass");
    public static final PathElement PATH$srcStageMask = PathElement.groupElement("PATH$srcStageMask");
    public static final PathElement PATH$dstStageMask = PathElement.groupElement("PATH$dstStageMask");
    public static final PathElement PATH$srcAccessMask = PathElement.groupElement("PATH$srcAccessMask");
    public static final PathElement PATH$dstAccessMask = PathElement.groupElement("PATH$dstAccessMask");
    public static final PathElement PATH$dependencyFlags = PathElement.groupElement("PATH$dependencyFlags");
    public static final PathElement PATH$viewOffset = PathElement.groupElement("PATH$viewOffset");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$srcSubpass = (OfInt) LAYOUT.select(PATH$srcSubpass);
    public static final OfInt LAYOUT$dstSubpass = (OfInt) LAYOUT.select(PATH$dstSubpass);
    public static final OfInt LAYOUT$srcStageMask = (OfInt) LAYOUT.select(PATH$srcStageMask);
    public static final OfInt LAYOUT$dstStageMask = (OfInt) LAYOUT.select(PATH$dstStageMask);
    public static final OfInt LAYOUT$srcAccessMask = (OfInt) LAYOUT.select(PATH$srcAccessMask);
    public static final OfInt LAYOUT$dstAccessMask = (OfInt) LAYOUT.select(PATH$dstAccessMask);
    public static final OfInt LAYOUT$dependencyFlags = (OfInt) LAYOUT.select(PATH$dependencyFlags);
    public static final OfInt LAYOUT$viewOffset = (OfInt) LAYOUT.select(PATH$viewOffset);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcSubpass = LAYOUT$srcSubpass.byteSize();
    public static final long SIZE$dstSubpass = LAYOUT$dstSubpass.byteSize();
    public static final long SIZE$srcStageMask = LAYOUT$srcStageMask.byteSize();
    public static final long SIZE$dstStageMask = LAYOUT$dstStageMask.byteSize();
    public static final long SIZE$srcAccessMask = LAYOUT$srcAccessMask.byteSize();
    public static final long SIZE$dstAccessMask = LAYOUT$dstAccessMask.byteSize();
    public static final long SIZE$dependencyFlags = LAYOUT$dependencyFlags.byteSize();
    public static final long SIZE$viewOffset = LAYOUT$viewOffset.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcSubpass = LAYOUT.byteOffset(PATH$srcSubpass);
    public static final long OFFSET$dstSubpass = LAYOUT.byteOffset(PATH$dstSubpass);
    public static final long OFFSET$srcStageMask = LAYOUT.byteOffset(PATH$srcStageMask);
    public static final long OFFSET$dstStageMask = LAYOUT.byteOffset(PATH$dstStageMask);
    public static final long OFFSET$srcAccessMask = LAYOUT.byteOffset(PATH$srcAccessMask);
    public static final long OFFSET$dstAccessMask = LAYOUT.byteOffset(PATH$dstAccessMask);
    public static final long OFFSET$dependencyFlags = LAYOUT.byteOffset(PATH$dependencyFlags);
    public static final long OFFSET$viewOffset = LAYOUT.byteOffset(PATH$viewOffset);
}
