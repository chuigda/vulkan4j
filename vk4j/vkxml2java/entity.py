from __future__ import annotations
from dataclasses import dataclass, field

from .vktype import Type, IdentifierType


@dataclass
class Registry:
    aliases: dict[str, Typedef] = field(default_factory=dict)
    bitmasks: dict[str, Bitmask] = field(default_factory=dict)
    constants: dict[str, Constant] = field(default_factory=dict)
    extension_names: dict[str, str] = field(default=dict)
    commands: dict[str, Command] = field(default_factory=dict)
    command_aliases: dict[str, str] = field(default_factory=dict)
    enums: dict[str, Enum] = field(default_factory=dict)
    extensions: dict[str, Extension] = field(default_factory=dict)
    functions: dict[str, Function] = field(default_factory=dict)
    handles: dict[str, Handle] = field(default_factory=dict)
    structs: dict[str, Structure] = field(default_factory=dict)
    unions: dict[str, Structure] = field(default_factory=dict)
    versions: dict[str, Version] = field(default_factory=dict)


@dataclass
class Entity:
    name: str
    api: str | None

    def is_vulkan_api(self) -> bool:
        return 'vulkan' in self.api.split(',') if self.api is not None else True

    def __eq__(self, other) -> bool:
        return self.name == other.name

    def __hash__(self):
        return hash(self.name)


@dataclass
class Typedef(Entity):
    type: IdentifierType

    def __eq__(self, other) -> bool:
        return self.name == other.name

    def __hash__(self):
        return hash(self.name)


@dataclass
class Bitmask(Entity):
    bitflags: list[Bitflag]
    bitwidth: int | None
    require_flagbits: str | None

@dataclass
class Bitflag(Entity):
    value: int

    def __eq__(self, other) -> bool:
        return self.name == other.name

    def __hash__(self):
        return hash(self.name)


@dataclass
class Constant(Entity):
    type: IdentifierType
    expr: str


@dataclass
class Command(Entity):
    params: list[Param]
    result: Type
    successcodes: list[str]
    errorcodes: list[str]

    def copy(self) -> Command:
        return Command(self.name, self.api, self.params, self.result, self.successcodes, self.errorcodes)

    def copy_rename(self, new_name: str) -> Command:
        ret = self.copy()
        ret.name = new_name
        return ret


@dataclass
class CommandAlias(Entity):
    alias: str


@dataclass
class Param(Entity):
    type: Type
    len: str | None
    arglen: list[str] | None
    optional: bool


@dataclass
class Enum(Entity):
    variants: list[Variant]


@dataclass
class Variant(Entity):
    value: int

    def __eq__(self, other) -> bool:
        return self.name == other.name

    def __hash__(self):
        return hash(self.name)


@dataclass
class Extension(Entity):
    number: int
    type: str | None
    author: str
    contact: str
    platform: str | None
    requires: str | None
    requires_core: str
    deprecated_by: str | None
    obsoleted_by: str | None
    promoted_to: str | None
    supported: str
    provisional: bool
    require: Require


@dataclass
class Function(Entity):
    params: list[Param]
    result: Type | None


@dataclass
class Handle(Entity):
    dispatchable: bool


@dataclass
class Structure(Entity):
    members: list[Member]
    structextends: list[str]

    has_init_: bool | None = None
    is_union: bool = False

    def has_init(self, registry: Registry) -> bool:
        if self.has_init_ is None:
            for member in self.members:
                if member.values is not None:
                    self.has_init_ = True
                    break
                if isinstance(member.type, IdentifierType):
                    if member.type.ident in registry.structs:
                        struct = registry.structs[member.type.ident]
                        if struct.has_init(registry):
                            self.has_init_ = True
                            break
            if self.has_init_ is None:
                self.has_init_ = False
        return self.has_init_


@dataclass
class Member(Entity):
    type: Type
    values: str | None
    len: list[str] | None
    altlen: str
    optional: bool
    bits: int | None


@dataclass
class Version(Entity):
    number: float
    require: Require


@dataclass
class Require:
    commands: set[str]
    types: set[str]
    values: list[RequireValue]


@dataclass
class RequireValue(Entity):
    extends: str
    value: int | None
    bitpos: int | None
    extnumber: int | None
    offset: int | None
    negative: bool
