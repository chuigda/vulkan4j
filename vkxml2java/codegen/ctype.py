from dataclasses import dataclass

from ..entity import Registry
from ..ident import Identifier
from ..vktype import Type, IdentifierType, ArrayType, PointerType


@dataclass
class CType:
    def java_type(self) -> str:
        raise NotImplementedError()

    def java_layout(self) -> str:
        raise NotImplementedError()

    def java_layout_type(self) -> str:
        raise NotImplementedError()

    def c_type(self) -> str:
        raise NotImplementedError()


@dataclass
class CPointerType(CType):
    pointee: CType
    const: bool
    comment: str | None = None

    def java_type(self) -> str:
        if self.comment is not None:
            return f'@pointer(comment="{self.comment}") MemorySegment'
        elif self.pointee == CTYPE_VOID:
            return '@pointer(comment="void*") MemorySegment'

        return 'MemorySegment'

    def java_layout(self) -> str:
        if self.pointee == CTYPE_VOID:
            return 'ValueLayout.ADDRESS'
        else:
            return 'ValueLayout.ADDRESS.withTargetLayout(' + self.pointee.java_layout() + ')'

    def java_layout_type(self) -> str:
        return 'AddressLayout'

    def c_type(self) -> str:
        return f'{self.pointee.c_type()} {'const' if self.const else ''}*'


@dataclass
class CHandleType(CType):
    name: Identifier

    def java_type(self) -> str:
        return f'@pointer(target={self.name}.class) MemorySegment'

    def java_layout(self) -> str:
        return 'ValueLayout.ADDRESS'

    def java_layout_type(self) -> str:
        return 'AddressLayout'

    def c_type(self) -> str:
        return f'{self.name}'


@dataclass
class CEnumType(CType):
    name: str
    bitwidth: int | None = None

    def java_type(self) -> str:
        name = self.non_flagbits_type_name()
        if self.bitwidth is None or self.bitwidth == 32:
            return f'@enumtype({name}.class) int'
        elif self.bitwidth == 64:
            return f'@enumtype({name}.class) long'
        else:
            raise Exception(f'unsupported bitwidth: {self.bitwidth}')

    def java_layout(self) -> str:
        if self.bitwidth is None or self.bitwidth == 32:
            return 'ValueLayout.JAVA_INT'
        elif self.bitwidth == 64:
            return 'ValueLayout.JAVA_LONG'
        else:
            raise Exception(f'unsupported bitwidth: {self.bitwidth}')

    def java_layout_type(self) -> str:
        if self.bitwidth is None or self.bitwidth == 32:
            return 'OfInt'
        elif self.bitwidth == 64:
            return 'OfLong'
        else:
            raise Exception(f'unsupported bitwidth: {self.bitwidth}')

    def c_type(self) -> str:
        return f'enum {self.name}'

    def non_flagbits_type_name(self) -> str:
        return self.name.replace('FlagBits', 'Flags')


@dataclass
class CArrayType(CType):
    element: CType
    size: int | str

    def java_type(self) -> str:
        return f'{self.element.java_type()}[]'

    def java_layout(self) -> str:
        return f'MemoryLayout.sequenceLayout({self.size}, {self.element.java_layout()})'

    def java_layout_type(self) -> str:
        return 'SequenceLayout'

    def c_type(self) -> str:
        return f'{self.element.c_type()}[{self.size}]'


class CNonRefType(CType):
    def vk4j_array_type(self) -> str:
        raise NotImplementedError()

    def vk4j_array_type_no_sign(self) -> str:
        raise NotImplementedError()

    def vk4j_ptr_type(self) -> str:
        raise NotImplementedError()

    def vk4j_ptr_type_no_sign(self) -> str:
        raise NotImplementedError()


