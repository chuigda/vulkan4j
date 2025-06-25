## Unreleased v0.4.1

### Quality of Life updates

- Added a handy `writeString` method for `BytePtr`.
- For array fields of structures, accessor `structure.field(PtrType ptr)` only copies `ptr.segment().byteSize()` bytes from `ptr` to the field, instead of attempting to copy the whole array. This makes it easier to work with C-style null-terminated strings, which would cause an overflow in previous versions.

### Bugfixes

- Fixed `BytePtr.checked` which was not previously marked as `static`.

### Minor changes

- `LibcArena` and a few singleton library loaders are now implemented in terms of `enum` instead of `class`, in order to support well-behaved serialization.

## v0.4.0

Upgrade `ffm-plus` to v0.2.4, and other wrapper modules to v0.4.0.

### Breaking changes

- Add new annotation `@Bitmask` and use it to mark bitmask types. Original `@EnumType` annotation should only be applied to non-composable enums. This won't break build, but you'll see IDE warnings if you are using our [ffm-plus-inspection](https://github.com/club-doki7/ffm-plus-inspection) plugin.
- All `MemorySegment`s are now `@NotNull` by default. APIs previously accepts `null` `MemorySegment` will now throw `NullPointerException` if you pass `null`. Always use `MemorySegment.NULL`.
- Deprecated `Loader` class and its methods. If you need to load basic functions (like `libc` functions) from "global" scope, use `JavaSystemLibrary.INSTANCE.load` instead; if you need to load functions from a specific library, use `ILibraryLoader` and `ISharedLibrary` interface instead.
- Updated `VulkanLoader`, `GLFWLoader`, `VMAJavaTraceUtil` and `STBJavaTraceUtil` APIs to use `ILibraryLoader` and `ISharedLibrary` accordingly.

### New bindings

- Added `stb` module, which provides bindings for `stb` libraries. Currently the following components are supported:
  - `stb.image` (`stb_image.h`): Image loading library.
  - `stb.imagewrite` (`stb_image_write.h`): Image writing library.
  - `stb.imageresize` (`stb_image_resize2.h`): Image resizing library.
  - `stb.truetype` (`stb_truetype.h`): TrueType font rendering library.

### Functionality updates

- Added `ILibraryLoader` and `ISharedLibrary` interface to reduce global `System.load`/`System.loadLibrary` calls. This allows you to load libraries in a more controlled manner.
  - This feature uses `LoadLibraryW` + `GetProcAddress` on Windows platform, `dlopen` + `dlsym` on Linux/FreeBSD/macOS platform.
  - macOS library bundle (`.framework`) is not supported yet.

### Quality of Life updates

- PVOID type field setters accepting `MemorySegment`s now also returns `this` to allow chaining.
- Added `ALLoader` class to automatically deal with platform library name difference (`OpenAL32.dll` on Windows vs `libopenal.so` on Linux).

### Known issues

- `LibcArena` does not work on Windows platform due to the lack of `aligned_alloc` support. `ShadercUtil` using `LibcArena` is also affected.

## v0.3.4

Upgrade `ffm-plus` to v0.2.2, and other wrapper modules to v0.3.4.

### New bindings

- Added `shaderc` module, which provides bindings for `libshaderc`.

### Bugfixes

- Fixed a issue causing memory allocation failure of `LibcArena`.
- Fixed a issue causing incorrect generation of return value retrieval for commands that returns `size_t`.

## v0.3.3

- Fixed a issue (#93) causing incorrect generation of `HandleType.Ptr.Iter.next` series methods.

## v0.3.2

Upgrade `ffm-plus` to v0.2.1, and other wrapper modules to v0.3.2,

### Breaking changes

- Made all the `Iter` types private to reduce disruptions in JavaDoc pages. Most code should not be affected. Existing code that really uses `T.Iter` type can migrate to `Iterator<T>` interface.

### New bindings

- Added `opengl` module, which provides bindings for OpenGL 1.0 - 4.6 (both Core and Compatibility profiles).
- Added `openal` module, which provides bindings based on OpenAL-soft (1.2).

### Quality of Life updates

- Added `allocateV` and `writeV` series functions for `Ptr` types (both `ffm-plus` and other generated code), utilizing Java varargs to simplify specific write operations.
- Supported chaining `set` methods for structure types.
- Supported LWJGL-alike `set` style methods for structure member of structure types. For example:
    ```c
    struct { struct { int a; int b; } inner; } outer;
    outer.inner.a = 1;
    outer.inner.b = 2;
    ```
    can now be written as:
    ```java
    outer.inner(it -> it.a(1).b(2));
    ```
- For OpenGL, OpenAL and GLFW, we now allow accessing global constants via command wrapper classes (`GLConstants.COLOR_BUFFER_BIT` -> `GL.COLOR_BUFFER_BIT`, etc.) to avoid repetitive strain injury.

### Bugfixes

- Fixed issue (#12), where some instance level commands are wrongly categorized as device commands.

## v0.3.1

- Fixed a issue (#63) causing incorrect generation of `StructureType.Ptr.reinterpret` series methods.
- Fixed a documentation issue in `vma` module.

## v0.3.0

A fresh start

- Migrating all extraction and code generation to Kotlin `codegen-v2` module.
- Entities are renamed properly to reduce boilerplates.
- Improved usability and correctness of `ffm-plus` (previously `panama-plus`) module.
- Many other enhancements and bug fixes.

### *Development history before 0.3.0?*

See [vulkan4j-legacy](https://github.com/CousinZe/vulkan4j-legacy).
