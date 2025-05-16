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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOpticalFlowSessionCreatePrivateDataInfoNV.html"><code>VkOpticalFlowSessionCreatePrivateDataInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkOpticalFlowSessionCreatePrivateDataInfoNV {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint32_t id;
///     uint32_t size;
///     void const* pPrivateData;
/// } VkOpticalFlowSessionCreatePrivateDataInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV`
///
/// The {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkOpticalFlowSessionCreatePrivateDataInfoNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOpticalFlowSessionCreatePrivateDataInfoNV.html"><code>VkOpticalFlowSessionCreatePrivateDataInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkOpticalFlowSessionCreatePrivateDataInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV allocate(Arena arena) {
        VkOpticalFlowSessionCreatePrivateDataInfoNV ret = new VkOpticalFlowSessionCreatePrivateDataInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV);
        return ret;
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkOpticalFlowSessionCreatePrivateDataInfoNV[] ret = new VkOpticalFlowSessionCreatePrivateDataInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV);
        }
        return ret;
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV clone(Arena arena, VkOpticalFlowSessionCreatePrivateDataInfoNV src) {
        VkOpticalFlowSessionCreatePrivateDataInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV[] clone(Arena arena, VkOpticalFlowSessionCreatePrivateDataInfoNV[] src) {
        VkOpticalFlowSessionCreatePrivateDataInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV);
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

    public @unsigned int id() {
        return segment.get(LAYOUT$id, OFFSET$id);
    }

    public void id(@unsigned int value) {
        segment.set(LAYOUT$id, OFFSET$id, value);
    }

    public @unsigned int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @pointer(comment="void*") MemorySegment pPrivateData() {
        return segment.get(LAYOUT$pPrivateData, OFFSET$pPrivateData);
    }

    public void pPrivateData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pPrivateData, OFFSET$pPrivateData, value);
    }

    public void pPrivateData(@Nullable IPointer pointer) {
        pPrivateData(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("id"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.ADDRESS.withName("pPrivateData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$id = PathElement.groupElement("PATH$id");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");
    public static final PathElement PATH$pPrivateData = PathElement.groupElement("PATH$pPrivateData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$id = (OfInt) LAYOUT.select(PATH$id);
    public static final OfInt LAYOUT$size = (OfInt) LAYOUT.select(PATH$size);
    public static final AddressLayout LAYOUT$pPrivateData = (AddressLayout) LAYOUT.select(PATH$pPrivateData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$id = LAYOUT$id.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$pPrivateData = LAYOUT$pPrivateData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$id = LAYOUT.byteOffset(PATH$id);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$pPrivateData = LAYOUT.byteOffset(PATH$pPrivateData);
}