@dataclass
class CFixedIntType(CNonRefType):
    c_name: str
    byte_size: int
    unsigned: bool

    def java_type(self) -> str:
        unsigned_prefix = '@unsigned ' if self.unsigned else ''
        if self.c_name == 'char' or self.byte_size == 1:
            return f'{unsigned_prefix}byte'
        elif self.byte_size == 2:
            return f'{unsigned_prefix}short'
        elif self.byte_size == 4:
            return f'{unsigned_prefix}int'
        elif self.byte_size == 8:
            return f'{unsigned_prefix}long'
        else:
            raise Exception(f'unsupported byte size: {self.byte_size}')

    def java_layout(self) -> str:
        if self.c_name == 'char' or self.byte_size == 1:
            return 'ValueLayout.JAVA_BYTE'
        elif self.byte_size == 2:
            return 'ValueLayout.JAVA_SHORT'
        elif self.byte_size == 4:
            return 'ValueLayout.JAVA_INT'
        elif self.byte_size == 8:
            return 'ValueLayout.JAVA_LONG'
        else:
            raise Exception(f'unsupported byte size: {self.byte_size}')

    def java_layout_type(self) -> str:
        if self.c_name == 'char' or self.byte_size == 1:
            return 'OfByte'
        elif self.byte_size == 2:
            return 'OfShort'
        elif self.byte_size == 4:
            return 'OfInt'
        elif self.byte_size == 8:
            return 'OfLong'
        else:
            raise Exception(f'unsupported byte size: {self.byte_size}')

    def c_type(self) -> str:
        return self.c_name

    def vk4j_array_type(self) -> str:
        unsigned_prefix = '@unsigned ' if self.unsigned else ''
        return f'{unsigned_prefix}{self.vk4j_array_type_nosign()}'

    def vk4j_array_type_nosign(self) -> str:
        if self.c_name == 'char' or self.byte_size == 1:
            return 'ByteArray'
        elif self.byte_size == 2:
            return 'DoubleArray'
        elif self.byte_size == 4:
            return 'IntArray'
        elif self.byte_size == 8:
            return 'LongArray'
        else:
            raise Exception(f'unsupported byte size: {self.byte_size}')

    def vk4j_ptr_type(self) -> str:
        unsigned_prefix = '@unsigned ' if self.unsigned else ''
        return f'{unsigned_prefix}{self.vk4j_ptr_type_no_sign()}'

    def vk4j_ptr_type_no_sign(self) -> str:
        if self.c_name == 'char' or self.byte_size == 1:
            return f'BytePtr'
        elif self.byte_size == 2:
            return f'ShortPtr'
        elif self.byte_size == 4:
            return f'IntPtr'
        elif self.byte_size == 8:
            return f'LongPtr'
        else:
            raise Exception(f'unsupported byte size: {self.byte_size}')


@dataclass
class CPlatformDependentIntType(CNonRefType):
    c_name: str
    array_name: str
    ptr_name: str
    java_layout_: str
    java_type_: str

    def java_type(self) -> str:
        return self.java_type_

    def java_layout(self) -> str:
        return self.java_layout_

    def java_layout_type(self) -> str:
        raise Exception(f'should not call `java_layout_type` on platform dependent int')

    def c_type(self) -> str:
        return self.c_name

    def vk4j_array_type(self) -> str:
        return self.array_name

    def vk4j_array_type_no_sign(self) -> str:
        return self.array_name

    def vk4j_ptr_type(self) -> str:
        return self.ptr_name

    def vk4j_ptr_type_no_sign(self) -> str:
        return self.ptr_name


@dataclass
class CFloatType(CNonRefType):
    byte_size: int

    def java_type(self) -> str:
        if self.byte_size == 4:
            return 'float'
        elif self.byte_size == 8:
            return 'double'
        else:
            raise Exception(f'unsupported byte size: {self.byte_size}')

    def java_layout(self) -> str:
        if self.byte_size == 4:
            return 'ValueLayout.JAVA_FLOAT'
        elif self.byte_size == 8:
            return 'ValueLayout.JAVA_DOUBLE'
        else:
            raise Exception(f'unsupported byte size: {self.byte_size}')

    def java_layout_type(self) -> str:
        if self.byte_size == 4:
            return 'OfFloat'
        elif self.byte_size == 8:
            return 'OfDouble'
        else:
            raise Exception(f'unsupported byte size: {self.byte_size}')

    def c_type(self) -> str:
        return 'float' if self.byte_size == 4 else 'double'

    def vk4j_array_type(self) -> str:
        return 'FloatArray' if self.byte_size == 4 else 'DoubleArray'

    def vk4j_array_type_no_sign(self) -> str:
        return 'FloatArray' if self.byte_size == 4 else 'DoubleArray'

    def vk4j_ptr_type(self) -> str:
        return 'FloatPtr' if self.byte_size == 4 else 'DoublePtr'

    def vk4j_ptr_type_no_sign(self) -> str:
        return 'FloatPtr' if self.byte_size == 4 else 'DoublePtr'


