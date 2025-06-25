package club.doki7.openxr.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.openxr.bitmask.*;
import club.doki7.openxr.handle.*;
import club.doki7.openxr.enumtype.*;
import static club.doki7.openxr.XRConstants.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrApiLayerCreateInfo.html"><code>XrApiLayerCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrApiLayerCreateInfo {
///     XrLoaderInterfaceStructs structType; // @link substring="XrLoaderInterfaceStructs" target="XrLoaderInterfaceStructs" @link substring="structType" target="#structType"
///     uint32_t structVersion; // @link substring="structVersion" target="#structVersion"
///     size_t structSize; // @link substring="structSize" target="#structSize"
///     void* loaderInstance; // @link substring="loaderInstance" target="#loaderInstance"
///     char[XR_API_LAYER_MAX_SETTINGS_PATH_SIZE] settings_file_location; // @link substring="settings_file_location" target="#settings_file_location"
///     XrApiLayerNextInfo* nextInfo; // @link substring="XrApiLayerNextInfo" target="XrApiLayerNextInfo" @link substring="nextInfo" target="#nextInfo"
/// } XrApiLayerCreateInfo;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrApiLayerCreateInfo.html"><code>XrApiLayerCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrApiLayerCreateInfo(@NotNull MemorySegment segment) implements IXrApiLayerCreateInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrApiLayerCreateInfo.html"><code>XrApiLayerCreateInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrApiLayerCreateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrApiLayerCreateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrApiLayerCreateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrApiLayerCreateInfo, Iterable<XrApiLayerCreateInfo> {
        public long size() {
            return segment.byteSize() / XrApiLayerCreateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrApiLayerCreateInfo at(long index) {
            return new XrApiLayerCreateInfo(segment.asSlice(index * XrApiLayerCreateInfo.BYTES, XrApiLayerCreateInfo.BYTES));
        }

        public void write(long index, @NotNull XrApiLayerCreateInfo value) {
            MemorySegment s = segment.asSlice(index * XrApiLayerCreateInfo.BYTES, XrApiLayerCreateInfo.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * XrApiLayerCreateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrApiLayerCreateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrApiLayerCreateInfo.BYTES,
                (end - start) * XrApiLayerCreateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrApiLayerCreateInfo.BYTES));
        }

        public XrApiLayerCreateInfo[] toArray() {
            XrApiLayerCreateInfo[] ret = new XrApiLayerCreateInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrApiLayerCreateInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrApiLayerCreateInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrApiLayerCreateInfo.BYTES;
            }

            @Override
            public XrApiLayerCreateInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrApiLayerCreateInfo ret = new XrApiLayerCreateInfo(segment.asSlice(0, XrApiLayerCreateInfo.BYTES));
                segment = segment.asSlice(XrApiLayerCreateInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrApiLayerCreateInfo allocate(Arena arena) {
        return new XrApiLayerCreateInfo(arena.allocate(LAYOUT));
    }

    public static XrApiLayerCreateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrApiLayerCreateInfo.Ptr(segment);
    }

    public static XrApiLayerCreateInfo clone(Arena arena, XrApiLayerCreateInfo src) {
        XrApiLayerCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(XrLoaderInterfaceStructs.class) int structType() {
        return segment.get(LAYOUT$structType, OFFSET$structType);
    }

    public XrApiLayerCreateInfo structType(@EnumType(XrLoaderInterfaceStructs.class) int value) {
        segment.set(LAYOUT$structType, OFFSET$structType, value);
        return this;
    }

    public @Unsigned int structVersion() {
        return segment.get(LAYOUT$structVersion, OFFSET$structVersion);
    }

    public XrApiLayerCreateInfo structVersion(@Unsigned int value) {
        segment.set(LAYOUT$structVersion, OFFSET$structVersion, value);
        return this;
    }

    public @Unsigned long structSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$structSize);
    }

    public XrApiLayerCreateInfo structSize(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$structSize, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment loaderInstance() {
        return segment.get(LAYOUT$loaderInstance, OFFSET$loaderInstance);
    }

    public XrApiLayerCreateInfo loaderInstance(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$loaderInstance, OFFSET$loaderInstance, value);
        return this;
    }

    public XrApiLayerCreateInfo loaderInstance(@Nullable IPointer pointer) {
        loaderInstance(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public BytePtr settings_file_location() {
        return new BytePtr(settings_file_locationRaw());
    }

    public XrApiLayerCreateInfo settings_file_location(BytePtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$settings_file_location, SIZE$settings_file_location);
        return this;
    }

    public @NotNull MemorySegment settings_file_locationRaw() {
        return segment.asSlice(OFFSET$settings_file_location, SIZE$settings_file_location);
    }

    public XrApiLayerCreateInfo nextInfo(@Nullable IXrApiLayerNextInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextInfoRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrApiLayerNextInfo.Ptr nextInfo(int assumedCount) {
        MemorySegment s = nextInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrApiLayerNextInfo.BYTES);
        return new XrApiLayerNextInfo.Ptr(s);
    }

    public @Nullable XrApiLayerNextInfo nextInfo() {
        MemorySegment s = nextInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrApiLayerNextInfo(s);
    }

    public @Pointer(target=XrApiLayerNextInfo.class) @NotNull MemorySegment nextInfoRaw() {
        return segment.get(LAYOUT$nextInfo, OFFSET$nextInfo);
    }

    public void nextInfoRaw(@Pointer(target=XrApiLayerNextInfo.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$nextInfo, OFFSET$nextInfo, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("structType"),
        ValueLayout.JAVA_INT.withName("structVersion"),
        NativeLayout.C_SIZE_T.withName("structSize"),
        ValueLayout.ADDRESS.withName("loaderInstance"),
        MemoryLayout.sequenceLayout(API_LAYER_MAX_SETTINGS_PATH_SIZE, ValueLayout.JAVA_BYTE).withName("settings_file_location"),
        ValueLayout.ADDRESS.withTargetLayout(XrApiLayerNextInfo.LAYOUT).withName("nextInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$structType = PathElement.groupElement("structType");
    public static final PathElement PATH$structVersion = PathElement.groupElement("structVersion");
    public static final PathElement PATH$structSize = PathElement.groupElement("structSize");
    public static final PathElement PATH$loaderInstance = PathElement.groupElement("loaderInstance");
    public static final PathElement PATH$settings_file_location = PathElement.groupElement("settings_file_location");
    public static final PathElement PATH$nextInfo = PathElement.groupElement("nextInfo");

    public static final OfInt LAYOUT$structType = (OfInt) LAYOUT.select(PATH$structType);
    public static final OfInt LAYOUT$structVersion = (OfInt) LAYOUT.select(PATH$structVersion);
    public static final AddressLayout LAYOUT$loaderInstance = (AddressLayout) LAYOUT.select(PATH$loaderInstance);
    public static final SequenceLayout LAYOUT$settings_file_location = (SequenceLayout) LAYOUT.select(PATH$settings_file_location);
    public static final AddressLayout LAYOUT$nextInfo = (AddressLayout) LAYOUT.select(PATH$nextInfo);

    public static final long SIZE$structType = LAYOUT$structType.byteSize();
    public static final long SIZE$structVersion = LAYOUT$structVersion.byteSize();
    public static final long SIZE$structSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$loaderInstance = LAYOUT$loaderInstance.byteSize();
    public static final long SIZE$settings_file_location = LAYOUT$settings_file_location.byteSize();
    public static final long SIZE$nextInfo = LAYOUT$nextInfo.byteSize();

    public static final long OFFSET$structType = LAYOUT.byteOffset(PATH$structType);
    public static final long OFFSET$structVersion = LAYOUT.byteOffset(PATH$structVersion);
    public static final long OFFSET$structSize = LAYOUT.byteOffset(PATH$structSize);
    public static final long OFFSET$loaderInstance = LAYOUT.byteOffset(PATH$loaderInstance);
    public static final long OFFSET$settings_file_location = LAYOUT.byteOffset(PATH$settings_file_location);
    public static final long OFFSET$nextInfo = LAYOUT.byteOffset(PATH$nextInfo);
}
