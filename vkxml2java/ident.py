class Identifier:
    def __init__(self, value: str):
        self.value = value
        self.renamed = None

    def __str__(self):
        return self.value

    def __repr__(self):
        return f"Identifier({self.value})"

    def __eq__(self, other):
        return self.value == other.value

    def __hash__(self):
        return hash(self.value)


IDENTIFIERS: dict[str, Identifier] = {}


def ident(value: str) -> Identifier:
    if value in IDENTIFIERS:
        return IDENTIFIERS[value]

    IDENTIFIERS[value] = Identifier(value)
    return IDENTIFIERS[value]