@dataclass
class CBoolType(CType):
    def java_type(self) -> str:
        return 'boolean'

    def java_layout(self) -> str:
        return 'ValueLayout.JAVA_BOOLEAN'

    def java_layout_type(self) -> str:
        return 'OfBoolean'

    def c_type(self) -> str:
        return 'bool'


@dataclass
class CStructType(CType):
    name: str

    def java_type(self) -> str:
        return self.name

    def java_layout(self) -> str:
        return f'{self.name}.LAYOUT'

    def java_layout_type(self) -> str:
        return 'StructLayout'

    def c_type(self) -> str:
        return f'struct {self.name}'


@dataclass
class CUnionType(CType):
    name: str

    def java_type(self) -> str:
        return self.name

    def java_layout(self) -> str:
        return f'{self.name}.LAYOUT'

    def java_layout_type(self) -> str:
        return 'UnionLayout'

    def c_type(self) -> str:
        return f'union {self.name}'


@dataclass
class CVoidType(CType):
    pass

    def java_type(self) -> str:
        return 'void'

    def java_layout(self) -> str:
        raise Exception(f'should not call `java_layout` on void')

    def java_layout_type(self) -> str:
        raise Exception(f'should not call `java_layout_type` on void')

    def c_type(self) -> str:
        return 'void'


CTYPE_INT8: CFixedIntType = CFixedIntType('int8_t', 1, False)
CTYPE_INT16: CFixedIntType = CFixedIntType('int16_t', 2, False)
CTYPE_INT32: CFixedIntType = CFixedIntType('int32_t', 4, False)
CTYPE_INT64: CFixedIntType = CFixedIntType('int64_t', 8, False)
CTYPE_UINT8: CFixedIntType = CFixedIntType('uint8_t', 1, True)
CTYPE_UINT16: CFixedIntType = CFixedIntType('uint16_t', 2, True)
CTYPE_UINT32: CFixedIntType = CFixedIntType('uint32_t', 4, True)
CTYPE_UINT64: CFixedIntType = CFixedIntType('uint64_t', 8, True)
CTYPE_FLOAT: CType = CFloatType(4)
CTYPE_DOUBLE: CType = CFloatType(8)

CTYPE_INT: CType = CTYPE_INT32
CTYPE_LONG: CType = CPlatformDependentIntType('long', 'CLongArray', 'CLongPtr', 'NativeLayout.C_LONG', 'long')
CTYPE_SIZET: CType = CPlatformDependentIntType('size_t', 'CSizeTArray', 'CSizeTPtr', 'NativeLayout.C_SIZE_T', '@unsigned long')

CTYPE_VOID: CType = CVoidType()
CTYPE_PVOID: CType = CPointerType(CTYPE_VOID, False)


