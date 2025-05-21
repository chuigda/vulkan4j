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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPushDescriptorSetWithTemplateInfo.html"><code>VkPushDescriptorSetWithTemplateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPushDescriptorSetWithTemplateInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkDescriptorUpdateTemplate descriptorUpdateTemplate; // @link substring="VkDescriptorUpdateTemplate" target="VkDescriptorUpdateTemplate" @link substring="descriptorUpdateTemplate" target="#descriptorUpdateTemplate"
///     VkPipelineLayout layout; // optional // @link substring="VkPipelineLayout" target="VkPipelineLayout" @link substring="layout" target="#layout"
///     uint32_t set; // optional // @link substring="set" target="#set"
///     void const* pData; // @link substring="pData" target="#pData"
/// } VkPushDescriptorSetWithTemplateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO`
///
/// The {@code allocate} ({@link VkPushDescriptorSetWithTemplateInfo#allocate(Arena)}, {@link VkPushDescriptorSetWithTemplateInfo#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPushDescriptorSetWithTemplateInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPushDescriptorSetWithTemplateInfo.html"><code>VkPushDescriptorSetWithTemplateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPushDescriptorSetWithTemplateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkPushDescriptorSetWithTemplateInfo allocate(Arena arena) {
        VkPushDescriptorSetWithTemplateInfo ret = new VkPushDescriptorSetWithTemplateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO);
        return ret;
    }

    public static VkPushDescriptorSetWithTemplateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPushDescriptorSetWithTemplateInfo[] ret = new VkPushDescriptorSetWithTemplateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPushDescriptorSetWithTemplateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO);
        }
        return ret;
    }

    public static VkPushDescriptorSetWithTemplateInfo clone(Arena arena, VkPushDescriptorSetWithTemplateInfo src) {
        VkPushDescriptorSetWithTemplateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPushDescriptorSetWithTemplateInfo[] clone(Arena arena, VkPushDescriptorSetWithTemplateInfo[] src) {
        VkPushDescriptorSetWithTemplateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO);
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

    public @Nullable VkDescriptorUpdateTemplate descriptorUpdateTemplate() {
        MemorySegment s = segment.asSlice(OFFSET$descriptorUpdateTemplate, SIZE$descriptorUpdateTemplate);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorUpdateTemplate(s);
    }

    public void descriptorUpdateTemplate(@Nullable VkDescriptorUpdateTemplate value) {
        segment.set(LAYOUT$descriptorUpdateTemplate, OFFSET$descriptorUpdateTemplate, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkPipelineLayout layout() {
        MemorySegment s = segment.asSlice(OFFSET$layout, SIZE$layout);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void layout(@Nullable VkPipelineLayout value) {
        segment.set(LAYOUT$layout, OFFSET$layout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int set() {
        return segment.get(LAYOUT$set, OFFSET$set);
    }

    public void set(@unsigned int value) {
        segment.set(LAYOUT$set, OFFSET$set, value);
    }

    public @pointer(comment="void*") MemorySegment pData() {
        return segment.get(LAYOUT$pData, OFFSET$pData);
    }

    public void pData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pData, OFFSET$pData, value);
    }

    public void pData(@Nullable IPointer pointer) {
        pData(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("descriptorUpdateTemplate"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("set"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorUpdateTemplate = PathElement.groupElement("descriptorUpdateTemplate");
    public static final PathElement PATH$layout = PathElement.groupElement("layout");
    public static final PathElement PATH$set = PathElement.groupElement("set");
    public static final PathElement PATH$pData = PathElement.groupElement("pData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$descriptorUpdateTemplate = (AddressLayout) LAYOUT.select(PATH$descriptorUpdateTemplate);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final OfInt LAYOUT$set = (OfInt) LAYOUT.select(PATH$set);
    public static final AddressLayout LAYOUT$pData = (AddressLayout) LAYOUT.select(PATH$pData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorUpdateTemplate = LAYOUT$descriptorUpdateTemplate.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$set = LAYOUT$set.byteSize();
    public static final long SIZE$pData = LAYOUT$pData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorUpdateTemplate = LAYOUT.byteOffset(PATH$descriptorUpdateTemplate);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$set = LAYOUT.byteOffset(PATH$set);
    public static final long OFFSET$pData = LAYOUT.byteOffset(PATH$pData);
}
