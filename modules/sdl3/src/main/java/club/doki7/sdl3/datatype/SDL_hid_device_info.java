package club.doki7.sdl3.datatype;

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
import club.doki7.sdl3.bitmask.*;
import club.doki7.sdl3.handle.*;
import club.doki7.sdl3.enumtype.*;
import static club.doki7.sdl3.SDL3Constants.*;

/// Information about a connected HID device
///
/// Since: This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_hid_device_info {
///     char* path; // @link substring="path" target="#path"
///     short vendor_id; // @link substring="vendor_id" target="#vendor_id"
///     short product_id; // @link substring="product_id" target="#product_id"
///     wchar_t* serial_number; // @link substring="serial_number" target="#serial_number"
///     short release_number; // @link substring="release_number" target="#release_number"
///     wchar_t* manufacturer_string; // @link substring="manufacturer_string" target="#manufacturer_string"
///     wchar_t* product_string; // @link substring="product_string" target="#product_string"
///     short usage_page; // @link substring="usage_page" target="#usage_page"
///     short usage; // @link substring="usage" target="#usage"
///     int interface_number; // @link substring="interface_number" target="#interface_number"
///     int interface_class; // @link substring="interface_class" target="#interface_class"
///     int interface_subclass; // @link substring="interface_subclass" target="#interface_subclass"
///     int interface_protocol; // @link substring="interface_protocol" target="#interface_protocol"
///     SDL_hid_bus_type bus_type; // @link substring="SDL_hid_bus_type" target="SDL_hid_bus_type" @link substring="bus_type" target="#bus_type"
///     SDL_hid_device_info* next; // @link substring="SDL_hid_device_info" target="SDL_hid_device_info" @link substring="next" target="#next"
/// } SDL_hid_device_info;
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
/// ## Member documentation
///
/// <ul>
/// <li>{@link #path} Platform-specific device path</li>
/// <li>{@link #vendor_id} Device Vendor ID</li>
/// <li>{@link #product_id} Device Product ID</li>
/// <li>{@link #serial_number} Serial Number</li>
/// <li>{@link #release_number} Device Release Number in binary-coded decimal,
/// also known as Device Version Number
/// </li>
/// <li>{@link #manufacturer_string} Manufacturer String</li>
/// <li>{@link #product_string} Product string</li>
/// <li>{@link #usage_page} Usage Page for this Device/Interface
/// (Windows/Mac/hidraw only)
/// </li>
/// <li>{@link #usage} Usage for this Device/Interface
/// (Windows/Mac/hidraw only)
/// </li>
/// <li>{@link #interface_number} The USB interface which this logical device
/// represents.
///
/// Valid only if the device is a USB HID device.
/// Set to -1 in all other cases.
/// </li>
/// <li>{@link #interface_class} Additional information about the USB interface.
/// Valid on libusb and Android implementations.
/// </li>
/// <li>{@link #bus_type} Underlying bus type</li>
/// <li>{@link #next} Pointer to the next device</li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record SDL_hid_device_info(@NotNull MemorySegment segment) implements ISDL_hid_device_info {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_hid_device_info}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_hid_device_info to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_hid_device_info.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_hid_device_info, Iterable<SDL_hid_device_info> {
        public long size() {
            return segment.byteSize() / SDL_hid_device_info.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_hid_device_info at(long index) {
            return new SDL_hid_device_info(segment.asSlice(index * SDL_hid_device_info.BYTES, SDL_hid_device_info.BYTES));
        }

        public void write(long index, @NotNull SDL_hid_device_info value) {
            MemorySegment s = segment.asSlice(index * SDL_hid_device_info.BYTES, SDL_hid_device_info.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_hid_device_info.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_hid_device_info.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_hid_device_info.BYTES,
                (end - start) * SDL_hid_device_info.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_hid_device_info.BYTES));
        }

        public SDL_hid_device_info[] toArray() {
            SDL_hid_device_info[] ret = new SDL_hid_device_info[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_hid_device_info> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_hid_device_info> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_hid_device_info.BYTES;
            }

            @Override
            public SDL_hid_device_info next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_hid_device_info ret = new SDL_hid_device_info(segment.asSlice(0, SDL_hid_device_info.BYTES));
                segment = segment.asSlice(SDL_hid_device_info.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_hid_device_info allocate(Arena arena) {
        return new SDL_hid_device_info(arena.allocate(LAYOUT));
    }

    public static SDL_hid_device_info.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_hid_device_info.Ptr(segment);
    }

    public static SDL_hid_device_info clone(Arena arena, SDL_hid_device_info src) {
        SDL_hid_device_info ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr path() {
        MemorySegment s = pathRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public SDL_hid_device_info path(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pathRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") MemorySegment pathRaw() {
        return segment.get(LAYOUT$path, OFFSET$path);
    }

    public void pathRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$path, OFFSET$path, value);
    }

    public short vendor_id() {
        return segment.get(LAYOUT$vendor_id, OFFSET$vendor_id);
    }

    public SDL_hid_device_info vendor_id(short value) {
        segment.set(LAYOUT$vendor_id, OFFSET$vendor_id, value);
        return this;
    }

    public short product_id() {
        return segment.get(LAYOUT$product_id, OFFSET$product_id);
    }

    public SDL_hid_device_info product_id(short value) {
        segment.set(LAYOUT$product_id, OFFSET$product_id, value);
        return this;
    }

    public @Pointer(comment="wchar_t*") MemorySegment serial_number() {
        return segment.get(LAYOUT$serial_number, OFFSET$serial_number);
    }

    public void serial_number(@Pointer(comment="wchar_t*") MemorySegment value) {
        segment.set(LAYOUT$serial_number, OFFSET$serial_number, value);
    }

    public SDL_hid_device_info serial_number(@Nullable IPointer pointer) {
        serial_number(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public short release_number() {
        return segment.get(LAYOUT$release_number, OFFSET$release_number);
    }

    public SDL_hid_device_info release_number(short value) {
        segment.set(LAYOUT$release_number, OFFSET$release_number, value);
        return this;
    }

    public @Pointer(comment="wchar_t*") MemorySegment manufacturer_string() {
        return segment.get(LAYOUT$manufacturer_string, OFFSET$manufacturer_string);
    }

    public void manufacturer_string(@Pointer(comment="wchar_t*") MemorySegment value) {
        segment.set(LAYOUT$manufacturer_string, OFFSET$manufacturer_string, value);
    }

    public SDL_hid_device_info manufacturer_string(@Nullable IPointer pointer) {
        manufacturer_string(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="wchar_t*") MemorySegment product_string() {
        return segment.get(LAYOUT$product_string, OFFSET$product_string);
    }

    public void product_string(@Pointer(comment="wchar_t*") MemorySegment value) {
        segment.set(LAYOUT$product_string, OFFSET$product_string, value);
    }

    public SDL_hid_device_info product_string(@Nullable IPointer pointer) {
        product_string(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public short usage_page() {
        return segment.get(LAYOUT$usage_page, OFFSET$usage_page);
    }

    public SDL_hid_device_info usage_page(short value) {
        segment.set(LAYOUT$usage_page, OFFSET$usage_page, value);
        return this;
    }

    public short usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public SDL_hid_device_info usage(short value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
        return this;
    }

    public int interface_number() {
        return segment.get(LAYOUT$interface_number, OFFSET$interface_number);
    }

    public SDL_hid_device_info interface_number(int value) {
        segment.set(LAYOUT$interface_number, OFFSET$interface_number, value);
        return this;
    }

    public int interface_class() {
        return segment.get(LAYOUT$interface_class, OFFSET$interface_class);
    }

    public SDL_hid_device_info interface_class(int value) {
        segment.set(LAYOUT$interface_class, OFFSET$interface_class, value);
        return this;
    }

    public int interface_subclass() {
        return segment.get(LAYOUT$interface_subclass, OFFSET$interface_subclass);
    }

    public SDL_hid_device_info interface_subclass(int value) {
        segment.set(LAYOUT$interface_subclass, OFFSET$interface_subclass, value);
        return this;
    }

    public int interface_protocol() {
        return segment.get(LAYOUT$interface_protocol, OFFSET$interface_protocol);
    }

    public SDL_hid_device_info interface_protocol(int value) {
        segment.set(LAYOUT$interface_protocol, OFFSET$interface_protocol, value);
        return this;
    }

    public @EnumType(SDL_hid_bus_type.class) int bus_type() {
        return segment.get(LAYOUT$bus_type, OFFSET$bus_type);
    }

    public SDL_hid_device_info bus_type(@EnumType(SDL_hid_bus_type.class) int value) {
        segment.set(LAYOUT$bus_type, OFFSET$bus_type, value);
        return this;
    }

    public SDL_hid_device_info next(@Nullable ISDL_hid_device_info value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextRaw(s);
        return this;
    }

    @Unsafe public @Nullable SDL_hid_device_info.Ptr next(int assumedCount) {
        MemorySegment s = nextRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * SDL_hid_device_info.BYTES);
        return new SDL_hid_device_info.Ptr(s);
    }

    public @Nullable SDL_hid_device_info next() {
        MemorySegment s = nextRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_hid_device_info(s);
    }

    public @Pointer(target=SDL_hid_device_info.class) MemorySegment nextRaw() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public void nextRaw(@Pointer(target=SDL_hid_device_info.class) MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("path"),
        ValueLayout.JAVA_SHORT.withName("vendor_id"),
        ValueLayout.JAVA_SHORT.withName("product_id"),
        ValueLayout.ADDRESS.withName("serial_number"),
        ValueLayout.JAVA_SHORT.withName("release_number"),
        ValueLayout.ADDRESS.withName("manufacturer_string"),
        ValueLayout.ADDRESS.withName("product_string"),
        ValueLayout.JAVA_SHORT.withName("usage_page"),
        ValueLayout.JAVA_SHORT.withName("usage"),
        ValueLayout.JAVA_INT.withName("interface_number"),
        ValueLayout.JAVA_INT.withName("interface_class"),
        ValueLayout.JAVA_INT.withName("interface_subclass"),
        ValueLayout.JAVA_INT.withName("interface_protocol"),
        ValueLayout.JAVA_INT.withName("bus_type"),
        ValueLayout.ADDRESS.withName("next")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$path = PathElement.groupElement("path");
    public static final PathElement PATH$vendor_id = PathElement.groupElement("vendor_id");
    public static final PathElement PATH$product_id = PathElement.groupElement("product_id");
    public static final PathElement PATH$serial_number = PathElement.groupElement("serial_number");
    public static final PathElement PATH$release_number = PathElement.groupElement("release_number");
    public static final PathElement PATH$manufacturer_string = PathElement.groupElement("manufacturer_string");
    public static final PathElement PATH$product_string = PathElement.groupElement("product_string");
    public static final PathElement PATH$usage_page = PathElement.groupElement("usage_page");
    public static final PathElement PATH$usage = PathElement.groupElement("usage");
    public static final PathElement PATH$interface_number = PathElement.groupElement("interface_number");
    public static final PathElement PATH$interface_class = PathElement.groupElement("interface_class");
    public static final PathElement PATH$interface_subclass = PathElement.groupElement("interface_subclass");
    public static final PathElement PATH$interface_protocol = PathElement.groupElement("interface_protocol");
    public static final PathElement PATH$bus_type = PathElement.groupElement("bus_type");
    public static final PathElement PATH$next = PathElement.groupElement("next");

    public static final AddressLayout LAYOUT$path = (AddressLayout) LAYOUT.select(PATH$path);
    public static final OfShort LAYOUT$vendor_id = (OfShort) LAYOUT.select(PATH$vendor_id);
    public static final OfShort LAYOUT$product_id = (OfShort) LAYOUT.select(PATH$product_id);
    public static final AddressLayout LAYOUT$serial_number = (AddressLayout) LAYOUT.select(PATH$serial_number);
    public static final OfShort LAYOUT$release_number = (OfShort) LAYOUT.select(PATH$release_number);
    public static final AddressLayout LAYOUT$manufacturer_string = (AddressLayout) LAYOUT.select(PATH$manufacturer_string);
    public static final AddressLayout LAYOUT$product_string = (AddressLayout) LAYOUT.select(PATH$product_string);
    public static final OfShort LAYOUT$usage_page = (OfShort) LAYOUT.select(PATH$usage_page);
    public static final OfShort LAYOUT$usage = (OfShort) LAYOUT.select(PATH$usage);
    public static final OfInt LAYOUT$interface_number = (OfInt) LAYOUT.select(PATH$interface_number);
    public static final OfInt LAYOUT$interface_class = (OfInt) LAYOUT.select(PATH$interface_class);
    public static final OfInt LAYOUT$interface_subclass = (OfInt) LAYOUT.select(PATH$interface_subclass);
    public static final OfInt LAYOUT$interface_protocol = (OfInt) LAYOUT.select(PATH$interface_protocol);
    public static final OfInt LAYOUT$bus_type = (OfInt) LAYOUT.select(PATH$bus_type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);

    public static final long SIZE$path = LAYOUT$path.byteSize();
    public static final long SIZE$vendor_id = LAYOUT$vendor_id.byteSize();
    public static final long SIZE$product_id = LAYOUT$product_id.byteSize();
    public static final long SIZE$serial_number = LAYOUT$serial_number.byteSize();
    public static final long SIZE$release_number = LAYOUT$release_number.byteSize();
    public static final long SIZE$manufacturer_string = LAYOUT$manufacturer_string.byteSize();
    public static final long SIZE$product_string = LAYOUT$product_string.byteSize();
    public static final long SIZE$usage_page = LAYOUT$usage_page.byteSize();
    public static final long SIZE$usage = LAYOUT$usage.byteSize();
    public static final long SIZE$interface_number = LAYOUT$interface_number.byteSize();
    public static final long SIZE$interface_class = LAYOUT$interface_class.byteSize();
    public static final long SIZE$interface_subclass = LAYOUT$interface_subclass.byteSize();
    public static final long SIZE$interface_protocol = LAYOUT$interface_protocol.byteSize();
    public static final long SIZE$bus_type = LAYOUT$bus_type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();

    public static final long OFFSET$path = LAYOUT.byteOffset(PATH$path);
    public static final long OFFSET$vendor_id = LAYOUT.byteOffset(PATH$vendor_id);
    public static final long OFFSET$product_id = LAYOUT.byteOffset(PATH$product_id);
    public static final long OFFSET$serial_number = LAYOUT.byteOffset(PATH$serial_number);
    public static final long OFFSET$release_number = LAYOUT.byteOffset(PATH$release_number);
    public static final long OFFSET$manufacturer_string = LAYOUT.byteOffset(PATH$manufacturer_string);
    public static final long OFFSET$product_string = LAYOUT.byteOffset(PATH$product_string);
    public static final long OFFSET$usage_page = LAYOUT.byteOffset(PATH$usage_page);
    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);
    public static final long OFFSET$interface_number = LAYOUT.byteOffset(PATH$interface_number);
    public static final long OFFSET$interface_class = LAYOUT.byteOffset(PATH$interface_class);
    public static final long OFFSET$interface_subclass = LAYOUT.byteOffset(PATH$interface_subclass);
    public static final long OFFSET$interface_protocol = LAYOUT.byteOffset(PATH$interface_protocol);
    public static final long OFFSET$bus_type = LAYOUT.byteOffset(PATH$bus_type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
}
