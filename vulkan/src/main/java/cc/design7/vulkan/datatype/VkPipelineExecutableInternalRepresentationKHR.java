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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineExecutableInternalRepresentationKHR.html"><code>VkPipelineExecutableInternalRepresentationKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineExecutableInternalRepresentationKHR {
///     VkStructureType sType;
///     void* pNext; // optional
///     char name;
///     char description;
///     VkBool32 isText;
///     size_t dataSize;
///     void* pData; // optional
/// } VkPipelineExecutableInternalRepresentationKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR`
///
/// The {@link VkPipelineExecutableInternalRepresentationKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPipelineExecutableInternalRepresentationKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineExecutableInternalRepresentationKHR.html"><code>VkPipelineExecutableInternalRepresentationKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineExecutableInternalRepresentationKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineExecutableInternalRepresentationKHR allocate(Arena arena) {
        VkPipelineExecutableInternalRepresentationKHR ret = new VkPipelineExecutableInternalRepresentationKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR);
        return ret;
    }

    public static VkPipelineExecutableInternalRepresentationKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineExecutableInternalRepresentationKHR[] ret = new VkPipelineExecutableInternalRepresentationKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineExecutableInternalRepresentationKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR);
        }
        return ret;
    }

    public static VkPipelineExecutableInternalRepresentationKHR clone(Arena arena, VkPipelineExecutableInternalRepresentationKHR src) {
        VkPipelineExecutableInternalRepresentationKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineExecutableInternalRepresentationKHR[] clone(Arena arena, VkPipelineExecutableInternalRepresentationKHR[] src) {
        VkPipelineExecutableInternalRepresentationKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR);
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

    public byte name() {
        return segment.get(LAYOUT$name, OFFSET$name);
    }

    public void name(byte value) {
        segment.set(LAYOUT$name, OFFSET$name, value);
    }

    public byte description() {
        return segment.get(LAYOUT$description, OFFSET$description);
    }

    public void description(byte value) {
        segment.set(LAYOUT$description, OFFSET$description, value);
    }

    public @unsigned int isText() {
        return segment.get(LAYOUT$isText, OFFSET$isText);
    }

    public void isText(@unsigned int value) {
        segment.set(LAYOUT$isText, OFFSET$isText, value);
    }

    public @unsigned long dataSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$dataSize);
    }

    public void dataSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$dataSize, value);
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
        ValueLayout.JAVA_BYTE.withName("name"),
        ValueLayout.JAVA_BYTE.withName("description"),
        ValueLayout.JAVA_INT.withName("isText"),
        NativeLayout.C_SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$name = PathElement.groupElement("PATH$name");
    public static final PathElement PATH$description = PathElement.groupElement("PATH$description");
    public static final PathElement PATH$isText = PathElement.groupElement("PATH$isText");
    public static final PathElement PATH$dataSize = PathElement.groupElement("PATH$dataSize");
    public static final PathElement PATH$pData = PathElement.groupElement("PATH$pData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfByte LAYOUT$name = (OfByte) LAYOUT.select(PATH$name);
    public static final OfByte LAYOUT$description = (OfByte) LAYOUT.select(PATH$description);
    public static final OfInt LAYOUT$isText = (OfInt) LAYOUT.select(PATH$isText);
    public static final AddressLayout LAYOUT$pData = (AddressLayout) LAYOUT.select(PATH$pData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$isText = LAYOUT$isText.byteSize();
    public static final long SIZE$dataSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$pData = LAYOUT$pData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$isText = LAYOUT.byteOffset(PATH$isText);
    public static final long OFFSET$dataSize = LAYOUT.byteOffset(PATH$dataSize);
    public static final long OFFSET$pData = LAYOUT.byteOffset(PATH$pData);
}
