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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderObjectPropertiesEXT.html"><code>VkPhysicalDeviceShaderObjectPropertiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderObjectPropertiesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint8_t shaderBinaryUUID; // @link substring="shaderBinaryUUID" target="#shaderBinaryUUID"
///     uint32_t shaderBinaryVersion; // @link substring="shaderBinaryVersion" target="#shaderBinaryVersion"
/// } VkPhysicalDeviceShaderObjectPropertiesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceShaderObjectPropertiesEXT#allocate(Arena)}, {@link VkPhysicalDeviceShaderObjectPropertiesEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceShaderObjectPropertiesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderObjectPropertiesEXT.html"><code>VkPhysicalDeviceShaderObjectPropertiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShaderObjectPropertiesEXT(@NotNull MemorySegment segment) implements IVkPhysicalDeviceShaderObjectPropertiesEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderObjectPropertiesEXT.html"><code>VkPhysicalDeviceShaderObjectPropertiesEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceShaderObjectPropertiesEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceShaderObjectPropertiesEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceShaderObjectPropertiesEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceShaderObjectPropertiesEXT {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceShaderObjectPropertiesEXT.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceShaderObjectPropertiesEXT at(long index) {
            return new VkPhysicalDeviceShaderObjectPropertiesEXT(segment.asSlice(index * VkPhysicalDeviceShaderObjectPropertiesEXT.BYTES, VkPhysicalDeviceShaderObjectPropertiesEXT.BYTES));
        }
        public void write(long index, @NotNull VkPhysicalDeviceShaderObjectPropertiesEXT value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceShaderObjectPropertiesEXT.BYTES, VkPhysicalDeviceShaderObjectPropertiesEXT.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPhysicalDeviceShaderObjectPropertiesEXT allocate(Arena arena) {
        VkPhysicalDeviceShaderObjectPropertiesEXT ret = new VkPhysicalDeviceShaderObjectPropertiesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceShaderObjectPropertiesEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderObjectPropertiesEXT.Ptr ret = new VkPhysicalDeviceShaderObjectPropertiesEXT.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderObjectPropertiesEXT clone(Arena arena, VkPhysicalDeviceShaderObjectPropertiesEXT src) {
        VkPhysicalDeviceShaderObjectPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT);
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

    public @unsigned byte shaderBinaryUUID() {
        return segment.get(LAYOUT$shaderBinaryUUID, OFFSET$shaderBinaryUUID);
    }

    public void shaderBinaryUUID(@unsigned byte value) {
        segment.set(LAYOUT$shaderBinaryUUID, OFFSET$shaderBinaryUUID, value);
    }

    public @unsigned int shaderBinaryVersion() {
        return segment.get(LAYOUT$shaderBinaryVersion, OFFSET$shaderBinaryVersion);
    }

    public void shaderBinaryVersion(@unsigned int value) {
        segment.set(LAYOUT$shaderBinaryVersion, OFFSET$shaderBinaryVersion, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_BYTE.withName("shaderBinaryUUID"),
        ValueLayout.JAVA_INT.withName("shaderBinaryVersion")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderBinaryUUID = PathElement.groupElement("shaderBinaryUUID");
    public static final PathElement PATH$shaderBinaryVersion = PathElement.groupElement("shaderBinaryVersion");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfByte LAYOUT$shaderBinaryUUID = (OfByte) LAYOUT.select(PATH$shaderBinaryUUID);
    public static final OfInt LAYOUT$shaderBinaryVersion = (OfInt) LAYOUT.select(PATH$shaderBinaryVersion);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderBinaryUUID = LAYOUT$shaderBinaryUUID.byteSize();
    public static final long SIZE$shaderBinaryVersion = LAYOUT$shaderBinaryVersion.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderBinaryUUID = LAYOUT.byteOffset(PATH$shaderBinaryUUID);
    public static final long OFFSET$shaderBinaryVersion = LAYOUT.byteOffset(PATH$shaderBinaryVersion);
}
