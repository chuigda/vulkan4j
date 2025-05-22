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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExtensionProperties.html"><code>VkExtensionProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkExtensionProperties {
///     char extensionName; // @link substring="extensionName" target="#extensionName"
///     uint32_t specVersion; // @link substring="specVersion" target="#specVersion"
/// } VkExtensionProperties;
/// }
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExtensionProperties.html"><code>VkExtensionProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkExtensionProperties(@NotNull MemorySegment segment) implements IVkExtensionProperties {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExtensionProperties.html"><code>VkExtensionProperties</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkExtensionProperties}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkExtensionProperties to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkExtensionProperties.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkExtensionProperties {
        public long size() {
            return segment.byteSize() / VkExtensionProperties.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkExtensionProperties at(long index) {
            return new VkExtensionProperties(segment.asSlice(index * VkExtensionProperties.BYTES, VkExtensionProperties.BYTES));
        }
        public void write(long index, @NotNull VkExtensionProperties value) {
            MemorySegment s = segment.asSlice(index * VkExtensionProperties.BYTES, VkExtensionProperties.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkExtensionProperties allocate(Arena arena) {
        return new VkExtensionProperties(arena.allocate(LAYOUT));
    }

    public static VkExtensionProperties.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExtensionProperties.Ptr ret = new VkExtensionProperties.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkExtensionProperties clone(Arena arena, VkExtensionProperties src) {
        VkExtensionProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public byte extensionName() {
        return segment.get(LAYOUT$extensionName, OFFSET$extensionName);
    }

    public void extensionName(byte value) {
        segment.set(LAYOUT$extensionName, OFFSET$extensionName, value);
    }

    public @unsigned int specVersion() {
        return segment.get(LAYOUT$specVersion, OFFSET$specVersion);
    }

    public void specVersion(@unsigned int value) {
        segment.set(LAYOUT$specVersion, OFFSET$specVersion, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("extensionName"),
        ValueLayout.JAVA_INT.withName("specVersion")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$extensionName = PathElement.groupElement("extensionName");
    public static final PathElement PATH$specVersion = PathElement.groupElement("specVersion");

    public static final OfByte LAYOUT$extensionName = (OfByte) LAYOUT.select(PATH$extensionName);
    public static final OfInt LAYOUT$specVersion = (OfInt) LAYOUT.select(PATH$specVersion);

    public static final long SIZE$extensionName = LAYOUT$extensionName.byteSize();
    public static final long SIZE$specVersion = LAYOUT$specVersion.byteSize();

    public static final long OFFSET$extensionName = LAYOUT.byteOffset(PATH$extensionName);
    public static final long OFFSET$specVersion = LAYOUT.byteOffset(PATH$specVersion);
}
