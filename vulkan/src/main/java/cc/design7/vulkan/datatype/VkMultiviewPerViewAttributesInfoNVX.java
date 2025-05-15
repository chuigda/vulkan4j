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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMultiviewPerViewAttributesInfoNVX.html"><code>VkMultiviewPerViewAttributesInfoNVX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkMultiviewPerViewAttributesInfoNVX {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkBool32 perViewAttributes;
///     VkBool32 perViewAttributesPositionXOnly;
/// } VkMultiviewPerViewAttributesInfoNVX;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX`
///
/// The {@link VkMultiviewPerViewAttributesInfoNVX#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkMultiviewPerViewAttributesInfoNVX#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMultiviewPerViewAttributesInfoNVX.html"><code>VkMultiviewPerViewAttributesInfoNVX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMultiviewPerViewAttributesInfoNVX(@NotNull MemorySegment segment) implements IPointer {
    public static VkMultiviewPerViewAttributesInfoNVX allocate(Arena arena) {
        VkMultiviewPerViewAttributesInfoNVX ret = new VkMultiviewPerViewAttributesInfoNVX(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX);
        return ret;
    }

    public static VkMultiviewPerViewAttributesInfoNVX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMultiviewPerViewAttributesInfoNVX[] ret = new VkMultiviewPerViewAttributesInfoNVX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMultiviewPerViewAttributesInfoNVX(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX);
        }
        return ret;
    }

    public static VkMultiviewPerViewAttributesInfoNVX clone(Arena arena, VkMultiviewPerViewAttributesInfoNVX src) {
        VkMultiviewPerViewAttributesInfoNVX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMultiviewPerViewAttributesInfoNVX[] clone(Arena arena, VkMultiviewPerViewAttributesInfoNVX[] src) {
        VkMultiviewPerViewAttributesInfoNVX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX);
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

    public @unsigned int perViewAttributes() {
        return segment.get(LAYOUT$perViewAttributes, OFFSET$perViewAttributes);
    }

    public void perViewAttributes(@unsigned int value) {
        segment.set(LAYOUT$perViewAttributes, OFFSET$perViewAttributes, value);
    }

    public @unsigned int perViewAttributesPositionXOnly() {
        return segment.get(LAYOUT$perViewAttributesPositionXOnly, OFFSET$perViewAttributesPositionXOnly);
    }

    public void perViewAttributesPositionXOnly(@unsigned int value) {
        segment.set(LAYOUT$perViewAttributesPositionXOnly, OFFSET$perViewAttributesPositionXOnly, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perViewAttributes"),
        ValueLayout.JAVA_INT.withName("perViewAttributesPositionXOnly")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$perViewAttributes = PathElement.groupElement("PATH$perViewAttributes");
    public static final PathElement PATH$perViewAttributesPositionXOnly = PathElement.groupElement("PATH$perViewAttributesPositionXOnly");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$perViewAttributes = (OfInt) LAYOUT.select(PATH$perViewAttributes);
    public static final OfInt LAYOUT$perViewAttributesPositionXOnly = (OfInt) LAYOUT.select(PATH$perViewAttributesPositionXOnly);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$perViewAttributes = LAYOUT$perViewAttributes.byteSize();
    public static final long SIZE$perViewAttributesPositionXOnly = LAYOUT$perViewAttributesPositionXOnly.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$perViewAttributes = LAYOUT.byteOffset(PATH$perViewAttributes);
    public static final long OFFSET$perViewAttributesPositionXOnly = LAYOUT.byteOffset(PATH$perViewAttributesPositionXOnly);
}
