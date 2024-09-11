from __future__ import annotations
from dataclasses import dataclass, field
from typing import Callable

from .ident import Identifier
from .vktype import Type, IdentifierType


@dataclass
class Registry:
    bitmasks: dict[Identifier, Bitmask] = field(default_factory=dict)
    constants: dict[Identifier, Constant] = field(default_factory=dict)
    commands: dict[Identifier, Command] = field(default_factory=dict)
    command_aliases: dict[Identifier, Identifier] = field(default_factory=dict)
    enums: dict[Identifier, Enum] = field(default_factory=dict)
    extensions: dict[Identifier, Extension] = field(default_factory=dict)
    functions: dict[Identifier, Function] = field(default_factory=dict)
    handles: dict[Identifier, Handle] = field(default_factory=dict)
    structs: dict[Identifier, Structure] = field(default_factory=dict)
    unions: dict[Identifier, Structure] = field(default_factory=dict)
    versions: dict[Identifier, Version] = field(default_factory=dict)


@dataclass
class Entity:
    name: Identifier
    api: str | None

    def rename(self, transform: Callable[[str], str]):
        if self.name.renamed is None:
            self.name.renamed = transform(self.name.value)

    def is_vulkan_api(self) -> bool:
        return 'vulkan' in self.api.split(',') if self.api is not None else True

    def __eq__(self, other) -> bool:
        return self.name == other.name

    def __hash__(self):
        return hash(self.name)


@dataclass
class Bitmask(Entity):
    bitflags: list[Bitflag]


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
    successcodes: list[Identifier]
    errorcodes: list[Identifier]

    def copy(self) -> Command:
        return Command(self.name, self.api, self.params, self.result, self.successcodes, self.errorcodes)

    def copy_rename(self, new_name: Identifier) -> Command:
        ret = self.copy()
        ret.name = new_name
        return ret


@dataclass
class CommandAlias(Entity):
    alias: Identifier


@dataclass
class Param(Entity):
    type: Type
    len: Identifier | None
    arglen: list[Identifier] | None
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
    structextends: list[Identifier]


@dataclass
class Member(Entity):
    type: Type
    values: Identifier | None
    len: list[Identifier] | None
    altlen: str
    optional: bool
    bits: int | None


@dataclass
class Version(Entity):
    number: float
    require: Require


@dataclass
class Require:
    commands: set[Identifier]
    types: set[str]
    values: list[RequireValue]


@dataclass
class RequireValue(Entity):
    extends: Identifier
    value: int | None
    bitpos: int | None
    extnumber: int | None
    offset: int | None
    negative: bool
