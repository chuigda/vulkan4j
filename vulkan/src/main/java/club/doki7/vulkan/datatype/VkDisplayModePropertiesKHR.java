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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayModePropertiesKHR.html"><code>VkDisplayModePropertiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDisplayModePropertiesKHR {
///     VkDisplayModeKHR displayMode; // @link substring="VkDisplayModeKHR" target="VkDisplayModeKHR" @link substring="displayMode" target="#displayMode"
///     VkDisplayModeParametersKHR parameters; // @link substring="VkDisplayModeParametersKHR" target="VkDisplayModeParametersKHR" @link substring="parameters" target="#parameters"
/// } VkDisplayModePropertiesKHR;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayModePropertiesKHR.html"><code>VkDisplayModePropertiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDisplayModePropertiesKHR(@NotNull MemorySegment segment) implements IVkDisplayModePropertiesKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayModePropertiesKHR.html"><code>VkDisplayModePropertiesKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDisplayModePropertiesKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDisplayModePropertiesKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDisplayModePropertiesKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDisplayModePropertiesKHR {
        public long size() {
            return segment.byteSize() / VkDisplayModePropertiesKHR.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDisplayModePropertiesKHR at(long index) {
            return new VkDisplayModePropertiesKHR(segment.asSlice(index * VkDisplayModePropertiesKHR.BYTES, VkDisplayModePropertiesKHR.BYTES));
        }
        public void write(long index, @NotNull VkDisplayModePropertiesKHR value) {
            MemorySegment s = segment.asSlice(index * VkDisplayModePropertiesKHR.BYTES, VkDisplayModePropertiesKHR.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkDisplayModePropertiesKHR allocate(Arena arena) {
        return new VkDisplayModePropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkDisplayModePropertiesKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayModePropertiesKHR.Ptr ret = new VkDisplayModePropertiesKHR.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkDisplayModePropertiesKHR clone(Arena arena, VkDisplayModePropertiesKHR src) {
        VkDisplayModePropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable VkDisplayModeKHR displayMode() {
        MemorySegment s = segment.asSlice(OFFSET$displayMode, SIZE$displayMode);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDisplayModeKHR(s);
    }

    public void displayMode(@Nullable VkDisplayModeKHR value) {
        segment.set(LAYOUT$displayMode, OFFSET$displayMode, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @NotNull VkDisplayModeParametersKHR parameters() {
        return new VkDisplayModeParametersKHR(segment.asSlice(OFFSET$parameters, LAYOUT$parameters));
    }

    public void parameters(@NotNull VkDisplayModeParametersKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$parameters, SIZE$parameters);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("displayMode"),
        VkDisplayModeParametersKHR.LAYOUT.withName("parameters")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$displayMode = PathElement.groupElement("displayMode");
    public static final PathElement PATH$parameters = PathElement.groupElement("parameters");

    public static final AddressLayout LAYOUT$displayMode = (AddressLayout) LAYOUT.select(PATH$displayMode);
    public static final StructLayout LAYOUT$parameters = (StructLayout) LAYOUT.select(PATH$parameters);

    public static final long SIZE$displayMode = LAYOUT$displayMode.byteSize();
    public static final long SIZE$parameters = LAYOUT$parameters.byteSize();

    public static final long OFFSET$displayMode = LAYOUT.byteOffset(PATH$displayMode);
    public static final long OFFSET$parameters = LAYOUT.byteOffset(PATH$parameters);
}
