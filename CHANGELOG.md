## UNPUBLISHED v0.4.0

Upgrade `ffm-plus` to v0.2.4, and other wrapper modules to v0.4.0.

### Breaking changes

- Add new annotation `@Bitmask` and use it to mark bitmask types. Original `@EnumType` annotation should only be applied to non-composable enums. This won't break build, but you'll see IDE warnings if you are using our [ffm-plus-inspection](https://github.com/club-doki7/ffm-plus-inspection) plugin.
- `RawFunctionLoader`'s return value is now `@NotNull`, it only returns `MemorySegment.NULL` when failed to load the function. Downstream implementation of `RawFunctionLoader` should also return `@NotNull` value now.

### Functionality updates

- Added `ILibraryLoader` and `ISharedLibrary` interface to reduce global `System.load`/`System.loadLibrary` calls. This allows you to load libraries in a more controlled manner.
  - This feature uses `LoadLibraryW` + `GetProcAddress` on Windows platform, `dlopen` + `dlsym` on Linux/FreeBSD platform. *TODO: What should we use on MAC?*

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