KNOWN_TYPES: dict[str, CType] = {
    # Fundatmental types
    'char': CTYPE_INT8,

    'int8_t': CTYPE_INT8,
    'int16_t': CTYPE_INT16,
    'int32_t': CTYPE_INT32,
    'int64_t': CTYPE_INT64,
    'uint8_t': CTYPE_UINT8,
    'uint16_t': CTYPE_UINT16,
    'uint32_t': CTYPE_UINT32,
    'uint64_t': CTYPE_UINT64,
    'float': CTYPE_FLOAT,
    'double': CTYPE_DOUBLE,
    'bool': CBoolType(),
    'void': CTYPE_VOID,
    'int': CTYPE_INT,
    'long': CTYPE_LONG,
    'size_t': CTYPE_SIZET,

    # Vulkan base types
    'VkSampleMask': CTYPE_UINT32,
    'VkBool32': CTYPE_UINT32,
    'VkFlags': CTYPE_UINT32,
    'VkFlags64': CTYPE_UINT64,
    'VkDeviceSize': CTYPE_UINT64,
    'VkDeviceAddress': CTYPE_UINT64,
    'VkRemoteAddressNV': CTYPE_PVOID,

    # Android
    'ANativeWindow': CTYPE_VOID,
    'AHardwareBuffer': CTYPE_VOID,

    # DirectFB
    'IDirectFB': CTYPE_VOID,
    'IDirectFBSurface': CTYPE_VOID,

    # iOS / MacOS
    'CAMetalLayer': CTYPE_VOID,
    'GgpFrameToken': CTYPE_UINT32,
    'GgpStreamDescriptor': CTYPE_UINT32,
    'IOSurfaceRef': CTYPE_PVOID,
    'MTLBuffer_id': CTYPE_PVOID,
    'MTLCommandQueue_id': CTYPE_PVOID,
    'MTLDevice_id': CTYPE_PVOID,
    'MTLSharedEvent_id': CTYPE_PVOID,
    'MTLTexture_id': CTYPE_PVOID,

    # QNX
    '_screen_buffer': CTYPE_VOID,
    '_screen_context': CTYPE_VOID,
    '_screen_window': CTYPE_VOID,

    # Wayland
    'wl_display': CTYPE_VOID,
    'wl_surface': CTYPE_VOID,

    # Windows
    'DWORD': CTYPE_UINT32,
    'HANDLE': CTYPE_PVOID,
    'HINSTANCE': CTYPE_PVOID,
    'HMONITOR': CTYPE_PVOID,
    'HWND': CTYPE_PVOID,
    'LPCWSTR': CPointerType(CTYPE_UINT16, True),
    'SECURITY_ATTRIBUTES': CTYPE_VOID,

    # X11
    'Display': CTYPE_PVOID,
    'RROutput': CTYPE_LONG,
    'VisualID': CTYPE_LONG,
    'Window': CTYPE_LONG,
    'xcb_connection_t': CTYPE_VOID,
    'xcb_visualid_t': CTYPE_UINT32,
    'xcb_window_t': CTYPE_UINT32,
    'zx_handle_t': CTYPE_UINT32,

    # NvSciBuf / NvSciSync
    'NvSciBufAttrList': CTYPE_PVOID,
    'NvSciBufObj': CTYPE_PVOID,
    'NvSciSyncAttrList': CTYPE_PVOID,
    'NvSciSyncObj': CTYPE_PVOID,
    'NvSciSyncFence': CArrayType(CTYPE_UINT64, 6),
}


def lower_type(registry: Registry, type_: Type) -> CType:
    if isinstance(type_, IdentifierType):
        return lower_identifier_type(registry, type_)
    elif isinstance(type_, ArrayType):
        if not type_.length.value.isnumeric():
            if type_.length not in registry.constants:
                raise Exception(f'array typed referred to an unknown constant: {type_.length.value}')
        element_type = lower_type(registry, type_.element)
        return CArrayType(element_type, type_.length.value)
    elif isinstance(type_, PointerType):
        pointee = lower_type(registry, type_.pointee)
        return CPointerType(pointee, type_.const)


def lower_identifier_type(registry: Registry, ident_type: IdentifierType) -> CType:
    ident = ident_type.identifier
    ident_value = ident.value

    if ident_value in KNOWN_TYPES:
        ret = KNOWN_TYPES[ident_value]
        return ret
    elif ident in registry.enums:
        return CEnumType(ident.value)
    elif ident in registry.bitmasks:
        bitmask = registry.bitmasks[ident]
        return CEnumType(ident.value, bitmask.bitwidth)
    elif ident in registry.structs:
        return CStructType(ident.value)
    elif ident in registry.unions:
        return CUnionType(ident.value)
    elif ident in registry.handles:
        return CHandleType(ident)
    elif ident in registry.functions:
        fn = registry.functions[ident]
        comment = f'{fn.name}'
        return CPointerType(CTYPE_VOID, False, comment)
    else:
        raise Exception(f'unknown type: {ident}')
