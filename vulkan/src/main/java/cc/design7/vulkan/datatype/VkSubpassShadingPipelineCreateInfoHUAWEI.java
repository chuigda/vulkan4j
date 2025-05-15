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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassShadingPipelineCreateInfoHUAWEI.html"><code>VkSubpassShadingPipelineCreateInfoHUAWEI</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSubpassShadingPipelineCreateInfoHUAWEI {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkRenderPass renderPass;
///     uint32_t subpass;
/// } VkSubpassShadingPipelineCreateInfoHUAWEI;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI`
///
/// The {@link VkSubpassShadingPipelineCreateInfoHUAWEI#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSubpassShadingPipelineCreateInfoHUAWEI#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassShadingPipelineCreateInfoHUAWEI.html"><code>VkSubpassShadingPipelineCreateInfoHUAWEI</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSubpassShadingPipelineCreateInfoHUAWEI(@NotNull MemorySegment segment) implements IPointer {
    public static VkSubpassShadingPipelineCreateInfoHUAWEI allocate(Arena arena) {
        VkSubpassShadingPipelineCreateInfoHUAWEI ret = new VkSubpassShadingPipelineCreateInfoHUAWEI(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI);
        return ret;
    }

    public static VkSubpassShadingPipelineCreateInfoHUAWEI[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubpassShadingPipelineCreateInfoHUAWEI[] ret = new VkSubpassShadingPipelineCreateInfoHUAWEI[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSubpassShadingPipelineCreateInfoHUAWEI(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI);
        }
        return ret;
    }

    public static VkSubpassShadingPipelineCreateInfoHUAWEI clone(Arena arena, VkSubpassShadingPipelineCreateInfoHUAWEI src) {
        VkSubpassShadingPipelineCreateInfoHUAWEI ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSubpassShadingPipelineCreateInfoHUAWEI[] clone(Arena arena, VkSubpassShadingPipelineCreateInfoHUAWEI[] src) {
        VkSubpassShadingPipelineCreateInfoHUAWEI[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI);
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

    public @Nullable VkRenderPass renderPass() {
        MemorySegment s = segment.asSlice(OFFSET$renderPass, SIZE$renderPass);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkRenderPass(s);
    }

    public void renderPass(@Nullable VkRenderPass value) {
        segment.set(LAYOUT$renderPass, OFFSET$renderPass, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int subpass() {
        return segment.get(LAYOUT$subpass, OFFSET$subpass);
    }

    public void subpass(@unsigned int value) {
        segment.set(LAYOUT$subpass, OFFSET$subpass, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$renderPass = PathElement.groupElement("PATH$renderPass");
    public static final PathElement PATH$subpass = PathElement.groupElement("PATH$subpass");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$renderPass = (AddressLayout) LAYOUT.select(PATH$renderPass);
    public static final OfInt LAYOUT$subpass = (OfInt) LAYOUT.select(PATH$subpass);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$renderPass = LAYOUT$renderPass.byteSize();
    public static final long SIZE$subpass = LAYOUT$subpass.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$renderPass = LAYOUT.byteOffset(PATH$renderPass);
    public static final long OFFSET$subpass = LAYOUT.byteOffset(PATH$subpass);
}
