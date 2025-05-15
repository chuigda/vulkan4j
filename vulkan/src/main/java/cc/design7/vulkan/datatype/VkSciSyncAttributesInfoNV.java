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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSciSyncAttributesInfoNV.html"><code>VkSciSyncAttributesInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSciSyncAttributesInfoNV {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkSciSyncClientTypeNV clientType;
///     VkSciSyncPrimitiveTypeNV primitiveType;
/// } VkSciSyncAttributesInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SCI_SYNC_ATTRIBUTES_INFO_NV`
///
/// The {@link VkSciSyncAttributesInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSciSyncAttributesInfoNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSciSyncAttributesInfoNV.html"><code>VkSciSyncAttributesInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSciSyncAttributesInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkSciSyncAttributesInfoNV allocate(Arena arena) {
        VkSciSyncAttributesInfoNV ret = new VkSciSyncAttributesInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SCI_SYNC_ATTRIBUTES_INFO_NV);
        return ret;
    }

    public static VkSciSyncAttributesInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSciSyncAttributesInfoNV[] ret = new VkSciSyncAttributesInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSciSyncAttributesInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SCI_SYNC_ATTRIBUTES_INFO_NV);
        }
        return ret;
    }

    public static VkSciSyncAttributesInfoNV clone(Arena arena, VkSciSyncAttributesInfoNV src) {
        VkSciSyncAttributesInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSciSyncAttributesInfoNV[] clone(Arena arena, VkSciSyncAttributesInfoNV[] src) {
        VkSciSyncAttributesInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SCI_SYNC_ATTRIBUTES_INFO_NV);
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

    public @enumtype(VkSciSyncClientTypeNV.class) int clientType() {
        return segment.get(LAYOUT$clientType, OFFSET$clientType);
    }

    public void clientType(@enumtype(VkSciSyncClientTypeNV.class) int value) {
        segment.set(LAYOUT$clientType, OFFSET$clientType, value);
    }

    public @enumtype(VkSciSyncPrimitiveTypeNV.class) int primitiveType() {
        return segment.get(LAYOUT$primitiveType, OFFSET$primitiveType);
    }

    public void primitiveType(@enumtype(VkSciSyncPrimitiveTypeNV.class) int value) {
        segment.set(LAYOUT$primitiveType, OFFSET$primitiveType, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("clientType"),
        ValueLayout.JAVA_INT.withName("primitiveType")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$clientType = PathElement.groupElement("PATH$clientType");
    public static final PathElement PATH$primitiveType = PathElement.groupElement("PATH$primitiveType");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$clientType = (OfInt) LAYOUT.select(PATH$clientType);
    public static final OfInt LAYOUT$primitiveType = (OfInt) LAYOUT.select(PATH$primitiveType);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$clientType = LAYOUT$clientType.byteSize();
    public static final long SIZE$primitiveType = LAYOUT$primitiveType.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$clientType = LAYOUT.byteOffset(PATH$clientType);
    public static final long OFFSET$primitiveType = LAYOUT.byteOffset(PATH$primitiveType);
}
