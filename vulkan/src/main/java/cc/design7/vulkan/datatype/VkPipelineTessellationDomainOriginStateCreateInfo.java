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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineTessellationDomainOriginStateCreateInfo.html"><code>VkPipelineTessellationDomainOriginStateCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineTessellationDomainOriginStateCreateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkTessellationDomainOrigin domainOrigin;
/// } VkPipelineTessellationDomainOriginStateCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO`
///
/// The {@link VkPipelineTessellationDomainOriginStateCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPipelineTessellationDomainOriginStateCreateInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineTessellationDomainOriginStateCreateInfo.html"><code>VkPipelineTessellationDomainOriginStateCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineTessellationDomainOriginStateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineTessellationDomainOriginStateCreateInfo allocate(Arena arena) {
        VkPipelineTessellationDomainOriginStateCreateInfo ret = new VkPipelineTessellationDomainOriginStateCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO);
        return ret;
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineTessellationDomainOriginStateCreateInfo[] ret = new VkPipelineTessellationDomainOriginStateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineTessellationDomainOriginStateCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO);
        }
        return ret;
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfo clone(Arena arena, VkPipelineTessellationDomainOriginStateCreateInfo src) {
        VkPipelineTessellationDomainOriginStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfo[] clone(Arena arena, VkPipelineTessellationDomainOriginStateCreateInfo[] src) {
        VkPipelineTessellationDomainOriginStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO);
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

    public @enumtype(VkTessellationDomainOrigin.class) int domainOrigin() {
        return segment.get(LAYOUT$domainOrigin, OFFSET$domainOrigin);
    }

    public void domainOrigin(@enumtype(VkTessellationDomainOrigin.class) int value) {
        segment.set(LAYOUT$domainOrigin, OFFSET$domainOrigin, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("domainOrigin")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$domainOrigin = PathElement.groupElement("PATH$domainOrigin");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$domainOrigin = (OfInt) LAYOUT.select(PATH$domainOrigin);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$domainOrigin = LAYOUT$domainOrigin.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$domainOrigin = LAYOUT.byteOffset(PATH$domainOrigin);
}
